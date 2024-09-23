package com.itsqmet.hquinapallo.controlador;

import com.itsqmet.hquinapallo.modelo.Estudiante;
import com.itsqmet.hquinapallo.servicios.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteControlador {

    @Autowired
    private IEstudianteServicio estudianteServicio;

    @GetMapping({"/estudiantes", "/"})
    public String listarEstudiantes(Model modelo) {
        modelo.addAttribute("estudiantes", estudianteServicio.listarEstudiante());
        return "estudiantes";
    }

    @GetMapping("/estudiantes/nuevo")
    public String mostrarEstudiante(Model modelo) {
        Estudiante estudiante = new Estudiante();
        modelo.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteServicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormEditar(@PathVariable int id, Model modelo) {
        modelo.addAttribute("estudiante", estudianteServicio.obtenerEstudiantePorId(id));
        return "editar_estudiante";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable int id, @ModelAttribute("estudiante") Estudiante estudiante, Model modelo) {
        Estudiante existeEstudiante = estudianteServicio.obtenerEstudiantePorId(id);
        existeEstudiante.setIdEstudiante(id);
        existeEstudiante.setNombre(estudiante.getNombre());
        existeEstudiante.setDireccion(estudiante.getDireccion());

        estudianteServicio.actualizarEstudiante(existeEstudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable int id, Model modelo) {
        estudianteServicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }
}

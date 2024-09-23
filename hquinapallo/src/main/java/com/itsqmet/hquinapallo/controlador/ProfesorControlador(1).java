package com.itsqmet.hquinapallo.controlador;

import com.itsqmet.hquinapallo.modelo.Profesor;
import com.itsqmet.hquinapallo.servicios.IProfesorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfesorControlador {

    @Autowired
    private IProfesorServicio profesorServicio;

    @GetMapping({"/profesores"})
    public String listarProfesores(Model modelo) {
        modelo.addAttribute("profesores", profesorServicio.listaProfesor());
        return "profesores";
    }

    @GetMapping("/profesores/nuevo")
    public String mostrarProfesor(Model modelo) {
        Profesor profesor = new Profesor();
        modelo.addAttribute("profesor", profesor);
        return "crear_profesor";
    }

    @PostMapping("/profesores")
    public String guardarProfesores(@ModelAttribute("profesor") Profesor profesor) {
        profesorServicio.guardarProfesor(profesor);
        return "redirect:/profesores";
    }

    @GetMapping("/profesores/editar/{id}")
    public String formEditarProfesor(@PathVariable int id, Model modelo) {
        modelo.addAttribute("profesor", profesorServicio.obtenerProfesorPorId(id));
        return "editar_profesor";
    }

    @PostMapping("/profesores/{id}")
    public String actualizarProfesor(@PathVariable int id, @ModelAttribute("profesor") Profesor profesor, Model modelo) {
        Profesor existeProfesor = profesorServicio.obtenerProfesorPorId(id);
        existeProfesor.setIdProfesor(id);
        existeProfesor.setNombre(profesor.getNombre());
        existeProfesor.setDireccion(profesor.getDireccion());

        profesorServicio.actualizarProfesor(existeProfesor);
        return "redirect:/profesores";
    }

    @GetMapping("/profesores/{id}")
    public String eliminarProfesor(@PathVariable int id, Model modelo) {
        profesorServicio.eliminarProfesor(id);
        return "redirect:/profesores";
    }
}

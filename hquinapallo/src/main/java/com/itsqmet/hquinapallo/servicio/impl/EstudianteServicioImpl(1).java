package com.itsqmet.hquinapallo.servicio.impl;

import com.itsqmet.hquinapallo.modelo.Estudiante;
import com.itsqmet.hquinapallo.repositorio.IEstudianteRepositorio;
import com.itsqmet.hquinapallo.servicios.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EstudianteServicioImpl implements IEstudianteServicio {

    @Autowired
    private IEstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> listarEstudiante() {
        return estudianteRepositorio.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudiantePorId(int id) {
        return estudianteRepositorio.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(int id) {
        estudianteRepositorio.deleteById(id);
    }
}

package com.itsqmet.hquinapallo.servicio.impl;

import com.itsqmet.hquinapallo.modelo.Profesor;
import com.itsqmet.hquinapallo.repositorio.IProfesorRepositorio;
import com.itsqmet.hquinapallo.servicios.IProfesorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServicioImpl implements IProfesorServicio {

    @Autowired
    private IProfesorRepositorio profesorRepositorio;

    @Override
    public List<Profesor> listaProfesor() {
        return profesorRepositorio.findAll();
    }

    @Override
    public Profesor guardarProfesor(Profesor profesor) {
        return profesorRepositorio.save(profesor);
    }

    @Override
    public Profesor obtenerProfesorPorId(int id) {
        return profesorRepositorio.findById(id).get();
    }

    @Override
    public Profesor actualizarProfesor(Profesor profesor) {
        return profesorRepositorio.save(profesor);
    }

    @Override
    public void eliminarProfesor(int id) {
        profesorRepositorio.deleteById(id);
    }
}

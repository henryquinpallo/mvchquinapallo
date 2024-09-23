package com.itsqmet.hquinapallo.servicios;

import com.itsqmet.hquinapallo.modelo.Profesor;

import java.util.List;

public interface IProfesorServicio {

    public List<Profesor> listaProfesor();
    public Profesor guardarProfesor(Profesor profesor);
    public Profesor obtenerProfesorPorId(int id);
    public Profesor actualizarProfesor(Profesor profesor);
    public void eliminarProfesor(int id);
}

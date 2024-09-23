package com.itsqmet.hquinapallo.servicios;

import com.itsqmet.hquinapallo.modelo.Estudiante;

import java.util.List;

public interface IEstudianteServicio {

    public List<Estudiante> listarEstudiante();
    public Estudiante guardarEstudiante(Estudiante estudiante);
    public Estudiante obtenerEstudiantePorId(int id);
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(int id);
}

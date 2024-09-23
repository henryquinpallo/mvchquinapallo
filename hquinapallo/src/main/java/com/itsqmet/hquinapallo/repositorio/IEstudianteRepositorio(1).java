package com.itsqmet.hquinapallo.repositorio;

import com.itsqmet.hquinapallo.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepositorio  extends JpaRepository<Estudiante, Integer> {
}

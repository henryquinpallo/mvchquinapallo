package com.itsqmet.hquinapallo.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "db.Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    private String cursoNombre;
}

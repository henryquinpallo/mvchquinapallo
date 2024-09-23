package com.itsqmet.hquinapallo.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "db.Matricula")
public class Matricula  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatricula;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "fkMatricula")
    private Estudiante fkEstudiante;
}
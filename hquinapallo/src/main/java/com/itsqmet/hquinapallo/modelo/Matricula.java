package com.itsqmet.hquinapallo.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "db.Matricula")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatricula;
    private String nombre;
}

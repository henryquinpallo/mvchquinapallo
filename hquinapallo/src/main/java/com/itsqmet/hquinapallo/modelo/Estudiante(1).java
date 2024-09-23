package com.itsqmet.hquinapallo.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "db.Estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    private String nombre;
    private String direccion;
}

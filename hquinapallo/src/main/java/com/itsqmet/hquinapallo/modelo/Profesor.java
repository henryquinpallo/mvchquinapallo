package com.itsqmet.hquinapallo.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "db.Profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    private String nombre;
    private String direccion;

}

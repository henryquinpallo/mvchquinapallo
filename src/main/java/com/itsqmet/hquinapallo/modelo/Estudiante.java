package com.itsqmet.hquinapallo.modelo;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "db.Estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    private String nombre;
    private String direccion;

    @OneToMany(mappedBy = "fkMatricula")
    private List<Matricula> listaMatricula= new ArrayList<>();

}

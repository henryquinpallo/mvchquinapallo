package com.itsqmet.hquinapallo.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb.Aula")
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAula;
    private String nombreAula;
}

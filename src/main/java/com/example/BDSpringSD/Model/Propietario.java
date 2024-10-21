package com.example.BDSpringSD.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Propietario")
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String nombre;

    private String direccion;

    private String telefono;




}

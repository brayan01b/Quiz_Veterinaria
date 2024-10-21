package com.example.BDSpringSD.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@Table(name = "Mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int codigo;

    private String nombre;

    private String especie;

    private String raza;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;
}

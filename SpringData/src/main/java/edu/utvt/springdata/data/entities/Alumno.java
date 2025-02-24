package edu.utvt.springdata.data.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue(value = "1")
public class Alumno extends Usuario {
    public Alumno(String nombre, String apellidos, String email, Date fechaNacimiento) {
        super(null, nombre, apellidos, email, fechaNacimiento);
    }
}

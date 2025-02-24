package edu.utvt.springdata.data.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@DiscriminatorValue( value = "2")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Administrativo extends Usuario {

    private Double salario;

    public Administrativo(String nombre, String apellidos, String email, Date fechaNacimiento, Double salario) {
        super(null, nombre, apellidos, email, fechaNacimiento);
        this.salario = salario;
    }
}

package com.user.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Entity
@AllArgsConstructor
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @Email(message = "El correo electrónico debe ser válido")
    @NotBlank(message = "El correo electrónico es obligatorio")
    private String email;

    @NotNull(message = "La edad no puede ser nula")
    @PositiveOrZero(message = "La edad debe ser un número positivo o cero")
    @Min(value = 18, message = "El usuario debe ser mayor de edad")
    private Integer age;
}

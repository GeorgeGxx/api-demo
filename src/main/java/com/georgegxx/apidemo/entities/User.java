package com.georgegxx.apidemo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @NotBlank(message ="no puede estar en blanco")
//    @Size(min=4, max=12, message="el tamaño tiene que estar entre 4 y 12")
//    @Column(nullable=false)
//    @Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre solo puede contener letras")
    private String name;

    @NotBlank(message ="no puede estar en blanco")
    private String lastname;

    @NotEmpty(message ="no puede estar vacio")
    @Email(message="no es una dirección de correo bien formada")
//    @Column(nullable=false, unique=true)
    private String email;

    @NotBlank(message ="no puede estar en blanco")
    @Size(min=4, max=12, message="el tamaño tiene que estar entre 4 y 12")
//    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "El nombre de usuario solo puede contener letras y números")
    private String username;

    @NotBlank(message ="no puede estar en blanco")
//    @Pattern(regexp = "^[0-9]+$", message = "La contraseña solo puede contener números")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

package com.eddy.springAws.models;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;

@Data
@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime fechaRegistro;

    @PrePersist
    void prePersist(){
        fechaRegistro = LocalDateTime.now();
    }
}

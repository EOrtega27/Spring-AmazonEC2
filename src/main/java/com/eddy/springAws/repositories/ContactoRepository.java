package com.eddy.springAws.repositories;

import com.eddy.springAws.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "contactos", collectionResourceRel = "contactos")
public interface ContactoRepository extends JpaRepository<Contacto, Long> {
    List<Contacto> findAllByOrderByName();
}
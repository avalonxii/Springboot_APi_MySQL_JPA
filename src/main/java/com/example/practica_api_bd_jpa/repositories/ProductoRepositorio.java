package com.example.practica_api_bd_jpa.repositories;

import com.example.practica_api_bd_jpa.model.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepositorio extends JpaRepository<ProductoEntity, Long> {

        @Query("SELECT p FROM ProductoEntity p WHERE p.nombre LIKE ?1")
        List<ProductoEntity> findByNombre(String nombre);
}

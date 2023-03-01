package com.example.practica_api_bd_jpa.repositories;

import com.example.practica_api_bd_jpa.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
    @Query("SELECT u FROM UsuarioEntity u WHERE u.email LIKE ?1")
    List<UsuarioEntity> findByEmail(String nombre);
}

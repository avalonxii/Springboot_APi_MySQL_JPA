package com.example.practica_api_bd_jpa.controller;

import com.example.practica_api_bd_jpa.model.UsuarioEntity;
import com.example.practica_api_bd_jpa.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ApiController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/usuarios")
    public List<UsuarioEntity> allElements() {
        return usuarioRepository.findAll();
    }

    @RequestMapping("/usuarios/{id}")
    public Optional<UsuarioEntity> findById(@PathVariable("id") Long id) {
        return usuarioRepository.findById(id);
    }

    @PostMapping("/usuarios")
    public UsuarioEntity save(@RequestBody UsuarioEntity usuario) {

        return usuarioRepository.save(usuario);
    }

    @PutMapping("/usuarios/{id}")
    public UsuarioEntity update(@PathVariable("id") Long id, @RequestBody UsuarioEntity usuario) {
        usuario.setId(id.intValue());
        return usuarioRepository.save(usuario);
    }

    @DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
    }
}

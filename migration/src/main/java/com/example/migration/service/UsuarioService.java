package com.example.migration.service;

import com.example.migration.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> findAll();

    Usuario save(Usuario usuario);

    void deleteUsuario(long id);

    Usuario updateUsuario(Usuario usuario, long id);
}

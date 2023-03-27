package com.jose.springboot.backend.eventos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jose.springboot.backend.eventos.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Integer>{

}

package com.jose.springboot.backend.eventos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jose.springboot.backend.eventos.models.entity.DatosUsuario;

public interface IDatosUsuarioDao extends CrudRepository<DatosUsuario, Integer> {

}

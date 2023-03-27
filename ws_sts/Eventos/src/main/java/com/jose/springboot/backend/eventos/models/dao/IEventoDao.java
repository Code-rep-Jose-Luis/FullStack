package com.jose.springboot.backend.eventos.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jose.springboot.backend.eventos.models.entity.Evento;

public interface IEventoDao extends CrudRepository<Evento,Integer>{
	List<Evento> findAllByOrderByIdAsc();
}
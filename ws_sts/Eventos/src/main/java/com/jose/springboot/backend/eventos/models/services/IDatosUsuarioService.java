package com.jose.springboot.backend.eventos.models.services;

import java.util.List;



import com.jose.springboot.backend.eventos.models.entity.DatosUsuario;


public interface IDatosUsuarioService {

	public List<DatosUsuario> findAll();
	public DatosUsuario findById(Integer id);
	public void deleteById(Integer id);
	public DatosUsuario save(DatosUsuario cliente);
}

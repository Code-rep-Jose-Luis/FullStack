package com.jose.springboot.backend.eventos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jose.springboot.backend.eventos.models.dao.IEventoDao;
import com.jose.springboot.backend.eventos.models.entity.Evento;

import com.jose.springboot.backend.eventos.utilidades.ImageUtils;

@Service
public class EventoServiceImpl implements IEventoService{

	private final ImageUtils imageUtils = new ImageUtils();
	
	@Autowired
	private IEventoDao eventoDao;

	@Override
	@Transactional(readOnly=true)
	public List<Evento> findAll() {
		return eventoDao.findAllByOrderByIdAsc();
	}

	@Override
	@Transactional(readOnly=true)
	public Evento findById(int id) {
		return eventoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(int id) {
		eventoDao.deleteById(id);		
	}

	@Override
	@Transactional
	public Evento save(Evento evento) {
		if(evento.getImagen()!=null) {
			String ruta = imageUtils.saveImageBase64("eventos", evento.getImagen());
		        evento.setImagen(ruta);
		}
		return eventoDao.save(evento);
	}

}
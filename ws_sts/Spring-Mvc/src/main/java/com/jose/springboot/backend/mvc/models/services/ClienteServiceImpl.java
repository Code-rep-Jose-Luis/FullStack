package com.jose.springboot.backend.mvc.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jose.springboot.backend.mvc.models.dao.IclienteDao;
import com.jose.springboot.backend.mvc.models.entity.Cliente;



@Service
public class ClienteServiceImpl implements IclienteService {

	@Autowired
	private IclienteDao clienteDao;
	
	@Override
	@Transactional(readOnly=true) // Auto-exiges que no puedan modificarse los datos dentro del metodo
	public List<Cliente> findAll() {
		return  (List<Cliente>)clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}



	@Override
	@Transactional
	public void deleteById(Long id) {
		clienteDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}
	

}

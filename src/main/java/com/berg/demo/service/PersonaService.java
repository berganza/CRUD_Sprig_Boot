package com.berg.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berg.demo.interfaceService.IPersonaService;
import com.berg.demo.interfaces.IPersona;
import com.berg.demo.modelo.Persona;

@Service
public class PersonaService implements IPersonaService {
	
	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() {
		return (List<Persona>) data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		return data.findById(id);
	}
	
	int contador = 0;
	@Override
	public int save(Persona p) {
		Persona persona = data.save(p);
		if(persona.equals(null)) {
			contador = 1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
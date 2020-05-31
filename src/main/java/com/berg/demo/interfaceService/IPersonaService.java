package com.berg.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.berg.demo.modelo.Persona;

public interface IPersonaService {
	
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
}
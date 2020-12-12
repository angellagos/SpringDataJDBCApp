package pe.edu.tecsup.springbootapp.services;

import java.util.List;

import pe.edu.tecsup.springbootapp.models.Categoria;

public interface CategoriaService {

	//Listar todas las categorias
	public List<Categoria> listar() throws Exception;
	
}

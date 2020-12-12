package pe.edu.tecsup.springbootapp.services;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.tecsup.springbootapp.models.Categoria;

@SpringBootTest
public class CategoriaServiceTest {

	@Autowired
	CategoriaService categoriaService;
	
	@Test
	public void testListar() throws Exception{
		List<Categoria> cats = categoriaService.listar();
		System.out.println(cats.isEmpty());
		assertThat(cats.isEmpty(), is(false));
	}
}

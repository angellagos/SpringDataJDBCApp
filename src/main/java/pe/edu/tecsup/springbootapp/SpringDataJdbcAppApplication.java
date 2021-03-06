package pe.edu.tecsup.springbootapp;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.tecsup.springbootapp.models.Producto;
import pe.edu.tecsup.springbootapp.services.ProductoService;

@SpringBootApplication
public class SpringDataJdbcAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcAppApplication.class, args);
	}

	private static Logger log = LoggerFactory.getLogger(SpringDataJdbcAppApplication.class);
	@Autowired
	private ProductoService productoService;

	@Override
	public void run(String... args) throws Exception {
		List<Producto> productos = productoService.listar();
		log.info(" - Lista de Productos--------------- ");
		for (Producto producto : productos) {
			log.info("--> " + producto);
		}
		log.info(" ----------------------------------- ");
		Producto productoNuevo = new Producto();
		productoNuevo.setCategorias_id(2L);
		productoNuevo.setNombre("Kingstone");
		productoNuevo.setDescripcion("Kingstone 64GB DDR3");
		productoNuevo.setPrecio(80.0);
		productoNuevo.setStock(12);
		productoService.registrar(productoNuevo);
		log.info(" - Producto Registrado --------------- ");
		log.info("--> " + productoNuevo);
		log.info(" ------------------------------------- ");
		productos = productoService.listar();
		log.info(" - Lista de Productos--------------- ");
		for (Producto producto : productos) {
			log.info("--> " + producto);
		}
		log.info(" ----------------------------------- ");
	}
}

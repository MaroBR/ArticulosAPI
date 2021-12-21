package com.micro.api.APIArt.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micro.api.APIArt.modelo.copy.Producto;
import com.micro.api.APIArt.servicio.ProductoServ;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/micro/v1.0")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductoControl {
	
	private final ProductoServ productoServ;
	
	@PostMapping("/producto")
	public void save(@RequestBody Producto producto) {
		productoServ.save(producto);
	}
	
	@GetMapping("/producto")
	public List<Producto> findAll(){
		return productoServ.findAll();
		
	}
	
	@GetMapping("/producto/{id}")
	public Producto findById(@PathVariable String id) {
		return productoServ.findById(id).get();
	}

	@DeleteMapping("/producto/{id}")
	public void deleteById(@PathVariable String id) {
		productoServ.delete(id);
	}
	
}

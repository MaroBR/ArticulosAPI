package com.micro.api.APIArt.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import lombok.*;
import com.micro.api.APIArt.modelo.copy.Producto;
import com.micro.api.APIArt.repositorio.ProductoRepo;


@Service
@RequiredArgsConstructor
public class ProductoServ {
	private final ProductoRepo productoRepo;
	
	public void save (Producto producto) {
		productoRepo.save(producto);
	}
	
	public List<Producto> findAll(){
		return productoRepo.findAll();
	}
	
	public Optional<Producto> findById (String id){
		return productoRepo.findById(id);
	}
	
	public void delete(String id) {
		productoRepo.deleteById(id);
	}

}

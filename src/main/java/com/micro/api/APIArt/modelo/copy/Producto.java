package com.micro.api.APIArt.modelo.copy;

import javax.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="productos")
public class Producto {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
	private String id;
	private String nombre;
	private String unidad;
	private String clave;
	private String precio;
}

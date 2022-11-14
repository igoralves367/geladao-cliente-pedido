package br.com.casadogeladao.geladaoclientepedido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/") 
public class GeladaoClientePedidoApplication {
	
	@GetMapping
	public String getHomeTeste () {
		return "Geladao Cliente Pedido - Novo API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(GeladaoClientePedidoApplication.class, args);
	}

}

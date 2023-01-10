package br.com.casadogeladao.geladaoclientepedido.pedido.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;

import br.com.casadogeladao.geladaoclientepedido.pedido.application.api.PedidoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPedido", updatable = false, unique = true, nullable = false)
	private UUID idPedido;
	@Column(columnDefinition = "uuid", name = "idClientePedido", nullable = false)
	private UUID idClientePedido;
	@Enumerated(EnumType.STRING)
	private Sabor sabor;
	private int quantidade;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Pedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		this.idClientePedido = idCliente;
		this.sabor = pedidoRequest.getSabor();
		this.quantidade = pedidoRequest.getQuantidade();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}
}
//definimos o modelo de negocio, dominio e construtor
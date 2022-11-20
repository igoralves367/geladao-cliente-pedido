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
import javax.validation.constraints.NotNull;

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
	@NotNull
	@Column(columnDefinition = "uuid", name = "idCliente", nullable = false)
	private UUID idCliente;
	@Enumerated(EnumType.STRING)
	private Sabor sabor;
	private int quantidade;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
//	public Pet(UUID idCliente, @Valid PetRequest petRequest) {
//		this.idClienteTutor = idCliente;
//		this.nomePet = petRequest.getNomePet();
//		this.porte = petRequest.getPorte();
//		this.tipo = petRequest.getTipo();
//		this.microchip = petRequest.getMicrochip();
//		this.raca = petRequest.getRaca();
//		this.sexo = petRequest.getSexo();
//		this.pelagemCor = petRequest.getPelagemCor();
//		this.dataNascimento = petRequest.getDataNascimento();
//		this.rga = petRequest.getRga();
//		this.peso = petRequest.getPeso();
//		this.dataHoraDoCadastro = LocalDateTime.now();
//	}
//
//	public void altera(PetAlteracaoRequest petRequest) {
//		this.nomePet = petRequest.getNomePet();
//		this.porte = petRequest.getPorte();
//		this.tipo = petRequest.getTipo();
//		this.microchip = petRequest.getMicrochip();
//		this.raca = petRequest.getRaca();
//		this.sexo = petRequest.getSexo();
//		this.pelagemCor = petRequest.getPelagemCor();
//		this.dataNascimento = petRequest.getDataNascimento();
//		this.rga = petRequest.getRga();
//		this.peso = petRequest.getPeso();
//		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();	
//	}
}
//definimos o modelo de negocio, dominio e construtor
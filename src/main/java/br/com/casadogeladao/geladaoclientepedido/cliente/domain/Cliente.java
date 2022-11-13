package br.com.casadogeladao.geladaoclientepedido.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {
	@Id
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotNull
	private LocalDateTime dataNascimento;
	@CPF
	private String cpf; 
	@NotNull
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	
	public Cliente(UUID idCliente, @NotBlank String nomeCompleto, @NotBlank @Email String email,
			@NotBlank String celular, String telefone, Sexo sexo, @NotNull LocalDateTime dataNascimento,
			@CPF String cpf, @NotNull Boolean aceitaTermos) {
		this.idCliente = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.celular = celular;
		this.telefone = telefone;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.aceitaTermos = aceitaTermos;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
	

}

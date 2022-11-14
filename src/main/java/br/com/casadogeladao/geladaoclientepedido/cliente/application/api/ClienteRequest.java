package br.com.casadogeladao.geladaoclientepedido.cliente.application.api;

import java.time.LocalDateTime;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import br.com.casadogeladao.geladaoclientepedido.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequest {
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
}

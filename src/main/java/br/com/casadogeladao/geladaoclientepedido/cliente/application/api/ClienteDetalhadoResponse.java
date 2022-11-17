package br.com.casadogeladao.geladaoclientepedido.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;
import br.com.casadogeladao.geladaoclientepedido.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
    private String nomeCompleto;
	private String cpf; 
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private Boolean aceitaTermos;
	private LocalDateTime dataHoraDoCadastro;
}

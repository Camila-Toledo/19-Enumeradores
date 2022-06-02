package br.com.glandata.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
public enum PerfilUsuario {

	USER(1, "Usuario", "Pode realizar consultas"), 
	ADMIN(2, "Administrador", "Pode parametrizar o sistema"),
	GER(3, "Gerente", "Pode lançar informações críticas");

	private int codigo;

	private String nome;

	private String descricao;

}

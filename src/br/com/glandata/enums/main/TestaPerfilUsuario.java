package br.com.glandata.enums.main;

import br.com.glandata.enums.PerfilUsuario;

public class TestaPerfilUsuario {

	public static void main(String[] args) {

		PerfilUsuario perfil1 = PerfilUsuario.USER;
		System.out.println(perfil1);

		String perfil2 = "ADMIN";
		System.out.println(PerfilUsuario.valueOf(perfil2));

		PerfilUsuario perfil3 = PerfilUsuario.valueOf("GER");
		System.out.println(perfil3.getDescricao());

	}
}

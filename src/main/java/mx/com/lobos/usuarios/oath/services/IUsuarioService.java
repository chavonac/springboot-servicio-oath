package mx.com.lobos.usuarios.oath.services;

import mx.com.lobos.usuarios.commons.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}

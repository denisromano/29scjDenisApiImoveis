package br.com.fiap.scjdenisapi.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.scjdenisapi.model.Login;
import br.com.fiap.scjdenisapi.repository.LoginRepository;

@Component
public class LoginComponent {

	@Autowired
	LoginRepository loginRepository;

	public void salvar(Login login) {
		List<Login> user = loginRepository.findByUsuario(login.getUsuario());
		if (!user.isEmpty()) {
			login.setId(user.get(0).getId());
		}
		loginRepository.save(login);
	}

	public Login buscarLogin(String usuario) {

		List<Login> user = loginRepository.findByUsuario(usuario);

		if (user.isEmpty()) {
			return new Login();
		} else {
			return user.get(0);
		}

	}

	public List<Login> buscarTodos() {
		return loginRepository.findAll();
	}

	public void apagar(String usuario) {

		List<Login> usuarios = loginRepository.findByUsuario(usuario);
		if (!usuarios.isEmpty()) {
			loginRepository.delete(usuarios.get(0));
		}
	}

}

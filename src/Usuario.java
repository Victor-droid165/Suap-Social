// Declaração da classe Usuário com os métodos construtor, set, get, add, equals, toString.

import java.util.ArrayList;

/**
 * Essa classe modela o conceito do que é um usuário na vida real, onde estão
 * contidos os atributos e os comportamentos para o mesmo.
 * 
 * <p>
 * Atributos da classe Usuario:
 * 
 * <blockquote>
 * 
 * <pre>
 * <code>ArrayList<code> perfis - Uma lista com todos os perfis do usuário
 * <code>String<code> login - O login do perfil (Nome que o usuário usa para efetuar o login, i.e. username)
 * <code>String<code> senha - A senha que o usuário utiliza para logar no app
 * <code>String<code> email - O email do usuário
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @author victoremanuel
 * @author rubenssilva
 *
 */

public class Usuario {

	private String login, senha, email; // informações para login (nome de usuário e senha) e o email do usuário
	private ArrayList<Object> perfis; // Lista dos perfis desse Usuário

	/**
	 * Construtor usuário
	 * 
	 * @param iniciaLogin o login do usuário
	 * @param iniciaSenha a senha do usuário
	 * @param iniciaEmail o email do usuário
	 */

	public Usuario(String iniciaLogin, String iniciaSenha, String iniciaEmail) {
		setLogin(iniciaLogin); // Configura login, consequentemente, o inicializa
		setSenha(iniciaSenha); // Configura senha, consequentemente, a inicializa
		setEmail(iniciaEmail); // Configura email, consequentemente, o inicializa
		this.perfis = new ArrayList<Object>(); // Inicializa perfis
	} // Fim do construtor Usuario com 3 argumentos

	/**
	 * Obtém login
	 * 
	 * @return um <code>String<code> especificando o login
	 */

	public String getLogin() {
		return this.login;
	} // Fim do método getLogin

	/**
	 * Configura login
	 * 
	 * @param novoLogin o login para a configuração
	 */

	public void setLogin(String novoLogin) {
		this.login = novoLogin;
	} // Fim do método setLogin

	/**
	 * Obtém senha
	 * 
	 * @return um <code>String<code> especificando a senha
	 */

	public String getSenha() {
		return this.senha;
	} // Fim do método getSenha

	/**
	 * Configura senha
	 * 
	 * @param novaSenha a senha para a configuração
	 */

	public void setSenha(String novaSenha) {
		this.senha = novaSenha;
	} // Fim do método setSenha

	/**
	 * Obtém email
	 * 
	 * @return um <code>String<code> especificando o email
	 */

	public String getEmail() {
		return this.email;
	}// Fim do método getEmail

	/**
	 * Configura email
	 * 
	 * @param novoEmail o email para a configuração
	 */

	public void setEmail(String novoEmail) {
		this.email = novoEmail;
	}// Fim do método setEmail

	/**
	 * Obtém perfis
	 * 
	 * @return um <code>ArrayList<code> especificando os perfis
	 */

	public ArrayList<Object> getPerfis() {
		return this.perfis;
	} // Fim do método getPerfis

	/**
	 * Configura perfis
	 * 
	 * @param novoPerfis os perfis para a configuração
	 */

	public void setPerfis(ArrayList<Object> novoPerfis) {
		this.perfis = novoPerfis;
	} // Fim do método setPerfis

	/**
	 * Adiciona um perfil à lista de perfis
	 * 
	 * @param meuPerfil o perfil a ser adicionado
	 */

	public void addPerfil(Object meuPerfil) {
		try {
			this.perfis.add((PerfilAluno) meuPerfil);
		} catch (java.lang.ClassCastException castExc) {
			try {
				this.perfis.add((PerfilProfessor) meuPerfil);
			} catch (java.lang.ClassCastException castExc2) {
				this.perfis.add((PerfilTurma) meuPerfil);
			}
		}
	}// Fim do método addPerfil

	/**
	 * O método equals compara dois objetos
	 * 
	 * @param meuObjeto o objeto com o qual você deseja comparar.
	 * @return {@code true} Se esse objeto for igual ao argumento meuObjeto;
	 *         {@code false} se não forem iguais.
	 */

	public boolean equals(Object meuObjeto) {
		if (!(meuObjeto instanceof Usuario))
			return false;
		Usuario comparandoObjeto = (Usuario) meuObjeto;
		if (this.getLogin().equals(comparandoObjeto.getLogin()))
			return true;
		return false;
	} // Fim do método equals

	/**
	 * O método toString retorna uma string que representa "textualmente" o objeto
	 * 
	 * @return uma representação de <code>String<code> do objeto
	 */

	public String toString() {
		return getLogin() + "\n" + getSenha() + "\n" + getEmail();
	} // Fim do método toString
}

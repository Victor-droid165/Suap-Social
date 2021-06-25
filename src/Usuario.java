// Declara��o da classe Usu�rio com os m�todos construtor, set, get, add, equals, toString.

import java.util.ArrayList;

/**
 * Essa classe modela o conceito do que � um usu�rio na vida real, onde est�o
 * contidos os atributos e os comportamentos para o mesmo.
 * 
 * <p>
 * Atributos da classe Usuario:
 * 
 * <blockquote>
 * 
 * <pre>
 * <code>ArrayList<code> perfis - Uma lista com todos os perfis do usu�rio
 * <code>String<code> login - O login do perfil (Nome que o usu�rio usa para efetuar o login, i.e. username)
 * <code>String<code> senha - A senha que o usu�rio utiliza para logar no app
 * <code>String<code> email - O email do usu�rio
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

	private String login, senha, email; // informa��es para login (nome de usu�rio e senha) e o email do usu�rio
	private ArrayList<Object> perfis; // Lista dos perfis desse Usu�rio

	/**
	 * Construtor usu�rio
	 * 
	 * @param iniciaLogin o login do usu�rio
	 * @param iniciaSenha a senha do usu�rio
	 * @param iniciaEmail o email do usu�rio
	 */

	public Usuario(String iniciaLogin, String iniciaSenha, String iniciaEmail) {
		setLogin(iniciaLogin); // Configura login, consequentemente, o inicializa
		setSenha(iniciaSenha); // Configura senha, consequentemente, a inicializa
		setEmail(iniciaEmail); // Configura email, consequentemente, o inicializa
		this.perfis = new ArrayList<Object>(); // Inicializa perfis
	} // Fim do construtor Usuario com 3 argumentos

	/**
	 * Obt�m login
	 * 
	 * @return um <code>String<code> especificando o login
	 */

	public String getLogin() {
		return this.login;
	} // Fim do m�todo getLogin

	/**
	 * Configura login
	 * 
	 * @param novoLogin o login para a configura��o
	 */

	public void setLogin(String novoLogin) {
		this.login = novoLogin;
	} // Fim do m�todo setLogin

	/**
	 * Obt�m senha
	 * 
	 * @return um <code>String<code> especificando a senha
	 */

	public String getSenha() {
		return this.senha;
	} // Fim do m�todo getSenha

	/**
	 * Configura senha
	 * 
	 * @param novaSenha a senha para a configura��o
	 */

	public void setSenha(String novaSenha) {
		this.senha = novaSenha;
	} // Fim do m�todo setSenha

	/**
	 * Obt�m email
	 * 
	 * @return um <code>String<code> especificando o email
	 */

	public String getEmail() {
		return this.email;
	}// Fim do m�todo getEmail

	/**
	 * Configura email
	 * 
	 * @param novoEmail o email para a configura��o
	 */

	public void setEmail(String novoEmail) {
		this.email = novoEmail;
	}// Fim do m�todo setEmail

	/**
	 * Obt�m perfis
	 * 
	 * @return um <code>ArrayList<code> especificando os perfis
	 */

	public ArrayList<Object> getPerfis() {
		return this.perfis;
	} // Fim do m�todo getPerfis

	/**
	 * Configura perfis
	 * 
	 * @param novoPerfis os perfis para a configura��o
	 */

	public void setPerfis(ArrayList<Object> novoPerfis) {
		this.perfis = novoPerfis;
	} // Fim do m�todo setPerfis

	/**
	 * Adiciona um perfil � lista de perfis
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
	}// Fim do m�todo addPerfil

	/**
	 * O m�todo equals compara dois objetos
	 * 
	 * @param meuObjeto o objeto com o qual voc� deseja comparar.
	 * @return {@code true} Se esse objeto for igual ao argumento meuObjeto;
	 *         {@code false} se n�o forem iguais.
	 */

	public boolean equals(Object meuObjeto) {
		if (!(meuObjeto instanceof Usuario))
			return false;
		Usuario comparandoObjeto = (Usuario) meuObjeto;
		if (this.getLogin().equals(comparandoObjeto.getLogin()))
			return true;
		return false;
	} // Fim do m�todo equals

	/**
	 * O m�todo toString retorna uma string que representa "textualmente" o objeto
	 * 
	 * @return uma representa��o de <code>String<code> do objeto
	 */

	public String toString() {
		return getLogin() + "\n" + getSenha() + "\n" + getEmail();
	} // Fim do m�todo toString
}

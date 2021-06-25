
// Declara��o da classe Perfil com os m�todos construtor, set, get, add, equals, toString, segue
import java.util.ArrayList;

/**
 * Essa classe modela o conceito do que � um perfil do usu�rio na vida real,
 * onde est�o contidos os atributos e os comportamentos para o mesmo
 * 
 * <p>
 * Atributos da classe Perfil:
 * 
 * 
 * <blockquote>
 * 
 * <pre>
 * <code>ArrayList<code> postagens - Uma lista com todas as postagens feitas pelo perfil
 * <code>ArrayList<code> seguidores - Uma lista com todos os seguidores do perfil
 * <code>ArrayList<code> seguindo - Uma lista com todos os perfis que o perfil segue
 * <code>String<code> descricao - A descri��o do perfil
 * <code>String<code> nome - O nome do perfil
 * <code>String<code> site - O link para a p�gina do perfil
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @author victoremanuel
 * @author rubenssilva
 *
 */

public abstract class Perfil {
	private ArrayList<Postagem> postagens; // Lista das postagens feitas pelo perfil
	private ArrayList<Object> seguidores, seguindo; // Lista dos seguidores e das pessoas que o perfil est� seguindo
	private String descricao, nome, site; // Descri��o do perfil, nome do perfil, link para acessar a p�gina do perfil,
											// g�nero do perfil
	protected static int CODIGO; // Atribuidor de valor �nico para o perfil

	/**
	 * Construtor perfil
	 * 
	 * @param iniciaDescricao a descri��o do perfil do usu�rio
	 * @param iniciaNome      o nome do perfil do usu�rio
	 * @param iniciaSite      o site do perfil do usu�rio
	 */

	public Perfil(String iniciaDescricao, String iniciaNome, String iniciaSite) {
		setDescricao(iniciaDescricao); // Configura e, consequentemente, inicializa quemsou
		setNome(iniciaNome); // Configura e, consequentemente, inicializa nome
		setSite(iniciaSite); // Configura e, consequentemente, inicializa site
		setPostagens(new ArrayList<Postagem>()); // Configura e, consequentemente, inicializa postagens
		setSeguidores(new ArrayList<Object>()); // Configura e, consequentemente, Inicializa seguidores
		setSeguindo(new ArrayList<Object>()); // Configura e, consequentemente, Inicializa seguindo
	} // Fim do construtor Perfil com 3 argumentos

	/**
	 * Obt�m postagens
	 * 
	 * @return um <code>ArrayList<code> especificando as postagens
	 */

	public ArrayList<Postagem> getPostagens() {
		return this.postagens;
	} // Fim do m�todo getPostagens

	/**
	 * Configura o postagens
	 * 
	 * @param novoPostagens as postagens para a configura��o
	 */

	public void setPostagens(ArrayList<Postagem> novoPostagens) {
		this.postagens = novoPostagens;
	} // Fim do m�todo setPostagens

	/**
	 * Obt�m seguidores
	 * 
	 * @return um <code>ArrayList<code> especificando os seguidores
	 */

	public ArrayList<Object> getSeguidores() {
		return this.seguidores;
	} // Fim do m�todo getSeguidores

	/**
	 * Configura o seguidores
	 * 
	 * @param novoSeguidores os seguidores para a configura��o
	 */

	public void setSeguidores(ArrayList<Object> novoSeguidores) {
		this.seguidores = novoSeguidores;
	} // Fim do m�todo setSeguidores

	/**
	 * Obt�m seguindo
	 * 
	 * @return um <code>ArrayList<code> especificando os seguindo
	 */

	public ArrayList<Object> getSeguindo() {
		return this.seguindo;
	}// Fim do m�todo getSeguindo

	/**
	 * Configura o seguindo
	 * 
	 * @param novoSeguindo os seguindo para a configura��o
	 */

	public void setSeguindo(ArrayList<Object> novoSeguindo) {
		this.seguindo = novoSeguindo;
	}// Fim do m�todo setSeguindo

	/**
	 * Obt�m descricao
	 * 
	 * @return um <code>String<code> especificando a descricao
	 */

	public String getDescricao() {
		return this.descricao;
	}// Fim do m�todo getDescricao

	/**
	 * Configura a descricao do perfil
	 * 
	 * @param novoDescricao a descricao do perfil para a configura��o
	 */

	public void setDescricao(String novoDescricao) {
		this.descricao = novoDescricao;
	} // Fim do m�todo setDescricao

	/**
	 * Obt�m nome
	 * 
	 * @return um <code>String<code> especificando o nome
	 */

	public String getNome() {
		return this.nome;
	} // Fim do m�todo getNome

	/**
	 * Configura o nome
	 * 
	 * @param novoNome o nome para a configura��o
	 */

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}// Fim do m�todo setNome

	/**
	 * Obt�m site
	 * 
	 * @return um <code>String<code> especificando o site
	 */

	public String getSite() {
		return this.site;
	} // Fim do m�todo getSite

	/**
	 * Configura o site
	 * 
	 * @param novoSite o site para a configura��o
	 */

	public void setSite(String novoSite) {
		this.site = novoSite;
	} // Fim do m�todo setSite

	/**
	 * Segue outro perfil � o mesmo que adicionar um perfil na lista de seguindo
	 * 
	 * @param perfilASeguir o perfil a ser seguido (o perfil a ser adicionado no
	 *                      ArrayList seguindo)
	 */

	public void segue(Object perfilASeguir) {
		try {
			this.seguindo.add((PerfilAluno) perfilASeguir);
		} catch (java.lang.ClassCastException castExc) {
			try {
				this.seguindo.add((PerfilProfessor) perfilASeguir);
			} catch (java.lang.ClassCastException castExc2) {
				this.seguindo.add((PerfilTurma) perfilASeguir);
			}
		}
		try {
			((PerfilAluno) perfilASeguir).addSeguidor((Object) this);
		} catch (java.lang.ClassCastException castExc) {
			try {
				((PerfilProfessor) perfilASeguir).addSeguidor((Object) this);
			} catch (java.lang.ClassCastException castExc2) {
				((PerfilTurma) perfilASeguir).addSeguidor((Object) this);
			}
		}
	} // Fim do m�todo segue

	/**
	 * Adiciona postagem � lista de postagens
	 * 
	 * @param post a postagem a ser adicionada no ArrayList postagens do perfil
	 */

	public void addPostagem(Postagem post) {
		this.postagens.add(post);
	} // Fim do m�todo addPostagem

	/**
	 * Adiciona o seguidor � lista de seguidores
	 * 
	 * @param meuSeguidor seguidor a ser adicionado no ArrayList seguidores
	 * 
	 */

	protected void addSeguidor(Object meuSeguidor) {
		try {
			PerfilAluno meuSeguidor2 = (PerfilAluno) meuSeguidor;
			this.seguidores.add(meuSeguidor2);
		} catch (java.lang.ClassCastException castExc) {
			PerfilProfessor meuSeguidor2 = (PerfilProfessor) meuSeguidor;
			this.seguidores.add(meuSeguidor2);
		}
	} // Fim do m�todo addSeguidor

	/**
	 * O m�todo equals compara dois objetos
	 * 
	 * @param meuObjeto o objeto com o qual voc� deseja comparar.
	 * @return {@code true} Se esse objeto for igual ao argumento meuObjeto;
	 *         {@code false} se n�o forem iguais.
	 */

	public boolean equals(Object meuObjeto) {
		if (!(meuObjeto instanceof Perfil))
			return false;
		Perfil comparandoObjeto = (Perfil) meuObjeto;
		if (this.getSite().equals(comparandoObjeto.getSite()))
			return true;
		return false;
	} // Fim do m�todo equals

	/**
	 * O m�todo toString retorna uma string que representa "textualmente" o objeto
	 * 
	 * @return uma representa��o de <code>String<code> do objeto
	 */

	public String toString() {
		if (getDescricao().equals(""))
			return "\t" + getNome() + "\n\t" + "\n\t" + getSite();
		return "\t" + getNome() + "\n\t" + getDescricao() + "\n\t" + "\n\t" + getSite();
	} // Fim do m�todo toString
}

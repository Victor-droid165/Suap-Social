// Declara��o da classe PerfilServidorPublico com os m�todos e atributos herdados de PerfilPessoaIntegranteIFPB

import java.util.Date;

/**
 * Essa classe modela um conceito abstrato de um perfil utilizado por um
 * servidor p�blico do IF, onde est�o contidos os atributos e os comportamentos
 * para o mesmo.
 * 
 * <p>
 * Atributos da classe PerfilPessoaIntegranteIFPB:
 * 
 * <blockquote>
 * 
 * <pre>
* <code>ArrayList<code> postagens - (Herdado) Uma lista com todas as postagens feitas pelo perfil
* <code>ArrayList<code> seguidores - (Herdado) Uma lista com todos os seguidores do perfil
* <code>ArrayList<code> seguindo - (Herdado) Uma lista com todos os perfis que o perfil segue
* <code>String<code> descricao - (Herdado) A descri��o do perfil
* <code>String<code> nome - (Herdado) O nome do perfil
* <code>String<code> site - (Herdado) O link para a p�gina do perfil
* <code>String<code> genero - (Herdado) O g�nero da pessoa que possui o perfil
* <code>String<code> dataNascimento - (Herdado) A data de nascimento da pessoa que possui o perfil
* <code>String<code> dataIngressoInstituicao - (Herdado) A data que a pessoa entrou no IF para estudar ou exercer uma profiss�o
 * </pre>
 * 
 * </blockquote> <code>String<code> curriculo - O link para o curriculo Lattes
 * do servidor p�blico
 * </pre>
 * </blockquote>
 * 
 * @see java.lang.Object
 * @see PerfilPessoaIntegranteIFPB;
 * @author victoremanuel
 * @author rubenssilva
 *
 */

public abstract class PerfilServidorPublico extends PerfilPessoaIntegranteIFPB {
	private String curriculo; // link do curriculo Lattes

	/**
	 * Construtor PerfilServidorPublico
	 * 
	 * @param iniciaDescricaoPerfil         a descri��o do perfil do usu�rio
	 * @param iniciaNomePerfil              o nome do perfil do usu�rio
	 * @param iniciaGeneroPerfil            o g�nero do perfil do usu�rio
	 * @param iniciaMatricula               a matr�cula do servidor p�blico que foi
	 *                                      gerada automaticamente pelo sistema
	 * @param iniciaDataNascimento          a data de nascimento do servidor p�blico
	 * @param iniciaDataIngressoInstituicao a data que o servidor p�blico come�ou a
	 *                                      exercer sua profiss�o
	 * @param iniciaCurriculo               o link para acessar o CV do servidor
	 *                                      p�blico.
	 */
	public PerfilServidorPublico(String iniciaDescricaoPerfil, String iniciaNomePerfil, String iniciaGeneroPerfil,
			String iniciaMatricula, Date iniciaDataNascimento, Date iniciaDataIngressoInstituicao,
			String iniciaCurriculo) {
		super(iniciaDescricaoPerfil, iniciaNomePerfil, iniciaMatricula, iniciaGeneroPerfil, iniciaDataNascimento,
				iniciaDataIngressoInstituicao); // Configura e, consequentemente, inicializa os atributos advindos da
												// heran�a.
		setCurriculo(iniciaCurriculo); // Configura e, consequentemente, inicializa o curriculo
	}

	/**
	 * Obt�m curriculo
	 * 
	 * @return um <code>String<code> especificando o curriculo
	 */
	public String getCurriculo() {
		return this.curriculo;
	}

	/**
	 * Configura o curriculo
	 * 
	 * @param novoCurriculo o curriculo para a configura��o
	 */
	public void setCurriculo(String novoCurriculo) {
		this.curriculo = novoCurriculo;
	}

}

// Declaração da classe PerfilServidorPublico com os métodos e atributos herdados de PerfilPessoaIntegranteIFPB

import java.util.Date;

/**
 * Essa classe modela um conceito abstrato de um perfil utilizado por um
 * servidor público do IF, onde estão contidos os atributos e os comportamentos
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
* <code>String<code> descricao - (Herdado) A descrição do perfil
* <code>String<code> nome - (Herdado) O nome do perfil
* <code>String<code> site - (Herdado) O link para a página do perfil
* <code>String<code> genero - (Herdado) O gênero da pessoa que possui o perfil
* <code>String<code> dataNascimento - (Herdado) A data de nascimento da pessoa que possui o perfil
* <code>String<code> dataIngressoInstituicao - (Herdado) A data que a pessoa entrou no IF para estudar ou exercer uma profissão
 * </pre>
 * 
 * </blockquote> <code>String<code> curriculo - O link para o curriculo Lattes
 * do servidor público
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
	 * @param iniciaDescricaoPerfil         a descrição do perfil do usuário
	 * @param iniciaNomePerfil              o nome do perfil do usuário
	 * @param iniciaGeneroPerfil            o gênero do perfil do usuário
	 * @param iniciaMatricula               a matrícula do servidor público que foi
	 *                                      gerada automaticamente pelo sistema
	 * @param iniciaDataNascimento          a data de nascimento do servidor público
	 * @param iniciaDataIngressoInstituicao a data que o servidor público começou a
	 *                                      exercer sua profissão
	 * @param iniciaCurriculo               o link para acessar o CV do servidor
	 *                                      público.
	 */
	public PerfilServidorPublico(String iniciaDescricaoPerfil, String iniciaNomePerfil, String iniciaGeneroPerfil,
			String iniciaMatricula, Date iniciaDataNascimento, Date iniciaDataIngressoInstituicao,
			String iniciaCurriculo) {
		super(iniciaDescricaoPerfil, iniciaNomePerfil, iniciaMatricula, iniciaGeneroPerfil, iniciaDataNascimento,
				iniciaDataIngressoInstituicao); // Configura e, consequentemente, inicializa os atributos advindos da
												// herança.
		setCurriculo(iniciaCurriculo); // Configura e, consequentemente, inicializa o curriculo
	}

	/**
	 * Obtém curriculo
	 * 
	 * @return um <code>String<code> especificando o curriculo
	 */
	public String getCurriculo() {
		return this.curriculo;
	}

	/**
	 * Configura o curriculo
	 * 
	 * @param novoCurriculo o curriculo para a configuração
	 */
	public void setCurriculo(String novoCurriculo) {
		this.curriculo = novoCurriculo;
	}

}

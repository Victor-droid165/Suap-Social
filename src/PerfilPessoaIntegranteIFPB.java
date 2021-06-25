//Declaração da classe PerfilPessoaIntegranteIFPB com os métodos e atributos herdados de Perfil

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Essa classe modela um conceito abstrato de um perfil utilizado por uma pessoa
 * que está trabalhando ou estudando no IF, onde estão contidos os atributos e
 * os comportamentos para o mesmo.
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
* <code>String<code> genero - O gênero da pessoa que possui o perfil
* <code>String<code> matricula - A matrícula da pessoa que é integrante do IF que possui o perfil
* <code>String<code> dataNascimento - A data de nascimento da pessoa que possui o perfil
* <code>String<code> dataIngressoInstituicao - A data que a pessoa entrou no IF para estudar ou exercer uma profissão
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @see Perfil;
 * @author victoremanuel
 * @author rubenssilva
 *
 */

public abstract class PerfilPessoaIntegranteIFPB extends Perfil {
	private String genero; // O gênero da pessoa
	private String matricula; // A matricula do aluno ou funcionário do IFPB
	private String dataNascimento; // A data de nascimento da pessoa
	private String dataIngressoInstituicao; // A data que a pessoa ingressou ao IFPB

	/**
	 * Construtor PerfilPessoaIntegranteIFPB
	 * 
	 * @param iniciaDescricaoPerfil         a descricao do perfil do usuario
	 * @param iniciaNomePerfil              o nome do perfil do usuario
	 * @param iniciaMatricula               a matricula do integrante do IFPB
	 * @param iniciaGenero                  o genero do perfil do usuario
	 * @param iniciaDataNascimento          a data de nascimento do perfil do
	 *                                      usuario
	 * @param iniciaDataIngressoInstituicao a data que a pessoa entrou no IFPB
	 */

	public PerfilPessoaIntegranteIFPB(String iniciaDescricaoPerfil, String iniciaNomePerfil, String iniciaMatricula,
			String iniciaGenero, Date iniciaDataNascimento, Date iniciaDataIngressoInstituicao) {
		super(iniciaDescricaoPerfil, iniciaNomePerfil,
				"https://www.suapsocial.com/" + iniciaNomePerfil.strip().replaceAll(" ", "-") + (++Perfil.CODIGO) + "0"
						+ iniciaGenero.charAt(0) + "0" + Perfil.CODIGO); // Configura e, consequentemente, inicializa os
																			// atributos advindos da herança.
		setGenero(iniciaGenero); // Configura e, consequentemente, inicializa genero
		setMatricula(iniciaMatricula); // Configura e, consequentemente, inicializa matricula
		setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").format(iniciaDataNascimento)); // Configura e,
																							// consequentemente,
																							// inicializa dataNascimento
		setDataIngressoInstituicao(new SimpleDateFormat("dd/MM/yyyy").format(iniciaDataIngressoInstituicao)); // Configura
																												// e,
																												// consequentemente,
																												// inicializa
																												// dataIngressoInstituicao
	} // Fim do método construtor de PerfilPessoaIntegranteIFPB com 6 argumentos

	/**
	 * Obtém genero
	 * 
	 * @return um <code>String<code> especificando o gênero
	 */

	public String getGenero() {
		return this.genero;
	} // Fim do método getGenero

	/**
	 * Obtém matricula
	 * 
	 * @return um <code>String<code> especificando a matricula
	 */
	public String getMatricula() {
		return this.matricula;
	} // Fim do método getMatricula

	/**
	 * Obtém dataNascimento
	 * 
	 * @return um <code>String<code> especificando a data de nascimento
	 */
	public String getDataNascimento() {
		return this.dataNascimento;
	} // Fim do método getDataNascimento

	/**
	 * Obtém dataIngressoInstituicao
	 * 
	 * @return um <code>String<code> especificando a data que a pessoa entrou no
	 *         IFPB
	 */
	public String getDataIngressoInstituicao() {
		return this.dataIngressoInstituicao;
	} // Fim do método getDataIngressoInstituicao

	/**
	 * Configura o genero
	 * 
	 * @param novoGenero o genero para a configuração
	 */

	public void setGenero(String novoGenero) {
		this.genero = novoGenero;
	} // Fim do método setGenero

	/**
	 * Configura o matricula
	 * 
	 * @param novoMatricula a matricula para a configuração
	 */
	private void setMatricula(String novoMatricula) {
		this.matricula = novoMatricula;
	} // Fim do método setMatricula

	/**
	 * Configura o dataNascimento
	 * 
	 * @param novoDataNascimento o dataNascimento para a configuração
	 */

	public void setDataNascimento(String novoDataNascimento) {
		this.dataNascimento = novoDataNascimento;
	}

	/**
	 * Configura o dataIngressoInstituicao
	 * 
	 * @param novoDataIngressoInstituicao o dataIngressoInstituicao para a
	 *                                    configuração
	 */
	public void setDataIngressoInstituicao(String novoDataIngressoInstituicao) {
		this.dataIngressoInstituicao = novoDataIngressoInstituicao;
	}

}

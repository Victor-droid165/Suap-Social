// Declara��o da classe PerfilAluno com os m�todos e atributos herdados de PerfilPessoaIntegranteIFPB

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Essa classe modela o conceito de um perfil utilizado por um aluno que estuda
 * no IF, onde est�o contidos os atributos e os comportamentos para o mesmo.
 * 
 * <p>
 * Atributos da classe PerfilAluno:
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
* <code>PerfilTurma<code> meuPerfilTurma - O perfil da turma a qual o aluno pertence
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @see PerfilPessoaIntegranteIFPB;
 * @author victoremanuel
 * @author rubenssilva
 *
 */

public class PerfilAluno extends PerfilPessoaIntegranteIFPB {
	private static int CODIGOALUNO = 222; // C�digo �nico que referencia os alunos
	private static int IDALUNO = 0; // Atribuidor de valor �nico para cada aluno
	private PerfilTurma meuPerfilTurma; // O perfil da turma a qual o aluno pertence

	/**
	 * @param iniciaDescricaoPerfil         a descri��o do perfil do usu�rio
	 * @param iniciaNomePerfil              o nome do perfil do usu�rio
	 * @param iniciaGenero                  o g�nero do perfil do usu�rio
	 * @param iniciaDataNascimento          a data de nascimento do perfil do
	 *                                      usu�rio
	 * @param iniciaDataIngressoInstituicao a data que a pessoa entrou na
	 *                                      institui��o
	 */
	public PerfilAluno(String iniciaDescricaoPerfil, String iniciaNomePerfil, String iniciaGenero,
			Date iniciaDataNascimento, Date iniciaDataIngressoInstituicao) {
		super(iniciaDescricaoPerfil, iniciaNomePerfil,
				new SimpleDateFormat("dd/MM/yyyy").format(iniciaDataIngressoInstituicao).substring(6)
						+ PerfilAluno.CODIGOALUNO + (++PerfilAluno.IDALUNO),
				iniciaGenero, iniciaDataNascimento, iniciaDataIngressoInstituicao); // Configura e, consequentemente,
																					// inicializa os atributos advindos
																					// da heran�a.
		setMeuPerfilTurma(null);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obt�m meuPerfilTurma
	 * 
	 * @return um <code>PerfilTurma<code> especificando o perfil da turma do aluno
	 */
	public PerfilTurma getMeuPerfilTurma() {
		return meuPerfilTurma;
	}

	/**
	 * Configura meuPerfilTurma
	 * 
	 * @param novoMeuPerfilTurma o meuPerfilTurma para a configura��o
	 */
	public void setMeuPerfilTurma(PerfilTurma novoMeuPerfilTurma) {
		this.meuPerfilTurma = novoMeuPerfilTurma;
	}

}

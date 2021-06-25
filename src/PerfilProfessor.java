// Declara��o da classe PerfilProfessor com os m�todos e atributos herdados de PerfilServidorPublico

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Essa classe modela o conceito de um perfil utilizado por um professor do IF,
 * onde est�o contidos os atributos e os comportamentos para o mesmo.
 * 
 * <p>
 * Atributos da classe PerfilProfessor:
 * 
 * <blockquote>
 * 
 * <pre>
* <code>ArrayList<code> postagens - (Herdado) Uma lista com todas as postagens feitas pelo perfil
* <code>ArrayList<code> seguidores - (Herdado) Uma lista com todos os seguidores do perfil
* <code>ArrayList<code> seguindo - (Herdado) Uma lista com todos os perfis que o perfil segue
* <code>ArrayList<code> disciplinas - Uma lista com todas as disciplinas que o professor leciona
* <code>ArrayList<code> meuPerfilTurma - uma lista com todos os perfis das turmas que o professor ministra suas aulas
* <code>String<code> descricao - (Herdado) A descri��o do perfil
* <code>String<code> nome - (Herdado) O nome do perfil
* <code>String<code> site - (Herdado) O link para a p�gina do perfil
* <code>String<code> genero - (Herdado) O g�nero da pessoa que possui o perfil
* <code>String<code> dataNascimento - (Herdado) A data de nascimento da pessoa que possui o perfil
* <code>String<code> dataIngressoInstituicao - (Herdado) A data que a pessoa entrou no IF para estudar ou exercer uma profiss�o
 * </pre>
 * 
 * </blockquote> <code>String<code> curriculo - (Herdado) O link para o
 * curriculo Lattes do servidor p�blico <code>String<code> orientacoes - As
 * orienta��es do professor
 * </pre>
 * </blockquote>
 * 
 * @see java.lang.Object
 * @see PerfilPessoaIntegranteIFPB;
 * @author victoremanuel
 * @author rubenssilva
 *
 */

public class PerfilProfessor extends PerfilServidorPublico {
	private ArrayList<String> disciplinas; // disciplinas lecionadas pelo professor
	private String orientacoes; // orienta��es do professor
	private static int CODIGOPROFESSOR = 514; // C�digo �nico que referencia os professores
	private static int IDPROFESSOR = 0; // Atribuidor de valor �nico para cada professor
	private ArrayList<PerfilTurma> meuPerfilTurma; // Os perfis das turmas que o professor ministra aula

	/**
	 * Construtor da classe PerfilProfessor
	 * 
	 * @param iniciaDescricaoPerfil         a descri��o do perfil
	 * @param iniciaNomePerfil              o nome do perfil
	 * @param iniciaGeneroPerfil            o g�nero do professor
	 * @param iniciaDataNascimento          a data de nascimento do professor
	 * @param iniciaDataIngressoInstituicao a data que o professor come�ou a
	 *                                      ministrar aulas no IF
	 * @param iniciaCurriculo               o curriculo do professor
	 * @param iniciaDisciplinas             as disciplinas que o professor ministra
	 * @param iniciaOrientacoes             as orienta��es do professor
	 */

	public PerfilProfessor(String iniciaDescricaoPerfil, String iniciaNomePerfil, String iniciaGeneroPerfil,
			Date iniciaDataNascimento, Date iniciaDataIngressoInstituicao, String iniciaCurriculo,
			ArrayList<String> iniciaDisciplinas, String iniciaOrientacoes) {
		super(iniciaDescricaoPerfil, iniciaNomePerfil, iniciaGeneroPerfil,
				new SimpleDateFormat("dd/MM/yyyy").format(iniciaDataIngressoInstituicao).substring(6)
						+ PerfilProfessor.CODIGOPROFESSOR + (++PerfilProfessor.IDPROFESSOR),
				iniciaDataNascimento, iniciaDataIngressoInstituicao, iniciaCurriculo); // Configura e, consequentemente,
																						// inicializa os atributos
																						// advindos da heran�a.
		setDisciplinas(iniciaDisciplinas); // Configura e, consequentemente, inicializa disciplinas
		setOrientacoes(iniciaOrientacoes); // Configura e, consequentemente, inicializa orientacoes
		setMeuPerfilTurma(new ArrayList<PerfilTurma>());
	}

	/**
	 * Obt�m disciplinas
	 * 
	 * @return um <code>ArrayList<code> especificando as disciplinas
	 */
	public ArrayList<String> getDisciplinas() {
		return this.disciplinas;
	}

	/**
	 * Configura o disciplinas
	 * 
	 * @param novoDisciplinas as disciplinas para a configura��o
	 */
	public void setDisciplinas(ArrayList<String> novoDisciplinas) {
		this.disciplinas = novoDisciplinas;
	}

	/**
	 * Adiciona uma disciplina na lista de disciplinas
	 * 
	 * @param novoDisciplina a disciplina que o professor passar� a ministrar aulas
	 *                       sobre
	 */
	public void addDisciplina(String novoDisciplina) {
		this.disciplinas.add(novoDisciplina);
	}

	/**
	 * Obt�m orientacoes
	 * 
	 * @return um <code>String<code> especificando as orienta��es
	 */
	public String getOrientacoes() {
		return this.orientacoes;
	}

	/**
	 * Configura o orientacoes
	 * 
	 * @param novoOrientacoes as orienta��es para a configura��o
	 */
	public void setOrientacoes(String novoOrientacoes) {
		this.orientacoes = novoOrientacoes;
	}

	/**
	 * Obt�m meuPerfilTurma
	 * 
	 * @return um <code>ArrayList<code> especificando as turmas, nas quais o
	 *         professor ministra aulas
	 */
	public ArrayList<PerfilTurma> getMeuPerfilTurma() {
		return meuPerfilTurma;
	}

	/**
	 * Configura meuPerfilTurma
	 * 
	 * @param novoMeuPerfilTurma as turmas para a configura��o
	 */
	public void setMeuPerfilTurma(ArrayList<PerfilTurma> novoMeuPerfilTurma) {
		this.meuPerfilTurma = novoMeuPerfilTurma;
	}

	/**
	 * Adiciona um perfil de turma na lista dos perfis de turmas dos quais o
	 * professor faz parte
	 * 
	 * @param novoMeuPerfilTurma o perfil da turma que o professor acaba de fazer
	 *                           parte
	 */
	public void addMeuPerfilTurma(PerfilTurma novoMeuPerfilTurma) {
		this.meuPerfilTurma.add(novoMeuPerfilTurma);
	}

}

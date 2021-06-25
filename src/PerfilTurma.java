// Declara��o da classe PerfilTurma com os m�todos e atributos herdados de Perfil

import java.util.ArrayList;

/**
 * Essa classe modela o conceito de um perfil utilizado por um aluno que estuda
 * no IF, onde est�o contidos os atributos e os comportamentos para o mesmo.
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
* <code>ArrayList<code> alunos - Uma lista com os alunos da turma
* <code>ArrayList<code> professores - Uma lista com os professores da turma
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

public class PerfilTurma extends Perfil {
	private static int idTurma = 0; // identificador �nico para cada turma
	private ArrayList<PerfilAluno> alunos; // alunos da turma
	private ArrayList<PerfilProfessor> professores; // professores da turma

	/**
	 * Construtor PerfilTurma
	 * 
	 * @param iniciaDescricao   a descri��o do perfil
	 * @param iniciaNome        o nome do perfil (nome da turma)
	 * @param iniciaSite        o link para acessar a p�gina do perfil
	 * @param iniciaAlunos      os alunos pertencentes � turma
	 * @param iniciaProfessores os professores da turma
	 */
	public PerfilTurma(String iniciaDescricao, String iniciaNome, ArrayList<PerfilAluno> iniciaAlunos,
			ArrayList<PerfilProfessor> iniciaProfessores) {
		super(iniciaDescricao, iniciaNome, "https://www.suapsocial.com/" + iniciaNome.strip().replaceAll(" ", "-")
				+ (++Perfil.CODIGO) + "0" + (idTurma + 100) + "0" + Perfil.CODIGO);
		PerfilTurma.idTurma += 100;
		setAlunos(iniciaAlunos);
		setProfessores(iniciaProfessores);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obt�m alunos
	 * 
	 * @return um <code>ArrayList<code> especificando os alunos da turma
	 */
	public ArrayList<PerfilAluno> getAlunos() {
		return alunos;
	}

	/**
	 * Configura alunos
	 * 
	 * @param novoAlunos o alunos para a configura��o
	 */
	public void setAlunos(ArrayList<PerfilAluno> novoAlunos) {
		this.alunos = novoAlunos;
	}

	/**
	 * Obt�m professores
	 * 
	 * @return um <code>ArrayList<code> especificando os professores da turma
	 */
	public ArrayList<PerfilProfessor> getProfessores() {
		return professores;
	}

	/**
	 * Configura professores
	 * 
	 * @param novoProfessores o alunos para a configura��o
	 */
	public void setProfessores(ArrayList<PerfilProfessor> novoProfessores) {
		this.professores = novoProfessores;
	}

}

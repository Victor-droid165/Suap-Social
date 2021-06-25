// Declaração da classe PerfilTurma com os métodos e atributos herdados de Perfil

import java.util.ArrayList;

/**
 * Essa classe modela o conceito de um perfil utilizado por um aluno que estuda
 * no IF, onde estão contidos os atributos e os comportamentos para o mesmo.
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
	private static int idTurma = 0; // identificador único para cada turma
	private ArrayList<PerfilAluno> alunos; // alunos da turma
	private ArrayList<PerfilProfessor> professores; // professores da turma

	/**
	 * Construtor PerfilTurma
	 * 
	 * @param iniciaDescricao   a descrição do perfil
	 * @param iniciaNome        o nome do perfil (nome da turma)
	 * @param iniciaSite        o link para acessar a página do perfil
	 * @param iniciaAlunos      os alunos pertencentes à turma
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
	 * Obtém alunos
	 * 
	 * @return um <code>ArrayList<code> especificando os alunos da turma
	 */
	public ArrayList<PerfilAluno> getAlunos() {
		return alunos;
	}

	/**
	 * Configura alunos
	 * 
	 * @param novoAlunos o alunos para a configuração
	 */
	public void setAlunos(ArrayList<PerfilAluno> novoAlunos) {
		this.alunos = novoAlunos;
	}

	/**
	 * Obtém professores
	 * 
	 * @return um <code>ArrayList<code> especificando os professores da turma
	 */
	public ArrayList<PerfilProfessor> getProfessores() {
		return professores;
	}

	/**
	 * Configura professores
	 * 
	 * @param novoProfessores o alunos para a configuração
	 */
	public void setProfessores(ArrayList<PerfilProfessor> novoProfessores) {
		this.professores = novoProfessores;
	}

}

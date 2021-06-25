// Declara��o da classe FuncoesPrint com os m�todos print criados para serem utilizados no SuapSocial.

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Essa classe possui todos os menus com os quais o usu�rio interage na
 * aplica��o SuapSocial
 * 
 * <p>
 * M�todos da classe FuncoesPrint:
 * 
 * <blockquote>
 * 
 * <pre>
 * printTracos()
 * printTelaLogin()
 * printMenu()
 * printGetUsuarioInfos()
 * printExcecaoCaractere()
 * printCreditos()
 * printTelaPerfil()
 * printAcessaPerfil()
 * printCriarPerfil()
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @author victoremanuel
 * @author rubenssilva
 * 
 */

public class FuncoesPrint {
	

	/**
	 * M�todo utilizado para separar as telas de menu, printa 50 h�fens
	 */

	public static void printTracos() {
		for (int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	/**
	 * M�todo utilizado para printar a tela de Login/Registro do usu�rio
	 */

	public static void printTelaLogin() {
		printTracos();
		System.out.println("\n\tSeja bem-vindo ao SuapSocial" + "\n\n\tFa�a o login ou registre-se"
				+ "\n\n\t1- Efetuar o login no SuapSocial" + "\n\t2- Se registrar no SuapSocial"
				+ "\n\t3- Fechar o programa\n");
	}

	/**
	 * M�todo utilizado para printar a tela do menu principal
	 * 
	 * @param nome o nome do usu�rio
	 */

	public static void printMenu(String nome) {
		printTracos();
		System.out.println("\tOl�, " + nome + "\n\n\n\t" + "1- Acessar informa��es do seu usu�rio\n"
				+ "\t2- Criar perfil de usu�rio\n" + "\t3- Acessar Perfis do usu�rio\n" + "\t4- Cr�ditos\n"
				+ "\t5- Deslogar do usu�rio");
		printTracos();
	}

	/**
	 * M�todo utilizado para printar a tela de acesso �s informa��es do usu�rio
	 */

	public static void printGetUsuarioInfos(ArrayList<?> userLogadoInfos) {
		printTracos();
		System.out.println("\tInforma��es do usu�rio " + userLogadoInfos.get(2) + "\n\n\n\t" + "Seus perfis: \n\t"
				+ userLogadoInfos.get(0) + "\n\n\tSeu email �: \n\t" + userLogadoInfos.get(1)
				+ "\n\n\tSeu login �: \n\t" + userLogadoInfos.get(2) + "\n\n\tSua senha �: \n\t" + userLogadoInfos.get(3));
	}

	/**
	 * M�todo utilizado para printar a tela de cria��o de perfil do usu�rio
	 */

	public static void printCriarPerfil() {
		FuncoesPrint.printTracos();
		System.out.println("\n\tBem-vindo � tela de cria��o de perfil do usu�rio!"
				+ "\n\n\t1- Perfil para Aluno (PerfilAluno)\n" + "\t2- Perfil para Professor (PerfilProfessor)\n"
				+ "\t3- Perfil para Turma (PerfilTurma)\n" + "\t4- Sair da tela de cria��o de perfis\n");
		System.out.print("Digite uma op��o: ");
	}

	/**
	 * M�todo utilizado para printar a tela na qual o usu�rio dever� escolher o
	 * perfil que ele deseja logar
	 * 
	 * @param usuarioLogado o usu�rio que est� logado no SuapSocial no momento
	 * @return um <code>ArrayList<code> com a quantidade de perfis do usu�rio e um
	 *         HashMap, cuja chave � o n�mero que identifica o perfil no print e
	 *         cujo valor � o perfil
	 */
	public static ArrayList<Object> printAcessaPerfil(Usuario usuarioLogado) {
		printTracos();
		HashMap<Integer, Object> mapaOpcoes = new HashMap<Integer, Object>();
		int cont = 0;
		System.out.println("\tEscolha o perfil que deseja acessar!");
		ArrayList<?> perfisUsuario = usuarioLogado.getPerfis();
		for (Object perfil : perfisUsuario) {
			if (perfil instanceof PerfilAluno) {
				System.out.print("\n\t" + (++cont) + "- PerfilAluno: " + ((PerfilAluno) perfil).getNome());
				mapaOpcoes.put(cont, (PerfilAluno) perfil);
			} else if (perfil instanceof PerfilProfessor) {
				System.out.print("\n\t" + (++cont) + "- PerfilProfessor: " + ((PerfilProfessor) perfil).getNome());
				mapaOpcoes.put(cont, (PerfilProfessor) perfil);
			} else {
				System.out.print("\n\t" + (++cont) + "- PerfilTurma: " + ((PerfilTurma) perfil).getNome());
				mapaOpcoes.put(cont, (PerfilTurma) perfil);
			}
		}
		if(cont > 0)
			System.out.println("\n\t" + (++cont) + "- Sair da tela de acesso de perfis");
		else
			cont++;
		System.out.println();
		System.out.println();
		ArrayList<Object> retorno = new ArrayList<Object>();
		retorno.add(cont);
		retorno.add(mapaOpcoes);
		return (retorno);
	}

	/**
	 * M�todo usado para printar tela com a qual o perfil do usu�rio ir� interagir
	 * 
	 * @param perfilLogado o perfil que foi logado pelo usu�rio
	 */
	public static void printTelaPerfil(Object perfilLogado) {
		FuncoesPrint.printTracos();
		Perfil logado = null;
		if (perfilLogado instanceof PerfilAluno) {
			logado = ((PerfilAluno) perfilLogado);
		} else if (perfilLogado instanceof PerfilProfessor) {
			logado = ((PerfilProfessor) perfilLogado);
		} else {
			logado = ((PerfilTurma) perfilLogado);
		}
		System.out.println("\n\tOl�, " + (logado.getNome()) + "\n\n\t1- Postar" + "\n\t2- Seguir"
				+ "\n\t3- Visualizar informa��es do perfil" + "\n\t4- Alterar informa��es do perfil"
				+ "\n\t5- Deslogar do perfil\n");
	}

	/**
	 * M�todo utilizado para printar a tela de cr�ditos
	 */
	public static void printCreditos() {
		printTracos();
		System.out.println("\n\tO SuapSocial � um projeto que foi designa-" + "\n\tdo para n�s, estudantes do 2� ano de"
				+ "\n\tinform�tica integrado ao Ensino M�dio do" + "\n\tIFPB- Campus Campina Grande. Ele contempla"
				+ "\n\ta ideia da nossa professora Mirna Maia que" + "\n\tnos ensinou os assuntos de POO."
				+ "\n\n\tVers�o criada, ap�s uma s�rie de esfor�os," + "\n\tpelos alunos:"
				+ "\n\t   Victor Emanuel Barbosa Rodrigues" + "\n\t   Rubens da Silva Bezerra\n");
		System.out.print("Pressione Enter para continuar.");
	}
	/**
	 * M�todo utilizado para printar a tela na qual o perfil far� suas postagens
	 */
	public static void printTelaPostagens() {
		FuncoesPrint.printTracos();
		System.out.println("\n\tBem-vindo � tela de postagens" + "\n\n\t1- Postar foto" + "\n\t2- Postar foto e v�deo"
				+ "\n\t3- Postar foto com legenda" + "\n\t4- Postar foto e v�deo com legenda" + "\n\t5- Postar v�deo"
				+ "\n\t6- Postar v�deo com legenda" + "\n\t7- Postar texto" + "\n\t8- Sair da tela de postagens\n");
	}
	/**
	 * M�todo utilizado para printar todos os atributos do objeto
	 * 
	 * @param perfilLogado o perfil que est� logado agora
	 */
	public static void printTelaGetsPerfil(Object perfilLogado) {
		FuncoesPrint.printTracos();
		if (perfilLogado instanceof PerfilAluno) {
			System.out.println("\n\tBem-vindo � tela de visualiza��o" + "\n\n\tSua data de nascimento: \n\t"
					+ ((PerfilAluno) perfilLogado).getDataNascimento() + "\n\n\tA data que voc� entrou no IFPB: \n\t"
					+ ((PerfilAluno) perfilLogado).getDataIngressoInstituicao() + "\n\n\tSua matr�cula: \n\t"
					+ ((PerfilAluno) perfilLogado).getMatricula() + "\n\n\tA descri��o do seu perfil: \n\t"
					+ ((PerfilAluno) perfilLogado).getDescricao() + "\n\n\tSeu g�nero: \n\t"
					+ ((PerfilAluno) perfilLogado).getGenero() + "\n\n\tSeu nome: \n\t"
					+ ((PerfilAluno) perfilLogado).getNome() + "\n\n\tLink para sua p�gina: \n\t"
					+ ((PerfilAluno) perfilLogado).getSite() + "\n\n\tSeus seguidores: \n\t"
					+ ((PerfilAluno) perfilLogado).getSeguidores() + "\n\n\tOs perfis que voc� est� seguindo: \n\t"
					+ ((PerfilAluno) perfilLogado).getSeguindo() + "\n\n\tAs postagens realizadas por voc�: \n\t"
					+ ((PerfilAluno) perfilLogado).getPostagens());
			if (((PerfilAluno) perfilLogado).getMeuPerfilTurma() != null)
				System.out.println("\tO perfil da sua turma: \n\t" + ((PerfilAluno) perfilLogado).getMeuPerfilTurma());

		} else if (perfilLogado instanceof PerfilProfessor) {
			System.out.println("\n\tBem-vindo � tela de visualiza��o" + "\n\n\tSua data de nascimento: \n\t"
					+ ((PerfilProfessor) perfilLogado).getDataNascimento() + "\n\n\tA data que voc� entrou no IFPB: \n\t"
					+ ((PerfilProfessor) perfilLogado).getDataIngressoInstituicao() + "\n\n\tSua matr�cula: \n\t"
					+ ((PerfilProfessor) perfilLogado).getMatricula() + "\n\n\tA descri��o do seu perfil: \n\t"
					+ ((PerfilProfessor) perfilLogado).getDescricao() + "\n\n\tSeu g�nero: \n\t"
					+ ((PerfilProfessor) perfilLogado).getGenero() + "\n\n\tSeu nome: \n\t"
					+ ((PerfilProfessor) perfilLogado).getNome() + "\n\n\tLink para sua p�gina: \n\t"
					+ ((PerfilProfessor) perfilLogado).getSite() + "\n\n\tSeus seguidores: \n\t"
					+ ((PerfilProfessor) perfilLogado).getSeguidores() + "\n\n\tOs perfis que voc� est� seguindo: \n\t"
					+ ((PerfilProfessor) perfilLogado).getSeguindo() + "\n\n\tAs postagens realizadas por voc�: \n\t"
					+ ((PerfilProfessor) perfilLogado).getPostagens() + "\n\n\tAs disciplinas que voc� leciona: \n\t"
					+ ((PerfilProfessor) perfilLogado).getDisciplinas() + "\n\n\tSuas orienta��es: \n\t"
					+ ((PerfilProfessor) perfilLogado).getOrientacoes());
			if (((PerfilProfessor) perfilLogado).getMeuPerfilTurma().size() != 0)
				System.out.println("\tOs perfis das turmas as quais voc� faz parte: \n\t"
						+ ((PerfilProfessor) perfilLogado).getMeuPerfilTurma());
		} else if (perfilLogado instanceof PerfilTurma) {
			System.out.println("\n\tBem-vindo � tela de visualiza��o"
					+ "\n\tOs perfis dos professores que est�o no perfilTurma: \n\n\t"
					+ ((PerfilTurma) perfilLogado).getProfessores()
					+ "\n\tOs perfis dos alunos que est�o no perfilTurma: \n\n\t"
					+ ((PerfilTurma) perfilLogado).getAlunos() + "\n\n\tO nome da turma: \n\t"
					+ ((PerfilTurma) perfilLogado).getNome() + "\n\n\tA descri��o da turma: \n\t"
					+ ((PerfilTurma) perfilLogado).getDescricao() + "\n\n\tO link da p�gina da turma: \n\t"
					+ ((PerfilTurma) perfilLogado).getSite() + "\n\n\tAs postagens da turma: \n\t"
					+ ((PerfilTurma) perfilLogado).getPostagens() + "\n\n\tOs perfis seguidos por este perfil: \n\t"
					+ ((PerfilTurma) perfilLogado).getSeguindo() + "\n\n\tOs perfis que seguem este perfil: \n\t"
					+ ((PerfilTurma) perfilLogado).getSeguidores());
		}
	}

	/**
	 * M�todo utilizado para quando o usu�rio digita algum caractere inv�lido
	 * 
	 * @throws InterruptedException O programa sofre um delay de 4 segundos
	 * @see OutrasFuncoes;
	 */

	public static void printExcecaoCaractere() throws InterruptedException {
		System.out.println("\nVoc� digitou um caractere inapropriado!");
		System.out.println("Por favor! Digite apenas os n�meros que est�o listados.");
		OutrasFuncoes.meuSleep();
	}
}

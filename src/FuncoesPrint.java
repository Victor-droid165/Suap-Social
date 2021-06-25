// Declaração da classe FuncoesPrint com os métodos print criados para serem utilizados no SuapSocial.

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Essa classe possui todos os menus com os quais o usuário interage na
 * aplicação SuapSocial
 * 
 * <p>
 * Métodos da classe FuncoesPrint:
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
	 * Método utilizado para separar as telas de menu, printa 50 hífens
	 */

	public static void printTracos() {
		for (int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	/**
	 * Método utilizado para printar a tela de Login/Registro do usuário
	 */

	public static void printTelaLogin() {
		printTracos();
		System.out.println("\n\tSeja bem-vindo ao SuapSocial" + "\n\n\tFaça o login ou registre-se"
				+ "\n\n\t1- Efetuar o login no SuapSocial" + "\n\t2- Se registrar no SuapSocial"
				+ "\n\t3- Fechar o programa\n");
	}

	/**
	 * Método utilizado para printar a tela do menu principal
	 * 
	 * @param nome o nome do usuário
	 */

	public static void printMenu(String nome) {
		printTracos();
		System.out.println("\tOlá, " + nome + "\n\n\n\t" + "1- Acessar informações do seu usuário\n"
				+ "\t2- Criar perfil de usuário\n" + "\t3- Acessar Perfis do usuário\n" + "\t4- Créditos\n"
				+ "\t5- Deslogar do usuário");
		printTracos();
	}

	/**
	 * Método utilizado para printar a tela de acesso às informações do usuário
	 */

	public static void printGetUsuarioInfos(ArrayList<?> userLogadoInfos) {
		printTracos();
		System.out.println("\tInformações do usuário " + userLogadoInfos.get(2) + "\n\n\n\t" + "Seus perfis: \n\t"
				+ userLogadoInfos.get(0) + "\n\n\tSeu email é: \n\t" + userLogadoInfos.get(1)
				+ "\n\n\tSeu login é: \n\t" + userLogadoInfos.get(2) + "\n\n\tSua senha é: \n\t" + userLogadoInfos.get(3));
	}

	/**
	 * Método utilizado para printar a tela de criação de perfil do usuário
	 */

	public static void printCriarPerfil() {
		FuncoesPrint.printTracos();
		System.out.println("\n\tBem-vindo à tela de criação de perfil do usuário!"
				+ "\n\n\t1- Perfil para Aluno (PerfilAluno)\n" + "\t2- Perfil para Professor (PerfilProfessor)\n"
				+ "\t3- Perfil para Turma (PerfilTurma)\n" + "\t4- Sair da tela de criação de perfis\n");
		System.out.print("Digite uma opção: ");
	}

	/**
	 * Método utilizado para printar a tela na qual o usuário deverá escolher o
	 * perfil que ele deseja logar
	 * 
	 * @param usuarioLogado o usuário que está logado no SuapSocial no momento
	 * @return um <code>ArrayList<code> com a quantidade de perfis do usuário e um
	 *         HashMap, cuja chave é o número que identifica o perfil no print e
	 *         cujo valor é o perfil
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
	 * Método usado para printar tela com a qual o perfil do usuário irá interagir
	 * 
	 * @param perfilLogado o perfil que foi logado pelo usuário
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
		System.out.println("\n\tOlá, " + (logado.getNome()) + "\n\n\t1- Postar" + "\n\t2- Seguir"
				+ "\n\t3- Visualizar informações do perfil" + "\n\t4- Alterar informações do perfil"
				+ "\n\t5- Deslogar do perfil\n");
	}

	/**
	 * Método utilizado para printar a tela de créditos
	 */
	public static void printCreditos() {
		printTracos();
		System.out.println("\n\tO SuapSocial é um projeto que foi designa-" + "\n\tdo para nós, estudantes do 2º ano de"
				+ "\n\tinformática integrado ao Ensino Médio do" + "\n\tIFPB- Campus Campina Grande. Ele contempla"
				+ "\n\ta ideia da nossa professora Mirna Maia que" + "\n\tnos ensinou os assuntos de POO."
				+ "\n\n\tVersão criada, após uma série de esforços," + "\n\tpelos alunos:"
				+ "\n\t   Victor Emanuel Barbosa Rodrigues" + "\n\t   Rubens da Silva Bezerra\n");
		System.out.print("Pressione Enter para continuar.");
	}
	/**
	 * Método utilizado para printar a tela na qual o perfil fará suas postagens
	 */
	public static void printTelaPostagens() {
		FuncoesPrint.printTracos();
		System.out.println("\n\tBem-vindo à tela de postagens" + "\n\n\t1- Postar foto" + "\n\t2- Postar foto e vídeo"
				+ "\n\t3- Postar foto com legenda" + "\n\t4- Postar foto e vídeo com legenda" + "\n\t5- Postar vídeo"
				+ "\n\t6- Postar vídeo com legenda" + "\n\t7- Postar texto" + "\n\t8- Sair da tela de postagens\n");
	}
	/**
	 * Método utilizado para printar todos os atributos do objeto
	 * 
	 * @param perfilLogado o perfil que está logado agora
	 */
	public static void printTelaGetsPerfil(Object perfilLogado) {
		FuncoesPrint.printTracos();
		if (perfilLogado instanceof PerfilAluno) {
			System.out.println("\n\tBem-vindo à tela de visualização" + "\n\n\tSua data de nascimento: \n\t"
					+ ((PerfilAluno) perfilLogado).getDataNascimento() + "\n\n\tA data que você entrou no IFPB: \n\t"
					+ ((PerfilAluno) perfilLogado).getDataIngressoInstituicao() + "\n\n\tSua matrícula: \n\t"
					+ ((PerfilAluno) perfilLogado).getMatricula() + "\n\n\tA descrição do seu perfil: \n\t"
					+ ((PerfilAluno) perfilLogado).getDescricao() + "\n\n\tSeu gênero: \n\t"
					+ ((PerfilAluno) perfilLogado).getGenero() + "\n\n\tSeu nome: \n\t"
					+ ((PerfilAluno) perfilLogado).getNome() + "\n\n\tLink para sua página: \n\t"
					+ ((PerfilAluno) perfilLogado).getSite() + "\n\n\tSeus seguidores: \n\t"
					+ ((PerfilAluno) perfilLogado).getSeguidores() + "\n\n\tOs perfis que você está seguindo: \n\t"
					+ ((PerfilAluno) perfilLogado).getSeguindo() + "\n\n\tAs postagens realizadas por você: \n\t"
					+ ((PerfilAluno) perfilLogado).getPostagens());
			if (((PerfilAluno) perfilLogado).getMeuPerfilTurma() != null)
				System.out.println("\tO perfil da sua turma: \n\t" + ((PerfilAluno) perfilLogado).getMeuPerfilTurma());

		} else if (perfilLogado instanceof PerfilProfessor) {
			System.out.println("\n\tBem-vindo à tela de visualização" + "\n\n\tSua data de nascimento: \n\t"
					+ ((PerfilProfessor) perfilLogado).getDataNascimento() + "\n\n\tA data que você entrou no IFPB: \n\t"
					+ ((PerfilProfessor) perfilLogado).getDataIngressoInstituicao() + "\n\n\tSua matrícula: \n\t"
					+ ((PerfilProfessor) perfilLogado).getMatricula() + "\n\n\tA descrição do seu perfil: \n\t"
					+ ((PerfilProfessor) perfilLogado).getDescricao() + "\n\n\tSeu gênero: \n\t"
					+ ((PerfilProfessor) perfilLogado).getGenero() + "\n\n\tSeu nome: \n\t"
					+ ((PerfilProfessor) perfilLogado).getNome() + "\n\n\tLink para sua página: \n\t"
					+ ((PerfilProfessor) perfilLogado).getSite() + "\n\n\tSeus seguidores: \n\t"
					+ ((PerfilProfessor) perfilLogado).getSeguidores() + "\n\n\tOs perfis que você está seguindo: \n\t"
					+ ((PerfilProfessor) perfilLogado).getSeguindo() + "\n\n\tAs postagens realizadas por você: \n\t"
					+ ((PerfilProfessor) perfilLogado).getPostagens() + "\n\n\tAs disciplinas que você leciona: \n\t"
					+ ((PerfilProfessor) perfilLogado).getDisciplinas() + "\n\n\tSuas orientações: \n\t"
					+ ((PerfilProfessor) perfilLogado).getOrientacoes());
			if (((PerfilProfessor) perfilLogado).getMeuPerfilTurma().size() != 0)
				System.out.println("\tOs perfis das turmas as quais você faz parte: \n\t"
						+ ((PerfilProfessor) perfilLogado).getMeuPerfilTurma());
		} else if (perfilLogado instanceof PerfilTurma) {
			System.out.println("\n\tBem-vindo à tela de visualização"
					+ "\n\tOs perfis dos professores que estão no perfilTurma: \n\n\t"
					+ ((PerfilTurma) perfilLogado).getProfessores()
					+ "\n\tOs perfis dos alunos que estão no perfilTurma: \n\n\t"
					+ ((PerfilTurma) perfilLogado).getAlunos() + "\n\n\tO nome da turma: \n\t"
					+ ((PerfilTurma) perfilLogado).getNome() + "\n\n\tA descrição da turma: \n\t"
					+ ((PerfilTurma) perfilLogado).getDescricao() + "\n\n\tO link da página da turma: \n\t"
					+ ((PerfilTurma) perfilLogado).getSite() + "\n\n\tAs postagens da turma: \n\t"
					+ ((PerfilTurma) perfilLogado).getPostagens() + "\n\n\tOs perfis seguidos por este perfil: \n\t"
					+ ((PerfilTurma) perfilLogado).getSeguindo() + "\n\n\tOs perfis que seguem este perfil: \n\t"
					+ ((PerfilTurma) perfilLogado).getSeguidores());
		}
	}

	/**
	 * Método utilizado para quando o usuário digita algum caractere inválido
	 * 
	 * @throws InterruptedException O programa sofre um delay de 4 segundos
	 * @see OutrasFuncoes;
	 */

	public static void printExcecaoCaractere() throws InterruptedException {
		System.out.println("\nVocê digitou um caractere inapropriado!");
		System.out.println("Por favor! Digite apenas os números que estão listados.");
		OutrasFuncoes.meuSleep();
	}
}

// Declara��o da classe FuncoesCriar com os m�todos criar criados para serem utilizados no SuapSocial.

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Essa classe possui todas as declara��es dos m�todos que usamos para
 * instanciar as classes utilizadas no SuapSocial
 * 
 * <p>
 * M�todos da classe FuncoesCriar:
 * 
 * <blockquote>
 * 
 * <pre>
 * criarUsuario()
 * criarPerfil()
 * criarPerfilAluno()
 * criarPerfilProfessor()
 * criarPerfilTurma()
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @see PerfilAluno
 * @see PerfilProfessor
 * @author victoremanuel
 * @author rubenssilva
 * 
 */

public class FuncoesCriar {

	private static Scanner scanner;

	/**
	 * M�todo utilizado para pedir as informa��es necess�rias para a instancia��o de
	 * um objeto da classe <code> Usuario <code> e para instanciar o objeto.
	 * 
	 * @return um <code> Usuario <code> especificando o Usuario que acabou de ser
	 *         criado
	 * @throws InterruptedException
	 * @see SenhaForte
	 */
	public static Usuario criarUsuario(ArrayList<Usuario> listaUsuarios) throws InterruptedException {
		scanner = new Scanner(System.in);
		System.out.println();
		FuncoesPrint.printTracos();
		System.out.println("\n\tBem-Vindo � tela de cria��o de usu�rio!");
		System.out.print("\n\tInsira o login do usu�rio: ");
		String login = scanner.nextLine();
		String senha = null; 
		while (senha == null)
			senha = SenhaForte.EhForte();
		System.out.print("\n\tInsira o email do usu�rio: ");
		String email = scanner.nextLine();

		for (Usuario usuario : listaUsuarios) {
			if (usuario.getLogin().equals(login) || usuario.getEmail().equals(email)) {
				System.out.println();
				System.out.println("\tFalha na cria��o do usu�rio." + "\n\tLogin ou email j� existente");
				System.out.print("\t");
				OutrasFuncoes.meuSleep();
				return (null);
			}
		}

		Usuario meuUsuario = new Usuario(login, senha, email);
		System.out.println("\n\n\tUsuario criado com sucesso.");
		System.out.print("\t");
		OutrasFuncoes.meuSleep();
		FuncoesPrint.printTracos();
		System.out.println();
		return (meuUsuario);
	}

	/**
	 * M�todo utilizado para saber o tipo do perfil que o usu�rio deseja criar
	 * 
	 * @return um <code> String <code> especificando o tipo do perfil que o usu�rio
	 *         deseja criar
	 * @throws InterruptedException
	 */

	public static String criarPerfil() throws InterruptedException {
		scanner = new Scanner(System.in);
		String tipo = "";
		do {
			if (!tipo.equals("")) {
				FuncoesPrint.printExcecaoCaractere();
				FuncoesPrint.printTracos();
				System.out.println();
			}
			FuncoesPrint.printCriarPerfil();
			tipo = scanner.next();
		} while (!(tipo.equals("1") || tipo.equals("2") || tipo.equals("3") || tipo.equals("4")));
		return (tipo);
	}

	/**
	 * M�todo utilizado para pedir as informa��es necess�rias para a instancia��o de
	 * um objeto da classe <code> PerfilAluno <code> e para instanciar o objeto.
	 * 
	 * @return um <code> PerfilAluno <code> especificando o PerfilAluno que o
	 *         usu�rio acabou de criar
	 */
	public static PerfilAluno criarPerfilAluno() {
		scanner = new Scanner(System.in);
		String descricao = "", nome = "1", genero = "Z";
		boolean verificaNome = false;
		while (!verificaNome) {
			System.out.print("Digite o seu nome completo para o perfil: ");
			nome = scanner.nextLine();
			verificaNome = FuncoesCheca.checaPossuiDigito(nome);
		}
		do {
			if (!genero.equals("Z"))
				System.out.println("Nota: Apenas digite Masculino/Feminino/Outro.");
			System.out.print("Digite o seu g�nero (Masculino, Feminino, Outro): ");
			genero = scanner.nextLine();
		} while (!genero.equals("Masculino") & !genero.equals("Feminino") & !genero.equals("Outro"));

		System.out.print("Digite a sua data de nascimento sem /. Ex: 04062020: ");
		String data = scanner.next();
		data = FuncoesCheca.checaData(data);

		Date dataNascimento = new Date(data);
		System.out.print("Digite a data que voc� entrou no IFPB sem /. Ex: 04062020: ");
		data = scanner.next();
		data = FuncoesCheca.checaData(data);
		Date dataIngresso = new Date(data);

		PerfilAluno meuPerfilAluno = new PerfilAluno(descricao, nome, genero, dataNascimento, dataIngresso);
		return (meuPerfilAluno);
	}

	/**
	 * M�todo utilizado para pedir as informa��es necess�rias para a instancia��o de
	 * um objeto da classe <code> PerfilProfessor <code> e para instanciar o objeto.
	 * 
	 * @return um <code> PerfilProfessor <code> especificando o PerfilProfessor que
	 *         o usu�rio acabou de criar
	 */

	public static PerfilProfessor criarPerfilProfessor() {
		scanner = new Scanner(System.in);
		String descricao = "", nome = "1", genero = "Z";
		boolean verificaNome = false;
		while (!verificaNome) {
			System.out.print("Digite o seu nome completo para o perfil: ");
			nome = scanner.nextLine();
			verificaNome = FuncoesCheca.checaPossuiDigito(nome);
		}
		do {
			if (!genero.equals("Z"))
				System.out.println("Nota: Apenas digite Masculino/Feminino/Outro.");
			System.out.print("Digite o seu g�nero (Masculino, Feminino, Outro): ");
			genero = scanner.nextLine();
		} while (!genero.equals("Masculino") & !genero.equals("Feminino") & !genero.equals("Outro"));

		System.out.print("Digite a sua data de nascimento sem /. Ex: 04062020: ");
		String data = scanner.nextLine();
		data = FuncoesCheca.checaData(data);

		Date dataNascimento = new Date(data);
		System.out.print("Digite a data que voc� entrou no IFPB sem /. Ex: 04062020: ");
		data = scanner.nextLine();
		data = FuncoesCheca.checaData(data);
		Date dataIngresso = new Date(data);
		System.out.print("Digite o link para o seu curr�culo (CV Lattes): ");
		String curriculo = scanner.nextLine();
		System.out
				.print("Digite as disciplinas que voc� leciona em uma linha. Ex: \"portugues, matematica, fisica\": ");
		String entrada = scanner.nextLine();
		String entradaDisciplina[] = new String[entrada.split(", ").length];
		entradaDisciplina = entrada.split(", ");

		ArrayList<String> disciplinas = new ArrayList<String>();
		for (String i : entradaDisciplina) {
			disciplinas.add(i);
		}
		String orientacoes = "";

		PerfilProfessor meuPerfilProfessor = new PerfilProfessor(descricao, nome, genero, dataNascimento, dataIngresso,
				curriculo, disciplinas, orientacoes);
		return (meuPerfilProfessor);
	}

	/**
	 * M�todo utilizado para pedir as informa��es necess�rias para se criar um
	 * PerfilTurma e criar o PerfilTurma.
	 * 
	 * @param usuarios todos os usu�rios j� criados no SuapSocial
	 * @return um <code> ArrayList <code> especificando a turma criada, os alunos e
	 *         professores pertencentes � ela.
	 */
	public static ArrayList<Object> criarPerfilTurma(ArrayList<Usuario> usuarios) {
		scanner = new Scanner(System.in);
		String descricao = "", nome = "";
		System.out.print("Digite o nome da turma: ");
		nome = scanner.nextLine();
		System.out.print("Digite os nomes completo dos perfis dos alunos,"
				+ " Ex: \"Victor Rodrigues, Carolina Maia, Eduarda Lima\": ");

		String entradaNomePerfisAlunos = scanner.nextLine();
		ArrayList<String> nomePerfisAlunos = new ArrayList<String>();
		String[] entradaNomePerfisAlunos2 = entradaNomePerfisAlunos.split(", ");
		for (String nomePerfil : entradaNomePerfisAlunos2)
			nomePerfisAlunos.add(nomePerfil);

		System.out.print("Digite os nomes completo dos perfis dos professores,"
				+ " Ex: \"Marcos Vinicius, Mirna Maia, Elaine Cristina\": ");

		String entradaNomePerfisProf = scanner.nextLine();
		ArrayList<String> nomePerfisProf = new ArrayList<String>();
		String[] entradaNomePerfisProf2 = entradaNomePerfisProf.split(", ");
		for (String nomePerfil : entradaNomePerfisProf2)
			nomePerfisProf.add(nomePerfil);

		ArrayList<PerfilAluno> alunos = new ArrayList<PerfilAluno>();
		ArrayList<PerfilProfessor> professores = new ArrayList<PerfilProfessor>();

		for (Usuario i : usuarios) {
			for (int j = 0; j < i.getPerfis().size(); j++) {
				Object perfil = i.getPerfis().get(j);
				if (perfil instanceof PerfilAluno) {
					for (int k = 0; k < nomePerfisAlunos.size(); k++) {
						if (((PerfilAluno) perfil).getNome().equals(nomePerfisAlunos.get(k)))
							alunos.add((PerfilAluno) perfil);
					}
				} else if (perfil instanceof PerfilProfessor) {
					for (int k = 0; k < nomePerfisProf.size(); k++) {
						if (((PerfilProfessor) perfil).getNome().equals(nomePerfisProf.get(k)))
							professores.add((PerfilProfessor) (perfil));
					}
				}
			}
		}

		if (alunos.size() != nomePerfisAlunos.size()) {
			System.out.println("Falha na cria��o de PerfilTurma");
			System.out.println("O nome de aluno digitado n�o existe!");
			return (null);
		} else if (professores.size() != nomePerfisProf.size()) {
			System.out.println("Falha na cria��o de PerfilTurma");
			System.out.println("O nome de professor digitado n�o existe!");
			return (null);
		}

		PerfilTurma meuPerfilTurma = new PerfilTurma(descricao, nome, alunos, professores);

		ArrayList<Object> retorno = new ArrayList<Object>();
		retorno.add(meuPerfilTurma);
		retorno.add(alunos);
		retorno.add(professores);

		return (retorno);
	}

}

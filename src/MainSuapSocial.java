import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainSuapSocial {

	private static Scanner scanner;

	public static void main(String[] args) throws InterruptedException {
		// Lista de usuários cadastradas no SuapSocial
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		while (true) {
			int op = 1, opcao;
			ArrayList<String> comparaInfoLogin;
			ArrayList<?> informacoesVerificadasLogin;
			Usuario userLogado = null;

			// printando tela login
			FuncoesPrint.printTelaLogin();
			// Verificando opção digita
			opcao = Integer.parseInt(FuncoesVerifica.verificaOpcaoTelaLogin());

			// Efetuando o login no SuapSocial (opção 1)
			if (opcao == 1) {
				comparaInfoLogin = OutrasFuncoes.getInformacoesLogin();
				System.out.println();
				informacoesVerificadasLogin = FuncoesVerifica.verificaInformacoesLogin(comparaInfoLogin, listaUsuarios);
				if ((boolean) informacoesVerificadasLogin.get(0))
					userLogado = (Usuario) informacoesVerificadasLogin.get(1);
				else {
					System.out.println("Login ou senha incorretos");
					System.out.println("Redirecionando para a tela de Login...");
					OutrasFuncoes.meuSleep();
					continue;
				}
			} else if (opcao == 2) { // Se registrando no SuapSocial (opção 2)
				Usuario usuarioRegistrado = FuncoesCriar.criarUsuario(listaUsuarios);
				if (usuarioRegistrado == null)
					continue;
				listaUsuarios.add(usuarioRegistrado);
				userLogado = listaUsuarios.get(listaUsuarios.size() - 1);
			} else
				break;
			int indexUserLogado = listaUsuarios.indexOf(userLogado);

			while (op != 5) { // Tela do usuário logada
				scanner = new Scanner(System.in);
				FuncoesPrint.printMenu(userLogado.getLogin());
				op = FuncoesVerifica.verificaOpcaoMenuEhInteiro(op);
				if (op == 0)
					continue;

				switch (op) {
				case 1: { // Acessando Informações do usuário
					ArrayList<?> userLogadoInfos = OutrasFuncoes.getUsuarioInfos(userLogado);
					FuncoesPrint.printGetUsuarioInfos(userLogadoInfos);
					System.out.println();
					System.out.print("Pressione Enter para continuar.");
					scanner.nextLine();
					FuncoesPrint.printTracos();
					break;
				}
				case 2: { // Criando perfil do usuário
					opcao = Integer.valueOf(FuncoesCriar.criarPerfil());
					switch (opcao) {
					case 1: { // Criando perfilAluno
						PerfilAluno meuPerfilAluno = FuncoesCriar.criarPerfilAluno();
						listaUsuarios.get(indexUserLogado).addPerfil(meuPerfilAluno);
						System.out.println("PerfilAluno criado com sucesso!");
						OutrasFuncoes.meuSleep();
						break;
					}
					case 2: { // Criando perfilProfessor
						PerfilProfessor meuPerfilProfessor = FuncoesCriar.criarPerfilProfessor();
						listaUsuarios.get(indexUserLogado).addPerfil(meuPerfilProfessor);
						System.out.println("\nPerfilProfessor criado com sucesso!");
						OutrasFuncoes.meuSleep();
						break;
					}
					case 3: { // Criando perfilTurma
						ArrayList<Object> turmaAlunoProfessores = FuncoesCriar.criarPerfilTurma(listaUsuarios);
						if (turmaAlunoProfessores != null) {
							PerfilTurma meuPerfilTurma = (PerfilTurma) turmaAlunoProfessores.get(0);
							ArrayList<PerfilAluno> alunosTurma = (ArrayList<PerfilAluno>) turmaAlunoProfessores.get(1);
							ArrayList<PerfilProfessor> professoresTurma = (ArrayList<PerfilProfessor>) turmaAlunoProfessores
									.get(2);

							for (PerfilAluno alunoPerfil : alunosTurma) {
								alunoPerfil.setMeuPerfilTurma(meuPerfilTurma);
							}

							for (PerfilProfessor professorPerfil : professoresTurma) {
								professorPerfil.addMeuPerfilTurma(meuPerfilTurma);
							}
							userLogado.addPerfil(meuPerfilTurma);
							System.out.println("\nPerfilTurma criado com sucesso!");
							OutrasFuncoes.meuSleep();
						} else
							OutrasFuncoes.meuSleep();
						break;
					}

					}
					break;
				}
				case 3: { // Acessando os perfis criados pelo usuário
					ArrayList<Object> retornoPrintAcessaPerfil = FuncoesPrint.printAcessaPerfil(userLogado);
					int opcaoLimite = (int) retornoPrintAcessaPerfil.get(0);
					if (opcaoLimite == 1) {
						System.out.println("\tVocê ainda não criou nenhum perfil.\n");
						OutrasFuncoes.meuSleep();
						break;
					}
					HashMap<Integer, Object> perfilAndNome = (HashMap<Integer, Object>) retornoPrintAcessaPerfil.get(1);
					int opUser = 0;
					while (opUser < 1 || opUser > opcaoLimite) {
						opUser = FuncoesVerifica.verificaOpcaoMenuEhInteiro(opUser);
						if (opUser < 1 || opUser > opcaoLimite)
							System.out.println("Caractere Inválido. Tente Novamente.");
					}
					if (opUser == opcaoLimite) {
						OutrasFuncoes.meuSleep();
						break;
					}
					Object perfilLogado = perfilAndNome.get(opUser);
					int opUserTelaPerfil = 0;
					while (opUserTelaPerfil != 5) {
						if (perfilLogado instanceof PerfilAluno) {
							FuncoesPrint.printTelaPerfil(perfilLogado);
							ArrayList<Object> retorno = OutrasFuncoes.processamentoTelaPerfil(listaUsuarios,
									perfilLogado);
							listaUsuarios = (ArrayList<Usuario>) retorno.get(0);
							opUserTelaPerfil = (int) retorno.get(1);
						} else if (perfilLogado instanceof PerfilProfessor) {
							FuncoesPrint.printTelaPerfil(perfilLogado);
							ArrayList<Object> retorno = OutrasFuncoes.processamentoTelaPerfil(listaUsuarios,
									perfilLogado);
							listaUsuarios = (ArrayList<Usuario>) retorno.get(0);
							opUserTelaPerfil = (int) retorno.get(1);
						} else {
							FuncoesPrint.printTelaPerfil(perfilLogado);
							ArrayList<Object> retorno = OutrasFuncoes.processamentoTelaPerfil(listaUsuarios,
									perfilLogado);
							listaUsuarios = (ArrayList<Usuario>) retorno.get(0);
							opUserTelaPerfil = (int) retorno.get(1);
						}
					}
					break;
				}
				case 4: { // Créditos
					FuncoesPrint.printCreditos();
					scanner.nextLine();
					break;
				}
				case 5: { // Deslogar do usuário
					OutrasFuncoes.meuSleep();
					break;
				}
				default: // Caso não aconteça nenhuma das opções mostradas na tela
					FuncoesPrint.printExcecaoCaractere();
				}

			}
		}
		FuncoesPrint.printTracos();
		System.out.println("Até Mais!");
	}
}

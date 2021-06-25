// Declaração da classe OutrasFuncoes com vários métodos criados para serem utilizados no SuapSocial.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Essa classe possui todas as declarações dos métodos que utilizamos para pegar
 * informações (gets) e para atrasar a execução do programa, etc
 * 
 * <p>
 * Métodos da classe OutrasFuncoes:
 * 
 * <blockquote>
 * 
 * <pre>
 * meuSleep()
 * getInformacoesLogin()
 * getUsuarioInfos()
 * getOpcaoUserInfo()
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @see TimeUnit
 * 
 * @author victoremanuel
 * @author rubenssilva
 * 
 */

public class OutrasFuncoes {

	private static Scanner scanner = new Scanner (System.in);

	/**
	 * Método utilizado para atrasar o programa; sempre em 4 segundos.
	 * 
	 * @throws InterruptedException
	 */
	public static void meuSleep() throws InterruptedException {
		System.out.print("Você está sendo redirecionado");
		for(int i = 0; i <4;i++) {
			System.out.print(".");
			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println();
	}

	/**
	 * Método utilizado para pegar as informações de login e senha da entrada
	 * 
	 * @return um <code> ArrayList <code> especificando o login e a senha do usuário
	 */
	public static ArrayList<String> getInformacoesLogin() {
		scanner = new Scanner(System.in);

		System.out.print("Insira seu login de usuario ou email: ");
		String log_in = scanner.next();
		System.out.print("Insira sua senha: ");
		String senha = scanner.next();

		ArrayList<String> meuArrayList = new ArrayList<String>();
		meuArrayList.add(log_in);
		meuArrayList.add(senha);

		return (meuArrayList);
	}

	/**
	 * Método utilizado para obter todos os atributos do objeto Usuario
	 * 
	 * @param meuUsuario o usuário que está logado no momento
	 * @return um <code>ArrayList<code> com todos os atributos do objeto Usuario
	 * @see Usuario
	 */
	public static ArrayList<Object> getUsuarioInfos(Usuario meuUsuario) {
		ArrayList<Object> usuarioInfos = new ArrayList<Object>();
		usuarioInfos.add(meuUsuario.getPerfis());
		usuarioInfos.add(meuUsuario.getEmail());
		usuarioInfos.add(meuUsuario.getLogin());
		usuarioInfos.add(meuUsuario.getSenha());
		return (usuarioInfos);
	}

	public static ArrayList<Usuario> interfaceTelaPerfil(int userOp, ArrayList<Usuario> listaUsuarios,
			Object perfilLogado) throws InterruptedException {
		switch (userOp) {
		case 1: {
			int opPostagem = 0;
			FuncoesPrint.printTelaPostagens();
			while (opPostagem < 1 || opPostagem > 8) {
				opPostagem = FuncoesVerifica.verificaOpcaoMenuEhInteiro(opPostagem);
				if(opPostagem != 0 && (opPostagem < 1 || opPostagem > 8))
					FuncoesPrint.printExcecaoCaractere();
					
			}
			ArrayList<String> atributos = new ArrayList<String>();
			for (int z = 0; z < 3; z++)
				atributos.add("");
			switch (opPostagem) {
			case 1: {
				System.out.print("Digite o link para visualizar a foto: ");
				atributos.set(1, scanner.nextLine());
				Postagem minhaPostagem = new Postagem(atributos.get(0), atributos.get(1), atributos.get(2));
				((Perfil) perfilLogado).addPostagem(minhaPostagem);
				System.out.println("Postagem criada com sucesso!");
				break;
			}
			case 2: {
				System.out.print("Digite o link para visualizar a foto: ");
				atributos.set(1, scanner.nextLine());
				System.out.print("Digite o link para visualizar o vídeo: ");
				atributos.set(2, scanner.nextLine());
				Postagem minhaPostagem = new Postagem(atributos.get(0), atributos.get(1), atributos.get(2));
				((Perfil) perfilLogado).addPostagem(minhaPostagem);
				System.out.println("Postagem criada com sucesso!");
				break;
			}
			case 3: {
				System.out.print("Digite o link para visualizar a foto: ");
				atributos.set(1, scanner.nextLine());
				System.out.print("Digite a legenda da foto: ");
				atributos.set(0, scanner.nextLine());
				Postagem minhaPostagem = new Postagem(atributos.get(0), atributos.get(1), atributos.get(2));
				((Perfil) perfilLogado).addPostagem(minhaPostagem);
				System.out.println("Postagem criada com sucesso!");
				break;
			}
			case 4: {
				System.out.print("Digite o link para visualizar a foto: ");
				atributos.set(1, scanner.nextLine());
				System.out.print("Digite o link para visualizar o vídeo: ");
				atributos.set(2, scanner.nextLine());
				System.out.print("Digite a legenda da foto: ");
				atributos.set(0, scanner.nextLine());
				Postagem minhaPostagem = new Postagem(atributos.get(0), atributos.get(1), atributos.get(2));
				((Perfil) perfilLogado).addPostagem(minhaPostagem);
				System.out.println("Postagem criada com sucesso!");
				break;
			}
			case 5: {
				System.out.print("Digite o link para visualizar o vídeo: ");
				atributos.set(2, scanner.nextLine());
				Postagem minhaPostagem = new Postagem(atributos.get(0), atributos.get(1), atributos.get(2));
				((Perfil) perfilLogado).addPostagem(minhaPostagem);
				System.out.println("Postagem criada com sucesso!");
				break;
			}
			case 6: {
				System.out.print("Digite o link para visualizar o vídeo: ");
				atributos.set(2, scanner.nextLine());
				System.out.print("Digite a legenda do vídeo: ");
				atributos.set(0, scanner.nextLine());
				Postagem minhaPostagem = new Postagem(atributos.get(0), atributos.get(1), atributos.get(2));
				((Perfil) perfilLogado).addPostagem(minhaPostagem);
				System.out.println("Postagem criada com sucesso!");
				break;
			}
			case 7: {
				System.out.print("Digite o texto da postagem: ");
				atributos.set(0, scanner.nextLine());
				Postagem minhaPostagem = new Postagem(atributos.get(0), atributos.get(1), atributos.get(2));
				((Perfil) perfilLogado).addPostagem(minhaPostagem);
				System.out.println("Postagem criada com sucesso!");
				break;
			}

			}
			OutrasFuncoes.meuSleep();
			break;
		}
		case 2: {
			FuncoesPrint.printTracos();
			System.out.println("\n\tBem-vindo à tela de seguir");
			System.out.print("\n\nInforme o nome do perfil de usuário que você deseja seguir: ");
			String nomePerfilASeguir = scanner.nextLine();
			ArrayList<Object> perfis = new ArrayList<Object>();
			int cont = 0;
			for (Usuario usuario : listaUsuarios)
				for (Object perfil : usuario.getPerfis()) {
					if (perfil instanceof PerfilAluno || perfil instanceof PerfilProfessor
							|| perfil instanceof PerfilTurma) {
						if (((Perfil) perfil).getNome().equals(nomePerfilASeguir)) {
							System.out.println("\n\t" + (++cont) + "-" + perfil.toString());
							perfis.add(perfil);
						}
					}
				}
			int opSegue = 0;
			if (cont == 0)
				System.out.println("Não foi encontrado nenhum perfil com esse nome.");
			else {
				System.out.println("\n\t" + (++cont) + "- Sair da tela de seguir");
				while (opSegue < 1 || opSegue > cont)
					opSegue = FuncoesVerifica.verificaOpcaoMenuEhInteiro(opSegue);
				if (opSegue == cont)
					break;
				else {
					((Perfil) perfilLogado).segue(perfis.get(opSegue - 1));
					System.out.println("Perfil seguido com sucesso");
				}
			}

			OutrasFuncoes.meuSleep();
			break;
		}
		case 3: {
			FuncoesPrint.printTelaGetsPerfil(perfilLogado);
			System.out.println("\nPressione Enter para continuar.");
			scanner.nextLine();
			OutrasFuncoes.meuSleep();
			break;
		}
		case 4: {
			FuncoesPrint.printTracos();
			System.out.println("\n\tBem-vindo à tela de alteração" + "\n\n\tO que deseja fazer?"
					+ "\n\n\t1- Alterar a descrição do seu perfil" + "\n\t2- Alterar o nome do perfil"
					+ "\n\t3- Sair da tela de alteração\n");
			int opAltera = 0;
			while (opAltera < 1 || opAltera > 3)
				opAltera = FuncoesVerifica.verificaOpcaoMenuEhInteiro(opAltera);
			String novoAtributo;
			if (opAltera == 1) {
				System.out.print("Digite a nova descrição do perfil: ");
				novoAtributo = scanner.nextLine();
				((Perfil) perfilLogado).setDescricao(novoAtributo);
			} else if (opAltera == 2) {
				boolean checaNome = false;
				do {
					System.out.print("Digite o novo nome do perfil: ");
					novoAtributo = scanner.nextLine();
					checaNome = FuncoesCheca.checaPossuiDigito(novoAtributo);
					if (checaNome == false)
						System.out.println("Você digitou número em seu nome. Tente novamente!");
				} while (checaNome == false);
				((Perfil) perfilLogado).setNome(novoAtributo);
			}
			OutrasFuncoes.meuSleep();
			break;
		}
		case 5: {
			System.out.println("\n\tDeslogando");
			OutrasFuncoes.meuSleep();
			FuncoesPrint.printTracos();
			break;
		}
		}
		for (Usuario usuario : listaUsuarios) {
			if(usuario.getPerfis().contains(perfilLogado)) {
				usuario.getPerfis().set(usuario.getPerfis().indexOf(perfilLogado), perfilLogado);
			}
		}
		return (listaUsuarios);
	}
	/**
	 * 
	 * @param listaUsuarios todos os usuários já criados no SuapSocial
	 * @param perfilLogado o perfil logado no momento
	 * @return um <code>ArrayList<code> especificando a lista de Usuarios
	 * @throws InterruptedException
	 */
	public static ArrayList<Object> processamentoTelaPerfil(ArrayList<Usuario> listaUsuarios, Object perfilLogado)
			throws InterruptedException {
		int userOp = 0;
		ArrayList<Object> objetos = new ArrayList<Object>();
		while (userOp < 1 || userOp > 5)
			userOp = FuncoesVerifica.verificaOpcaoMenuEhInteiro(userOp);
		objetos.add(listaUsuarios);
		objetos.add(userOp);
		if (userOp == 5)
			return (objetos);
		listaUsuarios = OutrasFuncoes.interfaceTelaPerfil(userOp, listaUsuarios, perfilLogado);
		return (objetos);
	}

}

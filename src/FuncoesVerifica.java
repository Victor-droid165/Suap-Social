// Declara��o da classe FuncoesVerifica com os m�todos verifica criados para serem utilizados no SuapSocial.

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Essa classe verifica os valores que foram inseridos no SuapSocial
 * 
 * <p>
 * M�todos da classe FuncoesVerifica:
 * 
 * <blockquote>
 * 
 * <pre>
 * verificaOpcaoTelaLogin()
 * verificaInformacoesLogin(ArrayList<String> infoLogin, ArrayList<Usuario> usuarios)
 * verificaOpcaoMenuEhInteiro(int opcao)
 * verificaOpcaoTelaAcessaPerfil()
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @author victoremanuel
 * @author rubenssilva
 * 
 */

public class FuncoesVerifica {

	private static Scanner scanner;

	/**
	 * M�todo utilizado para fazer com que o valor de op��o seja >=1 e <=3
	 * 
	 * @return um <code>String<code> com a op��o digitada pelo usuario
	 * @throws InterruptedException
	 */
	public static String verificaOpcaoTelaLogin() throws InterruptedException {
		scanner = new Scanner(System.in);
		String opcao = "";
		do {
			if (!opcao.equals("")) {
				FuncoesPrint.printExcecaoCaractere();
				FuncoesPrint.printTelaLogin();
			}
			System.out.print("Digite uma op��o: ");
			opcao = scanner.next();
		} while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3"));

		return (opcao);
	}

	/**
	 * M�todo utilizado para verificar se as informa��es digitadas no login
	 * correspondem � de algum usu�rio
	 * 
	 * @param infoLogin login e senha do usu�rio
	 * @param usuarios  todos os usu�rios j� criados no SuapSocial
	 * @return um <code>ArrayList<code> especificando se o login foi efetuado com
	 *         sucesso ou n�o e o indice do usuario na lista usuarios
	 */
	public static ArrayList<Object> verificaInformacoesLogin(ArrayList<String> infoLogin, ArrayList<Usuario> usuarios) {
		int contador = -1;
		ArrayList<Object> retorno = new ArrayList<Object>();
		//12345 6 8  10 20
		if (usuarios.size() == 0) {
			System.out.println("Nosso sistema detectou que nenhum"
					+ " usu�rio foi criado ainda, por favor escolha a op��o para se registrar.");
			retorno.add(false);
			return (retorno);
		} else
			for (Usuario i : usuarios) {
				contador++;
				if ((i.getLogin().equals(infoLogin.get(0)) || i.getEmail().equals(infoLogin.get(0)))
						&& (i.getSenha().equals(infoLogin.get(1)))) {
					System.out.println("Login efetuado com sucesso!");
					retorno.add(true);
					retorno.add(usuarios.get(contador));
					return (retorno);
				}
			}
		retorno.add(false);
		return (retorno);
	}

	/**
	 * M�todo utilizado para verificar se a op��o digitada pelo usu�rio � um n�mero
	 * inteiro
	 * 
	 * @param opcao opcao digitada pelo usuario
	 * @return 0 se foi digitado um <code>String<code>; 1 se foi digitado um
	 *         <code>int<code>
	 * @throws InterruptedException
	 */
	public static int verificaOpcaoMenuEhInteiro(int opcao) throws InterruptedException {
		scanner = new Scanner(System.in);
		try {
			System.out.print("Digite uma op��o: ");
			opcao = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			FuncoesPrint.printExcecaoCaractere();
			opcao = 0;
		}
		return (opcao);
	}

}

// Declaração da classe FuncoesCheca com os métodos checa criados para serem utilizados no SuapSocial.

import java.util.Scanner;

/**
 * Essa classe checa se os valores que foram inseridos no SuapSocial são
 * verdadeiros
 * 
 * <p>
 * Métodos da classe FuncoesCheca:
 * 
 * <blockquote>
 * 
 * <pre>
 * checaData(<code>String<code> data)
 * checaPossuiDigito(<code>String<code> nome)
 * </pre>
 * 
 * </blockquote>
 * 
 * @see java.lang.Object
 * @author victoremanuel
 * @author rubenssilva
 * 
 */

public class FuncoesCheca {

	private static Scanner scanner;

	/**
	 * Método utilizado para checar a validade da data informada pelo usuário
	 * 
	 * @param data data informada pelo usuário sem /
	 * @return um <code> String <code> especificando a data
	 */
	public static String checaData(String data) {
		scanner = new Scanner(System.in);
		while (true) {
			if (data.length() == 8)
				if ((Integer.valueOf(data.substring(0, 2)) <= 31 && Integer.valueOf(data.substring(0, 2)) >= 1)
						&& (Integer.valueOf(data.substring(2, 4)) <= 12 && Integer.valueOf(data.substring(2, 4)) >= 1)
						&& (Integer.valueOf(data.substring(4)) <= 2020 && Integer.valueOf(data.substring(4)) >= 1915)) {
					data = data.substring(2, 4) + "/" + data.substring(0, 2) + "/" + data.substring(4);
					return data;
				}
			System.out.println("Data inválida");
			System.out.print("Digite novamente: ");
			data = scanner.nextLine();
		}
	}

	/**
	 * Método utilizado para checar se o nome informado possui algum dígito
	 * 
	 * @param nome o nome do perfil do usuário
	 * @return {@code true} Se esse <code>String<code> não possuir dígito;
	 *         {@code false} se possuir dígito.
	 */
	public static boolean checaPossuiDigito(String nome) {
		for (int i = 0; i < nome.length(); i++) {
			if (Character.isDigit(nome.charAt(i)))
				return false;
		}
		return true;
	}

}

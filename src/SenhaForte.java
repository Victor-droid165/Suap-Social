import java.util.Scanner;

public class SenhaForte {
	private static Scanner scanner;

	public static String EhForte() {
		System.out.print("\n\tInsira a senha do usu�rio: ");
		scanner = new Scanner(System.in);
		String senha = scanner.nextLine();
		char[] meu_array1 = senha.toCharArray();
		int cont_maius = 0, cont_minus = 0, cont_num = 0, cont_simb = 0, cont_esp=0, contSeForte = 0;

		for (int i = 0; i < meu_array1.length; i++) {
			if (Character.isDigit(meu_array1[i])) {
				cont_num++;
			} else if ((meu_array1[i] >= 'a' && meu_array1[i] <= 'z')) {
				cont_minus++;
			} else if ((meu_array1[i] >= 'A' && meu_array1[i] <= 'Z'))
				cont_maius++;
			else if (meu_array1[i] == ' ')
				cont_esp++;
			else
				cont_simb++;
		}
		if(cont_esp > 0)
			System.out.println("\tA senha n�o deve conter espa�os");
		else
			contSeForte++;
		if((senha.length())> 18)
			System.out.println("\tA senha deve ter no m�ximo 18 caracteres");
		else
			contSeForte++;
		if (!(senha.length() >= 8))
			System.out.println("\tA senha deve ter no m�nimo 8 caracteres!");
		else
			contSeForte++;
		if (!(cont_maius >= 2))
			System.out.println("\tA senha deve ter no m�nimo 2 letras mai�sculas!");
		else
			contSeForte++;
		if (!(cont_minus >= 1))
			System.out.println("\tA senha deve ter no m�nimo 1 letra min�scula!");
		else
			contSeForte++;
		if (!(cont_num >= 1))
			System.out.println("\tA senha deve ter no m�nimo 1 n�mero!");
		else
			contSeForte++;
		if (!(cont_simb >= 2))
			System.out.println("\tA senha deve ter no m�nimo 2 s�mbolos!");
		else
			contSeForte++;
		if (contSeForte == 7)
			return (senha);
		return (null);
	}
}
package colecoes2;
import java.util.ArrayList;
import java.util.Scanner;

public class ColecoesPt2 {

	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> nomeMasculino = new ArrayList<>();
		ArrayList<String> nomeFeminino = new ArrayList<>();
		
		//Solicita ao usuário que ele digite o nome e o sexo até que ele digite "fim"
		
		System.out.println("Digite o nome e o sexo (M para masculino, F para femininno)");
		String entrada;
		while (!(entrada = scan.nextLine()).equalsIgnoreCase("fim")) {
			String[] partes = entrada.split(" ");
			
			// Verifica se a entrada tem o formato correto (nome e sexo)
			
			if (partes.length == 2) {
				String nome = partes[0];
				String sexo = partes[1].toUpperCase();
				
				// Adiciona o nome a lista correspondente ao sexo
				if (sexo.equals("M")) {
					nomeMasculino.add(nome);
				}else if (sexo.equals("F")) {
					nomeFeminino.add(nome);
				}else {
					System.out.println("Sexo inválido. Use M para masculino ou F para feminino");
				}
				}
		}
		//Imprime os nomes separados por sexo
		System.out.println("\nNomes Masculinos");
		for (String nome : nomeMasculino) {
			System.out.println(nome);
		}
		
		System.out.println("\nNomes Femininos");
		for (String nome : nomeFeminino) {
			System.out.println(nome);
		}
	}
}

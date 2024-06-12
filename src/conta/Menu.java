package conta;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao;



			System.out.println("***************************************************");
			System.out.println("*                                                 *");
			System.out.println("*            BANCO CORINTHIANS 2012               *");
			System.out.println("*                                                 *");
			System.out.println("***************************************************");
			System.out.println("*                                                 *");
			System.out.println("*         1 - Criar conta                         *");
			System.out.println("*         2 - Listar todas as Contas              *");
			System.out.println("*         3 - Buscar conta por Número             *");
			System.out.println("*         4 - Atualizar Dados da Conta            *");
			System.out.println("*         5 - Apagar Conta                        *");
			System.out.println("*         6 - Sacar                               *");
			System.out.println("*         7 - Depositar                           *");
			System.out.println("*         8 - Transferir Valores entre Contas     *");
			System.out.println("*         9 - Sair                                *");
			System.out.println("*                                                 *");
			System.out.println("***************************************************");

			while (true) {
			System.out.printf("Digite a opção desejada: \n");

			opcao = input.nextInt();

			if (opcao == 9) {
				System.out.println("Banco Corinthians 2012: A Credibilidade de um Campeão.\n");
				sobre();
				input.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("Criar Conta\n\n");
				break;

			case 2:
				System.out.println("Listar todas as contas\n\n");
				break;

			case 3:
				System.out.println("Consultar dados da Conta - por Número\n\n");
				break;

			case 4:
				System.out.println("Atualizar dados da Conta\n\n");
				break;

			case 5:
				System.out.println("Apagar a Conta\n\n");
				break;

			case 6:
				System.out.println("Saque\n\n");
				break;

			case 7:
				System.out.println("Deposíto\n\n");
				break;

			case 8:
				System.out.println("Transferência entre Contas \n\n");
				break;

			default:
				System.out.println("\n Opção Invalida! \n");
				break;

			}

		}

	}

	public static void sobre() {
		System.out.println("*********************************************************");
		System.out.println("* Projeto Desenvolvido por: Israel Oliveira             *");
		System.out.println("* Israel Oliveira - linkedin.com/in/israeloliveiradev/  *");
		System.out.println("* github.com/israeloliveiradev                          *");
		System.out.println("*********************************************************");
	}
}

package conta;

import java.util.Locale;
import java.util.Scanner;

import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);



		// TESTE CLASSE CONTA CORRENTE

		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Rebeca", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// TESTE CLASSE CONTA POUPANÇA

		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Ethan", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();



		int opcao;

			while (true) {

			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+          "***************************************************");
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
			System.out.println("***************************************************" + Cores.TEXT_RESET);
			System.out.printf( Cores.TEXT_WHITE_BOLD + "\nDigite a opção desejada: ");
			opcao = input.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD +"\n Banco Corinthians 2012: A Credibilidade de um Campeão.\n");
				sobre();
				input.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Criar Conta\n\n");
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Listar todas as contas\n\n");
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Consultar dados da Conta - por Número\n\n");
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Atualizar dados da Conta\n\n");
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Apagar a Conta\n\n");
				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Saque\n\n");
				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Deposíto\n\n");
				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Transferência entre Contas \n\n");
				break;

			default:
				System.out.println(Cores.TEXT_WHITE_BOLD +"\n Opção Invalida! \n");
				break;

			}

		}

	}

	public static void sobre() {

		System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND +
				           "*********************************************************");
		System.out.println("* Projeto Desenvolvido por: Israel Oliveira             *");
		System.out.println("* Israel Oliveira - linkedin.com/in/israeloliveiradev/  *");
		System.out.println("* github.com/israeloliveiradev                          *");
		System.out.println("*********************************************************");
	}
}

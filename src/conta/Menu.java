package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {

		ContaController contas = new ContaController();

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;


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
			System.out.println( Cores.TEXT_WHITE_BOLD + "\nDigite a opção desejada: ");
			System.out.println("\n");

			try {
				opcao = input.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("\nDigite Valores Inteiros: ");
				input.nextLine();
				opcao = 0;

			}


			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD +"\nBanco Corinthians 2012: A Credibilidade de um Campeão.\n");
				sobre();
				input.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Criar Conta\n\n");

				System.out.println("Digite o Número da Agência: ");
				agencia = input.nextInt();
				System.out.println("Digite o nome do Titular: ");
				input.skip("\\R?");
				titular = input.nextLine();


				do {
					System.out.println("Digite o Tipo da Conta (1 para Conta Corrente ou 2 Para Conta Poupança):");
					tipo = input.nextInt();

				} while(tipo < 1 && tipo > 2);

				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = input.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$):");
					limite = input.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}

				case 2 ->{
					System.out.println("Digite o dia do Aniversário da Conta: ");
					aniversario = input.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}

				}
				keyPress();
				break;


			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Listar todas as contas\n\n");

				contas.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Consultar dados da Conta - por Número\n\n");

				keyPress();
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Atualizar dados da Conta\n\n");

				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Apagar a Conta\n\n");

				keyPress();
				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Saque\n\n");

				keyPress();
				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Deposíto\n\n");

				keyPress();
				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Transferência entre Contas \n\n");

				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "Opção Invalida!\n");
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

	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_WHITE_BOLD + "\n\nDigite Enter para Continuar....");
			System.in.read();
		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}
}

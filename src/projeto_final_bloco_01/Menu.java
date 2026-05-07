package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;
import projeto_final_bloco_01.controller.ProdutoController;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// Instanciando a Controller: ela gerencia a lista (Collection) na memória
		ProdutoController produtos = new ProdutoController();

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                LOJA TECH - PROJETO FINAL            ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Atualizar Produto                    ");
			System.out.println("            4 - Apagar Produto                       ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.print("Entre com a opção desejada: ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("\nERRO: Digite apenas números inteiros!");
				leia.nextLine(); // Limpa o erro do teclado
				opcao = 0; // Reinicia o menu
			}

			if (opcao == 5) {
				System.out.println("\nLoja Tech - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1 -> System.out.println("Cadastrar Produto\n");
				case 2 -> {
					System.out.println("Listar todos os Produtos\n");
					produtos.listarTodos(); // Usa a Collection para listar
				}
				case 3 -> System.out.println("Atualizar Produto\n");
				case 4 -> System.out.println("Apagar Produto\n");
				default -> {
					if (opcao != 0) System.out.println("\nOpção Inválida!\n");
				}
			}
		}
	}
}
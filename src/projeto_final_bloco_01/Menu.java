package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;
import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.Cosmetico;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		// Instanciando a Controller: ela gerencia a lista (Collection) na memória
		ProdutoController produtos = new ProdutoController();

		// --- DADOS DE TESTE PARA VALIDAR A LISTAGEM (COLLECTIONS) ---
		// Cadastramos alguns itens antes do menu iniciar para a lista não vir vazia
		produtos.cadastrar(new Cosmetico(1, "Perfume Floral", 2, 89.90f, "Lavanda"));
		produtos.cadastrar(new Cosmetico(2, "Creme Hidratante", 2, 45.00f, "Sem fragrância"));
		// ------------------------------------------------------------

		int opcao;

		while (true) {

			// Título com Fundo Preto e Letras Ciano
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BOLD 
					+ "*****************************************************" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BOLD 
					+ "                LOJA TECH - PROJETO FINAL            " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BOLD 
					+ "*****************************************************" + Cores.TEXT_RESET);
			
			// Opções em Amarelo para destacar
			System.out.println(Cores.TEXT_YELLOW_BOLD + "            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos os Produtos             ");
			System.out.println("            3 - Atualizar Produto                    ");
			System.out.println("            4 - Apagar Produto                       ");
			System.out.println("            5 - Sair                                 " + Cores.TEXT_RESET);
			
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BOLD 
					+ "*****************************************************" + Cores.TEXT_RESET);
			System.out.print(Cores.TEXT_WHITE_BOLD + "Entre com a opção desejada: " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				// Mensagem de Erro em VERMELHO (Exceptions)
				System.err.println(Cores.TEXT_RED_BOLD + "\nERRO: Digite apenas números inteiros!" + Cores.TEXT_RESET);
				leia.nextLine(); // Limpa o erro do teclado
				opcao = 0; // Reinicia o menu
			}

			if (opcao == 5) {
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nLoja Tech - O seu futuro começa aqui!" + Cores.TEXT_RESET);
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1 -> System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar Produto\n" + Cores.TEXT_RESET);
				case 2 -> {
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os Produtos\n" + Cores.TEXT_RESET);
					// Este método percorre o ArrayList e imprime os dados dos itens de teste
					produtos.listarTodos(); 
				}
				case 3 -> System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Produto\n" + Cores.TEXT_RESET);
				case 4 -> System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Produto\n" + Cores.TEXT_RESET);
				default -> {
					if (opcao != 0) System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				}
			}
		}
	}
}
package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;
import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.Cosmetico;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ProdutoController produtos = new ProdutoController();

		// Variáveis para receber os dados do usuário (Padrão Conta Bancária)
		int opcao, id, tipo;
		String nome, fragrancia;
		float preco;

		while (true) {

			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BOLD 
					+ "*****************************************************" + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BOLD 
					+ "                LOJA TECH - PROJETO FINAL            " + Cores.TEXT_RESET);
			System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_CYAN_BOLD 
					+ "*****************************************************" + Cores.TEXT_RESET);
			
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
				System.err.println(Cores.TEXT_RED_BOLD + "\nERRO: Digite apenas números inteiros!" + Cores.TEXT_RESET);
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 5) {
				System.out.println(Cores.TEXT_PURPLE_BOLD + "\nLoja Tech - O seu futuro começa aqui!" + Cores.TEXT_RESET);
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1 -> {
					System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar Produto\n" + Cores.TEXT_RESET);
					
					System.out.println("Digite o ID do Produto: ");
					id = leia.nextInt();
					
					System.out.println("Digite o Nome do Produto: ");
					leia.skip("\\R?"); 
					nome = leia.nextLine();
					
					tipo = 2; // Definindo como Cosmético por padrão
					
					System.out.println("Digite o Preço: ");
					preco = leia.nextFloat();
					
					System.out.println("Digite a Fragrância: ");
					leia.skip("\\R?");
					fragrancia = leia.nextLine();
					
					/* CHAMADA DO MÉTODO: Envia o novo objeto para a Collection na Controller */
					produtos.cadastrar(new Cosmetico(id, nome, tipo, preco, fragrancia));
				}
				case 2 -> {
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todos os Produtos\n" + Cores.TEXT_RESET);
					/* CHAMADA DO MÉTODO: Percorre o ArrayList e mostra os dados */
					produtos.listarTodos(); 
				}
				case 3 -> {
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Produto\n" + Cores.TEXT_RESET);
					
					System.out.println("Digite o ID do produto que deseja atualizar: ");
					id = leia.nextInt();
					
					// Verifica se o produto existe antes de pedir os novos dados
					if (produtos.buscarNaCollection(id) != null) {
						
						System.out.println("Digite o Novo Nome: ");
						leia.skip("\\R?");
						nome = leia.nextLine();
						
						System.out.println("Digite o Novo Preço: ");
						preco = leia.nextFloat();
						
						System.out.println("Digite a Nova Fragrância: ");
						leia.skip("\\R?");
						fragrancia = leia.nextLine();
						
						/* CHAMADA DO MÉTODO: Atualiza o item na lista */
						produtos.atualizar(new Cosmetico(id, nome, 2, preco, fragrancia));
						
					} else {
						System.out.println(Cores.TEXT_RED_BOLD + "\nProduto não encontrado!" + Cores.TEXT_RESET);
					}
				}
				case 4 -> {
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Produto\n" + Cores.TEXT_RESET);
					
					System.out.println("Digite o ID do produto que deseja apagar: ");
					id = leia.nextInt();
					
					/* CHAMADA DO MÉTODO: Remove o item da Collection pelo ID */
					produtos.deletar(id);
				}
				default -> {
					if (opcao != 0) System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				}
			}
		}
	}
}
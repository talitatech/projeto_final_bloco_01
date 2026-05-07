package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	// Collection: ArrayList que armazena os objetos na memória
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	@Override
	public void procurarPorId(int id) {
		var produto = buscarNaCollection(id);
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nProduto não encontrado!");
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nProduto cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getId());
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
		} else
			System.out.println("\nProduto não encontrado!");
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		if (produto != null) {
			listaProdutos.remove(produto);
		}
	}

	public Produto buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
}
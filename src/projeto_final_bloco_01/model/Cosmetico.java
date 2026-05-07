package projeto_final_bloco_01.model;

public class Cosmetico extends Produto {

	private String fragrancia;

	public Cosmetico(int id, String nome, int tipo, float preco, String fragrancia) {
		super(id, nome, tipo, preco);
		this.fragrancia = fragrancia;
	}

	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Fragrância: " + this.fragrancia);
	}
}
import java.util.ArrayList;
import java.util.List;

public class Secao extends ItemBiblioteca {
	private List<ItemBiblioteca> itens;

	public Secao(String nome) {
		super(nome);
		this.itens = new ArrayList<ItemBiblioteca>();
	}

	public void addItem(ItemBiblioteca item) {
		this.itens.add(item);
	}

	@Override
	public String getDetalhes() {
		StringBuilder saida = new StringBuilder("Seção: " + this.getNome() + "\n");
		for (ItemBiblioteca item : itens) {
			saida.append(item.getDetalhes());
		}
		return saida.toString();
	}
}

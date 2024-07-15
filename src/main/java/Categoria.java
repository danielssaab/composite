import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemBiblioteca {
	private List<Secao> secoes;

	public Categoria(String nome) {
		super(nome);
		this.secoes = new ArrayList<Secao>();
	}

	public void addSecao(Secao secao) {
		this.secoes.add(secao);
	}

	@Override
	public String getDetalhes() {
		StringBuilder saida = new StringBuilder("Categoria: " + this.getNome() + "\n");
		for (Secao secao : secoes) {
			saida.append(secao.getDetalhes());
		}
		return saida.toString();
	}
}

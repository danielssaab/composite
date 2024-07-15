public class Livro extends ItemBiblioteca {
	private String autor;

	public Livro(String nome, String autor) {
		super(nome);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String getDetalhes() {
		return "Livro: " + this.getNome() + " - Autor: " + this.autor + "\n";
	}
}

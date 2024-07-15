public abstract class ItemBiblioteca {
	private String nome;

	public ItemBiblioteca(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract String getDetalhes();
}

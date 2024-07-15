public class Biblioteca {
	private Categoria categoriaPrincipal;

	public void setCategoriaPrincipal(Categoria categoriaPrincipal) {
		this.categoriaPrincipal = categoriaPrincipal;
	}

	public String getDetalhesBiblioteca() {
		if (this.categoriaPrincipal == null) {
			throw new NullPointerException("Biblioteca sem categoria principal");
		}
		return this.categoriaPrincipal.getDetalhes();
	}
}

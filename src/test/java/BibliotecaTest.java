import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

	@Test
	void deveRetornarDetalhesBiblioteca() {
		Livro livro1 = new Livro("Padrões de Projeto", "Marco Antonio");
		Livro livro2 = new Livro("Código Limpo", "Sandro Fernandes");

		Secao secao1 = new Secao("Programação");
		secao1.addItem(livro1);
		secao1.addItem(livro2);

		Livro livro3 = new Livro("UML", "Ricardo");
		Secao secao2 = new Secao("Desenvolvimento");
		secao2.addItem(livro3);

		Categoria categoria = new Categoria("Tecnologia");
		categoria.addSecao(secao1);
		categoria.addSecao(secao2);

		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setCategoriaPrincipal(categoria);

		assertEquals("Categoria: Tecnologia\n" +
				"Seção: Programação\n" +
				"Livro: Padrões de Projeto - Autor: Marco Antonio\n" +
				"Livro: Código Limpo - Autor: Sandro Fernandes\n" +
				"Seção: Desenvolvimento\n" +
				"Livro: UML - Autor: Ricardo\n",
			biblioteca.getDetalhesBiblioteca());
	}

	@Test
	void deveRetornarExcecaoBibliotecaSemCategoriaPrincipal() {
		try {
			Biblioteca biblioteca = new Biblioteca();
			biblioteca.getDetalhesBiblioteca();
			fail();
		}
		catch (NullPointerException e) {
			assertEquals("Biblioteca sem categoria principal", e.getMessage());
		}
	}
}

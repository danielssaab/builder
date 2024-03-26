package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatrimonioBuilderTest {

	@Test
	void deveRetornarExcecaoParaPatrimonioSemId() {
		try {
			PatrimonioBuilder patrimonioBuilder = new PatrimonioBuilder();
			Patrimonio patrimonio = patrimonioBuilder
				.setNome("Computador")
				.setDescricao("Computador de escritório")
				.setLocalizacao("Sala 102")
				.setDepartamento("TI")
				.setValor(2500.00)
				.setStatus("Ativo")
				.build();
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Id inválido", e.getMessage());
		}
	}

	@Test
	void deveRetornarExcecaoParaPatrimonioSemNome() {
		try {
			PatrimonioBuilder patrimonioBuilder = new PatrimonioBuilder();
			Patrimonio patrimonio = patrimonioBuilder
				.setId(1)
				.setDescricao("Computador de escritório")
				.setLocalizacao("Sala 102")
				.setDepartamento("TI")
				.setValor(2500.00)
				.setStatus("Ativo")
				.build();
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Nome inválido", e.getMessage());
		}
	}

	@Test
	void deveRetornarPatrimonioValido() {
		PatrimonioBuilder patrimonioBuilder = new PatrimonioBuilder();
		Patrimonio patrimonio = patrimonioBuilder
			.setId(1)
			.setNome("Computador")
			.setDescricao("Computador de escritório")
			.setLocalizacao("Sala 102")
			.setDepartamento("TI")
			.setValor(2500.00)
			.setStatus("Ativo")
			.build();

		assertNotNull(patrimonio);
	}
}

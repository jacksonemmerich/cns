package br.gov.ro.portovelho;

import static org.junit.Assert.*;

import org.junit.Test;

import br.gov.ro.portovelho.models.DadosDemograficosImpl;

public class DadosDemograficosTest {
	
	@Test
	public void documentoXmlNullo() {
		DadosDemograficosImpl dadosDemograficosImpl = new DadosDemograficosImpl(null);
		assertFalse(dadosDemograficosImpl.sucesso());
	}

}

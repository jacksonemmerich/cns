package br.gov.ro.portovelho;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.gov.ro.portovelho.cns.CnsDatasus;
import br.gov.ro.portovelho.conexao.ConexaoDatasusImpl;
import br.gov.ro.portovelho.models.DadosDemograficosImpl;

public class CnsDatasusConexaoTest {
	
	@Test
	public void cnsConsegueConectarBarramento() {
		// Em ConexaoDatasusImpl o parametro false é setado para ambiente de homologação, true para ambiente de produção.
		ConexaoDatasusImpl conexaoDatasusImpl = new ConexaoDatasusImpl("CADSUS.CNS.PDQ.PUBLICO", "kUXNmiiii#RDdlOELdoe00966", false);
		CnsDatasus cns = new CnsDatasus(conexaoDatasusImpl);
		DadosDemograficosImpl dadosDemograficosImpl= (DadosDemograficosImpl) cns.buscaPorCPF("123.456.789-10");
		
		assertTrue(dadosDemograficosImpl.sucesso());
		
		
	}

}

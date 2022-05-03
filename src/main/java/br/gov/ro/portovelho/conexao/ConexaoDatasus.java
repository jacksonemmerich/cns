package br.gov.ro.portovelho.conexao;

/**
 * Servicos oferecidos para conexao com Datasus para acesso ao CNS. 
 * @author jackson
 *
 */
public interface ConexaoDatasus {
	
	String requisicao(String xmlRequisicao);
	
}

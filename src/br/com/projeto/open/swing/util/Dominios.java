package br.com.projeto.open.swing.util;

import java.util.Hashtable;
import org.openswing.swing.domains.java.Domain;
/**
 *
 * @author José Augusto
 */
public final class Dominios {
    
    private final Hashtable domains;

    public Dominios(Hashtable domains) {
    this.domains = domains;
    criarDominio();    
    }
    
    
public void criarDominio(){
    
    Domain sexo = new Domain("SEXO");
    
    sexo.addDomainPair("", "");
    sexo.addDomainPair("F", "Feminino");
    sexo.addDomainPair("M", "Masculino");
    sexo.addDomainPair("O", "Outro");
    domains.put(sexo.getDomainId(), sexo);
    
    Domain UF = new Domain("UF");
    
    UF.addDomainPair("", "");
    UF.addDomainPair("AC", "Acre");
    UF.addDomainPair("AL", "Alagoas");
    UF.addDomainPair("AP", "Amapá");
    UF.addDomainPair("AM", "Amazonas");
    UF.addDomainPair("BA", "Bahia");
    UF.addDomainPair("CE", "Ceará");
    UF.addDomainPair("ES", "Espírito Santo");
    UF.addDomainPair("GO", "Goiás");
    UF.addDomainPair("MA", "Maranhão");
    UF.addDomainPair("MT", "Mato grosso");
    UF.addDomainPair("MS", "Mato grosso do sul");
    UF.addDomainPair("MG", "Minas Gerais");
    UF.addDomainPair("PA", "Pará");
    UF.addDomainPair("PB", "Paraíba");
    UF.addDomainPair("PR", "Paraná");
    UF.addDomainPair("PE", "Pernambuco");
    UF.addDomainPair("PI", "Piauí");
    UF.addDomainPair("RJ", "Rio de Janeiro");
    UF.addDomainPair("RN", "Rio Grande do Norte");
    UF.addDomainPair("RS", "Rio Grande do Sul");
    UF.addDomainPair("RO", "Rondônia");
    UF.addDomainPair("RR", "Roraima");
    UF.addDomainPair("SC", "Santa Catarina");
    UF.addDomainPair("SP", "Sâo Paulo");
    UF.addDomainPair("SE", "Sergipe");
    UF.addDomainPair("TO", "Tocantins");
    UF.addDomainPair("DF", "Distrito Federal");
    
    domains.put(UF.getDomainId(), UF);
}
}

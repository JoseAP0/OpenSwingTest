package br.com.projeto.open.swing.VO;

import java.math.BigDecimal;
import java.util.Date;
import org.openswing.swing.message.receive.java.ValueObjectImpl;

public class FuncionarioVO extends ValueObjectImpl {

    private Integer id;
    String sexo;
    String uf;
    String numero;
    String nome;
    String logradouro;
    String complemento;
    String cidade;
    String cep;
    String bairro;
    String cargo;
    Date data_de_saida;
    Date data_de_entrada;
    BigDecimal salario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getData_de_saida() {
        return data_de_saida;
    }

    public void setData_de_saida(Date data_de_saida) {
        this.data_de_saida = data_de_saida;
    }

    public Date getData_de_entrada() {
        return data_de_entrada;
    }

    public void setData_de_entrada(Date data_de_entrada) {
        this.data_de_entrada = data_de_entrada;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "FuncionarioVO{" + "id=" + id + ", sexo=" + sexo + ", uf=" + uf + ", numero=" + numero + ", nome=" + nome + ", logradouro=" + logradouro + ", complemento=" + complemento + ", cidade=" + cidade + ", cep=" + cep + ", bairro=" + bairro + ", cargo=" + cargo + ", data_de_saida=" + data_de_saida + ", data_de_entrada=" + data_de_entrada + ", salario=" + salario + '}';
    }
}

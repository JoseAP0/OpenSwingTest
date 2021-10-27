package br.com.projeto.open.swing.VO;

import java.util.Objects;
import org.openswing.swing.message.receive.java.ValueObjectImpl;

public class FuncionarioVO extends ValueObjectImpl{

    Integer id;
    String uf, sexo, numero, nome, logradouro,
            complemento, cidade, cep, bairro, cargo;
    double salario;
    String data_de_saida, data_de_entrada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getcargo() {
        return cargo;
    }

    public void setcargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getData_de_saida() {
        return data_de_saida;
    }

    public void setData_de_saida(String data_de_saida) {
        this.data_de_saida = data_de_saida;
    }

    public String getData_de_entrada() {
        return data_de_entrada;
    }

    public void setData_de_entrada(String data_de_entrada) {
        this.data_de_entrada = data_de_entrada;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FuncionarioVO other = (FuncionarioVO) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "uf=" + uf + ", sexo=" + sexo + ", numero=" + numero + ", nome=" + nome + ", logradouro=" + logradouro + ", complemento=" + complemento + ", cidade=" + cidade + ", cep=" + cep + ", bairro=" + bairro + ", cargo=" + cargo + ", salario=" + salario + ", data_de_saida=" + data_de_saida + ", data_de_entrada=" + data_de_entrada + '}';
    }

}

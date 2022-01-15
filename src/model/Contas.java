package model;

/**
 *
 * @author Henrique
 * <p>
 * Classe reponsável por definir os parâmetros e métodos referentes às contas
 * bancárias contidas no sistema.</p>
 *
 */
public class Contas {
    
    /**
     * <h1>Atributos das <b>{@link Contas}</b> no sistema.</h1>
     *
     *
     * @see {@link Contas}
     */
    
    private int id_conta;
    private String nome;
    private String sobrenome;
    private String instituicaoFinanceira;
    private String tipoConta;
    private Double saldo, total_receitas, total_despesas;

/**
     * <h1>Retorna o total das {@link Despesas} registradas para a {@link Contas} .</h1>
     *
     *
     * @return 
     * @see {@link getTotal_despesas}
     */
    
    public Double getTotal_despesas() {
        return total_despesas;
    }
/**
     * <h1>Define o total das {@link Despesas} registradas para a {@link Contas} .</h1>
     *
     * 
     * @param total_despesas
     * @see {@link setTotal_despesas}
     */
    public void setTotal_despesas(Double total_despesas) {
        this.total_despesas = total_despesas;
    }
/**
     * <h1>Retorna a instituição financeira cadastrada para a {@link Contas} .</h1>
     *
     *
     * @return 
     * @see {@link getInstituicaoFinanceira}
     */
    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }
/**
     * <h1>Define a instituição financeira cadastrada para a {@link Contas} .</h1>
     *
     * 
     * @param instituicaoFinanceira
     * @see {@link setInstituicaoFinanceira}
     */
    public void setInstituicaoFinanceira(String instituicaoFinanceira) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }
/**
     * <h1>Retorna o total das {@link Despesas} registradas para a {@link Contas} .</h1>
     *
     *
     * @return 
     * @see {@link getTotal_despesas}
     */
    public Double getTotal_receitas() {
        return total_receitas;
    }
    /**
     * <h1>Define o total das {@link Despesas} registradas para a {@link Contas} .</h1>
     *
     * 
     * @param total_receitas
     * @see {@link getTotal_despesas}
     */
    public void setTotal_receitas(Double total_receitas) {
        this.total_receitas = total_receitas;
    }

    /**
     * <h1>Retorna o tipo da {@link Contas} bancária.</h1>
     *
     *
     * @return 
     * @see {@link getTipoConta}
     */
    public String getTipoConta() {
        return tipoConta;
    }

    /**
     * <h1>Define o tipo da {@link Contas} bancária.</h1>
     *
     * 
     * @param tipoConta
     * @see {@link setTipoConta}
     */
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    /**
     * <h1>Retorna o saldo da {@link Contas} bancária.</h1>
     *
     *
     * @return 
     * @see {@link getSaldo}
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * <h1>Define o saldo da {@link Contas} bancária.</h1>
     *
     * 
     * @param saldo
     * @see {@link setSaldo}
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * <h1>Retorna o id da {@link Contas} bancária.</h1>
     *
     *
     * @return 
     * @see {@link getId_conta}
     */
    public int getId_conta() {
        return id_conta;
    }

    /**
     * <h1>Define o id da {@link Contas} bancária.</h1>
     *
     * 
     * @param id_conta
     * @see {@link setId_conta}
     */
    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    /**
     * <h1>Retorna o nome da pessoa vinculada à {@link Contas} bancária.</h1>
     *
     *
     * @return 
     * @see {@link getNome}
     */
    public String getNome() {
        return nome;
    }

    /**
     * <h1>Define o nome da pessoa vinculada à {@link Contas} bancária.</h1>
     *
     * 
     * @param nome
     * @see {@link setNome}
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * <h1>Retorna o sobrenome da pessoa vinculada à {@link Contas} bancária.</h1>
     *
     *
     * @return 
     * @see {@link getSobrenome}
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * <h1>Define o sobrenome da pessoa vinculada à {@link Contas} bancária.</h1>
     *
     * 
     * @param sobrenome
     * @see {@link setSobrenome}
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * <h1>Retorna a agência bancária cadastrada para a {@link Contas} bancária.</h1>
     *
     *
     * @return 
     * @see {@link getAgenciaBancaria}
     */
    public String getAgenciaBancaria() {
        return instituicaoFinanceira;
    }

    /**
     * <h1>Define a agência {@link Contas} bancária para a {@link Contas} bancária.</h1>
     *
     * 
     * @param agenciaBancaria
     * @see {@link setAgenciaBancaria}
     */
    public void setAgenciaBancaria(String agenciaBancaria) {
        this.instituicaoFinanceira = agenciaBancaria;
    }

    public void setAgenciaBancaria(Agencias item) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }
}

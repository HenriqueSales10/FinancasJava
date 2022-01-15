package model;

/**
 *
 * @author Henrique
 * <p>
 * Classe reponsável por definir os parâmetros e métodos referentes às despesas contidas no sistema.</p>
 *
 */
public class Despesas {
    
    int id_despesa, numero_conta;
    String descricao, tipo_depesa, data_despesa, data_despesa_esperado, despesaRegistrada;
    Double valor_despesa;
/**
     * <h1>Retorna o id das {@link Despesas}.</h1>
     *
     *
     * @return 
     * @see {@link getId_despesa}
     */
    public int getId_despesa() {
        return id_despesa;
    }
/**
     * <h1>Define o id das {@link Despesas}.</h1>
     *
     * 
     * @param id_despesa
     * @see {@link setId_despesa}
     */
    public void setId_despesa(int id_despesa) {
        this.id_despesa = id_despesa;
    }
/**
     * <h1>Retorna o número da conta em que a {@link Despesas} foi cadastrada.</h1>
     *
     *
     * @return 
     * @see {@link getNumero_conta}
     */
    public int getNumero_conta() {
        return numero_conta;
    }
/**
     * <h1>Define o número da conta em que a {@link Despesas} será cadastrada.</h1>
     *
     * 
     * @param numero_conta
     * @see {@link setNumero_conta}
     */
    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }
/**
     * <h1>Retorna a descrição da {@link Despesas}.</h1>
     *
     *
     * @return 
     * @see {@link getDescricao}
     */
    public String getDescricao() {
        return descricao;
    }
/**
     * <h1>Degine a descrição da {@link Despesas}.</h1>
     *
     * 
     * @param descricao
     * @see {@link setDescricao}
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
/**
     * <h1>Retorna o tipo da {@link Despesas}.</h1>
     *
     *
     * @return 
     * @see {@link getTipo_depesa}
     */
    public String getTipo_depesa() {
        return tipo_depesa;
    }
/**
     * <h1>Define o tipo da {@link Despesas}.</h1>
     *
     * 
     * @param tipo_depesa
     * @see {@link setTipo_depesa}
     */
    public void setTipo_depesa(String tipo_depesa) {
        this.tipo_depesa = tipo_depesa;
    }
/**
     * <h1>Retorna a data da {@link Despesas}.</h1>
     *
     *
     * @return 
     * @see {@link getData_despesa}
     */
    public String getData_despesa() {
        return data_despesa;
    }
/**
     * <h1>Define a data da {@link Despesas}.</h1>
     *
     * 
     * @param data_despesa
     * @see {@link setData_despesa}
     */
    public void setData_despesa(String data_despesa) {
        this.data_despesa = data_despesa;
    }
/**
     * <h1>Retorna a data esperada da {@link Despesas}.</h1>
     *
     *
     * @return 
     * @see {@link getData_despesa_esperado}
     */
    public String getData_despesa_esperado() {
        return data_despesa_esperado;
    }
/**
     * <h1>Define a data esperada da {@link Despesas}.</h1>
     *
     * 
     * @param data_despesa_esperado
     * @see {@link setData_despesa_esperado}
     */
    public void setData_despesa_esperado(String data_despesa_esperado) {
        this.data_despesa_esperado = data_despesa_esperado;
    }
/**
     * <h1>Retorna se a{@link Despesas} foi registrada.</h1>
     *
     *
     * @return 
     * @see {@link getDespesaRegistrada}
     */
    public String getDespesaRegistrada() {
        return despesaRegistrada;
    }
/**
     * <h1>Define se a {@link Despesas} foi registrada.</h1>
     *
     * 
     * @param despesaRegistrada
     * @see {@link setDespesaRegistrada}
     */
    public void setDespesaRegistrada(String despesaRegistrada) {
        this.despesaRegistrada = despesaRegistrada;
    }
/**
     * <h1>Retorna o valor da{@link Despesas}.</h1>
     *
     *
     * @return 
     * @see {@link getValor_despesa}
     */
    public Double getValor_despesa() {
        return valor_despesa;
    }
/**
     * <h1>Define o valor da{@link Despesas}.</h1>
     *
     * 
     * @param valor_despesa
     * @see {@link getValor_despesa}
     */
    public void setValor_despesa(Double valor_despesa) {
        this.valor_despesa = valor_despesa;
    }
    
        
}

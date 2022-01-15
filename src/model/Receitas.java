package model;
/**
 *
 * @author Henrique
 * <p>
 * Classe reponsável por definir os parâmetros e métodos referentes às receitas contidas no sistema.</p>
 *
 */
public class Receitas {
    
    int id_receita, id_conta;
    String descricao, tipo_Receita, data_Recebimento, data_RecebimentoEsperado, recebimentoRegistrado;
    Double valor_Receita;
    /**
     * <h1>Retorna se o recebimento da {@link Receitas} foi registrado.</h1>
     *
     *
     * @return 
     * @see {@link getRecebimentoRegistrado}
     */
    public String getRecebimentoRegistrado() {
        return recebimentoRegistrado;
    }

    /**
     * <h1>Define se o recebimento da {@link Receitas} foi registrado.</h1>
     *
     * 
     * @param recebimentoRegistrado
     * @see {@link setRecebimentoRegistrado}
     */
    public void setRecebimentoRegistrado(String recebimentoRegistrado) {
        this.recebimentoRegistrado = recebimentoRegistrado;
    }
    
/**
     * <h1>Retorna o Id da {@link Receitas}.</h1>
     *
     *
     * @return 
     * @see {@link getId_receita}
     */
    public int getId_receita() {
        return id_receita;
    }
/**
     * <h1>Define o Id da {@link Receitas}.</h1>
     *
     * 
     * @param id_receita
     * @see {@link setId_receita}
     */
    public void setId_receita(int id_receita) {
        this.id_receita = id_receita;
    }
/**
     * <h1>Retorna o Id da conta em que a {@link Receitas} foi cadastrada.</h1>
     *
     *
     * @return 
     * @see {@link getId_conta}
     */
    public int getId_conta() {
        return id_conta;
    }
/**
     * <h1>Define o Id da conta em que a {@link Receitas} será cadastrada.</h1>
     *
     * 
     * @param id_conta
     * @see {@link setId_conta}
     */
    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }   
/**
     * <h1>Retorna a data de recebimento da {@link Receitas}.</h1>
     *
     *
     * @return 
     * @see {@link getData_Recebimento}
     */
    public String getData_Recebimento() {
        return data_Recebimento;
    }
/**
     * <h1>Define a data de recebimento da {@link Receitas}.</h1>
     *
     * 
     * @param data_Recebimento
     * @see {@link setData_Recebimento}
     */
    public void setData_Recebimento(String data_Recebimento) {
        this.data_Recebimento = data_Recebimento;
    }
/**
     * <h1>Retorna a data de recebimento esperada da {@link Receitas}.</h1>
     *
     *
     * @return 
     * @see {@link getData_RecebimentoEsperado}
     */
    public String getData_RecebimentoEsperado() {
        return data_RecebimentoEsperado;
    }

    /**
     * <h1>Define a data de recebimento esperada da {@link Receitas}.</h1>
     *
     *
     * @param data_RecebimentoEsperado 
     * @see {@link setData_RecebimentoEsperado}
     */
    public void setData_RecebimentoEsperado(String data_RecebimentoEsperado) {
        this.data_RecebimentoEsperado = data_RecebimentoEsperado;
    }
/**
     * <h1>Retorna a descrição da {@link Receitas}.</h1>
     *
     *
     * @return 
     * @see {@link getDescricao}
     */
    public String getDescricao() {
        return descricao;
    }
/**
     * <h1>Define a descrição da {@link Receitas}.</h1>
     *
     * 
     * @param descricao
     * @see {@link setDescricao}
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
/**
     * <h1>Retorna o tipo da {@link Receitas}.</h1>
     *
     *
     * @return 
     * @see {@link getTipo_Receita}
     */
    public String getTipo_Receita() {
        return tipo_Receita;
    }
/**
     * <h1>Define o tipo da {@link Receitas}.</h1>
     *
     * 
     * @param tipo_Receita
     * @see {@link setTipo_Receita}
     */
    public void setTipo_Receita(String tipo_Receita) {
        this.tipo_Receita = tipo_Receita;
    }
/**
     * <h1>Retorna o valor da {@link Receitas}.</h1>
     *
     *
     * @return 
     * @see {@link getValor_Receita}
     */
    public Double getValor_Receita() {
        return valor_Receita;
    }
/**
     * <h1>Define o valor da {@link Receitas}.</h1>
     *
     * 
     * @param valor_Receita
     * @see {@link setValor_Receita}
     */
    public void setValor_Receita(Double valor_Receita) {
        this.valor_Receita = valor_Receita;
    }
        
}

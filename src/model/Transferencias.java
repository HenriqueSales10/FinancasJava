package model;

/**
 *
 * @author Henrique
 * <p>
 * Classe reponsável por definir os parâmetros e métodos referentes às transferências entre {@link Contas}.</p>
 *
 */
public class Transferencias {
    int id_transferencia;
    int conta_origem;
    int conta_destino;
    Double valor_transferencia;
/**
     * <h1>Retorna o Id da {@link Transferencias}.</h1>
     *
     *
     * @return 
     * @see {@link getId_transferencia}
     */
    public int getId_transferencia() {
        return id_transferencia;
    }
/**
     * <h1>Define o Id da {@link Transferencias}.</h1>
     *
     * 
     * @param id_transferencia
     * @see {@link setId_transferencia}
     */
    public void setId_transferencia(int id_transferencia) {
        this.id_transferencia = id_transferencia;
    }
/**
     * <h1>Retorna a {@link Contas} que irá realizar a {@link Transferencias}.</h1>
     *
     *
     * @return 
     * @see {@link getConta_origem}
     */
    public int getConta_origem() {
        return conta_origem;
    }
/**
     * <h1>Define a {@link Contas} que irá realizar a {@link Transferencias}.</h1>
     *
     * 
     * @param conta_origem
     * @see {@link setConta_origem}
     */
    public void setConta_origem(int conta_origem) {
        this.conta_origem = conta_origem;
    }
/**
     * <h1>Retorna a {@link Contas} que irá receber a {@link Transferencias}.</h1>
     *
     *
     * @return 
     * @see {@link getConta_destino}
     */
    public int getConta_destino() {
        return conta_destino;
    }
/**
     * <h1>Define a {@link Contas} que irá receber a {@link Transferencias}.</h1>
     *
     *
     * @return 
     * @see {@link setConta_destino}
     */
    public void setConta_destino(int conta_destino) {
        this.conta_destino = conta_destino;
    }
/**
     * <h1>Retorna o valor da {@link Transferencias}.</h1>
     *
     *
     * @return 
     * @see {@link getValor_transferencia}
     */
    public Double getValor_transferencia() {
        return valor_transferencia;
    }
/**
     * <h1>Define o valor da {@link Transferencias}.</h1>
     *
     * 
     * @param valor_transferencia
     * @see {@link setValor_transferencia}
     */
    public void setValor_transferencia(Double valor_transferencia) {
        this.valor_transferencia = valor_transferencia;
    }
}

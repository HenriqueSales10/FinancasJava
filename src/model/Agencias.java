package model;

/**
 *
 * @author Henrique
 * <p>
 * Classe reponsável por definir os parâmetros e métodos referentes às Agências
 * bancárias contidas no sistema.</p>
 *
 */
public class Agencias {

    /**
     * <h1>Atributos das <b>{@link Agências}</b> cadastradas no sistema.</h1>
     *
     *
     * @return 
     * @see {@link Agencias}
     */
    
    public int getIdAgencia() {
        return idAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }
     
    public int idAgencia;
        String nomeAgencia;

        public Agencias(int idAgencia, String nomeAgencia) {
            this.idAgencia = idAgencia;
            this.nomeAgencia = nomeAgencia;
        }

        @Override
        public String toString() {
            return nomeAgencia;
        }
}

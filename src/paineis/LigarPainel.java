package paineis;

/**
 *
 * @author RojeruSan
 */
import javax.swing.JPanel;

public class LigarPainel {
    //
    private final JPanel container;
    private final JPanel conteudo;


   /**
     *
     * <h1>Classe reponsável por realizar a ligação entre telas.</h1>
     * 
     *
     * @author Henrique
     * @param container
     * @param content
     *
     * @see LigarPainel
     */
    public LigarPainel(JPanel container, JPanel content) {
        
        this.container = container;
        this.conteudo = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.conteudo);
        this.container.revalidate();
        this.container.repaint();
        
    }

}

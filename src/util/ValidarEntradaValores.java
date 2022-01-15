package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * <h1>Classe responsável por realizar a validação da inserção de dados nos campos que devem receber os valores.</h1>
 *
 *
 * @author Henrique
 */
public class ValidarEntradaValores extends PlainDocument{
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9|^.]", ""), a);

    }    	   
}


package br.com.projeto.open.swing.util;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author José Augusto
 */
public class AdicionaMascara {
    
    MaskFormatter mascara = null;

    public void verificaTipoRegistro() {

    }
    
    public MaskFormatter setMascara(String tpReg) {

        try {

            if (tpReg.equals("DATA_COMPLETA")) {
                mascara = new MaskFormatter("##/##/####");
            }

            mascara.setPlaceholderCharacter('_');
            mascara.setValidCharacters("0123456789");

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Adicionar Mascara" + e.getMessage());
        }
        return mascara;
    }
    
}

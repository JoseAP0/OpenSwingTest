package br.com.projeto.open.swing.util;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
        

public class Alerta {    
    
    public void alertaNormal(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem, "aviso", 2);
    }
    
    public boolean alertaPergunta(String pergunta){
        return (JOptionPane.showConfirmDialog(null, pergunta, "Confirmação", 1));
        
    }
}

package br.com.projeto.open.swing.util;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
        

public class Alerta {   
    
    ImageIcon iconeSucesso = new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/open/swing/images/iconeSucesso.png"));
    ImageIcon iconeErro = new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/open/swing/images/iconeErro.png"));
    ImageIcon iconePergunta = new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/open/swing/images/iconePergunta.png"));
    
    public void alertaNormal(String mensagem){
        
        JOptionPane.showMessageDialog(null, mensagem, "aviso", 2);
    }
    
    public boolean alertaPergunta(String pergunta){
        
        return (JOptionPane.showConfirmDialog(null, pergunta, "Confirmação", JOptionPane.YES_OPTION, 1, iconePergunta)== JOptionPane.YES_OPTION);
    }
    
    public void alertaSucesso(String mensagem){
        
        JOptionPane.showMessageDialog(null, mensagem, "Sucesso", 1, iconeSucesso);
    }
    
    public void alertaErro(String mensagem){
        
        JOptionPane.showMessageDialog(null, mensagem, "Erro!", 0, iconeErro);
    }
}

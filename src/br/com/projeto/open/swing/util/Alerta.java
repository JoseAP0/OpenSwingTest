package br.com.projeto.open.swing.util;

import javax.swing.JOptionPane;
        

public class Alerta {    
    
    public void alertaNormal(String mensagem){
        
        JOptionPane.showMessageDialog(null, mensagem, "aviso", 2);
    }
    
    public boolean alertaPergunta(String pergunta){
        
        return (JOptionPane.showConfirmDialog(null, pergunta, "Confirmação", JOptionPane.YES_OPTION, 1, null)== JOptionPane.YES_OPTION);
    }
    
    public void alertaSucesso(String mensagem){
        
        JOptionPane.showMessageDialog(null, mensagem, "Sucesso", 1);
    }
    
    public void alertaErro(String mensagem){
        
        JOptionPane.showMessageDialog(null, mensagem, "Erro!", 0);
    }
}

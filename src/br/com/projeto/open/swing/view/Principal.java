package br.com.projeto.open.swing.view;

import br.com.projeto.open.swing.controllers.FuncionarioController;
import br.com.projeto.open.swing.util.Dominios;
import br.com.projeto.open.swing.util.Util;
import java.awt.event.KeyEvent;
import java.util.Hashtable;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.openswing.swing.internationalization.java.XMLResourcesFactory;
import org.openswing.swing.permissions.java.ButtonsAuthorizations;
import org.openswing.swing.util.client.ClientSettings;

/**
 *
 * @author José Augusto
 */
public class Principal extends javax.swing.JFrame {

    Login login;
    public FuncionarioController funcionarioController;

    public Principal() {
        
        this.organizarOpenSwing();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jMenu1.setText("Sistemas");

        jMenuItem1.setText("Relogar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");

        jMenuItem3.setText("Funcionários");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (login != null){
            this.dispose();
            login.setVisible(true);
        }
        else{
                this.dispose();
                login = new Login();
                login.setVisible(true);
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        if (Util.getAlert().alertaPergunta("Deseja realmente sair?")) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        if (funcionarioController == null) {

            funcionarioController = new FuncionarioController(this);
        } else {

            funcionarioController.getFuncionarioView().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables

    private void organizarOpenSwing() {

        Hashtable domains = new Hashtable();
        new Dominios(domains);

        Hashtable xmlFiles = new Hashtable();
        xmlFiles.put("PT_BR", "br/com/projeto/open/swing/arquivos/Resources_pt_br.xml");
        ClientSettings clientSettings = new ClientSettings(
                new XMLResourcesFactory(xmlFiles, false),
                domains,
                new ButtonsAuthorizations()
        );

        try {
            Properties props = new Properties();

            props.put("logoString", "Curso");
            props.setProperty("brightMode", "on");
            props.setProperty("menuOpaque", "on");
            props.setProperty("backgroundPattern", "off");
            props.setProperty("drawSquareButtons", "on");
            props.setProperty("backgroundColor", "235 247 254");

            props.setProperty("windowDecoration", "false");

            com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {

            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClientSettings.AS_TAB = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        ClientSettings.LOOK_AND_FEEL_CLASS_NAME = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";

        ClientSettings.VIEW_BACKGROUND_SEL_COLOR = true;
        ClientSettings.BUTTON_INSERT_IMAGE_NAME = "inserir.png";
        ClientSettings.BUTTON_RELOAD_IMAGE_NAME = "reload.png";
        ClientSettings.BUTTON_SAVE_IMAGE_NAME = "salvar.png";
        ClientSettings.BUTTON_FILTER_IMAGE_NAME = "pesquisa.png";
        ClientSettings.BUTTON_DELETE_IMAGE_NAME = "excluir.png";
        ClientSettings.BUTTON_COPY_IMAGE_NAME = "copiar.png";
        ClientSettings.BUTTON_EDIT_IMAGE_NAME = "editar.png";
        ClientSettings.BUTTON_EXPORT_IMAGE_NAME = "exportar.png";
        ClientSettings.BUTTON_IMPORT_IMAGE_NAME = "importar.png";

        ClientSettings.VIEW_MANDATORY_SYMBOL = true;
        ClientSettings.ALLOW_OR_OPERATOR = false;
        ClientSettings.LIKE = "ilike";

        ClientSettings.TREE_BACK = null;
        ClientSettings.FILTER_PANEL_ON_GRID = false;
        ClientSettings.SHOW_FILTER_SYMBOL = true;
        ClientSettings.ASK_BEFORE_CLOSE = true;
        ClientSettings.RELOAD_LAST_VO_ON_FORM = true;
        ClientSettings.MAX_EXPORTABLE_ROWS = 2000000000;
        ClientSettings.SHOW_EVENT_QUEUE_EXCEPTIONS = true;
        ClientSettings.SHOW_FOCUS_BORDER_ON_FORM = false;

        ClientSettings.getInstance().setLanguage("PT_BR");
    }
}

package br.com.projeto.open.swing.view;

import br.com.model.open.swing.controllers.FuncionarioController;
import org.openswing.swing.client.GridControl;

/**
 *
 * @author José Augusto
 */
public class FuncionarioView extends javax.swing.JFrame {

    private final FuncionarioController funcionarioController;

    public FuncionarioView(FuncionarioController funcionarioController1) {

        this.funcionarioController = funcionarioController1;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        paneBottons = new javax.swing.JPanel();
        btnInsert = new org.openswing.swing.client.InsertButton();
        btnEdit = new org.openswing.swing.client.EditButton();
        btnSave = new org.openswing.swing.client.SaveButton();
        btnDelete = new org.openswing.swing.client.DeleteButton();
        btnReload = new org.openswing.swing.client.ReloadButton();
        btnExport = new org.openswing.swing.client.ExportButton();
        btnImport = new org.openswing.swing.client.ImportButton();
        btnCopy = new org.openswing.swing.client.CopyButton();
        btnFilter = new org.openswing.swing.client.FilterButton();
        paneGrid = new javax.swing.JPanel();
        gridFuncionarios = new org.openswing.swing.client.GridControl();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        comboColumn1 = new org.openswing.swing.table.columns.client.ComboColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        comboColumn2 = new org.openswing.swing.table.columns.client.ComboColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn6 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn7 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        dateColumn1 = new org.openswing.swing.table.columns.client.DateColumn();
        dateColumn2 = new org.openswing.swing.table.columns.client.DateColumn();
        currencyColumn1 = new org.openswing.swing.table.columns.client.CurrencyColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        paneBottons.setBorder(javax.swing.BorderFactory.createTitledBorder("Botões"));
        paneBottons.add(btnInsert);
        paneBottons.add(btnEdit);
        paneBottons.add(btnSave);
        paneBottons.add(btnDelete);
        paneBottons.add(btnReload);
        paneBottons.add(btnExport);
        paneBottons.add(btnImport);
        paneBottons.add(btnCopy);
        paneBottons.add(btnFilter);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(paneBottons, gridBagConstraints);

        paneGrid.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados dos Funcionários"));
        paneGrid.setLayout(new java.awt.GridBagLayout());

        gridFuncionarios.setCopyButton(this.btnCopy);
        gridFuncionarios.setDeleteButton(this.btnDelete);
        gridFuncionarios.setEditButton(this.btnEdit);
        gridFuncionarios.setExportButton(this.btnExport);
        gridFuncionarios.setFilterButton(this.btnFilter);
        gridFuncionarios.setImportButton(this.btnImport);
        gridFuncionarios.setInsertButton(this.btnInsert);
        gridFuncionarios.setReloadButton(this.btnReload);
        gridFuncionarios.setValueObjectClassName("br.com.projeto.open.swing.VO.FuncionarioVO");

        textColumn2.setColumnName("nome");
        textColumn2.setHeaderColumnName("Nome");
        gridFuncionarios.getColumnContainer().add(textColumn2);

        comboColumn1.setColumnName("sexo");
        comboColumn1.setHeaderColumnName("Sexo");
        gridFuncionarios.getColumnContainer().add(comboColumn1);

        textColumn3.setEncryptText(true);
        textColumn3.setHeaderColumnName("Cidade");
        gridFuncionarios.getColumnContainer().add(textColumn3);

        comboColumn2.setHeaderColumnName("UF");
        gridFuncionarios.getColumnContainer().add(comboColumn2);

        textColumn5.setHeaderColumnName("Logradouro");
        gridFuncionarios.getColumnContainer().add(textColumn5);

        textColumn6.setHeaderColumnName("Bairro");
        gridFuncionarios.getColumnContainer().add(textColumn6);

        textColumn7.setHeaderColumnName("CEP");
        gridFuncionarios.getColumnContainer().add(textColumn7);

        textColumn8.setHeaderColumnName("Complemento");
        gridFuncionarios.getColumnContainer().add(textColumn8);

        dateColumn1.setHeaderColumnName("Data de Entrada");
        gridFuncionarios.getColumnContainer().add(dateColumn1);

        dateColumn2.setHeaderColumnName("Data de Saída");
        gridFuncionarios.getColumnContainer().add(dateColumn2);

        currencyColumn1.setHeaderColumnName("Salário");
        gridFuncionarios.getColumnContainer().add(currencyColumn1);

        textColumn1.setHeaderColumnName("Número");
        gridFuncionarios.getColumnContainer().add(textColumn1);

        textColumn4.setEncryptText(true);
        textColumn4.setHeaderColumnName("Cargo");
        gridFuncionarios.getColumnContainer().add(textColumn4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        paneGrid.add(gridFuncionarios, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(paneGrid, gridBagConstraints);

        setSize(new java.awt.Dimension(1327, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            
            Principal principal = new Principal();
            new FuncionarioController(principal);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.client.CopyButton btnCopy;
    private org.openswing.swing.client.DeleteButton btnDelete;
    private org.openswing.swing.client.EditButton btnEdit;
    private org.openswing.swing.client.ExportButton btnExport;
    private org.openswing.swing.client.FilterButton btnFilter;
    private org.openswing.swing.client.ImportButton btnImport;
    private org.openswing.swing.client.InsertButton btnInsert;
    private org.openswing.swing.client.ReloadButton btnReload;
    private org.openswing.swing.client.SaveButton btnSave;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn1;
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn2;
    private org.openswing.swing.table.columns.client.CurrencyColumn currencyColumn1;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn1;
    private org.openswing.swing.table.columns.client.DateColumn dateColumn2;
    private org.openswing.swing.client.GridControl gridFuncionarios;
    private javax.swing.JPanel paneBottons;
    private javax.swing.JPanel paneGrid;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn6;
    private org.openswing.swing.table.columns.client.TextColumn textColumn7;
    private org.openswing.swing.table.columns.client.TextColumn textColumn8;
    // End of variables declaration//GEN-END:variables

    public GridControl getGridFuncionarios() {
        return gridFuncionarios;
    }

}

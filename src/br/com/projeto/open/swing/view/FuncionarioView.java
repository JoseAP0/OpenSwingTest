package br.com.projeto.open.swing.view;

import br.com.projeto.open.swing.controllers.FuncionarioController;
import br.com.projeto.open.swing.util.AdicionaMascara;
import org.openswing.swing.client.GridControl;

/**
 *
 * @author José Augusto
 */
public class FuncionarioView extends javax.swing.JFrame {

    private final FuncionarioController funcionarioController;
    private final AdicionaMascara adicionaMascara = new AdicionaMascara();

    public FuncionarioView(FuncionarioController funcionarioController1) {

        this.funcionarioController = funcionarioController1;
        initComponents();
        this.organizaDomain();
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
        btnNav = new org.openswing.swing.client.NavigatorBar();
        paneGrid = new javax.swing.JPanel();
        gridFuncionarios = new org.openswing.swing.client.GridControl();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        comboSexo = new org.openswing.swing.table.columns.client.ComboColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        comboUF = new org.openswing.swing.table.columns.client.ComboColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn6 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn7 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn8 = new org.openswing.swing.table.columns.client.TextColumn();
        dateEntrada = new org.openswing.swing.table.columns.client.DateColumn();
        dateSaida = new org.openswing.swing.table.columns.client.DateColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        decimalColumn1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        paneBottons.setBorder(javax.swing.BorderFactory.createTitledBorder("Botões"));

        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        paneBottons.add(btnInsert);
        paneBottons.add(btnEdit);

        btnSave.setAttributeName("bairro");
        paneBottons.add(btnSave);
        paneBottons.add(btnDelete);
        paneBottons.add(btnReload);
        paneBottons.add(btnExport);
        paneBottons.add(btnImport);
        paneBottons.add(btnCopy);
        paneBottons.add(btnFilter);

        btnNav.setShowPaginationButtons(false);
        paneBottons.add(btnNav);

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
        gridFuncionarios.setNavBar(this.btnNav);
        gridFuncionarios.setReloadButton(this.btnReload);
        gridFuncionarios.setSaveButton(this.btnSave);
        gridFuncionarios.setValueObjectClassName("br.com.projeto.open.swing.VO.FuncionarioVO");

        textColumn2.setColumnDuplicable(true);
        textColumn2.setColumnFilterable(true);
        textColumn2.setColumnName("nome");
        textColumn2.setColumnSelectable(false);
        textColumn2.setColumnSortable(true);
        textColumn2.setEditableOnEdit(true);
        textColumn2.setEditableOnInsert(true);
        textColumn2.setHeaderColumnName("Nome");
        textColumn2.setMaxCharacters(100);
        gridFuncionarios.getColumnContainer().add(textColumn2);

        comboSexo.setColumnDuplicable(true);
        comboSexo.setColumnFilterable(true);
        comboSexo.setColumnName("sexo");
        comboSexo.setColumnSelectable(false);
        comboSexo.setColumnSortable(true);
        comboSexo.setDomainId("sexo");
        comboSexo.setEditableOnEdit(true);
        comboSexo.setEditableOnInsert(true);
        comboSexo.setHeaderColumnName("Sexo");
        gridFuncionarios.getColumnContainer().add(comboSexo);

        textColumn3.setColumnDuplicable(true);
        textColumn3.setColumnFilterable(true);
        textColumn3.setColumnName("cidade");
        textColumn3.setColumnSelectable(false);
        textColumn3.setColumnSortable(true);
        textColumn3.setEditableOnEdit(true);
        textColumn3.setEditableOnInsert(true);
        textColumn3.setHeaderColumnName("Cidade");
        textColumn3.setMaxCharacters(50);
        gridFuncionarios.getColumnContainer().add(textColumn3);

        comboUF.setColumnDuplicable(true);
        comboUF.setColumnFilterable(true);
        comboUF.setColumnName("uf");
        comboUF.setColumnSelectable(false);
        comboUF.setColumnSortable(true);
        comboUF.setDomainId("uf");
        comboUF.setEditableOnEdit(true);
        comboUF.setEditableOnInsert(true);
        comboUF.setHeaderColumnName("UF");
        gridFuncionarios.getColumnContainer().add(comboUF);

        textColumn5.setColumnDuplicable(true);
        textColumn5.setColumnFilterable(true);
        textColumn5.setColumnName("logradouro");
        textColumn5.setColumnSelectable(false);
        textColumn5.setColumnSortable(true);
        textColumn5.setEditableOnEdit(true);
        textColumn5.setEditableOnInsert(true);
        textColumn5.setHeaderColumnName("Logradouro");
        gridFuncionarios.getColumnContainer().add(textColumn5);

        textColumn6.setColumnDuplicable(true);
        textColumn6.setColumnFilterable(true);
        textColumn6.setColumnName("bairro");
        textColumn6.setColumnSelectable(false);
        textColumn6.setColumnSortable(true);
        textColumn6.setEditableOnEdit(true);
        textColumn6.setEditableOnInsert(true);
        textColumn6.setHeaderColumnName("Bairro");
        gridFuncionarios.getColumnContainer().add(textColumn6);

        textColumn7.setColumnDuplicable(true);
        textColumn7.setColumnFilterable(true);
        textColumn7.setColumnName("cep");
        textColumn7.setColumnSelectable(false);
        textColumn7.setColumnSortable(true);
        textColumn7.setEditableOnEdit(true);
        textColumn7.setEditableOnInsert(true);
        textColumn7.setHeaderColumnName("CEP");
        gridFuncionarios.getColumnContainer().add(textColumn7);

        textColumn8.setColumnDuplicable(true);
        textColumn8.setColumnFilterable(true);
        textColumn8.setColumnName("complemento");
        textColumn8.setColumnSelectable(false);
        textColumn8.setColumnSortable(true);
        textColumn8.setEditableOnEdit(true);
        textColumn8.setEditableOnInsert(true);
        textColumn8.setHeaderColumnName("Complemento");
        gridFuncionarios.getColumnContainer().add(textColumn8);

        dateEntrada.setColumnDuplicable(true);
        dateEntrada.setColumnFilterable(true);
        dateEntrada.setColumnName("data_de_entrada");
        dateEntrada.setColumnSortable(true);
        dateEntrada.setEditableOnEdit(true);
        dateEntrada.setEditableOnInsert(true);
        dateEntrada.setHeaderColumnName("Data de Entrada");
        gridFuncionarios.getColumnContainer().add(dateEntrada);

        dateSaida.setColumnName("data_de_saida");
        dateSaida.setEditableOnEdit(true);
        dateSaida.setEditableOnInsert(true);
        dateSaida.setHeaderColumnName("Data de Saída");
        gridFuncionarios.getColumnContainer().add(dateSaida);

        textColumn1.setColumnDuplicable(true);
        textColumn1.setColumnFilterable(true);
        textColumn1.setColumnName("numero");
        textColumn1.setColumnSelectable(false);
        textColumn1.setColumnSortable(true);
        textColumn1.setEditableOnEdit(true);
        textColumn1.setEditableOnInsert(true);
        textColumn1.setHeaderColumnName("Número");
        gridFuncionarios.getColumnContainer().add(textColumn1);

        decimalColumn1.setColumnName("salario");
        decimalColumn1.setColumnSortable(true);
        decimalColumn1.setDecimals(2);
        decimalColumn1.setEditableOnEdit(true);
        decimalColumn1.setEditableOnInsert(true);
        decimalColumn1.setHeaderColumnName("Salário");
        gridFuncionarios.getColumnContainer().add(decimalColumn1);

        textColumn4.setColumnDuplicable(true);
        textColumn4.setColumnFilterable(true);
        textColumn4.setColumnName("cargo");
        textColumn4.setColumnSelectable(false);
        textColumn4.setColumnSortable(true);
        textColumn4.setEditableOnEdit(true);
        textColumn4.setEditableOnInsert(true);
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

        setSize(new java.awt.Dimension(1541, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

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
    private org.openswing.swing.client.NavigatorBar btnNav;
    private org.openswing.swing.client.ReloadButton btnReload;
    private org.openswing.swing.client.SaveButton btnSave;
    private org.openswing.swing.table.columns.client.ComboColumn comboSexo;
    private org.openswing.swing.table.columns.client.ComboColumn comboUF;
    private org.openswing.swing.table.columns.client.DateColumn dateEntrada;
    private org.openswing.swing.table.columns.client.DateColumn dateSaida;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn1;
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

    private void organizaDomain() {
        this.comboSexo.setDomainId("SEXO");
        this.comboUF.setDomainId("UF");
    }

    public GridControl getGridFuncionarios() {
        return gridFuncionarios;
    }

}

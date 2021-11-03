package br.com.projeto.open.swing.controllers;

import br.com.projeto.open.swing.VO.FuncionarioVO;
import br.com.projeto.open.swing.model.FuncionarioDAO;
import br.com.projeto.open.swing.util.Util;
import br.com.projeto.open.swing.view.FuncionarioView;
import br.com.projeto.open.swing.view.Principal;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;

/**
 *
 * @author José Augusto
 */
public class FuncionarioController extends GridController implements GridDataLocator {

    private final Principal principal;
    private final FuncionarioView funcionarioView;
    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public FuncionarioController(Principal principal) {

        this.principal = principal;

        this.funcionarioView = new FuncionarioView(FuncionarioController.this);

        this.funcionarioView.getGridFuncionarios().setController(FuncionarioController.this);
        this.funcionarioView.getGridFuncionarios().setGridDataLocator(FuncionarioController.this);

        this.funcionarioView.setVisible(true);

        this.funcionarioView.getGridFuncionarios().requestFocus();
    }

    @Override
    public Response loadData(int action,
            int startIndex,
            Map filteredColumns,
            ArrayList currentSortedColumns,
            ArrayList currentSortedVersusColumns,
            Class valueObjectType,
            Map otherGridParams) {

        filteredColumns = Util.ajustaFiltro(filteredColumns);

        GridParams gridParams = new GridParams(
                action,
                startIndex,
                filteredColumns,
                currentSortedColumns,
                currentSortedVersusColumns,
                new HashMap()
        );

        return this.funcionarioDAO.loadData(gridParams);
    }

    @Override
    public void createValueObject(ValueObject valueObject) throws Exception {

        ((FuncionarioVO) valueObject).setSalario(new BigDecimal(0.0));
    }

    @Override
    public Response insertRecords(int[] rowNumbers, ArrayList newValueObjects) throws Exception {

        return this.funcionarioDAO.insert(newValueObjects);
    }

    @Override
    public Response updateRecords(int[] linhas, ArrayList objetoAnterior, ArrayList objetoAtualizado) throws Exception {

        return this.funcionarioDAO.edit(objetoAtualizado);
    }

    @Override
    public Response deleteRecords(ArrayList VO) throws Exception {
        ArrayList vos = VO;

        for (int i = 0; i < vos.size(); i++) {
            this.funcionarioDAO.delete((FuncionarioVO) vos.get(i));
        }

        return new VOResponse(true);
    }

    @Override
    public String getHeaderTooltip(String attributeName) {

        return attributeName;
    }

    @Override
    public String getCellTooltip(int row, String attributeName) {

        Object texto = funcionarioView.getGridFuncionarios().getVOListTableModel().getField(row, attributeName);
        if (texto == null) {
            texto = "";
        }

        return texto.toString();
    }

    public FuncionarioView getFuncionarioView() {
        return funcionarioView;
    }
}

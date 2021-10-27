package br.com.projeto.open.swing.model;

import br.com.projeto.open.swing.VO.FuncionarioVO;
import br.com.projeto.open.swing.util.Conexao;
import br.com.projeto.open.swing.util.Util;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.server.QueryUtil;

/**
 *
 * @author José Augusto
 */
public class FuncionarioDAO {

//    public Response loadData(GridParams gridParams) {
//
//        try {
//            Connection conn = Conexao.getConexao();
//
//            String sql = "select nome from usuario";
//
//            Map attribute2dbField = new HashMap();
//
//            attribute2dbField.put("nome", "nome");
//
//            return QueryUtil.getQuery(conn,
//                    sql,
//                    new ArrayList(),
//                    attribute2dbField,
//                    FuncionarioVO.class,
//                    "t",
//                    "f",
//                    gridParams,
//                    false
//            );
//
//        } catch (SQLException e) {
//            Util.getAlert().alertaErro("Erro no LoadData: " + e);
//            return new ErrorResponse(e.getMessage());
//        } catch (Exception ex) {
//            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return new ErrorResponse(ex.getMessage());
//        }
//    }
    
    public Response loadData(GridParams gridParams) {

        try {

            Connection connection = Conexao.getConexao();

            String sql = "SELECT \n"
                    + "    nome\n"
                    + "FROM usuario";

            Map attribute2dbField = new HashMap();

            attribute2dbField.put("nome", "nome");

            return QueryUtil.getQuery(connection,
                    sql,
                    new ArrayList(),
                    attribute2dbField,
                    FuncionarioVO.class,
                    "t",
                    "f",
                    gridParams,
                    false
            );

        } catch (Exception ex) {

            
            return new ErrorResponse(ex.getMessage());
        }
    }

}

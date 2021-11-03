package br.com.projeto.open.swing.model;

import br.com.projeto.open.swing.VO.FuncionarioVO;
import br.com.projeto.open.swing.util.Conexao;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.send.java.GridParams;
import org.openswing.swing.server.QueryUtil;

/**
 *
 * @author José Augusto
 */
public class FuncionarioDAO {

    public Response loadData(GridParams gridParams) {

        try {

            Connection connection = Conexao.getConexao();

            String sql = "SELECT\n"
                    + "	a.id,\n"
                    + "    a.nome,\n"
                    + "    a.logradouro,\n"
                    + "    a.sexo,\n"
                    + "    a.salario,\n"
                    + "    to_date(a.data_de_entrada, 'ddMMyyyy') AS data_de_entrada,\n"
                    + "    to_date(a.data_de_saida, 'ddMMyyyy')AS data_de_saida,\n"
                    + "    a.cidade,\n"
                    + "    a.numero,\n"
                    + "    a.complemento,\n"
                    + "    a.bairro,\n"
                    + "    a.uf,\n"
                    + "    a.cep,\n"
                    + "    a.cargo    \n"
                    + "FROM funcionario a\n"
                    + "WHERE TRUE";

            Map attribute2dbField = new HashMap();

            attribute2dbField.put("id", "a.id");
            attribute2dbField.put("nome", "a.nome");
            attribute2dbField.put("logradouro", "a.logradouro");
            attribute2dbField.put("sexo", "a.sexo");
            attribute2dbField.put("salario", "a.salario");
            attribute2dbField.put("data_de_entrada", "data_de_entrada");
            attribute2dbField.put("data_de_saida", "data_de_saida");
            attribute2dbField.put("cidade", "a.cidade");
            attribute2dbField.put("numero", "a.numero");
            attribute2dbField.put("complemento", "a.complemento");
            attribute2dbField.put("bairro", "a.bairro");
            attribute2dbField.put("uf", "a.uf");
            attribute2dbField.put("cep", "a.cep");
            attribute2dbField.put("cargo", "a.cargo");

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

    public Response insert(ArrayList newValueObjects) {

        Connection connection = Conexao.getConexao();
        PreparedStatement preparedStatement = null;

        FuncionarioVO objetoNovoVO;

        String sql = "INSERT INTO funcionario (\n"
                + "  nome,\n"
                + "  logradouro,\n"
                + "  sexo,\n"
                + "  salario,\n"
                + "  data_de_entrada,\n"
                + "  data_de_saida,\n"
                + "  cidade,\n"
                + "  numero,\n"
                + "  complemento,\n"
                + "  bairro,\n"
                + "  uf,\n"
                + "  cep,\n"
                + "  cargo\n"
                + ") VALUES (\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?,\n"
                + "  ?\n"
                + ")";

        try {

            for (int i = 0; i < newValueObjects.size(); i++) {

                objetoNovoVO = (FuncionarioVO) newValueObjects.get(i);

                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, (String) objetoNovoVO.getNome() == null ? "" : objetoNovoVO.getNome());
                preparedStatement.setString(2, (String) objetoNovoVO.getLogradouro() == null ? "" : objetoNovoVO.getLogradouro());
                preparedStatement.setString(3, (String) objetoNovoVO.getSexo() == null ? "" : objetoNovoVO.getSexo());
                preparedStatement.setBigDecimal(4, new BigDecimal(String.valueOf(objetoNovoVO.getSalario())));
                //preparedStatement.setString(5, (String) objetoNovoVO.getData_de_entrada() == null ? "" : objetoNovoVO.getData_de_entrada());
                //preparedStatement.setString(6, (String) objetoNovoVO.getData_de_saida() == null ? "" : objetoNovoVO.getData_de_saida());
                preparedStatement.setString(7, (String) objetoNovoVO.getCidade() == null ? "" : objetoNovoVO.getCidade());
                preparedStatement.setString(8, (String) objetoNovoVO.getNumero() == null ? "" : objetoNovoVO.getNumero());
                preparedStatement.setString(9, (String) objetoNovoVO.getComplemento() == null ? "" : objetoNovoVO.getComplemento());
                preparedStatement.setString(10, (String) objetoNovoVO.getBairro() == null ? "" : objetoNovoVO.getBairro());
                preparedStatement.setString(11, (String) objetoNovoVO.getUf() == null ? "" : objetoNovoVO.getUf());
                preparedStatement.setString(12, (String) objetoNovoVO.getCep() == null ? "" : objetoNovoVO.getCep());
                preparedStatement.setString(13, (String) objetoNovoVO.getCargo() == null ? "" : objetoNovoVO.getCargo());

                preparedStatement.executeUpdate();
            }

        } catch (SQLException ex) {
            return new ErrorResponse(ex.getMessage());
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                
                System.err.println(ex.getMessage());
            }
        }

        return new VOListResponse(newValueObjects, false, newValueObjects.size());
    }

    // método de Edição
    public Response edit(ArrayList objetoAtualizado) {

        Connection connection = Conexao.getConexao();

        PreparedStatement preparedStatement = null;

        FuncionarioVO objetoNovoVO;

        try {

            for (int i = 0; i < objetoAtualizado.size(); i++) {

                objetoNovoVO = (FuncionarioVO) objetoAtualizado.get(i);

                preparedStatement = connection.prepareStatement("UPDATE empresa SET \n"
                        + "  nome=?,\n"
                        + "  logradouro=?,\n"
                        + "  sexo=?,\n"
                        + "  salario=?,\n"
                        + "  data_de_entrada=?,\n"
                        + "  data_de_saida=?,\n"
                        + "  cidade=?,\n"
                        + "  numero=?,\n"
                        + "  complemento=?,\n"
                        + "  bairro=?,\n"
                        + "  uf=?,\n"
                        + "  cep=?,\n"
                        + "  cargo=?\n"
                        + "  WHERE id=?");

                preparedStatement.setString(1, (String) objetoNovoVO.getNome() == null ? "" : objetoNovoVO.getNome());
                preparedStatement.setString(2, (String) objetoNovoVO.getLogradouro() == null ? "" : objetoNovoVO.getLogradouro());
                preparedStatement.setString(3, (String) objetoNovoVO.getSexo() == null ? "" : objetoNovoVO.getSexo());
                preparedStatement.setBigDecimal(4, new BigDecimal(String.valueOf(objetoNovoVO.getSalario())));
                //preparedStatement.setString(5, (String) objetoNovoVO.getData_de_entrada() == null ? "" : objetoNovoVO.getData_de_entrada());
                //preparedStatement.setString(6, (String) objetoNovoVO.getData_de_saida() == null ? "" : objetoNovoVO.getData_de_saida());
                preparedStatement.setString(7, (String) objetoNovoVO.getCidade() == null ? "" : objetoNovoVO.getCidade());
                preparedStatement.setString(8, (String) objetoNovoVO.getNumero() == null ? "" : objetoNovoVO.getNumero());
                preparedStatement.setString(9, (String) objetoNovoVO.getComplemento() == null ? "" : objetoNovoVO.getComplemento());
                preparedStatement.setString(10, (String) objetoNovoVO.getBairro() == null ? "" : objetoNovoVO.getBairro());
                preparedStatement.setString(11, (String) objetoNovoVO.getUf() == null ? "" : objetoNovoVO.getUf());
                preparedStatement.setString(12, (String) objetoNovoVO.getCep() == null ? "" : objetoNovoVO.getCep());
                preparedStatement.setString(13, (String) objetoNovoVO.getCargo() == null ? "" : objetoNovoVO.getCargo());

                preparedStatement.setInt(14, objetoNovoVO.getId());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException ex) {

            System.err.println(ex.getMessage());
        } finally {
            try {
                if (preparedStatement != null) {

                    preparedStatement.close();
                }
            } catch (SQLException ex) {

                return new ErrorResponse(ex.getMessage());
            }
        }

        return new VOListResponse(objetoAtualizado, false, objetoAtualizado.size());
    }

    public void delete(FuncionarioVO funcionarioVO) {

        Connection conn = Conexao.getConexao();
        PreparedStatement ps = null;

        String sql = "DELETE FROM funcionario WHERE id = ?;";

        try {

            ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionarioVO.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {

            System.err.println(ex.getMessage());
        } finally {
            try {
                if (ps != null) {

                    ps.close();
                }
            } catch (SQLException ex) {
                
                System.err.println(ex.getMessage());
            }
        }
    }

}

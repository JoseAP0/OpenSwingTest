package br.com.projeto.open.swing.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ConnectionPostgres {
    
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5433/Openswing_test";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
    
    public static Connection createConnection() throws Exception{
        //Carrega o driver do jdbc na JVM
        Class.forName("org.postgresql.Driver");
        //Cria a conex�o com o Postgres
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        
        return connection;
    }
    
    public static void main(String[] args) throws Exception {
        Connection con = createConnection();
        if(con!=null){
            System.out.println("Conexão realizada com sucesso");
            con.close();
        }
    }
    private static Connection conexao;

    public static Connection getConexao() {

        try {
            if (conexao == null || conexao.isClosed()) {

                conecta();
            }
        } catch (SQLException ex) {

            Logger.getLogger(ConnectionPostgres.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexao;
    }

    protected static void conecta() {

        try {

            String url = "jdbc:postgresql://localhost:5432/teste";
            conexao = (Connection) DriverManager.getConnection(url, "postgres", "postgres");
        } catch (SQLException ex) {

            Logger.getLogger(ConnectionPostgres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void desconecta() {

        try {
            if (conexao != null) {

                conexao.close();
            }
        } catch (SQLException ex) {

            Logger.getLogger(ConnectionPostgres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
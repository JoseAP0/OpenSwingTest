package br.com.projeto.open.swing.model;

import java.sql.Connection;
import java.sql.DriverManager;

class ConnectionPostgres {
    
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5433/Projeto_CRUD";
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
            System.out.println("Conex�o realizada com sucesso");
            con.close();
        }
    }   
}
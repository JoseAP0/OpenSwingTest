package br.com.projeto.open.swing.model;

import br.com.projeto.open.swing.VO.FuncionarioVO;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class DAO {
 
    public void save (FuncionarioVO usuario){
        //cria a query para inserir
        String query = "INSERT INTO tab_alunos (user_name, gender, phone, address, cpf) VALUES (?,?,?,?,?)";
        
        //cria a connection e o prepared statement
        Connection con = null;
        PreparedStatement pstm = null;
        try{
            //Cria a conexão com o banco
            con = ConnectionPostgres.createConnection();
            //Cria a preparedStatement enviando a query
            pstm = con.prepareStatement(query);
            //Adiciona os valores �s posi��es do array da query
            pstm.setString(1, usuario.getUserName());
            pstm.setString(2, usuario.getGender());
            pstm.setString(3, usuario.getPhone());
            pstm.setString(4, usuario.getAddress());
            pstm.setString(5, usuario.getCpf());
            //executa a query no banco
            
            pstm.execute();
            System.out.println("Salvo com Sucesso");
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                //compara se o prepared statement e connection est�o abertos e fecha
                if(pstm!=null){
                    pstm.close();
                }
                if(con!=null){
                    con.close();
                }  
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    } 
    
    public List<usuario> read (){
        //cria a query para inser��o
        String query = "SELECT * FROM tab_alunos";
        //Cria a list para armazenar os dados
        List <usuario> usuarios = new ArrayList<>();
        
        //cria a connection e o prepared statement
        Connection con = null;
        PreparedStatement pstm = null;
        //Cria o objeto que vai recuperar os dados no banco
        ResultSet rs = null;
                        
        try{
            //Cria a conex�o com o banco
            con = ConnectionPostgres.createConnection();
            //Cria a preparedStatement enviando a query
            pstm = con.prepareStatement(query);
            //Recupera os dados
            rs = pstm.executeQuery();
            
            while (rs.next()){
                
                usuario user = new usuario();
                
                user.setUserName(rs.getString("user_name"));
                user.setAddress(rs.getString("address"));
                user.setCpf(rs.getString("cpf"));
                user.setPhone(rs.getString("phone"));
                user.setGender(rs.getString("gender"));
                
                usuario.add(user);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                //compara se o prepared statement, o rs e a connection estão abertos e fecha
                if(pstm!=null){
                    pstm.close();
                }
                if(con!=null){
                    con.close();
                }
                if(rs!=null){
                    rs.close();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return usuario;
    }
    
    public void update (usuario user){
        //cria a query
        String query = "UPDATE tab_alunos SET user_name= ?, gender= ?, phone= ?, address= ?" + "WHERE cpf=?";
        //cria a connection e o prepared statement
        Connection con = null;
        PreparedStatement pstm = null;
        try{
            //Cria a conexao com o banco
            con = ConnectionPostgres.createConnection();
            //Cria a preparedStatement enviando a query
            pstm = con.prepareStatement(query);
            //Adiciona os valores às posições do array da query
            pstm.setString(1, user.getUserName());
            pstm.setString(2, user.getGender());
            pstm.setString(3, user.getPhone());
            pstm.setString(4, user.getAddress());
            pstm.setString(5, user.getCpf());
            //executa a query no banco
            
            pstm.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                //compara se o prepared statement e connection est�o abertos e fecha
                if(pstm!=null){
                    pstm.close();
                }
                if(con!=null){
                    con.close();
                }  
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    public void delete (String cpf){
        //cria a query
        String query = "DELETE FROM tab_alunos WHERE cpf= ?";
        //cria a connection e o prepared statement
        Connection con = null;
        PreparedStatement pstm = null;
        try{
            //Cria a conexao com o banco
            con = ConnectionPostgres.createConnection();
            //Cria a preparedStatement enviando a query
            pstm = con.prepareStatement(query);
            //Adiciona os valores às posições do array da query
           pstm.setString(1, cpf);
            //executa a query no banco
            
            pstm.execute();
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                //compara se o prepared statement e connection est�o abertos e fecha
                if(pstm!=null){
                    pstm.close();
                }
                if(con!=null){
                    con.close();
                }  
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
}


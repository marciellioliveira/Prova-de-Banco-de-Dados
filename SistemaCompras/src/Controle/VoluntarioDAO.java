package Controle;

//AlunoDAO faz o MOR - Mapeamento objeto relacional ORM

import Modelo.Voluntario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VoluntarioDAO
{

    Connection connection = null;

 /*  public Voluntario getEmail(String px) {
        System.out.println("pesquisa Voluntário");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para consultar");
        Statement stmt = null;
        try {
            String sql = "SELECT * FROM PECA WHERE px = " + px + ";";
            System.out.println("SQL: " + sql);
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
         
            // Tratando os dados retornados..
            if (rs.next()) {
                Voluntario voluntario = new Voluntario(rs.getString("px"));
                //Projeto projeto = new Projeto(rs.getString("email"));
               return voluntario;
            }
            else
            {
               return null;
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } */
    
    public boolean inserirVoluntario(Voluntario voluntario) {
        System.out.println("inserirVoluntário");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para inserir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO peca (px,p_nome,p_cor,p_preco) VALUES ('"+voluntario.getPX()+"','"+voluntario.getP_Nome()+"','"+voluntario.getP_Cor()+"','"+voluntario.getP_Preco()+"');";
            
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // Incluindo alunos na listaAlunos que vai ser retornada
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } // fim do metodo InserirAluno

    public boolean atualizarVoluntario(Voluntario voluntario) {
        System.out.println("atualizarVoluntario");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para atualizar");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "UPDATE peca SET px = '" + voluntario.getPX() + "',p_nome = '"+voluntario.getP_Nome()+"',p_cor = '"+voluntario.getP_Cor()+"',p_preco='"+voluntario.getP_Preco()+"' WHERE px = '" + voluntario.getPX() + "';";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // Incluindo alunos na listaAlunos que vai ser retornada
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } 
    
    public Voluntario getUsuarioCompleto(String email) 
    {
        System.out.println("ValidarUsuario");
         // inicia a conexao com o Banco de dados chamando
        // a classe Conexao

        
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para validar");
        Statement stmt = null;

        try 
        {
            stmt = connection.createStatement();

            String sql = "SELECT px,p_nome,p_cor,p_preco FROM peca WHERE px = '" + email +"';";
            System.out.println("SQL: " + sql);

            ResultSet rs = stmt.executeQuery(sql);

           // Tratando os dados retornados..
            if (rs.next()) {
                Voluntario voluntario = new Voluntario(rs.getString("px"),rs.getString("p_nome"),rs.getString("p_cor"),rs.getString("p_preco"));
                //System.out.print(rs.getString("telefone"));
               return voluntario;
            }
           
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return null;
        } 
        finally 
        {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try 
            {
                stmt.close();
                connection.close();                
            } 
            catch (SQLException e) 
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }                
        return null;
    }
    
     /*public boolean validarUsuario(Voluntario voluntario) 
{
    System.out.println("ValidarUsuario");
     // inicia a conexao com o Banco de dados chamando
    // a classe Conexao

    if (voluntario == null)
    {
        return false;
    }        

    connection = Conexao.getInstance().getConnection();
    System.out.println("conectado e preparando para validar");
    Statement stmt = null;
    
    try 
    {
        stmt = connection.createStatement();
        
        String sql = "SELECT * FROM voluntario WHERE email = '" + voluntario.getEmail() + "' AND senha = '" + voluntario.getSenha() + "';";
        System.out.println("SQL: " + sql);
        
        ResultSet rs = stmt.executeQuery(sql);

        if (!rs.isBeforeFirst())
        {
            return false;
        }
                            
        // Incluindo usuarios na listaUsuarios que vai ser retornada
        return true;
    } 
    catch (SQLException e) 
    {
        System.out.println(e.getMessage());
        return false;
    } 
    finally 
    {
        // este bloco finally sempre executa na instrução try para
        // fechar a conexão a cada conexão aberta
        try 
        {
            stmt.close();
            connection.close();                
        } 
        catch (SQLException e) 
        {
            System.out.println("Erro ao desconectar" + e.getMessage());
        }
    }                
}*/

    public ArrayList<Voluntario> getListaVoluntario() {
        ArrayList<Voluntario> listaVoluntarios = new ArrayList<Voluntario>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando listagem");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM peca ORDER BY px");
            // Incluindo alunos na listaAlunos que vai ser retornada
            while (rs.next()) {
                Voluntario voluntarios = new Voluntario(rs.getString("px"),rs.getString("p_nome"),rs.getString("p_cor"),rs.getString("p_preco"));
                //System.out.println("Telefone: "+rs.getString("telefone"));
                listaVoluntarios.add(voluntarios);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
          
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return listaVoluntarios;
    } // final do metodo

    // deleta aluno
    public boolean excluirVoluntario(Voluntario voluntario) {
        System.out.println("excluirVoluntario");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado. Preparando para excluir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "DELETE FROM peca WHERE px = '" + voluntario.getPX() + "';";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // Incluindo alunos na listaAlunos que vai ser retornada
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
}
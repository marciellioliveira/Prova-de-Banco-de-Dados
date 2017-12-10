package Controle;

//AlunoDAO faz o MOR - Mapeamento objeto relacional ORM

import Modelo.Projeto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProjetoDAO
{

    Connection connection = null;

    public Projeto getEmail(String em) {
        System.out.println("pesquisa Aluno");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para consultar");
        Statement stmt = null;
        try {
            String sql = "SELECT * FROM PROJETO WHERE email = " + em + ";";
            System.out.println("SQL: " + sql);
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
         
            // Tratando os dados retornados..
            if (rs.next()) {
                Projeto projeto = new Projeto(rs.getString("email"));
               return projeto;
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
    } 
    
    public boolean inserirProjeto(Projeto projeto) {
        System.out.println("inserirProjeto");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para inserir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO projeto (cnpj,local,fundador,email,senha) VALUES (" + projeto.getCNPJ() + ",'" + projeto.getLocal() + ",'"+projeto.getFundador()+",'"+projeto.getEmail()+",'"+projeto.getSenha()+"');";
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

    public boolean atualizarProjeto(Projeto projeto) {
        System.out.println("atualizarProjeto");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para atualizar");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "UPDATE projeto SET cnpj = '" + projeto.getCNPJ() + "',local = '"+projeto.getLocal()+"',fundador = '"+projeto.getFundador()+"',email='"+projeto.getEmail()+"', senha='"+projeto.getSenha()+"' WHERE email = " + projeto.getEmail() + ";";
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

    public ArrayList<Projeto> getListaProjetos() {
        ArrayList<Projeto> listaProjetos = new ArrayList<Projeto>();
      
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando listagem");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM projeto ORDER BY id_projeto");
            // Incluindo alunos na listaAlunos que vai ser retornada
            while (rs.next()) {
                Projeto projeto = new Projeto(rs.getString("email"), rs.getString("cnpj"), rs.getString("local"),rs.getString("fundador"));
                listaProjetos.add(projeto);
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
        return listaProjetos;
    } // final do metodo

    // deleta aluno
    public boolean excluirProjeto(Projeto projeto) {
        System.out.println("excluirProjeto");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado. Preparando para excluir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "DELETE FROM projeto WHERE email = " + projeto.getEmail() + ";";
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
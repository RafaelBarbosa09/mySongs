package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDb{

    public static Connection conectar(){

        Connection retorno = null;

        try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/engsoft2020?useTimezone=true&serverTimezone=UTC";
        String usuario = "root";
        String senha = "root";

        retorno = DriverManager.getConnection(url, usuario, senha);

        } catch (ClassNotFoundException e) {
            System.out.println("ERRO: Driver não encontrado");
        } catch (SQLException e) {
            System.out.println("ERRO: Não foi possível conectar");
        }

        return retorno;
    }
}

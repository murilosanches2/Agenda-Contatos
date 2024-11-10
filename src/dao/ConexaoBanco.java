package dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class ConexaoBanco {
    private static final String driverClass = "com.mysql.jdbc.Driver";
    private static final String url = "";
    
    public static Connection abreConexao() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fazenda", "root", "");
            JOptionPane.showMessageDialog(null, "Conectado com sucesso.");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar: "+erro);
        }
        
        
        return con;
    }
}

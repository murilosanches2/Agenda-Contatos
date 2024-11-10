package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.TipoContatoModelo;

public class TipoContatoDao implements InterfaceDao{

    String sql;
    PreparedStatement stm;
    
    @Override
    public void salvarDao(Object... valor) {
        TipoContatoModelo tcm = (TipoContatoModelo) valor[0];
        if (tcm.getId()== 0){
            sql = "INSERT INTO tipo_contato (descricao) VALUES (?)";
        } else{
            sql = "UPDATE tipo_contato SET descricao=? WHERE id_tipo_contato=?";
        }
        
        try {
            stm = ConexaoBanco.abreConexao().prepareStatement(sql);
            stm.setString(1,tcm.getDescricao());
            stm.setInt(2,tcm.getId());
            if (tcm.getId()>0) stm.setInt(2,tcm.getId());
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Registro Gravado");
            
        } catch (Exception erro) {
            
        }
        
        
        
    }

    @Override
    public void excluirDao(int id) {
   
    }

    @Override
    public void consultarDao(Object... valor) throws SQLException {
   
    }

    public void carregarDao(JComboBox itens) throws SQLException {
    
    }

    @Override
    public void carregarComboBoxDao(JComboBox itens) throws SQLException {
        
    }
    
}
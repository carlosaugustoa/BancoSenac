package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conta;
import model.Cliente;

public class ContaDao {
    
    private final DataBase db;
    private PreparedStatement ps;
    private ResultSet rs;
    private String sql;
    
    public ContaDao(){
        db = new DataBase();
    }
    
    public boolean inserir(Conta conta){
        if (db.connect()){
            sql = "INSERT INTO tb_contas(cnt_cli_id, cnt_saldo) VALUES (?,?)";
            try {
                ps = db.conexao.prepareStatement(sql);
                ps.setInt(1, conta.getCliente().getId());
                ps.setFloat(2, conta.getSaldo());
                if (ps.executeUpdate() == 1){
                    ps.close();
                    db.disconnect();
                    return true;
                }
                ps.close();
                db.disconnect();
            } catch (SQLException error){
                return false;
            }
        }
        return false;
  
    }   
    
public boolean excluir(Conta conta){
        if (db.connect()){
            sql = "DELETE FROM tb_contas WHERE cnt_id = ?)";
            try {
                ps = db.conexao.prepareStatement(sql);
                ps.setInt(1, conta.getId());
                if (ps.executeUpdate() == 1){
                    ps.close();
                    db.disconnect();
                    return true;
                }
                ps.close();
                db.disconnect();
            } catch (SQLException error){
                return false;
            }
        }
        return false;
}

//public boolean editar(Conta conta){
//       if (db.connect()){
//            sql = "UPADATE tb_contas SET cnt_cliente = ?, cnt_saldo = ?,"
//                    + "cli_sex_id = ? WHERE cli_id = ?)";
//            try {
//                ps = db.conexao.prepareStatement(sql);
//                ps.setString(1, conta.getCliente());
//                ps.setString(2, conta.getCpf());
//                ps.setInt(3, cliente.getSexo().getId());
//                ps.setInt(4, cliente.getId());
//                if (ps.executeUpdate() == 1){
//                    ps.close();
//                    db.disconnect();
//                    return true;
//                }
//                ps.close();
//                db.disconnect();
//            } catch (SQLException error){
//                return false;
//            }
//        }
//        return false; 
//    
//}

//public List<Cliente> buscarTudo(){
//         if (db.connect()){
//            List<Cliente> clientes = new ArrayList();
//            sql = "SELECT * FROM tb_clientes JOIN tb_sexos ON sex_id"
//                    + "= cli_sex_id)";
//            try {
//                ps = db.conexao.prepareStatement(sql);
//                ps.executeQuery();
//                while(rs.next()){
//                    Cliente cliente = new Cliente();
//                    model.Sexo sexo = new model.Sexo();
//                    cliente.setId(rs.getInt("cli_id"));
//                    cliente.setNome(rs.getString("cli_nome"));
//                    cliente.setCpf(rs.getString("cli_cpf"));
//                    sexo.setId(rs.getInt("sex_id"));
//                    sexo.setSexo(rs.getString("sex_sexo"));
//                    sexo.setSigla(rs.getString("sex_sigla").charAt(0));
//                    cliente.setSexo(sexo);
//                    clientes.add(cliente);
//                }
//                rs.close();
//                ps.close();
//                db.disconnect();
//                return clientes;
//            } catch (SQLException error){
//                return null;
//            }
//        }
//        return null; 
//    
//}

//public Cliente buscarPorCpf(String cpf){
//    
//        if (db.connect()){
//            
//            sql = "SELECT * FROM tb_clientes WHERE cli_cpf = ?";
//            try {
//                ps = db.conexao.prepareStatement(sql);
//                ps.setString(1,cpf);
//                rs = ps.executeQuery();
//                if (rs.next()){
//                    Cliente cliente = new Cliente();
//                    SexoDao dao = new SexoDao();
//                    cliente.setId(rs.getInt("cli_id"));
//                    cliente.setNome(rs.getString("cli_nome"));
//                    cliente.setCpf(rs.getString("cli_cpf"));
//                    cliente.setSexo(dao.buscarPorId(rs.getInt("cli_sex_id")));
//                    rs.close();
//                    ps.close();
//                    db.disconnect();
//                    return cliente;
//                }
//                rs.close();
//                ps.close();
//                db.disconnect();              
//            } catch (SQLException error){
//                return null;
//            }
//        }
//        return null; 
//}
//
//public Cliente buscarPorId(int id){
//    
//        if (db.connect()){
//            
//            sql = "SELECT * FROM tb_clientes WHERE cli_id = ?";
//            try {
//                ps = db.conexao.prepareStatement(sql);
//                ps.setInt(1,id);
//                rs = ps.executeQuery();
//                if (rs.next()){
//                    Cliente cliente = new Cliente();
//                    SexoDao dao = new SexoDao();
//                    cliente.setId(rs.getInt("cli_id"));
//                    cliente.setNome(rs.getString("cli_nome"));
//                    cliente.setCpf(rs.getString("cli_cpf"));
//                    cliente.setSexo(dao.buscarPorId(rs.getInt("cli_sex_id")));
//                    rs.close();
//                    ps.close();
//                    db.disconnect();
//                    return cliente;
//                }
//                rs.close();
//                ps.close();
//                db.disconnect();              
//            } catch (SQLException error){
//                return null;
//            }
//        }
//        return null; 
//}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

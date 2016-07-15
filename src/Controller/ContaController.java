package Controller;

import dao.ClienteDao;
import dao.ContaDao;
import model.Conta;
import model.Cliente;

public class ContaController {

    public boolean cadastrar(String cliente, Float saldo){
        ClienteDao cdao = new ClienteDao();
        if (cdao.buscarPorId(cliente) != null){
            Cliente c = cdao.buscarPorId(cliente);
            Conta conta = new model.Conta(c, saldo);
            ContaDao cntdao = new ContaDao();
            if (cntdao.inserir(conta)){
                return true;
            }
        }
        return false;
        }
    
//    public void listar(){
//        ContaDao cdao = new ContaDao();
//        for (model.Conta c: cdao.buscarTudo()){
//            System.out.println(c.toString());      
//            System.out.println("Id. " + c.getId() + "\tCPF: " + c.getCpf() +
//                "\tNome: " + c.getNome() + "\tSexo: " + c.getSexo().getSigla());
//        }
//    }
    
    //public boolean excluir(int id){
    //    Cliente cliente = new Cliente(id);
    //    ClienteDao cdao = new ClienteDao();
    //        if (cdao.excluir(cliente)){
    //            return true;
    //        }
    //    return false;
    //    }
}
   
    
    
    
    
    
    
    


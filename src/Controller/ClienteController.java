package Controller;

import dao.ClienteDao;
import dao.SexoDao;
import model.Cliente;
import model.Sexo;

public class ClienteController {

    public boolean cadastrar(String nome, String cpf, String sexo){
        SexoDao sdao = new SexoDao();
        if (sdao.buscarPorSexo(sexo) != null){
            Sexo s = sdao.buscarPorSexo(sexo);
            Cliente cliente = new Cliente(nome, s, cpf);
            ClienteDao cdao = new ClienteDao();
            if (cdao.inserir(cliente)){
                return true;
            }
        }
        return false;
        }
}

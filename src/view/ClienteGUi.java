package view;

import Controller.ClienteController;
import dao.ClienteDao;
import dao.SexoDao;
import java.util.Scanner;

public class ClienteGUi{
    
    Scanner sc = new Scanner(System.in);
    
    public ClienteGUi(){}
    
    public void cadastrar(){
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("CPF: ");
        String cpf = sc.next();
        System.out.print("Sexo: ");
        String sexo = sc.next();
    
        ClienteController cc = new ClienteController();
        if (cc.cadastrar(nome, cpf, sexo)){
            System.out.println("SUCESSO");
        } else {
            System.out.println("FALHA");
        }
    }
    
//    public void excluir(){
//        System.out.print("Cliente Id:  ");
//        int id = sc.nextInt();
//        
//        ClienteController cc = new ClienteController();
//        if (cc.excluir(id)){
//            System.out.println("SUCESSO");
//        } else {
//            System.out.println("FALHA");
//        }  
//    }
   
    public void listar(){
        ClienteController cc = new ClienteController();
        cc.listar();
    }
        
    public static void main(String[] args){
        ClienteGUi gui = new ClienteGUi();
        gui.cadastrar();
    }
    
    
    
    
}

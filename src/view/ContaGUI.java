package view;

import Controller.ClienteController;
import Controller.ContaController;
import java.util.Scanner;

public class ContaGUI {

    Scanner sc = new Scanner(System.in);
    
    public ContaGUI(){}
    
    public void cadastrar(){
        System.out.print("Cliente id: ");
        String cliente = sc.nextInt();
        System.out.print("Saldo: ");
        String saldo = sc.next();
    
        ContaController cc = new ContaController();
        if (cc.cadastrar(cliente, saldo)){
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
   
//    public static void listar(){
//        ClienteController cc = new ClienteController();
//        cc.listar();
//    }
        
  public static void main(String[] args){}
    
    
    
    
    
    
}

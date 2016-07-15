package view;

import Controller.ClienteController;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args){
       
    Scanner sc = new Scanner(System.in);   
        
        int opcdo = -1;
        int opcsw = -1;
       
        do {
            System.out.print(
              "=========== OPCÕES ============"
            + "\n01-Incluir Cliente           "
            + "\n02-Alterar Cliente           "
            + "\n03-Excluir Cliente           "
            + "\n04-Listar Todos Clientes     "
            + "\n05-Listar Cliente Por CPF    "
            + "\n06-Abrir Conta               "
            + "\n07-Fechar Conta              "
            + "\n08-Transferencia entre contas"
            + "\n09-Sacar em Conta            "
            + "\n10-Deposito em Conta         "  
            + "\n0-SAIR                       "
            + "\n============================="
            + "\n\nOpção: ");
            
            opcdo = sc.nextInt();
            
            switch(opcsw){
                case 1:
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    ClienteGUi.listar();
                    break;
            }
        } while(opcdo != 0);
    
    }
    
}

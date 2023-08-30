package contador;

import contador.exceptions.ParametrosInvalidosException;
import java.util.Scanner;

/**
 *
 * @author Ueno
 */
public class Contador {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro parâmentro: ");
        int paramentroUm = input.nextInt();
        
        System.out.print("Digite o segundo parâmentro: ");
        int paramentroDois = input.nextInt();
        
        try {
            contar(paramentroUm, paramentroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("Mensagem: " + e);
        }
    }

    private static void contar(int paramentroUm, int paramentroDois) throws ParametrosInvalidosException  {
        int contagem;
        
        if(paramentroUm > paramentroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }else{
            contagem = paramentroDois - paramentroUm;
            
            System.out.println("\nImprimindo números: \n");
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo número " + i);
            }
        }
    }
    
    
    
}

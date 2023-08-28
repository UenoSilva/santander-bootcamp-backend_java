package contabanco;

import java.util.Scanner;

/**
 *
 * @author Ueno
 */
public class ContaTerminal {

    public static void main(String[] args) {
        
        Conta cliente1 = new Conta(1021, "067-8", "Mario Andrade", 237.48);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da agência!");
        System.out.print("Usuário: ");
        int numeroUsuario = input.nextInt();
        
        if(numeroUsuario == cliente1.getNumero()){
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso "
                    + "banco, sua agência é %s, conta %d e o seu saldo R$ %.2f está "
                    + "disponível para o saque.%n",
                    cliente1.getNomeCliente(), cliente1.getAgencia(), 
                    cliente1.getNumero(), cliente1.getSaldo());
        }else{
            System.out.println("Erro! Número do usuário não consta no sistem. Tente novamente!");
        }
    }
    
}

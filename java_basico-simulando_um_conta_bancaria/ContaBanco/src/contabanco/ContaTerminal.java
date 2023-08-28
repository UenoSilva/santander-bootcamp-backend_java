package contabanco;

import java.util.Scanner;

/**
 *
 * @author Ueno
 */
public class ContaTerminal {

    public static void main(String[] args) {
        
        // criar um objeto conta, com as informações do cliente
        Conta cliente1 = new Conta(1021, "067-8", "Mario Andrade", 237.48);
        //
        Scanner input = new Scanner(System.in);
        
        // exibe a mensagem para o usuário
        System.out.println("Por favor, digite o número da agência!");
        System.out.print("Usuário: ");
        // obtem o número do usuario pela terminal com o scanner
        int numeroUsuario = input.nextInt();
        
        // verifica se o número de usuário informado pelo terminal 
        // é válido
        if(numeroUsuario == cliente1.getNumero()){
            // exibe para o usuário as informações da sua conta
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso "
                    + "banco, sua agência é %s, conta %d e o seu saldo R$ %.2f está "
                    + "disponível para o saque.%n",
                    cliente1.getNomeCliente(), cliente1.getAgencia(), 
                    cliente1.getNumero(), cliente1.getSaldo());
        }else{
            // exibe uma mensagem caso o número de usuário não exista
            System.out.println("Erro! Número do usuário não consta no sistem. Tente novamente!");
        }
    }
    
}

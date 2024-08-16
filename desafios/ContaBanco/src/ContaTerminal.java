import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner userin = new Scanner(System.in);

        System.out.println("digite o numero da agencia: ");
        
        int numero = userin.nextInt();
        
        System.out.println("digite a agencia: ");

        String agencia = userin.next();

        System.out.println("digite seu nome: ");

        String nomeCliente = userin.next();
        
        System.out.println("digite o saldo: ");

        float saldo = userin.nextFloat();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        
        //System.out.println("Hello, World!");
    }
}

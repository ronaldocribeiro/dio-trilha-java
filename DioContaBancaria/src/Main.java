import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        String agencia = null;
        String nomeCliente = null;
        float saldo = 0.0f;
        boolean auxVar = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        while (numero == 0){
            System.out.print("Por favor, digite o número da conta: ");
            try{
                numero = Integer.parseInt(scanner.next());
            }catch (Exception e){
            }
        }

        System.out.print("Por favor, informe o seu nome ");
        nomeCliente = scanner.next();

        while (!auxVar){
            System.out.print("Por favor, digite o saldo da conta: ");
            try{
                saldo = Float.parseFloat(scanner.next());
                auxVar = true;
            }catch (Exception e){
            }
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nossa banco. Sua agencia é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque." );
    }
}
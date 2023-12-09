import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    double saldoCC = 2500.00;
    int opcao = 0;
    double saldoAtualizado = saldoCC;
    double debito = 0;
    double credito = 0;
    Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {

        Main m = new Main();
        m.cabecalho();
        m.operacao();
        m.calculo();

    }

    public void cabecalho(){

        System.out.println("***********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome: Marcelo Viana");
        System.out.println("Tipo conta: Corrente");
        System.out.println("Saldo inicial: "+ saldoAtualizado);
        System.out.println("\n***********************************************");
    }
    public void operacao(){

        System.out.println("\nOperacões");
        System.out.println("\n1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

    }

    public void calculo(){
        while (opcao !=4 ){

            System.out.println("\nDigite a opcao desejada:");
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é: " + saldoAtualizado);
            }
            if (opcao == 3){
                System.out.println("Informe o valor a transferir: ");
                debito = leitura.nextDouble();
                if(debito > saldoAtualizado){
                    System.out.println("Saldo insuficiente!");
                }else {
                    saldoAtualizado = saldoAtualizado - debito;
                    System.out.println("Saldo atualizado R$ "+saldoAtualizado);
                }

            }

            if (opcao == 2){
                System.out.println("Informe o valor a receber: ");
                credito = leitura.nextDouble();
                saldoAtualizado = saldoAtualizado + credito;
                System.out.println("Saldo atualizado R$ "+saldoAtualizado);

            }

        }

    }

}
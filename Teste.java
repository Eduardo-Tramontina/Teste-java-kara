import java.util.Scanner;

public class Teste {
  
  public static void main(String[] args) {
    int x, y, divisao;
Scanner objLeitura = new Scanner(System.in);
System.out.print("digite qualquer valor: ");
x = objLeitura.nextInt();
System.out.print("digite outro valor: ");
y = objLeitura.nextInt();
objLeitura.close();
divisao = x / y;
System.out.print("O total do valor é: " + divisao);
    
  }
}

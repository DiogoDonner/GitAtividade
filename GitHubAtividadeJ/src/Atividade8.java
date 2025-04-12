//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade8 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int number = 123;

        int centena = number / 100;
        System.out.println("Centena: " + centena);
        int dezena = number % 100 / 10;
        System.out.println("Dezena " + dezena);
        int unidade = number % 100 % 10;
        System.out.println("Unidade: " + unidade);
        int soma = centena + dezena + unidade;
        System.out.println("A soma dos algarismos de " + number + " é: " + soma);


        
    }
}
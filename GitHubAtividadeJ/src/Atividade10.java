//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade10 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int fibonacciC = 10;
        int fibo = 0;
        for (int t = 0; t <= fibonacciC; t++) {
            fibo += (t - 3);
            System.out.println("O fatorial é: " + fibo);
        }


        
    }
}
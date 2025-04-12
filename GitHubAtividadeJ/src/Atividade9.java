//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade9 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int numberprime = 7;
        boolean ISPRIME = true;
        for (int i = 2; i <= numberprime - 1; i++) {
            if (numberprime % i == 0) {
                ISPRIME = false;

            }
        }
        if (ISPRIME) {
            System.out.println("Número " + numberprime + " é primo!");
        } else {
            System.out.println("Número " + numberprime + " não é primo!");
        }
        System.out.println();


        
    }
}
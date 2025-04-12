//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade4 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        int max = 10;
        System.out.println("Números Pares Até " + max + ":");
        for (int e = 0; e <= max; e++) {
            if (e % 2 != 0) {
                e++;
            }
            System.out.println(e);


        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade5 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int max = 10;
        System.out.println("Números Ímpares Até " + max + ":");
        for (int i = 0; i < max; i++) {
            if (i % 2 == 0) {
                i++;
            }

            System.out.println(i);
        }



    }
}
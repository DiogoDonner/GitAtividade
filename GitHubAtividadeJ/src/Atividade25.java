import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade25 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int numberaaaa = 10000;

        int contagem = 0;
        int temp = Math.abs(numberaaaa);

        do {
            contagem++;
            temp /= 10;
        } while (temp > 0);
        System.out.println(contagem+" casas ");
    }
}

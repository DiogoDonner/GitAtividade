import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade24 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<String> palindromo = new ArrayList<>();
        palindromo.add("A");
        palindromo.add("R");
        palindromo.add("A");
        palindromo.add("R");
        palindromo.add("A");
        ArrayList<String> palindromo2 = new ArrayList<>();
        palindromo2.addAll(palindromo);
        Collections.reverse(palindromo2);
        if (palindromo.equals(palindromo2)) {
            System.out.println("É um palindromo");
        } else {
            System.out.println("Não é palindromo");
        }
    }
}

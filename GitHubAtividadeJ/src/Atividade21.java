import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade21 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(-5);
        lista2.add(3);
        lista2.add(-2);
        lista2.add(5);
        lista2.add(6);
        lista2.add(11);
        lista2.add(8);
        Collections.sort(lista2);
        Collections.reverse(lista2);
        System.out.println("Ordem decrescente: " + lista2);

    }
}

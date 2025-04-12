import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade13 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(3);
        lista.add(2);
        lista.add(5);
        lista.add(6);
        lista.add(11);
        lista.add(8);

        int maxs = lista.get(0);
        for (Integer bigger : lista) {
            if (bigger > maxs) {
                maxs = bigger;
            }
        }
        System.out.println(maxs);


    }
}
import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade23 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(-5);
        lista2.add(3);
        lista2.add(-2);
        lista2.add(5);
        lista2.add(6);
        lista2.add(11);
        lista2.add(8);
        double desgraça = 0;
        for (Integer pares2 : lista2) {
            if (pares2 % 2 != 0) {
                even.add(pares2);
                desgraça += pares2;
            }
        }
        System.out.println("Pares são: " + even);
        double medium = desgraça / even.size();
        System.out.println("Média é: " + medium);

    }
}

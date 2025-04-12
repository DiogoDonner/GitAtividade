import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade19 {
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

        ArrayList<Integer> doubl = new ArrayList<Integer>();
        doubl.add(2);
        doubl.add(8);
        doubl.add(2);

        int current = 0;
        while (current < doubl.size()) {
            int j = 0;
            boolean removed = false;
            while (j < current) {
                if (doubl.get(current).equals(doubl.get(j))) {
                    doubl.remove(current);
                    removed = true;
                    break;
                } else j++;
            }
            if (!removed) current++;
        }
        System.out.println("");
        for (Integer str : doubl) {
            System.out.println(str + " ");
        }
        ArrayList<Integer> pares = new ArrayList<>(lista.size());
        int results = 0;
        for (Integer evennumber : lista) {
            if (evennumber % 2 == 0) {
                pares.add(evennumber);


            }
        }
    }
}
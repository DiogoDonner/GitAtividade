import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade16 {
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
        int buscado = 6;

        boolean Existe = false;
        for (Integer search : lista) {
            if (buscado == search) {
                Existe = true;

            }
        }
        if (Existe) {
            System.out.println("O número " + buscado + " existe no ArrayList!");
        } else {
            System.out.println("O número " + buscado + " não existe no ArrayList :(");
        }


    }
}
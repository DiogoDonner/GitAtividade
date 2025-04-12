import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade36 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> ordered = new ArrayList<>();
        ordered.add(1);
        ordered.add(9);
        ordered.add(3);
        boolean isOrdered = true;
//
        for (Integer orderedfor = 0; orderedfor < ordered.size() - 1; orderedfor++) {
            if ((ordered.get(orderedfor)) > ordered.get(orderedfor + 1)) {
                isOrdered = false;
                break;
            }
        }
        if (isOrdered) {
            System.out.println("Está ordenado");
        } else {
            System.out.println("Não está");
        }
    }
}

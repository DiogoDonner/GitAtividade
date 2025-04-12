import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade26 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> sle = new ArrayList<>();
        sle.add(9);
        ArrayList<Integer> sla = new ArrayList<>();
        sla.add(3);

        int multiele = sle.get(0) * sla.get(0);
        System.out.println(multiele);
    }
}

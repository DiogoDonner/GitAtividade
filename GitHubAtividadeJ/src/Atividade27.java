import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade27 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> inter1 = new ArrayList<>();
        inter1.add(8);
        inter1.add(2);
        inter1.add(9);
        ArrayList<Integer> inter2 = new ArrayList<>();
        inter2.add(6);
        inter2.add(1);
        inter2.add(8);
        ArrayList<Integer> interresult = new ArrayList<>();

        for (Integer inter = 0; inter <= 6; inter++) {
            if (inter < inter1.size()) {
                interresult.add(inter2.get(inter));
            }
            if (inter < inter2.size()) {
                interresult.add(inter1.get(inter));
            }
        }
    }
}

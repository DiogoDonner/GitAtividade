import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade29 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> notcommom1 = new ArrayList<>();
        notcommom1.add(1);
        notcommom1.add(9);
        notcommom1.add(5);
        ArrayList<Integer> notcommom2 = new ArrayList<>();
        notcommom2.add(1);
        notcommom2.add(8);
        notcommom2.add(7);
        ArrayList<Integer> notcommomresults = new ArrayList<>();
        for (Integer notcommom : notcommom1) {
            if (notcommom2.contains(notcommom)) {
                notcommom++;

            } else {
                notcommomresults.add(notcommom);
            }
        }
        System.out.println(notcommomresults);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade22 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Integer> dupli = new ArrayList<Integer>();
        dupli.add(2);
        dupli.add(8);
        dupli.add(2);

        HashSet<Integer> nodupli = new HashSet<>(dupli);
        System.out.println(nodupli);

    }
}

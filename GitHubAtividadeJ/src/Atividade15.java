import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Atividade15 {
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
        int soma = lista.get(0) + lista.get(1) + lista.get(2) + lista.get(3) + lista.get(4) + lista.get(5) + lista.get(6);
        Integer media = soma / lista.size();
        System.out.println(media);


    }
}
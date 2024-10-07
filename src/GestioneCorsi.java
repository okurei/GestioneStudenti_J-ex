import java.util.HashMap;
import java.util.HashSet;

public class GestioneCorsi {

    HashMap<String, HashSet<String>> studenteCorsiMap = new HashMap<>();

    public void iscriviCorso(String matricola, String corso){
        if (!studenteCorsiMap.containsKey(matricola)){
            studenteCorsiMap.put(matricola, new HashSet<>());
        }
        studenteCorsiMap.get(matricola).add(corso);

    }
    public void visualizzaCorsi(String matricola){
        System.out.println(studenteCorsiMap.get(matricola).toString());
    }
    public void rimuoviCorso(String matricola, String corso){
        studenteCorsiMap.get(matricola).remove(corso);
    }
}
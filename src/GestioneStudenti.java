import java.util.ArrayList;

public class GestioneStudenti {
    ArrayList<Studente> corpoStudenti;

    public void addStudente(Studente studente){
        corpoStudenti.add(studente);
    }
    private int indexNumber(String matricola){
        
    }
    public void removeStudente (String matricola){
        corpoStudenti.removeIf(studente -> studente.getMatricola().equals(matricola));
    }
    public Studente returnStudente(String matricola){}
}

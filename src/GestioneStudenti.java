import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GestioneStudenti {
    Scanner scan = new Scanner(System.in);
    ArrayList<Studente> corpoStudenti = new ArrayList<>();

    public void addStudente(){// deciso di mettere il nuovo studente qui cosi. da decidere come strutturare poi il resto
        System.out.print("Nome: ");
        String nome = scan.next();
        System.out.print("Cognome: ");
        String cognome = scan.next();
        Studente studente = new Studente(nome, cognome);
        System.out.println(studente);
        corpoStudenti.add(studente);
    }
    public void removeStudente (){
        System.out.print("Inserisci il numero matricola dello studente da rimuovere: ");
        String matricola = scan.next();
        corpoStudenti.removeIf(studente -> studente.getMatricola().equals(matricola));
    }

    public void findStudente(){
        int index = findIndexStudente(findStudenteDaMatricola());
        if (index == -1){
            System.out.println("Il numero matricola inserito non è correto");
        }else {
            System.out.println(corpoStudenti.get(index));
        }
    }
    public String findStudenteDaMatricola(){
        System.out.print("Inserisci il numero di matricola dello studente da trovare: ");
        return scan.next();
    }
    public int findIndexStudente(String matricola){
        return IntStream.range(0, corpoStudenti.size())
                .filter(i -> corpoStudenti.get(i).getMatricola().equals(matricola))
                .findFirst()
                .orElse(-1);
    }

    public void stampaCorpoStudenti(){
        System.out.println(corpoStudenti.toString());
    }
}
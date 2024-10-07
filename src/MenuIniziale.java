import java.util.Scanner;

public class MenuIniziale {

    Scanner scan = new Scanner(System.in);
    GestioneStudenti gestioneStudenti = new GestioneStudenti();
    GestioneCorsi gestioneCorsi = new GestioneCorsi();

    public void menuIniziale(){
        System.out.println("Seleziona 1 per gestire gli studenti iscritti\nSeleziona 2 per gestire i corsi\nSeleziona 3 per chiudere l`applicazione");
            String selezione = scan.next();

            switch (selezione) {
                case "1" -> menuGestioneStudenti();
                case "2" -> menuGestioneCorsi();
                case "3" -> System.exit(0);
                default -> selezioneInvalida(3);
            }
        }
    private void menuGestioneStudenti(){
        System.out.println("Seleziona 1 per aggiungere uno studente\nSeleziona 2 per rimuovere uno studente\nSeleziona 3 per trovare uno studente\nSeleziona 4 per stampare tutti gli studenti\nSeleziona 5 per tornare al menu precedente");
        String selezione = scan.next();
        switch (selezione){
            case "1" -> gestioneStudenti.addStudente();
            case "2" -> gestioneStudenti.removeStudente();
            case "3" -> gestioneStudenti.findStudente();
            case "4" -> gestioneStudenti.stampaCorpoStudenti();
            case "5" -> menuIniziale();
            default -> selezioneInvalida(2);
        }
        menuIniziale();
    }

    private void menuGestioneCorsi(){
        System.out.println("Seleziona 1 per iscrivere uno studente ad un corso\nSeleziona 2 per rimuovere un corso\nSeleziona 3 per stampare tutti i corsi di uno studente \nSeleziona 4 per tornare al menu precedente");
        String selezione = scan.next();
        switch (selezione) {
            case "1" -> gestioneCorsi.iscriviCorso(matricola(), corso());
            case "2" -> gestioneCorsi.rimuoviCorso(matricola(), corso());
            case "3" -> gestioneCorsi.visualizzaCorsi(matricola());
            case "4" -> menuIniziale();
            default -> selezioneInvalida(1);
        }
        menuIniziale();
    }
    private void selezioneInvalida(int i){
        System.out.println("Selezione invalida");
        if (i == 1) {
            menuGestioneCorsi();
        } else if (i == 2) {
            menuGestioneStudenti();
        } else if (i == 3) {
            menuIniziale();
        }
    }

    private String matricola(){
        System.out.println("Inserici il numero di matricola");
        return scan.next();
    }
    private String corso(){
        System.out.println("Insericsi il nome del corso");
        return scan.next();
    }
}

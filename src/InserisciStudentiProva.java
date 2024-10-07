public class InserisciStudentiProva {
    MenuIniziale menuIniziale = new MenuIniziale();
    public void iniziaStudenti(){
        menuIniziale.gestioneStudenti.addStudentiInizio("Paolo", "Rossi");
        menuIniziale.gestioneStudenti.addStudentiInizio("Maria", "Verdi");
        menuIniziale.gestioneStudenti.addStudentiInizio("Enzo", "Gialli");
        menuIniziale.gestioneStudenti.addStudentiInizio("Giovanna", "Rossi");
        menuIniziale.gestioneStudenti.addStudentiInizio("Paolo", "Verdi");

        menuIniziale.gestioneCorsi.iscriviCorso("1001", "Biologia");
        menuIniziale.gestioneCorsi.iscriviCorso("1003", "Geologia");
    }

    public void run(){
        menuIniziale.menuIniziale();
    }
}

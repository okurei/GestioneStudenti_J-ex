import java.util.Objects;

public class Studente {
    private final String nome;
    private final String cognome;
    private final String matricola;
    private static int numeroStudenti = 1;

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = String.valueOf(1000 + numeroStudenti);
        numeroStudenti++;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", matricola='" + matricola + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Studente studente = (Studente) o;
        return Objects.equals(matricola, studente.matricola);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricola);
    }
}

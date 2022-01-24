package it.fi.itismeucci;
import java.util.ArrayList;

public class Root {
    private String annoDiInizio;
    private Aula aula;
    private String classe;
    private int numeroFinestre;
    private String specializzazione;
    private ArrayList<Studente> studenti;

    public String getAnnoDiInizio() {
        return annoDiInizio;
    }

    public Aula getAula() {
        return aula;
    }

    public String getClasse() {
        return classe;
    }

    public int getNumeroFinestre() {
        return numeroFinestre;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setAnnoDiInizio(String annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }
}

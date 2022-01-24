package it.fi.itismeucci;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{

    static final File ROOT = new File("./src/main/resources");

    static File file;
    static Scanner scanner;

    public static void main( String[] args )
    {
        
        //creo file che conterrà il file xml da leggere e deserializzare
        //creo scanner che leggerà il file xml da deserializzare
        file = new File(ROOT, "classe.xml");
        try {
            scanner = new Scanner(file);

        } catch (FileNotFoundException e){
            System.out.println("Errore: File non trovato");
            e.printStackTrace();
        }

        // dopo il while in testo sarà salvata una stringa con un'unica riga che conterrà tutto il file xml
        String testo = "";
        while(scanner.hasNextLine()){
            testo += scanner.nextLine().trim();
        }   
        
        XmlMapper mapper = new XmlMapper();
        Root classe = null;

        //con mapper.readValue salverò nel nuovo oggetto classe tutti i valori del file xml
        try {
            classe = mapper.readValue(testo, Root.class);
        } catch (JsonProcessingException e) {
            System.out.println("Errore nella lettura del xmlmapper");
            e.printStackTrace();
        }

        //Stampo i dati salvati
        System.out.println("Anno di inizio: " + classe.getAnnoDiInizio());
        System.out.println("Aula:");
        System.out.println("    -Nome: " + classe.getAula().getNome());
        System.out.println("    -Numero banchi: " + classe.getAula().getNumeroDiBanchi());
        System.out.println("Classe: " + classe.getClasse());
        System.out.println("Numero Finestre: " + classe.getNumeroFinestre());
        System.out.println("Specializzazione: " + classe.getSpecializzazione() + "\nStudenti:");
        for (Studente s : classe.getStudenti()) {
            System.out.println("    [Anno di nascita]: " + s.getAnnoDiNascita());
            System.out.println("    [Nome]: " + s.getNome());
            System.out.println("    [Cognome]: " + s.getCognome() + "\n");
        }
    }
}

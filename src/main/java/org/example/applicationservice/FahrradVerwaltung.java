package org.example.applicationservice;

import io.jexxa.addend.applicationcore.ApplicationService;
import org.example.domain.*;

import java.util.List;

@ApplicationService
public class FahrradVerwaltung {
    private final FahrradRepository fahrradVerwaltungsListe ;

    public  FahrradVerwaltung(FahrradRepository fahrradRepository){
        this.fahrradVerwaltungsListe = fahrradRepository;
    }
    public void add(GestellNummer gestellNummer, FahrradDaten fahrradDaten){
        fahrradVerwaltungsListe.add(new Fahrrad(gestellNummer, fahrradDaten));
    }
    public void delete(GestellNummer gestellNummer){
        fahrradVerwaltungsListe.remove(gestellNummer);
    }
    public List<GestellNummer> get(){
        return fahrradVerwaltungsListe.getAll()
                .stream()
                .map(Fahrrad::getGestellnummer)
                .toList();
    }
    public void registriere(GestellNummer gestellNummer, FahrradDaten fahrradDaten, EmailAdresse emailAdresse){

    }
    public void verifiziere(EmailAdresse emailAdresse, VerifizierungsCode verifizierungsCode){

    }
}

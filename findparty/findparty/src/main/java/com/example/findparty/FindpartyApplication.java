package com.example.findparty;

import com.example.findparty.model.Event;
import com.example.findparty.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindpartyApplication implements CommandLineRunner {

    @Autowired
    private EventRepository eventRepository;

    public static void main(String[] args) {
        SpringApplication.run(FindpartyApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Adaugă câteva evenimente mock în baza de date la pornirea aplicației

        // Eveniment cu tipul "party la bloc"
        Event event1 = new Event();
        event1.setName("Petrecere la bloc");
        event1.setLocation("Blocul A, etajul 5");
        event1.setDressCode("Casual");
        event1.setPartyType("party la bloc");
        eventRepository.save(event1);

        // Eveniment cu tipul "party festival"
        Event event2 = new Event();
        event2.setName("Festival de muzică");
        event2.setLocation("Parcul Central");
        event2.setDressCode("Cool & Hippie");
        event2.setPartyType("party festival");
        eventRepository.save(event2);

        // Adaugă și alte evenimente mock aici...
    }
}

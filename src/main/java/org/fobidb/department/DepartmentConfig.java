package org.fobidb.department;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

// Data Access LAYER *******************************************************


@Configuration // Diese Klasse wird als Konfigurationsklasse für Spring markiert. Sie enthält Beans, die von Spring verwaltet werden sollen.
public class DepartmentConfig {

    @Bean // Diese Annotation sagt Spring, dass die Methode commandLineRunner ein Bean ist, welches beim Start der Anwendung ausgeführt werden soll.
    CommandLineRunner commandLineRunner_dep(DepartmentRepository repository) { //CommandLineRunnder: Funktionales Interface von Spring Boot. Es erlaubt die Ausführung von Code nach dem Start der Anwendung. Hier wird der übergebene Code also ausgeführt, sobald die Anwendung vollständig gestartet ist.
        return args -> { // Lambda-Ausdruck = kompakte Art, das Interface zu implementieren.
            // Prüfen, ob die Datenbank bereits Einträge enthält
            if (repository.count() == 0) {
                Department Tk = new Department(
                        "Technik"

                );
                Department Km = new Department(
                        "Kaufmännisches"
                );
                repository.saveAll(
                        List.of(Tk, Km) // temporäre unveränderliche Liste, um die Objekte in der Datenbank zu speichern.
                );
            };
        };
    }
}
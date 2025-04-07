package org.fobidb.department;

import jakarta.persistence.*;

@Entity
@Table
public class Department {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    public int id;
    public String bezeichnung;

    public Department() {
    }

    public Department(int id, String bezeichnung) {
        this.id = id;
        this.bezeichnung = bezeichnung;
    }

    public Department(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", Bezeichnung='" + bezeichnung + '\'' +
                '}';
    }
}

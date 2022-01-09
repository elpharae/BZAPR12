package pkg;

import java.io.Serializable;

public class Osoba implements Serializable {

    String prijmeni;
    String email;

    public Osoba(String prijmeni, String email) {
        this.prijmeni = prijmeni;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "prijmeni='" + prijmeni + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package pkg;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Osoba[] arr = {
                new Osoba("Prijmeni", "email"),
                new Osoba("Lmao", "xd"),
                new Osoba("Xd", "emoji@xd.sk")
        };
/*
        try (PrintWriter wr = new PrintWriter(new File("Osoby.csv"))){
            ulozOsoby(arr, wr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        OsobaRead rd = new OsobaRead("Osoby.csv");


        File obj = new File("Soubor.txt");

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(obj, true))) {
            writer.println("Prvni radek, na konci odradkuje");
            writer.println("Druhy radek, na konci odradkuje");
            writer.print("Tohle neodradkuje");
            writer.print("Tohle taky ne");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner sc = new Scanner(obj)) {
            while (sc.hasNext()) System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
*/

        try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(new File("Textak.txt")))){
            ulozOsoby(arr, new PrintWriter(obj));
        } catch (IOException e) {
            e.printStackTrace();
        }

        OsobaRead rd = new OsobaRead("Textak.txt");
    }

    private static void ulozOsoby(Osoba[] arr, PrintWriter wr) {
        for (Osoba o: arr)
            wr.printf("%s,%s,\n", o.prijmeni, o.email);
    }

}

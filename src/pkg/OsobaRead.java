package pkg;

import java.io.*;
import java.util.Scanner;

public class OsobaRead {

    public OsobaRead(String name) {
        File file = new File(name);
/*
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] arr = line.split(",");

                System.out.println(new Osoba(arr[0], arr[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
*/
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println(obj.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package Assigment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class PtLogger {

    public void log(Member member) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Assigment_2/pt_log.txt", true))) {

            writer.write(member.getName() + ";" + member.getPersonNr() + ";" + LocalDate.now());
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Fel! Gick inte spara besöket: " + e.getMessage());
        }
    }
}

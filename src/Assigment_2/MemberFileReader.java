package Assigment_2;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class MemberFileReader {

    public List<Member> loadMembers(String fileName) {

        List<Member> members = new ArrayList<>();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                try {
                    LocalDate memberSince = LocalDate.parse(data[4].trim(), dtf);
                    LocalDate lastPayment = LocalDate.parse(data[5].trim(), dtf);
                    MemberType memberType = MemberType.fromString(data[6].trim());

                    Member member = new Member(
                            data[0].trim(),
                            data[1].trim(),
                            data[2].trim(),
                            data[3].trim(),
                            memberSince,
                            lastPayment,
                            memberType
                    );

                    members.add(member);

                }catch (DateTimeParseException e) {
                    System.out.println("Felaktigt datum format: " + line);
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Felaktig medlemsnivå: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Kan inte Läsa filen: " + e.getMessage());;
        }
        return members;
    }
}
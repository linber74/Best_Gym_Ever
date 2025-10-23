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
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {

                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                if  (line.trim().isEmpty()) continue;

                //String[] data = line.split(",");
                String[] data = line.trim().split("\\s*;\\s*");


                if (data.length < 7) {
                    System.out.println("Ogiltig rad (för få fält): " + line);
                    continue;
                }

                try {
                    String name = data[0].trim();
                    String address = data[1].trim();
                    String email = data[2].trim();
                    String personnummer = data[3].trim();
                    LocalDate memberSince = LocalDate.parse(data[4].trim(), dtf);
                    LocalDate lastPayment = LocalDate.parse(data[5].trim(), dtf);
                    MemberType memberType = MemberType.fromString(data[6].trim());


                    Member member = new Member(name, address, email, personnummer,
                            memberSince, lastPayment, memberType);

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
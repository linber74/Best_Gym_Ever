package Sprint_2.Gym_Assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MemberFileReader {

    Path fileName = Paths.get("inlämningsuppgift 2.txt");

    public List<Member> readFile() {
        List<Member> members = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName.toFile()))) {

            String line;
            int lineNr = 0;

            while ((line = reader.readLine()) != null) {

                lineNr++;
                if (lineNr == 1) {
                    continue;
                }

                String[] data = line.split(";");
                String name = data[0].trim();
                String address = data[1].trim();

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
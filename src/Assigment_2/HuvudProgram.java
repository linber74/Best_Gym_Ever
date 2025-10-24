package Assigment_2;

import java.util.List;
import java.util.Scanner;

public class HuvudProgram {

    void main() {

        MemberFileReader file = new MemberFileReader();
        List<Member> members = file.loadMembers("src/Assigment_2/inlämningsuppgift 2.txt");

        MemberService service = new MemberService(members);
        PtLogger logger = new PtLogger();
        GymSystem system = new GymSystem(service, logger);

        try (Scanner scanner = new Scanner(System.in)) {
            UserInputHandler userInputHandler = new UserInputHandler(scanner);
            String input = userInputHandler.readNameOrPersonNr
                    ("Ange förnamn och efternamn eller personnummer (YYMMDD-XXXX): ");
            system.checkStatus(input);
        }
    }
}

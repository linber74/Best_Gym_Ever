package Assigment_2;

import java.util.List;
import java.util.Scanner;

public class HuvudProgram {

    void main() {

        MemberFileReader file = new MemberFileReader();
        List<Member> members = file.loadMembers("C:\\Users\\linbe\\OneDrive\\Dokument\\Javautvecklare\\Projects\\OOP\\src\\Assigment_2\\inlämningsuppgift 2.txt");

        MemberService service = new MemberService(members);
        PtLogger logger = new PtLogger();
        GymSystem system = new GymSystem(service, logger);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange namn eller personnummer: ");
        String input = scanner.nextLine();

        system.checkStatus(input);
    }
}

package Sprint_2.Gym_Assignment2;

import java.time.LocalDate;

public class Member  {

    private String name;
    private String address;
    private String personNr;
    private LocalDate memberSince;
    private LocalDate lastPayment;
    private final MemberType memberType;

    public Member(MemberType memberType, String name, String address, String personNr,
                  LocalDate memberSince, LocalDate lastPayment) {
        this.memberType = memberType;
        this.name = name;
        this.address = address;
        this.personNr = personNr;
        this.memberSince = memberSince;
        this.lastPayment = lastPayment;
    }
}

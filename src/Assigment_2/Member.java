package Assigment_2;

import java.time.LocalDate;

public class Member  {

    private final String name;
    private final String personNr;
    private final LocalDate lastPayment;
    private final MemberType memberType;

    public Member(String name, String address, String email, String personNr,
                  LocalDate memberSince, LocalDate lastPayment, MemberType memberType) {
        this.name = name;
        this.personNr = personNr;
        this.lastPayment = lastPayment;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public String getPersonNr() {
        return personNr;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    boolean isCurrentMember() {
        return lastPayment.plusYears(1).isAfter(LocalDate.now());
    }

    boolean isFormerMember() {
        return lastPayment.plusYears(1).isBefore(LocalDate.now());
    }
}

package Inlämningsuppgift_2;

import java.time.LocalDate;

public class Member  {

    private final String name;
    private final String address;
    private final String email;
    private final String personNr;
    private final LocalDate memberSince;
    private final LocalDate lastPayment;
    private final MemberType memberType;

    public Member(String name, String address, String email, String personNr,
                  LocalDate memberSince, LocalDate lastPayment, MemberType memberType) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.personNr = personNr;
        this.memberSince = memberSince;
        this.lastPayment = lastPayment;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPersonNr() {
        return personNr;
    }

    public LocalDate getMemberSince() {
        return memberSince;
    }

    public LocalDate getLastPayment() {
        return lastPayment;
    }

    public MemberType getMemberType() {
        return memberType;
    }
}

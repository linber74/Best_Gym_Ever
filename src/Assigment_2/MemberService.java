package Assigment_2;

import java.util.List;

public class MemberService {

    private final List<Member> members;

    public MemberService(List<Member> members) {
        this.members = members;
    }

    public Member findMember(String input) {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(input) || member.getPersonNr().equals(input)){
                return member;
            }
        }
        return null;
    }
}

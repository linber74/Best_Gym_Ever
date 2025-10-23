package Assigment_2;

public class GymSystem {

    private final MemberService memberService;
    private final PtLogger log;

    public GymSystem(MemberService memberService, PtLogger log) {
        this.memberService = memberService;
        this.log = log;
    }

    public void checkStatus(String input) {
        Member member = memberService.findMember(input);

        if (member == null){
            System.out.println("OBehörig!");
        }
        else if (member.isCurrentMember()){
            System.out.println("Medlem! (" + member.getMemberType().getFormattedMemberType() + ")");
            System.out.println("Välkommen " + member.getName());
            log.log(member);
        }
        else{
            System.out.println("Före detta medlem!");
        }
    }
}

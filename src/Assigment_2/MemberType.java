package Assigment_2;

public enum MemberType {

    STANDARD ("Standard"),
    GOLD ("Guld"),
    PLATINA("Platina");

    public final String memberType;

    MemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getFormattedMemberType() {
        return memberType;
    }

    public static MemberType fromString(String input) {
        switch (input.trim().toLowerCase()){

            case "standard": return STANDARD;

            case "guld": return GOLD;

            case "platina": return PLATINA;

            default: throw new IllegalArgumentException("Ogiltig Medlemstyp: " + input);
        }
    }
}

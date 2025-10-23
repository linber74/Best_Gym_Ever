package Inlämningsuppgift_2;

public enum MemberType {

    STANDARD ("Standard"),
    GOLD ("Gold"),
    PLatina ("Platina");

    public final String memberType;

    MemberType(String memberType) {
        this.memberType = memberType;
    }
}

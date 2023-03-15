package Java.OOP.Lab6;

public class Client implements CanPay    {
    private String name;
    private MemberTypeWithDiscount memberType;

    Client(String n) {
        this.name = n;
        this.memberType = MemberTypeWithDiscount.None;
    }

    private void promoteMemberType() {
        switch (memberType) {
            case None:
                memberType = MemberTypeWithDiscount.SILVER;
                break;
            case SILVER:
                memberType = MemberTypeWithDiscount.GOLD;
                break;
            case GOLD:
                memberType = MemberTypeWithDiscount.PREMIUM;
                break;
            case PREMIUM:
                break;
        }
    }

    private void demoteMemberType() {
        switch (memberType) {
            case None:
                break;
            case SILVER:
                break;
            case GOLD:
                memberType = MemberTypeWithDiscount.SILVER;
                break;
            case PREMIUM:
                memberType = MemberTypeWithDiscount.GOLD;
                break;
        }
    }

    public void showMembershipStatus() {
        System.out.println("You are now " + memberType + " " + (int) memberType.getProductDiscount()
                + "% discount on Product " + (int) memberType.getServiceDiscount() + "% on service");
    }

    public void spend(int direction) {
        if (direction < 0) {
            demoteMemberType();
        } else {
            promoteMemberType();
        }
        showMembershipStatus();
    }
}

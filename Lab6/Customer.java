package Java.OOP.Lab6;

public class Customer implements CanPay {
    private String name;
    private MemberType memberType;

    Customer(String n) {
        this.name = n;
        this.memberType = MemberType.None;
    }

    private void promoteMemberType() {
        switch (memberType) {
            case None:
                memberType = MemberType.SILVER;
                break;
            case SILVER:
                memberType = MemberType.GOLD;
                break;
            case GOLD:
                memberType = MemberType.PREMIUM;
                break;
            case PREMIUM:
                break;
        }
    }

    private void demoteMemberType() {
        switch (memberType) {
            case PREMIUM:
                memberType = MemberType.GOLD;
                break;
            case GOLD:
                memberType = MemberType.SILVER;
                break;
            case SILVER:
                break;
            case None:
                break;

        }
    }

    public void showMembershipStatus() {
        System.out.println("You are now " + memberType);
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

package Java.OOP.Lab6;

public enum MemberTypeWithDiscount {
    None(0, 0), SILVER(0.5, 0.5), GOLD(1.0, 2.0), PREMIUM(3.0, 4.5);

    private double productDiscount;
    private double serviceDiscount;

    private MemberTypeWithDiscount(final double productDiscount, final double serviceDiscount) {
        this.productDiscount = productDiscount;
        this.serviceDiscount = serviceDiscount;
    }

    public double getProductDiscount() {
        return productDiscount * 10;
    }

    public double getServiceDiscount() {
        return serviceDiscount * 10;
    }
}

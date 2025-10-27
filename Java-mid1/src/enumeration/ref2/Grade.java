package enumeration.ref2;

public enum Grade {
    //이렇게 하면 밑에 생성자가 호출되면서 값을 넘음
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    //자동 private 생략
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}

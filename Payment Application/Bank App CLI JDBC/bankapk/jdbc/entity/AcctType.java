package bankapk.jdbc.entity;

public enum AcctType {
    SAVINGS(1),
    CURRENT(2),
    LOAN(3),
    SALARY(4);

    private int value;

    AcctType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

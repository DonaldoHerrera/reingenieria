package defpackage;

/* renamed from: xNa reason: default package and case insensitive filesystem */
/* compiled from: DeliveryMechanism */
public enum C7667xNa {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    private final int f;

    private C7667xNa(int i) {
        this.f = i;
    }

    public static C7667xNa a(String str) {
        if ("io.crash.air".equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int getId() {
        return this.f;
    }

    public String toString() {
        return Integer.toString(this.f);
    }
}

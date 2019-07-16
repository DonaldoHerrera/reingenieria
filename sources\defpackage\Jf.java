package defpackage;

/* renamed from: Jf reason: default package */
public enum Jf implements C1294fg<String> {
    MALE,
    FEMALE;

    public String forJsonPut() {
        int i = If.a[ordinal()];
        if (i == 1) {
            return "m";
        }
        if (i != 2) {
            return null;
        }
        return "f";
    }
}

package defpackage;

/* renamed from: Mf reason: default package */
public enum Mf implements C1294fg<String> {
    OPTED_IN,
    SUBSCRIBED,
    UNSUBSCRIBED;

    public String forJsonPut() {
        int i = Lf.a[ordinal()];
        if (i == 1) {
            return "unsubscribed";
        }
        if (i == 2) {
            return "subscribed";
        }
        if (i != 3) {
            return null;
        }
        return "opted_in";
    }
}

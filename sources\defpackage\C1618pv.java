package defpackage;

import java.util.Date;

/* renamed from: pv reason: default package and case insensitive filesystem */
public final class C1618pv {
    private final Date a;
    private final int b;
    private final C1432jv c;

    private C1618pv(Date date, int i, C1432jv jvVar) {
        this.a = date;
        this.b = i;
        this.c = jvVar;
    }

    public static C1618pv a(C1432jv jvVar) {
        return new C1618pv(jvVar.b(), 0, jvVar);
    }

    public static C1618pv b(Date date) {
        return new C1618pv(date, 2, null);
    }

    public static C1618pv a(Date date) {
        return new C1618pv(date, 1, null);
    }

    public final C1432jv a() {
        return this.c;
    }
}

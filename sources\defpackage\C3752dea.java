package defpackage;

import java.util.Date;

/* renamed from: dea reason: default package and case insensitive filesystem */
/* compiled from: TrackPolicy.kt */
public final class C3752dea {
    private final String a;
    private final Date b;

    public C3752dea(String str, Date date) {
        C7471uYa.b(str, "policy");
        C7471uYa.b(date, "updatedAt");
        this.a = str;
        this.b = date;
    }

    public final String a() {
        return this.a;
    }

    public final Date b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3752dea) && !(C7471uYa.a((Object) this.a, (Object) ((C3752dea) obj).a) ^ true));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

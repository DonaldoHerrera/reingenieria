package defpackage;

/* renamed from: xzb reason: default package and case insensitive filesystem */
/* compiled from: Header */
public final class C7718xzb {
    public static final C7030oAb a = C7030oAb.c(":");
    public static final C7030oAb b = C7030oAb.c(":status");
    public static final C7030oAb c = C7030oAb.c(":method");
    public static final C7030oAb d = C7030oAb.c(":path");
    public static final C7030oAb e = C7030oAb.c(":scheme");
    public static final C7030oAb f = C7030oAb.c(":authority");
    public final C7030oAb g;
    public final C7030oAb h;
    final int i;

    public C7718xzb(String str, String str2) {
        this(C7030oAb.c(str), C7030oAb.c(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7718xzb)) {
            return false;
        }
        C7718xzb xzb = (C7718xzb) obj;
        if (!this.g.equals(xzb.g) || !this.h.equals(xzb.h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return Kyb.a("%s: %s", this.g.v(), this.h.v());
    }

    public C7718xzb(C7030oAb oab, String str) {
        this(oab, C7030oAb.c(str));
    }

    public C7718xzb(C7030oAb oab, C7030oAb oab2) {
        this.g = oab;
        this.h = oab2;
        this.i = oab.f() + 32 + oab2.f();
    }
}

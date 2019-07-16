package defpackage;

/* renamed from: jNa reason: default package and case insensitive filesystem */
/* compiled from: AdvertisingInfo */
class C6705jNa {
    public final String a;
    public final boolean b;

    C6705jNa(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6705jNa.class != obj.getClass()) {
            return false;
        }
        C6705jNa jna = (C6705jNa) obj;
        if (this.b != jna.b) {
            return false;
        }
        String str = this.a;
        return str == null ? jna.a == null : str.equals(jna.a);
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.b ? 1 : 0);
    }
}

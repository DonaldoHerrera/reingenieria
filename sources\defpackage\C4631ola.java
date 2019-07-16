package defpackage;

/* renamed from: ola reason: default package and case insensitive filesystem */
/* compiled from: Payload */
public final class C4631ola {
    public final String a;
    public final String b;

    public C4631ola(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4631ola.class != obj.getClass()) {
            return false;
        }
        C4631ola ola = (C4631ola) obj;
        if (!C4804CKa.a(this.a, ola.a) || !C4804CKa.a(this.b, ola.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C4804CKa.a(this.a, this.b);
    }
}

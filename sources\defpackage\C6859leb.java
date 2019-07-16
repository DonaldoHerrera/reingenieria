package defpackage;

/* renamed from: leb reason: default package and case insensitive filesystem */
/* compiled from: Annotations.kt */
public final class C6859leb {
    public static final C6723jeb a(C6723jeb jeb, C6723jeb jeb2) {
        C7471uYa.b(jeb, "first");
        C7471uYa.b(jeb2, "second");
        if (jeb.isEmpty()) {
            return jeb2;
        }
        if (jeb2.isEmpty()) {
            return jeb;
        }
        return new C7202qeb(jeb, jeb2);
    }
}

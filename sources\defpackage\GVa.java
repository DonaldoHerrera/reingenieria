package defpackage;

/* renamed from: GVa reason: default package */
/* compiled from: Standard.kt */
public final class GVa extends Error {
    public GVa(String str) {
        C7471uYa.b(str, "message");
        super(str);
    }

    public /* synthetic */ GVa(String str, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            str = "An operation is not implemented.";
        }
        this(str);
    }
}

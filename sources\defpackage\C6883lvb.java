package defpackage;

/* renamed from: lvb reason: default package and case insensitive filesystem */
/* compiled from: capitalizeDecapitalize.kt */
final class C6883lvb extends C7540vYa implements _Xa<String, String> {
    final /* synthetic */ boolean a;

    C6883lvb(boolean z) {
        this.a = z;
        super(1);
    }

    /* renamed from: a */
    public final String invoke(String str) {
        C7471uYa.b(str, "string");
        if (this.a) {
            return C6951mvb.c(str);
        }
        String lowerCase = str.toLowerCase();
        C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}

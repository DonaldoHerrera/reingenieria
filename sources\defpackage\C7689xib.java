package defpackage;

/* renamed from: xib reason: default package and case insensitive filesystem */
/* compiled from: RawType.kt */
final class C7689xib extends C7540vYa implements C6308dYa<String, String, Boolean> {
    public static final C7689xib a = new C7689xib();

    C7689xib() {
        super(2);
    }

    public final boolean a(String str, String str2) {
        C7471uYa.b(str, "first");
        C7471uYa.b(str2, "second");
        return C7471uYa.a((Object) str, (Object) Hxb.a(str2, (CharSequence) "out ")) || C7471uYa.a((Object) str2, (Object) "*");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((String) obj, (String) obj2));
    }
}

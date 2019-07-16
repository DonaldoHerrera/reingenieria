package defpackage;

/* renamed from: zib reason: default package and case insensitive filesystem */
/* compiled from: RawType.kt */
final class C7827zib extends C7540vYa implements C6308dYa<String, String, String> {
    public static final C7827zib a = new C7827zib();

    C7827zib() {
        super(2);
    }

    /* renamed from: a */
    public final String invoke(String str, String str2) {
        C7471uYa.b(str, "$this$replaceArgs");
        C7471uYa.b(str2, "newArgs");
        if (!Hxb.a((CharSequence) str, '<', false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Hxb.c(str, '<', (String) null, 2, (Object) null));
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        sb.append(Hxb.b(str, '>', (String) null, 2, (Object) null));
        return sb.toString();
    }
}

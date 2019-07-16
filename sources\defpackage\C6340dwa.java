package defpackage;

/* renamed from: dwa reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C6340dwa extends C7540vYa implements _Xa<Eda, Boolean> {
    final /* synthetic */ String a;

    C6340dwa(String str) {
        this.a = str;
        super(1);
    }

    public final boolean a(Eda eda) {
        C7471uYa.b(eda, "it");
        String s = eda.s();
        C7471uYa.a((Object) s, "it.title()");
        return Hxb.a((CharSequence) s, (CharSequence) this.a, true);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Eda) obj));
    }
}

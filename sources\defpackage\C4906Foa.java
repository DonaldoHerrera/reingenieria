package defpackage;

/* renamed from: Foa reason: default package and case insensitive filesystem */
/* compiled from: AddToPlaylistDialogFragment.kt */
final class C4906Foa extends C7540vYa implements C6308dYa<C5333Toa, C5333Toa, Boolean> {
    public static final C4906Foa a = new C4906Foa();

    C4906Foa() {
        super(2);
    }

    public final boolean a(C5333Toa toa, C5333Toa toa2) {
        C7471uYa.b(toa, "firstSuggestion");
        C7471uYa.b(toa2, "secondSuggestion");
        return toa.a(toa2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((C5333Toa) obj, (C5333Toa) obj2));
    }
}

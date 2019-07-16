package defpackage;

/* renamed from: Bqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsPresenter.kt */
final class C4784Bqa<T1, T2, R> implements C6504gQa<C7218qra, Boolean, Ul<? extends C7218qra>> {
    public static final C4784Bqa a = new C4784Bqa();

    C4784Bqa() {
    }

    public final Ul<C7218qra> a(C7218qra qra, boolean z) {
        C7471uYa.b(qra, "model");
        if (z) {
            return Tl.b;
        }
        return new Wl(qra);
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        return a((C7218qra) obj, ((Boolean) obj2).booleanValue());
    }
}

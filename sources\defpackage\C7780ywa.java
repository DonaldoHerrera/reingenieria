package defpackage;

/* renamed from: ywa reason: default package and case insensitive filesystem */
/* compiled from: SuggestionItem */
public abstract class C7780ywa {

    /* renamed from: ywa$a */
    /* compiled from: SuggestionItem */
    public static abstract class a extends C7780ywa {
        public abstract String h();

        public abstract String i();

        public abstract C4928GKa<C3508cda> j();
    }

    /* renamed from: ywa$b */
    /* compiled from: SuggestionItem */
    public enum b {
        TrackItem,
        UserItem,
        PlaylistItem,
        AutocompletionItem
    }

    public static C7366swa a(C7159pwa pwa, String str) {
        C4928GKa b2 = pwa.b();
        String c = pwa.c();
        C4928GKa a2 = pwa.a();
        C3508cda d = pwa.d();
        if (d.x()) {
            return C7366swa.b(d, b2, str, a2, c);
        }
        if (d.J()) {
            return C7366swa.a(d, b2, str, a2, c, pwa.e());
        } else if (d.u()) {
            return C7366swa.a(d, b2, str, a2, c);
        } else {
            throw new IllegalStateException("Unexpected suggestion item type.");
        }
    }

    public abstract b f();

    public abstract String g();

    public static a a(C7778yva yva, String str, C4928GKa<C3508cda> gKa) {
        C7709xva xva = new C7709xva(b.AutocompletionItem, str, yva.a(), yva.b(), gKa);
        return xva;
    }
}

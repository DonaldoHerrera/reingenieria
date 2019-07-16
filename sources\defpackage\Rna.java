package defpackage;

/* renamed from: Rna reason: default package */
/* compiled from: ViewPlaybackStateEmitter.kt */
final /* synthetic */ class Rna extends C7402tYa implements C6308dYa<Ina, Ina, Boolean> {
    public static final Rna e = new Rna();

    Rna() {
        super(2);
    }

    public final boolean a(Ina ina, Ina ina2) {
        C7471uYa.b(ina, "p1");
        C7471uYa.b(ina2, "p2");
        return Wna.b(ina, ina2);
    }

    public final String getName() {
        return "isEqualToWithoutTimestamp";
    }

    public final C7610wZa h() {
        return HYa.a(Wna.class, "player-ui-components_release");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((Ina) obj, (Ina) obj2));
    }

    public final String j() {
        return "isEqualToWithoutTimestamp(Lcom/soundcloud/android/player/ui/PlaybackStateInput;Lcom/soundcloud/android/player/ui/PlaybackStateInput;)Z";
    }
}

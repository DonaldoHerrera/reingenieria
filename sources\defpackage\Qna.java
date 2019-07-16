package defpackage;

/* renamed from: Qna reason: default package */
/* compiled from: ViewPlaybackStateEmitter.kt */
final class Qna<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Ona a;
    final /* synthetic */ Ina b;
    final /* synthetic */ long c;

    Qna(Ona ona, Ina ina, long j) {
        this.a = ona;
        this.b = ina;
        this.c = j;
    }

    /* renamed from: a */
    public final Kna apply(Float f) {
        C7471uYa.b(f, "it");
        return this.a.a(f.floatValue(), this.b.b(), this.c);
    }
}

package defpackage;

/* renamed from: Sna reason: default package */
/* compiled from: ViewPlaybackStateEmitter.kt */
final class Sna<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Ona a;
    final /* synthetic */ APa b;
    final /* synthetic */ long c;
    final /* synthetic */ APa d;
    final /* synthetic */ APa e;

    Sna(Ona ona, APa aPa, long j, APa aPa2, APa aPa3) {
        this.a = ona;
        this.b = aPa;
        this.c = j;
        this.d = aPa2;
        this.e = aPa3;
    }

    /* renamed from: a */
    public final APa<Nna> apply(Ina ina) {
        C7471uYa.b(ina, "playState");
        return this.a.a(this.b, this.c, ina, this.d).a((EPa<? extends U>) this.e, this.a.a(ina)).e(this.a.a(ina, this.c));
    }
}

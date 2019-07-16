package defpackage;

/* renamed from: Bpa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository.kt */
final class C4783Bpa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C4938Gpa a;
    final /* synthetic */ _Xa b;
    final /* synthetic */ C3508cda c;

    C4783Bpa(C4938Gpa gpa, _Xa _xa, C3508cda cda) {
        this.a = gpa;
        this.b = _xa;
        this.c = cda;
    }

    /* renamed from: a */
    public final APa<Pda<Eda>> apply(Pda<Eda> pda) {
        C7471uYa.b(pda, "it");
        if (!(pda instanceof b) || ((Boolean) this.b.invoke(((b) pda).a())).booleanValue()) {
            return this.a.c(this.c);
        }
        return this.a.b(this.c).c(1).e(pda);
    }
}

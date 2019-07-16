package defpackage;

/* renamed from: Fta reason: default package and case insensitive filesystem */
/* compiled from: PostsStorage.kt */
public final class C4911Fta extends a {
    final /* synthetic */ C4942Gta b;
    final /* synthetic */ C3508cda c;

    C4911Fta(C4942Gta gta, C3508cda cda) {
        this.b = gta;
        this.c = cda;
    }

    private final void c(C5500ZKa zKa) {
        _ea _ea = _ea.Activities;
        C6907mLa a = C6907mLa.a();
        Integer valueOf = Integer.valueOf(1);
        String str = "sound_type";
        String str2 = "sound_id";
        a(zKa.a((C5116MLa) _ea, a.d(str, (Object) valueOf).d(str2, (Object) Long.valueOf(this.c.c()))));
        a(zKa.a((C5116MLa) _ea.SoundStream, C6907mLa.a().d(str, (Object) valueOf).d(str2, (Object) Long.valueOf(this.c.c()))));
    }

    private final void d(C5500ZKa zKa) {
        a(zKa.a((C5116MLa) d.c, C6907mLa.a().a(d.e, (Object) Integer.valueOf(1)).a(d.f, (Object) Long.valueOf(this.c.c()))));
    }

    private final void e(C5500ZKa zKa) {
        String str = "sound_id";
        a(zKa.a((C5116MLa) _ea.SoundStream, C6907mLa.a().d("sound_type", (Object) Integer.valueOf(1)).d(str, (Object) Long.valueOf(this.c.c()))));
    }

    private final void f(C5500ZKa zKa) {
        a(zKa.a((C5116MLa) e.c, C5296SKa.a(1).a(e.L, this.b.c.a()).a(), C6907mLa.a().a(e.d, (Object) Long.valueOf(this.c.c())).a(e.e, (Object) Integer.valueOf(1))));
    }

    public void b(C5500ZKa zKa) {
        C7471uYa.b(zKa, "propeller");
        f(zKa);
        d(zKa);
        c(zKa);
        e(zKa);
    }
}

package defpackage;

/* renamed from: jsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistStorage.kt */
public final class C6740jsa extends a {
    final /* synthetic */ C6332dsa b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ long d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ C3508cda g;
    final /* synthetic */ C3508cda h;

    C6740jsa(C6332dsa dsa, C3508cda cda, long j, String str, boolean z, C3508cda cda2, C3508cda cda3) {
        this.b = dsa;
        this.c = cda;
        this.d = j;
        this.e = str;
        this.f = z;
        this.g = cda2;
        this.h = cda3;
    }

    public void b(C5500ZKa zKa) {
        C7471uYa.b(zKa, "propeller");
        e eVar = e.c;
        C6332dsa dsa = this.b;
        C3508cda cda = this.c;
        String str = "playlist";
        C7471uYa.a((Object) cda, str);
        a(zKa.a((C5116MLa) eVar, dsa.a(cda, this.d, this.e, this.f, this.g)));
        _ea _ea = _ea.PlaylistTracks;
        C6332dsa dsa2 = this.b;
        C3508cda cda2 = this.c;
        C7471uYa.a((Object) cda2, str);
        a(zKa.a((C5116MLa) _ea, dsa2.a(cda2, this.h)));
    }
}

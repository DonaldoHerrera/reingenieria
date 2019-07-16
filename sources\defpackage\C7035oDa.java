package defpackage;

/* renamed from: oDa reason: default package and case insensitive filesystem */
/* compiled from: DownloadedMediaStreamsStorage.kt */
final class C7035oDa<T, R> implements C7118pQa<T, R> {
    public static final C7035oDa a = new C7035oDa();

    C7035oDa() {
    }

    /* renamed from: a */
    public final C6762kDa apply(a aVar) {
        C7471uYa.b(aVar, "it");
        C3508cda c = aVar.c();
        C7471uYa.a((Object) c, "it.urn()");
        String a2 = aVar.a();
        C7471uYa.a((Object) a2, "it.preset()");
        String b = aVar.b();
        C7471uYa.a((Object) b, "it.quality()");
        String d = aVar.d();
        C7471uYa.a((Object) d, "it.mime_type()");
        return new C6762kDa(c, a2, b, d);
    }
}

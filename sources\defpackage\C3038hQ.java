package defpackage;

import com.soundcloud.android.offline.ve.a;

/* renamed from: hQ reason: default package and case insensitive filesystem */
/* compiled from: DownloadRequestHelper.kt */
public final class C3038hQ implements a {
    private final C6699jHa a;
    private final C2322UP b;

    public C3038hQ(C6699jHa jha, C2322UP up) {
        C7471uYa.b(jha, "deviceHelper");
        C7471uYa.b(up, "oAuth");
        this.a = jha;
        this.b = up;
    }

    public String a() {
        return this.a.j();
    }

    public int b() {
        return this.a.b();
    }

    public String c() {
        String a2 = this.b.a();
        C7471uYa.a((Object) a2, "oAuth.authorizationHeaderValue");
        return a2;
    }
}

package defpackage;

import java.util.concurrent.Callable;

/* renamed from: lKa reason: default package and case insensitive filesystem */
/* compiled from: WaveformStorage.kt */
public class C6838lKa {
    /* access modifiers changed from: private */
    public final C7321sMa<C5325TJa> a;
    /* access modifiers changed from: private */
    public final C3469VY b;

    public C6838lKa(C7321sMa<C5325TJa> sma, C3469VY vy) {
        C7471uYa.b(sma, "waveformCache");
        C7471uYa.b(vy, "errorReporter");
        this.a = sma;
        this.b = vy;
    }

    /* access modifiers changed from: private */
    public String c(C3508cda cda) {
        String d = cda.d();
        C7471uYa.a((Object) d, "trackUrn.stringId");
        return d;
    }

    public C7531vPa<C5325TJa> b(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        C7531vPa<C5325TJa> b2 = C7531vPa.b((Callable<? extends T>) new C6770kKa<Object>(this, cda));
        C7471uYa.a((Object) b2, "Maybe.fromCallable {\n   …l\n            }\n        }");
        return b2;
    }

    public boolean a(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        return this.a.a(c(cda));
    }

    public void a(C3508cda cda, C5325TJa tJa) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(tJa, "data");
        this.a.a(c(cda), tJa);
    }

    public void a() {
        this.a.c();
    }
}

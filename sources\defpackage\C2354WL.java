package defpackage;

/* renamed from: WL reason: default package and case insensitive filesystem */
/* compiled from: DefaultTrackingApiFactory.kt */
public class C2354WL implements C1952BM {
    private final C4806CMa<C7440tyb> a;
    private final C3395zM b;
    private final C3469VY c;
    private final C1971CL d;
    private final String e;
    private final int f;
    private final C7648wza<Boolean> g;

    public C2354WL(C4806CMa<C7440tyb> cMa, C3395zM zMVar, C3469VY vy, C1971CL cl, @C3132mP String str, @b int i, @e C7648wza<Boolean> wza) {
        C7471uYa.b(cMa, "httpClient");
        C7471uYa.b(zMVar, "simpleTrackingApiRequestBuilder");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(cl, "batchTrackingApiFactory");
        C7471uYa.b(str, "eventGatewayBaseurl");
        C7471uYa.b(wza, "flushInstantlyPref");
        this.a = cMa;
        this.b = zMVar;
        this.c = vy;
        this.d = cl;
        this.e = str;
        this.f = i;
        this.g = wza;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.e;
    }

    public C7648wza<Boolean> c() {
        return this.g;
    }

    public C1932AM a(String str) {
        C7471uYa.b(str, "backend");
        if (C7471uYa.a((Object) "boogaloo", (Object) str)) {
            return this.d.a(b(), a(), c());
        }
        return new C3375yM(this.a, this.c, this.b);
    }
}

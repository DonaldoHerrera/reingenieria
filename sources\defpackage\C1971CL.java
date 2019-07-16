package defpackage;

/* renamed from: CL reason: default package and case insensitive filesystem */
/* compiled from: BatchTrackingApiFactory.kt */
public class C1971CL {
    private final C4806CMa<C7440tyb> a;
    private final b b;
    private final a c;
    private final C3469VY d;

    public C1971CL(C4806CMa<C7440tyb> cMa, b bVar, a aVar, C3469VY vy) {
        C7471uYa.b(cMa, "httpClient");
        C7471uYa.b(bVar, "devicePropertiesProvider");
        C7471uYa.b(aVar, "authenticationProvider");
        C7471uYa.b(vy, "errorReporter");
        this.a = cMa;
        this.b = bVar;
        this.c = aVar;
        this.d = vy;
    }

    public C1951BL a(String str, int i, C7648wza<Boolean> wza) {
        C7471uYa.b(str, "batchUrl");
        C7471uYa.b(wza, "flushInstantly");
        C1951BL bl = new C1951BL(this.a, str, i, this.b, this.c, this.d, wza);
        return bl;
    }
}

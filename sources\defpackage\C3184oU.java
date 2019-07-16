package defpackage;

/* renamed from: oU reason: default package and case insensitive filesystem */
/* compiled from: PendingPlanOperations */
public class C3184oU {
    private final C2343VT a;

    C3184oU(C2343VT vt) {
        this.a = vt;
    }

    /* access modifiers changed from: 0000 */
    public void a(C2455aV aVVar) {
        this.a.a(aVVar);
    }

    public void b(C2455aV aVVar) {
        this.a.b(aVVar);
    }

    public C2455aV c() {
        return this.a.g();
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        C2455aV f = this.a.f();
        C2455aV g = this.a.g();
        C2455aV aVVar = C2455aV.UNDEFINED;
        return (f == aVVar && g == aVVar) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        C2455aV f = this.a.f();
        return f == C2455aV.FREE_TIER || f == C2455aV.MID_TIER;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        C2455aV g = this.a.g();
        return g == C2455aV.MID_TIER || g == C2455aV.HIGH_TIER;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.c();
    }

    public C2455aV b() {
        return this.a.f();
    }
}

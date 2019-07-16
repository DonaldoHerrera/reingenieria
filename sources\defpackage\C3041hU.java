package defpackage;

import com.soundcloud.android.foundation.events.C3712n;

/* renamed from: hU reason: default package and case insensitive filesystem */
/* compiled from: ForceUpdateHandler */
public class C3041hU {
    private final C5327TLa a;
    private final C5467YGa b;
    private final C6699jHa c;
    private final C2343VT d;

    C3041hU(C5327TLa tLa, C5467YGa yGa, C6699jHa jha, C2343VT vt) {
        this.a = tLa;
        this.b = yGa;
        this.c = jha;
        this.d = vt;
    }

    private void b() {
        this.a.c(C3876taa.k, new C3712n(this.b.a(), this.c.c(), this.c.b()));
    }

    /* access modifiers changed from: 0000 */
    public void a(C2212OT ot) {
        if (ot.g()) {
            this.d.a(this.c.b());
            b();
            return;
        }
        this.d.b();
    }

    public void a() {
        if (this.d.d() == this.c.b()) {
            b();
        }
    }
}

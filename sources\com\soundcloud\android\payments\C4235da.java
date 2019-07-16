package com.soundcloud.android.payments;

import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* renamed from: com.soundcloud.android.payments.da reason: case insensitive filesystem */
/* compiled from: PaymentErrorPresenter */
class C4235da {
    private final C4239fa a;
    private final C3700b b;

    C4235da(C4239fa faVar, C3700b bVar) {
        this.a = faVar;
        this.b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    private void b(ifa ifa) {
        char c;
        String a2 = ifa.a();
        int hashCode = a2.hashCode();
        if (hashCode != -993047903) {
            if (hashCode != 258063133) {
                if (hashCode == 1337096963 && a2.equals("unconfirmed_email")) {
                    c = 2;
                    if (c != 0) {
                        this.a.a();
                        a("Already subscribed");
                        return;
                    } else if (c == 1) {
                        this.a.j();
                        a("Wrong user");
                        return;
                    } else if (c != 2) {
                        c();
                        return;
                    } else {
                        this.a.f();
                        a("Unconfirmed email");
                        return;
                    }
                }
            } else if (a2.equals("wrong_user")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (a2.equals("already_subscribed")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    public void a(FragmentActivity fragmentActivity) {
        this.a.a(fragmentActivity);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.a.d();
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.a.h();
        a("Verify fail");
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.a.i();
        a("Verify timeout");
    }

    public void a(Throwable th) {
        if (th instanceof ifa) {
            a((ifa) th);
            return;
        }
        this.a.g();
        a("Unknown");
    }

    private void a(ifa ifa) {
        int i = C4233ca.a[ifa.j().ordinal()];
        if (i == 1) {
            b(ifa);
        } else if (i != 2) {
            c();
        } else {
            this.a.e();
            a("Stale checkout");
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        this.a.c();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.b();
        a("Billing unavailable");
    }

    private void a(String str) {
        this.b.a((J) Caa.a(str));
    }
}

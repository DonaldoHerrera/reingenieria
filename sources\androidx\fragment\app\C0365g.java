package androidx.fragment.app;

import androidx.activity.a;

/* renamed from: androidx.fragment.app.g reason: case insensitive filesystem */
/* compiled from: FragmentActivity */
class C0365g implements a {
    final /* synthetic */ FragmentActivity a;

    C0365g(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    public boolean a() {
        C0370l j = this.a.mFragments.j();
        if (j.f()) {
            return false;
        }
        return j.h();
    }
}

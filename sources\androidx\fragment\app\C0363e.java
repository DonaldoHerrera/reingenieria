package androidx.fragment.app;

import android.view.View;

/* renamed from: androidx.fragment.app.e reason: case insensitive filesystem */
/* compiled from: Fragment */
class C0363e extends C0366h {
    final /* synthetic */ Fragment a;

    C0363e(Fragment fragment) {
        this.a = fragment;
    }

    public View a(int i) {
        View view = this.a.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    public boolean a() {
        return this.a.mView != null;
    }
}

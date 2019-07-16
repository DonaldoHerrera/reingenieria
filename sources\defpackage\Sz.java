package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: Sz reason: default package */
/* compiled from: ExpandableWidgetHelper */
public final class Sz {
    private final View a;
    private boolean b = false;
    private int c = 0;

    public Sz(Rz rz) {
        this.a = (View) rz;
    }

    private void d() {
        ViewParent parent = this.a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).a(this.a);
        }
    }

    public void a(Bundle bundle) {
        this.b = bundle.getBoolean("expanded", false);
        this.c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            d();
        }
    }

    public boolean b() {
        return this.b;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.b);
        bundle.putInt("expandedComponentIdHint", this.c);
        return bundle;
    }

    public void a(int i) {
        this.c = i;
    }

    public int a() {
        return this.c;
    }
}

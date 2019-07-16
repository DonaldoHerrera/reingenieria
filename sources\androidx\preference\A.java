package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.a;

/* compiled from: PreferenceRecyclerViewAccessibilityDelegate */
class A extends C0273Wb {
    final /* synthetic */ B d;

    A(B b) {
        this.d = b;
    }

    public void a(View view, Mc mc) {
        this.d.g.a(view, mc);
        int f = this.d.f.f(view);
        a adapter = this.d.f.getAdapter();
        if (adapter instanceof x) {
            Preference f2 = ((x) adapter).f(f);
            if (f2 != null) {
                f2.a(mc);
            }
        }
    }

    public boolean a(View view, int i, Bundle bundle) {
        return this.d.g.a(view, i, bundle);
    }
}

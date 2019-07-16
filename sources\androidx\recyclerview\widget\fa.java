package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class fa extends C0273Wb {
    final RecyclerView d;
    final C0273Wb e = new a(this);

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends C0273Wb {
        final fa d;

        public a(fa faVar) {
            this.d = faVar;
        }

        public void a(View view, Mc mc) {
            super.a(view, mc);
            if (!this.d.c() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().a(view, mc);
            }
        }

        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (this.d.c() || this.d.d.getLayoutManager() == null) {
                return false;
            }
            return this.d.d.getLayoutManager().a(view, i, bundle);
        }
    }

    public fa(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (c() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().a(i, bundle);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.d.j();
    }

    public void a(View view, Mc mc) {
        super.a(view, mc);
        mc.b((CharSequence) RecyclerView.class.getName());
        if (!c() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().a(mc);
        }
    }

    public C0273Wb b() {
        return this.e;
    }
}

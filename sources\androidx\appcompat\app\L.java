package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.T;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar */
public class L extends ActionBar implements androidx.appcompat.widget.ActionBarOverlayLayout.a {
    private static final Interpolator a = new AccelerateInterpolator();
    private static final Interpolator b = new DecelerateInterpolator();
    private boolean A = true;
    A B;
    private boolean C;
    boolean D;
    final Fc E = new I(this);
    final Fc F = new J(this);
    final Hc G = new K(this);
    Context c;
    private Context d;
    private Activity e;
    private Dialog f;
    ActionBarOverlayLayout g;
    ActionBarContainer h;
    D i;
    ActionBarContextView j;
    View k;
    T l;
    private ArrayList<Object> m = new ArrayList<>();
    private int n = -1;
    private boolean o;
    a p;
    C1712t q;
    defpackage.C1712t.a r;
    private boolean s;
    private ArrayList<androidx.appcompat.app.ActionBar.a> t = new ArrayList<>();
    private boolean u;
    private int v = 0;
    boolean w = true;
    boolean x;
    boolean y;
    private boolean z;

    /* compiled from: WindowDecorActionBar */
    public class a extends C1712t implements androidx.appcompat.view.menu.l.a {
        private final Context c;
        private final l d;
        private defpackage.C1712t.a e;
        private WeakReference<View> f;

        public a(Context context, defpackage.C1712t.a aVar) {
            this.c = context;
            this.e = aVar;
            this.d = new l(context).c(1);
            this.d.a((androidx.appcompat.view.menu.l.a) this);
        }

        public void a() {
            L l = L.this;
            if (l.p == this) {
                if (!L.a(l.x, l.y, false)) {
                    L l2 = L.this;
                    l2.q = this;
                    l2.r = this.e;
                } else {
                    this.e.a(this);
                }
                this.e = null;
                L.this.g(false);
                L.this.j.a();
                L.this.i.j().sendAccessibilityEvent(32);
                L l3 = L.this;
                l3.g.setHideOnContentScrollEnabled(l3.D);
                L.this.p = null;
            }
        }

        public void b(CharSequence charSequence) {
            L.this.j.setTitle(charSequence);
        }

        public Menu c() {
            return this.d;
        }

        public MenuInflater d() {
            return new C1862y(this.c);
        }

        public CharSequence e() {
            return L.this.j.getSubtitle();
        }

        public CharSequence g() {
            return L.this.j.getTitle();
        }

        public void i() {
            if (L.this.p == this) {
                this.d.s();
                try {
                    this.e.b(this, this.d);
                } finally {
                    this.d.r();
                }
            }
        }

        public boolean j() {
            return L.this.j.b();
        }

        public boolean k() {
            this.d.s();
            try {
                return this.e.a((C1712t) this, (Menu) this.d);
            } finally {
                this.d.r();
            }
        }

        public void b(int i) {
            b((CharSequence) L.this.c.getResources().getString(i));
        }

        public View b() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public void a(View view) {
            L.this.j.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        public void a(CharSequence charSequence) {
            L.this.j.setSubtitle(charSequence);
        }

        public void a(int i) {
            a((CharSequence) L.this.c.getResources().getString(i));
        }

        public void a(boolean z) {
            super.a(z);
            L.this.j.setTitleOptional(z);
        }

        public boolean a(l lVar, MenuItem menuItem) {
            defpackage.C1712t.a aVar = this.e;
            if (aVar != null) {
                return aVar.a((C1712t) this, menuItem);
            }
            return false;
        }

        public void a(l lVar) {
            if (this.e != null) {
                i();
                L.this.j.d();
            }
        }
    }

    public L(Activity activity, boolean z2) {
        this.e = activity;
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z2) {
            this.k = decorView.findViewById(16908290);
        }
    }

    private D a(View view) {
        if (view instanceof D) {
            return (D) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    static boolean a(boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return true;
        }
        return !z2 && !z3;
    }

    private void b(View view) {
        this.g = (ActionBarOverlayLayout) view.findViewById(C1283f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.g;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.i = a(view.findViewById(C1283f.action_bar));
        this.j = (ActionBarContextView) view.findViewById(C1283f.action_context_bar);
        this.h = (ActionBarContainer) view.findViewById(C1283f.action_bar_container);
        D d2 = this.i;
        if (d2 == null || this.j == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(L.class.getSimpleName());
            sb.append(" can only be used ");
            sb.append("with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.c = d2.getContext();
        boolean z2 = (this.i.m() & 4) != 0;
        if (z2) {
            this.o = true;
        }
        C1682s a2 = C1682s.a(this.c);
        k(a2.a() || z2);
        l(a2.f());
        TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(null, C1406j.ActionBar, C0294a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C1406j.ActionBar_hideOnContentScroll, false)) {
            j(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1406j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void l(boolean z2) {
        this.u = z2;
        if (!this.u) {
            this.i.a((T) null);
            this.h.setTabContainer(this.l);
        } else {
            this.h.setTabContainer(null);
            this.i.a(this.l);
        }
        boolean z3 = true;
        boolean z4 = m() == 2;
        T t2 = this.l;
        if (t2 != null) {
            if (z4) {
                t2.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.g;
                if (actionBarOverlayLayout != null) {
                    C1778vc.G(actionBarOverlayLayout);
                }
            } else {
                t2.setVisibility(8);
            }
        }
        this.i.b(!this.u && z4);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.g;
        if (this.u || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z3);
    }

    private void n() {
        if (this.z) {
            this.z = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m(false);
        }
    }

    private boolean o() {
        return C1778vc.B(this.h);
    }

    private void p() {
        if (!this.z) {
            this.z = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.g;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m(false);
        }
    }

    public void b() {
    }

    public void c(CharSequence charSequence) {
        this.i.setWindowTitle(charSequence);
    }

    public void d(boolean z2) {
        a(z2 ? 4 : 0, 4);
    }

    public void e(boolean z2) {
        a(z2 ? 8 : 0, 8);
    }

    public void f(boolean z2) {
        this.C = z2;
        if (!z2) {
            A a2 = this.B;
            if (a2 != null) {
                a2.a();
            }
        }
    }

    public int g() {
        return this.i.m();
    }

    public void h(boolean z2) {
        A a2 = this.B;
        if (a2 != null) {
            a2.a();
        }
        if (this.v != 0 || (!this.C && !z2)) {
            this.E.b(null);
            return;
        }
        this.h.setAlpha(1.0f);
        this.h.setTransitioning(true);
        A a3 = new A();
        float f2 = (float) (-this.h.getHeight());
        if (z2) {
            int[] iArr = {0, 0};
            this.h.getLocationInWindow(iArr);
            f2 -= (float) iArr[1];
        }
        Ec a4 = C1778vc.a(this.h);
        a4.b(f2);
        a4.a(this.G);
        a3.a(a4);
        if (this.w) {
            View view = this.k;
            if (view != null) {
                Ec a5 = C1778vc.a(view);
                a5.b(f2);
                a3.a(a5);
            }
        }
        a3.a(a);
        a3.a(250);
        a3.a(this.E);
        this.B = a3;
        a3.c();
    }

    public void i(boolean z2) {
        A a2 = this.B;
        if (a2 != null) {
            a2.a();
        }
        this.h.setVisibility(0);
        if (this.v != 0 || (!this.C && !z2)) {
            this.h.setAlpha(1.0f);
            this.h.setTranslationY(0.0f);
            if (this.w) {
                View view = this.k;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            this.F.b(null);
        } else {
            this.h.setTranslationY(0.0f);
            float f2 = (float) (-this.h.getHeight());
            if (z2) {
                int[] iArr = {0, 0};
                this.h.getLocationInWindow(iArr);
                f2 -= (float) iArr[1];
            }
            this.h.setTranslationY(f2);
            A a3 = new A();
            Ec a4 = C1778vc.a(this.h);
            a4.b(0.0f);
            a4.a(this.G);
            a3.a(a4);
            if (this.w) {
                View view2 = this.k;
                if (view2 != null) {
                    view2.setTranslationY(f2);
                    Ec a5 = C1778vc.a(this.k);
                    a5.b(0.0f);
                    a3.a(a5);
                }
            }
            a3.a(b);
            a3.a(250);
            a3.a(this.F);
            this.B = a3;
            a3.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.g;
        if (actionBarOverlayLayout != null) {
            C1778vc.G(actionBarOverlayLayout);
        }
    }

    public void j(boolean z2) {
        if (!z2 || this.g.i()) {
            this.D = z2;
            this.g.setHideOnContentScrollEnabled(z2);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void k(boolean z2) {
        this.i.a(z2);
    }

    public int m() {
        return this.i.i();
    }

    private void m(boolean z2) {
        if (a(this.x, this.y, this.z)) {
            if (!this.A) {
                this.A = true;
                i(z2);
            }
        } else if (this.A) {
            this.A = false;
            h(z2);
        }
    }

    public void c() {
        if (!this.y) {
            this.y = true;
            m(true);
        }
    }

    public void d() {
        A a2 = this.B;
        if (a2 != null) {
            a2.a();
            this.B = null;
        }
    }

    public void g(boolean z2) {
        Ec ec;
        Ec ec2;
        if (z2) {
            p();
        } else {
            n();
        }
        if (o()) {
            if (z2) {
                ec = this.i.a(4, 100);
                ec2 = this.j.a(0, 200);
            } else {
                ec2 = this.i.a(0, 200);
                ec = this.j.a(8, 100);
            }
            A a2 = new A();
            a2.a(ec, ec2);
            a2.c();
        } else if (z2) {
            this.i.setVisibility(4);
            this.j.setVisibility(0);
        } else {
            this.i.setVisibility(0);
            this.j.setVisibility(8);
        }
    }

    public boolean f() {
        D d2 = this.i;
        if (d2 == null || !d2.g()) {
            return false;
        }
        this.i.collapseActionView();
        return true;
    }

    public void c(boolean z2) {
        if (!this.o) {
            d(z2);
        }
    }

    public void a(float f2) {
        C1778vc.a((View) this.h, f2);
    }

    public void a(Configuration configuration) {
        l(C1682s.a(this.c).f());
    }

    public void a(int i2) {
        this.v = i2;
    }

    public void a(CharSequence charSequence) {
        this.i.a(charSequence);
    }

    public void a(int i2, int i3) {
        int m2 = this.i.m();
        if ((i3 & 4) != 0) {
            this.o = true;
        }
        this.i.a((i2 & i3) | ((~i3) & m2));
    }

    public C1712t a(defpackage.C1712t.a aVar) {
        a aVar2 = this.p;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.g.setHideOnContentScrollEnabled(false);
        this.j.c();
        a aVar3 = new a(this.j.getContext(), aVar);
        if (!aVar3.k()) {
            return null;
        }
        this.p = aVar3;
        aVar3.i();
        this.j.a(aVar3);
        g(true);
        this.j.sendAccessibilityEvent(32);
        return aVar3;
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        defpackage.C1712t.a aVar = this.r;
        if (aVar != null) {
            aVar.a(this.q);
            this.q = null;
            this.r = null;
        }
    }

    public L(Dialog dialog) {
        this.f = dialog;
        b(dialog.getWindow().getDecorView());
    }

    public void b(boolean z2) {
        if (z2 != this.s) {
            this.s = z2;
            int size = this.t.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((androidx.appcompat.app.ActionBar.a) this.t.get(i2)).onMenuVisibilityChanged(z2);
            }
        }
    }

    public Context h() {
        if (this.d == null) {
            TypedValue typedValue = new TypedValue();
            this.c.getTheme().resolveAttribute(C0294a.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.d = new ContextThemeWrapper(this.c, i2);
            } else {
                this.d = this.c;
            }
        }
        return this.d;
    }

    public void a(boolean z2) {
        this.w = z2;
    }

    public void b(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    public void a() {
        if (this.y) {
            this.y = false;
            m(true);
        }
    }

    public void b(int i2) {
        this.i.c(i2);
    }

    public boolean a(int i2, KeyEvent keyEvent) {
        a aVar = this.p;
        if (aVar == null) {
            return false;
        }
        Menu c2 = aVar.c();
        if (c2 == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        c2.setQwertyMode(z2);
        return c2.performShortcut(i2, keyEvent, 0);
    }
}

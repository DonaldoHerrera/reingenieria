package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.v.a;
import androidx.appcompat.widget.L;

/* compiled from: StandardMenuPopup */
final class C extends s implements OnDismissListener, OnItemClickListener, v, OnKeyListener {
    private static final int b = C1314g.abc_popup_menu_item_layout;
    private final Context c;
    private final l d;
    private final k e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    final L j;
    final OnGlobalLayoutListener k = new A(this);
    private final OnAttachStateChangeListener l = new B(this);
    private OnDismissListener m;
    private View n;
    View o;
    private a p;
    ViewTreeObserver q;
    private boolean r;
    private boolean s;
    private int t;
    private int u = 0;
    private boolean v;

    public C(Context context, l lVar, View view, int i2, int i3, boolean z) {
        this.c = context;
        this.d = lVar;
        this.f = z;
        this.e = new k(lVar, LayoutInflater.from(context), this.f, b);
        this.h = i2;
        this.i = i3;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1222d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new L(this.c, null, this.h, this.i);
        lVar.a((v) this, context);
    }

    private boolean h() {
        if (d()) {
            return true;
        }
        if (!this.r) {
            View view = this.n;
            if (view != null) {
                this.o = view;
                this.j.a((OnDismissListener) this);
                this.j.a((OnItemClickListener) this);
                this.j.a(true);
                View view2 = this.o;
                boolean z = this.q == null;
                this.q = view2.getViewTreeObserver();
                if (z) {
                    this.q.addOnGlobalLayoutListener(this.k);
                }
                view2.addOnAttachStateChangeListener(this.l);
                this.j.a(view2);
                this.j.c(this.u);
                if (!this.s) {
                    this.t = s.a(this.e, null, this.c, this.g);
                    this.s = true;
                }
                this.j.b(this.t);
                this.j.e(2);
                this.j.a(g());
                this.j.c();
                ListView e2 = this.j.e();
                e2.setOnKeyListener(this);
                if (this.v && this.d.h() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.c).inflate(C1314g.abc_popup_menu_header_item_layout, e2, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.d.h());
                    }
                    frameLayout.setEnabled(false);
                    e2.addHeaderView(frameLayout, null, false);
                }
                this.j.a((ListAdapter) this.e);
                this.j.c();
                return true;
            }
        }
        return false;
    }

    public Parcelable a() {
        return null;
    }

    public void a(int i2) {
        this.u = i2;
    }

    public void a(Parcelable parcelable) {
    }

    public void a(l lVar) {
    }

    public void b(boolean z) {
        this.e.a(z);
    }

    public boolean b() {
        return false;
    }

    public void c() {
        if (!h()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public boolean d() {
        return !this.r && this.j.d();
    }

    public void dismiss() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public ListView e() {
        return this.j.e();
    }

    public void onDismiss() {
        this.r = true;
        this.d.close();
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void a(boolean z) {
        this.s = false;
        k kVar = this.e;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    public void b(int i2) {
        this.j.d(i2);
    }

    public void c(int i2) {
        this.j.h(i2);
    }

    public void c(boolean z) {
        this.v = z;
    }

    public void a(a aVar) {
        this.p = aVar;
    }

    public boolean a(D d2) {
        if (d2.hasVisibleItems()) {
            u uVar = new u(this.c, d2, this.o, this.f, this.h, this.i);
            uVar.a(this.p);
            uVar.a(s.b((l) d2));
            uVar.a(this.m);
            this.m = null;
            this.d.a(false);
            int g2 = this.j.g();
            int h2 = this.j.h();
            if ((Gravity.getAbsoluteGravity(this.u, C1778vc.l(this.n)) & 7) == 5) {
                g2 += this.n.getWidth();
            }
            if (uVar.a(g2, h2)) {
                a aVar = this.p;
                if (aVar != null) {
                    aVar.a(d2);
                }
                return true;
            }
        }
        return false;
    }

    public void a(l lVar, boolean z) {
        if (lVar == this.d) {
            dismiss();
            a aVar = this.p;
            if (aVar != null) {
                aVar.a(lVar, z);
            }
        }
    }

    public void a(View view) {
        this.n = view;
    }

    public void a(OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }
}

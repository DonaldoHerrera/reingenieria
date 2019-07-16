package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.v.a;

/* compiled from: ToolbarWidgetWrapper */
public class ua implements D {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Callback l;
    boolean m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    public ua(Toolbar toolbar, boolean z) {
        this(toolbar, z, C1345h.abc_action_bar_up_description, C1252e.abc_ic_ab_back_material);
    }

    private void c(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private int o() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    private void p() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.k)) {
            this.a.setNavigationContentDescription(this.p);
        } else {
            this.a.setNavigationContentDescription(this.k);
        }
    }

    private void q() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.a.setNavigationIcon((Drawable) null);
    }

    private void r() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    public void a(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void a(boolean z) {
    }

    public void b(int i2) {
        a(i2 != 0 ? C1437k.b(getContext(), i2) : null);
    }

    public void collapseActionView() {
        this.a.c();
    }

    public void d(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                e(this.p);
            }
        }
    }

    public void e() {
        this.m = true;
    }

    public boolean f() {
        return this.a.h();
    }

    public boolean g() {
        return this.a.f();
    }

    public Context getContext() {
        return this.a.getContext();
    }

    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    public Menu h() {
        return this.a.getMenu();
    }

    public int i() {
        return this.o;
    }

    public ViewGroup j() {
        return this.a;
    }

    public void k() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void l() {
        this.a.d();
    }

    public int m() {
        return this.b;
    }

    public void n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i2) {
        setIcon(i2 != 0 ? C1437k.b(getContext(), i2) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.h = true;
        c(charSequence);
    }

    public void setVisibility(int i2) {
        this.a.setVisibility(i2);
    }

    public void setWindowCallback(Callback callback) {
        this.l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            c(charSequence);
        }
    }

    public ua(Toolbar toolbar, boolean z, int i2, int i3) {
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        na a2 = na.a(toolbar.getContext(), null, C1406j.ActionBar, C0294a.actionBarStyle, 0);
        this.q = a2.b(C1406j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e2 = a2.e(C1406j.ActionBar_title);
            if (!TextUtils.isEmpty(e2)) {
                setTitle(e2);
            }
            CharSequence e3 = a2.e(C1406j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e3)) {
                a(e3);
            }
            Drawable b2 = a2.b(C1406j.ActionBar_logo);
            if (b2 != null) {
                a(b2);
            }
            Drawable b3 = a2.b(C1406j.ActionBar_icon);
            if (b3 != null) {
                setIcon(b3);
            }
            if (this.g == null) {
                Drawable drawable = this.q;
                if (drawable != null) {
                    b(drawable);
                }
            }
            a(a2.d(C1406j.ActionBar_displayOptions, 0));
            int g2 = a2.g(C1406j.ActionBar_customNavigationLayout, 0);
            if (g2 != 0) {
                a(LayoutInflater.from(this.a.getContext()).inflate(g2, this.a, false));
                a(this.b | 16);
            }
            int f2 = a2.f(C1406j.ActionBar_height, 0);
            if (f2 > 0) {
                LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = f2;
                this.a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(C1406j.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(C1406j.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                this.a.a(Math.max(b4, 0), Math.max(b5, 0));
            }
            int g3 = a2.g(C1406j.ActionBar_titleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.b(toolbar2.getContext(), g3);
            }
            int g4 = a2.g(C1406j.ActionBar_subtitleTextStyle, 0);
            if (g4 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.a(toolbar3.getContext(), g4);
            }
            int g5 = a2.g(C1406j.ActionBar_popupTheme, 0);
            if (g5 != 0) {
                this.a.setPopupTheme(g5);
            }
        } else {
            this.b = o();
        }
        a2.a();
        d(i2);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new sa(this));
    }

    public boolean b() {
        return this.a.g();
    }

    public void e(int i2) {
        b((CharSequence) i2 == 0 ? null : getContext().getString(i2));
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        r();
    }

    public void b(boolean z) {
        this.a.setCollapsible(z);
    }

    public void a(Drawable drawable) {
        this.f = drawable;
        r();
    }

    public void b(Drawable drawable) {
        this.g = drawable;
        q();
    }

    public boolean c() {
        return this.a.k();
    }

    public void c(int i2) {
        b(i2 != 0 ? C1437k.b(getContext(), i2) : null);
    }

    public boolean d() {
        return this.a.i();
    }

    public boolean a() {
        return this.a.b();
    }

    public void b(CharSequence charSequence) {
        this.k = charSequence;
        p();
    }

    public void a(Menu menu, a aVar) {
        if (this.n == null) {
            this.n = new ActionMenuPresenter(this.a.getContext());
            this.n.a(C1283f.action_menu_presenter);
        }
        this.n.a(aVar);
        this.a.a((l) menu, this.n);
    }

    public void a(int i2) {
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i3 & 3) != 0) {
                r();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0) {
                View view = this.d;
                if (view == null) {
                    return;
                }
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public void a(T t) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = t;
        if (t != null && this.o == 2) {
            this.a.addView(this.c, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.a = 8388691;
            t.setAllowCollapse(true);
        }
    }

    public void a(View view) {
        View view2 = this.d;
        if (!(view2 == null || (this.b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(this.d);
        }
    }

    public Ec a(int i2, long j2) {
        Ec a2 = C1778vc.a(this.a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.a(j2);
        a2.a((Fc) new ta(this, i2));
        return a2;
    }

    public void a(a aVar, l.a aVar2) {
        this.a.a(aVar, aVar2);
    }
}

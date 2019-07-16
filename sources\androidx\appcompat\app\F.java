package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ua;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar */
class F extends ActionBar {
    D a;
    boolean b;
    Callback c;
    private boolean d;
    private boolean e;
    private ArrayList<androidx.appcompat.app.ActionBar.a> f = new ArrayList<>();
    private final Runnable g = new D(this);
    private final androidx.appcompat.widget.Toolbar.b h = new E(this);

    /* compiled from: ToolbarActionBar */
    private final class a implements androidx.appcompat.view.menu.v.a {
        private boolean a;

        a() {
        }

        public boolean a(l lVar) {
            Callback callback = F.this.c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, lVar);
            return true;
        }

        public void a(l lVar, boolean z) {
            if (!this.a) {
                this.a = true;
                F.this.a.l();
                Callback callback = F.this.c;
                if (callback != null) {
                    callback.onPanelClosed(108, lVar);
                }
                this.a = false;
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    private final class b implements androidx.appcompat.view.menu.l.a {
        b() {
        }

        public void a(l lVar) {
            F f = F.this;
            if (f.c == null) {
                return;
            }
            if (f.a.d()) {
                F.this.c.onPanelClosed(108, lVar);
            } else if (F.this.c.onPreparePanel(0, null, lVar)) {
                F.this.c.onMenuOpened(108, lVar);
            }
        }

        public boolean a(l lVar, MenuItem menuItem) {
            return false;
        }
    }

    /* compiled from: ToolbarActionBar */
    private class c extends B {
        public c(Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(F.this.a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                F f = F.this;
                if (!f.b) {
                    f.a.e();
                    F.this.b = true;
                }
            }
            return onPreparePanel;
        }
    }

    F(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.a = new ua(toolbar, false);
        this.c = new c(callback);
        this.a.setWindowCallback(this.c);
        toolbar.setOnMenuItemClickListener(this.h);
        this.a.setWindowTitle(charSequence);
    }

    private Menu n() {
        if (!this.d) {
            this.a.a((androidx.appcompat.view.menu.v.a) new a(), (androidx.appcompat.view.menu.l.a) new b());
            this.d = true;
        }
        return this.a.h();
    }

    public void a(Configuration configuration) {
        super.a(configuration);
    }

    public void b(int i) {
        this.a.c(i);
    }

    public void c(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public void e(boolean z) {
        a(z ? 8 : 0, 8);
    }

    public void f(boolean z) {
    }

    public boolean f() {
        if (!this.a.g()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    public int g() {
        return this.a.m();
    }

    public Context h() {
        return this.a.getContext();
    }

    public boolean i() {
        this.a.j().removeCallbacks(this.g);
        C1778vc.a((View) this.a.j(), this.g);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void j() {
        this.a.j().removeCallbacks(this.g);
    }

    public boolean k() {
        return this.a.c();
    }

    public Callback l() {
        return this.c;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public void m() {
        Menu n = n();
        l lVar = n instanceof l ? (l) n : null;
        if (lVar != null) {
            lVar.s();
        }
        try {
            n.clear();
            if (!this.c.onCreatePanelMenu(0, n) || !this.c.onPreparePanel(0, null, n)) {
                n.clear();
            }
            if (lVar != null) {
                lVar.r();
            }
        } catch (Throwable th) {
            if (lVar != null) {
                lVar.r();
            }
            throw th;
        }
    }

    public void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public void b(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    public boolean e() {
        return this.a.b();
    }

    public void a(int i, int i2) {
        this.a.a((i & i2) | ((~i2) & this.a.m()));
    }

    public void b(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                ((androidx.appcompat.app.ActionBar.a) this.f.get(i)).onMenuVisibilityChanged(z);
            }
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    public boolean a(int i, KeyEvent keyEvent) {
        Menu n = n();
        if (n == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        n.setQwertyMode(z);
        return n.performShortcut(i, keyEvent, 0);
    }
}

package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: t reason: default package and case insensitive filesystem */
/* compiled from: ActionMode */
public abstract class C1712t {
    private Object a;
    private boolean b;

    /* renamed from: t$a */
    /* compiled from: ActionMode */
    public interface a {
        void a(C1712t tVar);

        boolean a(C1712t tVar, Menu menu);

        boolean a(C1712t tVar, MenuItem menuItem);

        boolean b(C1712t tVar, Menu menu);
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public void a(Object obj) {
        this.a = obj;
    }

    public abstract View b();

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.a;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.b;
    }

    public abstract void i();

    public abstract boolean j();

    public void a(boolean z) {
        this.b = z;
    }
}

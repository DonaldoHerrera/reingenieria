package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: Xb reason: default package and case insensitive filesystem */
/* compiled from: ActionProvider */
public abstract class C0278Xb {
    private final Context a;
    private a b;
    private b c;

    /* renamed from: Xb$a */
    /* compiled from: ActionProvider */
    public interface a {
        void b(boolean z);
    }

    /* renamed from: Xb$b */
    /* compiled from: ActionProvider */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0278Xb(Context context) {
        this.a = context;
    }

    public Context a() {
        return this.a;
    }

    public void a(SubMenu subMenu) {
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public void g() {
        if (this.c != null && f()) {
            this.c.onActionProviderVisibilityChanged(c());
        }
    }

    public void h() {
        this.c = null;
        this.b = null;
    }

    public View a(MenuItem menuItem) {
        return d();
    }

    public void a(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void a(b bVar) {
        if (!(this.c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.c = bVar;
    }
}

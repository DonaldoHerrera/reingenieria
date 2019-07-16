package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.u;

/* compiled from: PopupMenu */
public class O {
    private final Context a;
    private final l b;
    private final View c;
    final u d;
    b e;
    a f;

    /* compiled from: PopupMenu */
    public interface a {
        void a(O o);
    }

    /* compiled from: PopupMenu */
    public interface b {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public O(Context context, View view) {
        this(context, view, 0);
    }

    public void a(int i) {
        c().inflate(i, this.b);
    }

    public Menu b() {
        return this.b;
    }

    public MenuInflater c() {
        return new C1862y(this.a);
    }

    public void d() {
        this.d.e();
    }

    public O(Context context, View view, int i) {
        this(context, view, i, C0294a.popupMenuStyle, 0);
    }

    public void a() {
        this.d.a();
    }

    public O(Context context, View view, int i, int i2, int i3) {
        this.a = context;
        this.c = view;
        this.b = new l(context);
        this.b.a((androidx.appcompat.view.menu.l.a) new M(this));
        u uVar = new u(context, this.b, view, false, i2, i3);
        this.d = uVar;
        this.d.a(i);
        this.d.a((OnDismissListener) new N(this));
    }

    public void a(b bVar) {
        this.e = bVar;
    }

    public void a(a aVar) {
        this.f = aVar;
    }
}

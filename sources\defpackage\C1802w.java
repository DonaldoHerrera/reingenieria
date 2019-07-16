package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.l.a;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: w reason: default package and case insensitive filesystem */
/* compiled from: StandaloneActionMode */
public class C1802w extends C1712t implements a {
    private Context c;
    private ActionBarContextView d;
    private a e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private l i;

    public C1802w(Context context, ActionBarContextView actionBarContextView, a aVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = aVar;
        this.i = new l(actionBarContextView.getContext()).c(1);
        this.i.a((a) this);
        this.h = z;
    }

    public void a(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    public void b(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    public Menu c() {
        return this.i;
    }

    public MenuInflater d() {
        return new C1862y(this.d.getContext());
    }

    public CharSequence e() {
        return this.d.getSubtitle();
    }

    public CharSequence g() {
        return this.d.getTitle();
    }

    public void i() {
        this.e.b(this, this.i);
    }

    public boolean j() {
        return this.d.b();
    }

    public void a(int i2) {
        a((CharSequence) this.c.getString(i2));
    }

    public void b(int i2) {
        b((CharSequence) this.c.getString(i2));
    }

    public void a(boolean z) {
        super.a(z);
        this.d.setTitleOptional(z);
    }

    public View b() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public void a(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    public void a() {
        if (!this.g) {
            this.g = true;
            this.d.sendAccessibilityEvent(32);
            this.e.a(this);
        }
    }

    public boolean a(l lVar, MenuItem menuItem) {
        return this.e.a((C1712t) this, menuItem);
    }

    public void a(l lVar) {
        i();
        this.d.d();
    }
}

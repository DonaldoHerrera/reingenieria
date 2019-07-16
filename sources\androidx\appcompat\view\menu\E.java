package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuWrapperICS */
class E extends y implements SubMenu {
    E(Context context, C1567ob obVar) {
        super(context, obVar);
    }

    public C1567ob c() {
        return (C1567ob) this.a;
    }

    public void clearHeader() {
        c().clearHeader();
    }

    public MenuItem getItem() {
        return a(c().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        c().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        c().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        c().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        c().setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        c().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        c().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        c().setIcon(drawable);
        return this;
    }
}

package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.x;
import java.util.ArrayList;

/* renamed from: x reason: default package and case insensitive filesystem */
/* compiled from: SupportActionModeWrapper */
public class C1832x extends ActionMode {
    final Context a;
    final C1712t b;

    /* renamed from: x$a */
    /* compiled from: SupportActionModeWrapper */
    public static class a implements defpackage.C1712t.a {
        final Callback a;
        final Context b;
        final ArrayList<C1832x> c = new ArrayList<>();
        final C0485ba<Menu, Menu> d = new C0485ba<>();

        public a(Context context, Callback callback) {
            this.b = context;
            this.a = callback;
        }

        public boolean a(C1712t tVar, Menu menu) {
            return this.a.onCreateActionMode(b(tVar), a(menu));
        }

        public boolean b(C1712t tVar, Menu menu) {
            return this.a.onPrepareActionMode(b(tVar), a(menu));
        }

        public boolean a(C1712t tVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(b(tVar), x.a(this.b, (C1536nb) menuItem));
        }

        public ActionMode b(C1712t tVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                C1832x xVar = (C1832x) this.c.get(i);
                if (xVar != null && xVar.b == tVar) {
                    return xVar;
                }
            }
            C1832x xVar2 = new C1832x(this.b, tVar);
            this.c.add(xVar2);
            return xVar2;
        }

        public void a(C1712t tVar) {
            this.a.onDestroyActionMode(b(tVar));
        }

        private Menu a(Menu menu) {
            Menu menu2 = (Menu) this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a2 = x.a(this.b, (C1505mb) menu);
            this.d.put(menu, a2);
            return a2;
        }
    }

    public C1832x(Context context, C1712t tVar) {
        this.a = context;
        this.b = tVar;
    }

    public void finish() {
        this.b.a();
    }

    public View getCustomView() {
        return this.b.b();
    }

    public Menu getMenu() {
        return x.a(this.a, (C1505mb) this.b.c());
    }

    public MenuInflater getMenuInflater() {
        return this.b.d();
    }

    public CharSequence getSubtitle() {
        return this.b.e();
    }

    public Object getTag() {
        return this.b.f();
    }

    public CharSequence getTitle() {
        return this.b.g();
    }

    public boolean getTitleOptionalHint() {
        return this.b.h();
    }

    public void invalidate() {
        this.b.i();
    }

    public boolean isTitleOptional() {
        return this.b.j();
    }

    public void setCustomView(View view) {
        this.b.a(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    public void setTag(Object obj) {
        this.b.a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }

    public void setSubtitle(int i) {
        this.b.a(i);
    }

    public void setTitle(int i) {
        this.b.b(i);
    }
}

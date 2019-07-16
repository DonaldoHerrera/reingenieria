package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.v.a;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b reason: case insensitive filesystem */
/* compiled from: BaseMenuPresenter */
public abstract class C0327b implements v {
    protected Context a;
    protected Context b;
    protected l c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    private a f;
    private int g;
    private int h;
    protected w i;
    private int j;

    public C0327b(Context context, int i2, int i3) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.g = i2;
        this.h = i3;
    }

    public void a(Context context, l lVar) {
        this.b = context;
        this.e = LayoutInflater.from(this.b);
        this.c = lVar;
    }

    public abstract void a(p pVar, w.a aVar);

    public abstract boolean a(int i2, p pVar);

    public boolean a(l lVar, p pVar) {
        return false;
    }

    public w b(ViewGroup viewGroup) {
        if (this.i == null) {
            this.i = (w) this.d.inflate(this.g, viewGroup, false);
            this.i.a(this.c);
            a(true);
        }
        return this.i;
    }

    public boolean b(l lVar, p pVar) {
        return false;
    }

    public a c() {
        return this.f;
    }

    public int getId() {
        return this.j;
    }

    public void a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup != null) {
            l lVar = this.c;
            int i2 = 0;
            if (lVar != null) {
                lVar.b();
                ArrayList n = this.c.n();
                int size = n.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    p pVar = (p) n.get(i4);
                    if (a(i3, pVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        p itemData = childAt instanceof w.a ? ((w.a) childAt).getItemData() : null;
                        View a2 = a(pVar, childAt, viewGroup);
                        if (pVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            a(a2, i3);
                        }
                        i3++;
                    }
                }
                i2 = i3;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i2);
    }

    /* access modifiers changed from: protected */
    public boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    public w.a a(ViewGroup viewGroup) {
        return (w.a) this.d.inflate(this.h, viewGroup, false);
    }

    public View a(p pVar, View view, ViewGroup viewGroup) {
        w.a aVar;
        if (view instanceof w.a) {
            aVar = (w.a) view;
        } else {
            aVar = a(viewGroup);
        }
        a(pVar, aVar);
        return (View) aVar;
    }

    public void a(l lVar, boolean z) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(lVar, z);
        }
    }

    public boolean a(D d2) {
        a aVar = this.f;
        if (aVar != null) {
            return aVar.a(d2);
        }
        return false;
    }

    public void a(int i2) {
        this.j = i2;
    }
}

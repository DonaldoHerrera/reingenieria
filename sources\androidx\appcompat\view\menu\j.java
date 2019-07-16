package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class j implements v, OnItemClickListener {
    Context a;
    LayoutInflater b;
    l c;
    ExpandedMenuView d;
    int e;
    int f;
    int g;
    private androidx.appcompat.view.menu.v.a h;
    a i;
    private int j;

    /* compiled from: ListMenuPresenter */
    private class a extends BaseAdapter {
        private int a = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            p f = j.this.c.f();
            if (f != null) {
                ArrayList j = j.this.c.j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (((p) j.get(i)) == f) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        public int getCount() {
            int size = j.this.c.j().size() - j.this.e;
            return this.a < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                j jVar = j.this;
                view = jVar.b.inflate(jVar.g, viewGroup, false);
            }
            ((androidx.appcompat.view.menu.w.a) view).a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }

        public p getItem(int i) {
            ArrayList j = j.this.c.j();
            int i2 = i + j.this.e;
            int i3 = this.a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (p) j.get(i2);
        }
    }

    public j(Context context, int i2) {
        this(i2, 0);
        this.a = context;
        this.b = LayoutInflater.from(this.a);
    }

    public void a(Context context, l lVar) {
        int i2 = this.f;
        if (i2 != 0) {
            this.a = new ContextThemeWrapper(context, i2);
            this.b = LayoutInflater.from(this.a);
        } else if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(this.a);
            }
        }
        this.c = lVar;
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean a(l lVar, p pVar) {
        return false;
    }

    public void b(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public boolean b() {
        return false;
    }

    public boolean b(l lVar, p pVar) {
        return false;
    }

    public ListAdapter c() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    public int getId() {
        return this.j;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.c.a((MenuItem) this.i.getItem(i2), (v) this, 0);
    }

    public j(int i2, int i3) {
        this.g = i2;
        this.f = i3;
    }

    public w a(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(C1314g.abc_expanded_menu_layout, viewGroup, false);
            if (this.i == null) {
                this.i = new a();
            }
            this.d.setAdapter(this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public void a(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void a(androidx.appcompat.view.menu.v.a aVar) {
        this.h = aVar;
    }

    public boolean a(D d2) {
        if (!d2.hasVisibleItems()) {
            return false;
        }
        new m(d2).a((IBinder) null);
        androidx.appcompat.view.menu.v.a aVar = this.h;
        if (aVar != null) {
            aVar.a(d2);
        }
        return true;
    }

    public void a(l lVar, boolean z) {
        androidx.appcompat.view.menu.v.a aVar = this.h;
        if (aVar != null) {
            aVar.a(lVar, z);
        }
    }

    public void a(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public Parcelable a() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        b(bundle);
        return bundle;
    }

    public void a(Parcelable parcelable) {
        a((Bundle) parcelable);
    }
}

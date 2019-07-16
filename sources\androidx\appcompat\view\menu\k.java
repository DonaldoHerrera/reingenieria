package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.w.a;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class k extends BaseAdapter {
    l a;
    private int b = -1;
    private boolean c;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public k(l lVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = lVar;
        this.f = i;
        a();
    }

    public void a(boolean z) {
        this.c = z;
    }

    public l b() {
        return this.a;
    }

    public int getCount() {
        ArrayList j = this.d ? this.a.j() : this.a.n();
        if (this.b < 0) {
            return j.size();
        }
        return j.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.a.o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        a aVar = (a) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        p f2 = this.a.f();
        if (f2 != null) {
            ArrayList j = this.a.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((p) j.get(i)) == f2) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public p getItem(int i) {
        ArrayList j = this.d ? this.a.j() : this.a.n();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (p) j.get(i);
    }
}

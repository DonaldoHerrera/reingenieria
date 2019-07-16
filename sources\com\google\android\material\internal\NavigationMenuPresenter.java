package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.D;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.view.menu.w;
import java.util.ArrayList;

public class NavigationMenuPresenter implements v {
    private NavigationMenuView a;
    LinearLayout b;
    private androidx.appcompat.view.menu.v.a c;
    l d;
    private int e;
    b f;
    LayoutInflater g;
    int h;
    boolean i;
    ColorStateList j;
    ColorStateList k;
    Drawable l;
    int m;
    int n;
    private int o;
    int p;
    final OnClickListener q = new j(this);

    private static abstract class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    private static class a extends ViewHolder {
        public a(View view) {
            super(view);
        }
    }

    private class b extends androidx.recyclerview.widget.RecyclerView.a<ViewHolder> {
        private final ArrayList<d> c = new ArrayList<>();
        private p d;
        private boolean e;

        b() {
            i();
        }

        private void i() {
            if (!this.e) {
                this.e = true;
                this.c.clear();
                this.c.add(new c());
                int size = NavigationMenuPresenter.this.d.n().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    p pVar = (p) NavigationMenuPresenter.this.d.n().get(i3);
                    if (pVar.isChecked()) {
                        a(pVar);
                    }
                    if (pVar.isCheckable()) {
                        pVar.c(false);
                    }
                    if (pVar.hasSubMenu()) {
                        SubMenu subMenu = pVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.c.add(new e(NavigationMenuPresenter.this.p, 0));
                            }
                            this.c.add(new f(pVar));
                            int size2 = this.c.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                p pVar2 = (p) subMenu.getItem(i4);
                                if (pVar2.isVisible()) {
                                    if (!z2 && pVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (pVar2.isCheckable()) {
                                        pVar2.c(false);
                                    }
                                    if (pVar.isChecked()) {
                                        a(pVar);
                                    }
                                    this.c.add(new f(pVar2));
                                }
                            }
                            if (z2) {
                                d(size2, this.c.size());
                            }
                        }
                    } else {
                        int groupId = pVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.c.size();
                            boolean z3 = pVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<d> arrayList = this.c;
                                int i5 = NavigationMenuPresenter.this.p;
                                arrayList.add(new e(i5, i5));
                            }
                            z = z3;
                        } else if (!z && pVar.getIcon() != null) {
                            d(i2, this.c.size());
                            z = true;
                        }
                        f fVar = new f(pVar);
                        fVar.b = z;
                        this.c.add(fVar);
                        i = groupId;
                    }
                }
                this.e = false;
            }
        }

        public long a(int i) {
            return (long) i;
        }

        /* renamed from: a */
        public void b(ViewHolder viewHolder, int i) {
            int b = b(i);
            if (b == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder.itemView;
                navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.k);
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                if (navigationMenuPresenter.i) {
                    navigationMenuItemView.setTextAppearance(navigationMenuPresenter.h);
                }
                ColorStateList colorStateList = NavigationMenuPresenter.this.j;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = NavigationMenuPresenter.this.l;
                C1778vc.a((View) navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                f fVar = (f) this.c.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(fVar.b);
                navigationMenuItemView.setHorizontalPadding(NavigationMenuPresenter.this.m);
                navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.n);
                navigationMenuItemView.a(fVar.a(), 0);
            } else if (b == 1) {
                ((TextView) viewHolder.itemView).setText(((f) this.c.get(i)).a().getTitle());
            } else if (b == 2) {
                e eVar = (e) this.c.get(i);
                viewHolder.itemView.setPadding(0, eVar.b(), 0, eVar.a());
            }
        }

        public Bundle f() {
            Bundle bundle = new Bundle();
            p pVar = this.d;
            if (pVar != null) {
                bundle.putInt("android:menu:checked", pVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                d dVar = (d) this.c.get(i);
                if (dVar instanceof f) {
                    p a = ((f) dVar).a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public p g() {
            return this.d;
        }

        public void h() {
            i();
            e();
        }

        private void d(int i, int i2) {
            while (i < i2) {
                ((f) this.c.get(i)).b = true;
                i++;
            }
        }

        public int b() {
            return this.c.size();
        }

        public int b(int i) {
            d dVar = (d) this.c.get(i);
            if (dVar instanceof e) {
                return 2;
            }
            if (dVar instanceof c) {
                return 3;
            }
            if (dVar instanceof f) {
                return ((f) dVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public ViewHolder b(ViewGroup viewGroup, int i) {
            if (i == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new g(navigationMenuPresenter.g, viewGroup, navigationMenuPresenter.q);
            } else if (i == 1) {
                return new i(NavigationMenuPresenter.this.g, viewGroup);
            } else {
                if (i == 2) {
                    return new h(NavigationMenuPresenter.this.g, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new a(NavigationMenuPresenter.this.b);
            }
        }

        public void b(boolean z) {
            this.e = z;
        }

        /* renamed from: a */
        public void d(ViewHolder viewHolder) {
            if (viewHolder instanceof g) {
                ((NavigationMenuItemView) viewHolder.itemView).b();
            }
        }

        public void a(p pVar) {
            if (this.d != pVar && pVar.isCheckable()) {
                p pVar2 = this.d;
                if (pVar2 != null) {
                    pVar2.setChecked(false);
                }
                this.d = pVar;
                pVar.setChecked(true);
            }
        }

        public void a(Bundle bundle) {
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.e = true;
                int size = this.c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    d dVar = (d) this.c.get(i2);
                    if (dVar instanceof f) {
                        p a = ((f) dVar).a();
                        if (a != null && a.getItemId() == i) {
                            a(a);
                            break;
                        }
                    }
                    i2++;
                }
                this.e = false;
                i();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d dVar2 = (d) this.c.get(i3);
                    if (dVar2 instanceof f) {
                        p a2 = ((f) dVar2).a();
                        if (a2 != null) {
                            View actionView = a2.getActionView();
                            if (actionView != null) {
                                ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a2.getItemId());
                                if (parcelableSparseArray != null) {
                                    actionView.restoreHierarchyState(parcelableSparseArray);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static class c implements d {
        c() {
        }
    }

    private interface d {
    }

    private static class e implements d {
        private final int a;
        private final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    private static class f implements d {
        private final p a;
        boolean b;

        f(p pVar) {
            this.a = pVar;
        }

        public p a() {
            return this.a;
        }
    }

    private static class g extends ViewHolder {
        public g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(Az.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class h extends ViewHolder {
        public h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(Az.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class i extends ViewHolder {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(Az.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public void a(Context context, l lVar) {
        this.g = LayoutInflater.from(context);
        this.d = lVar;
        this.p = context.getResources().getDimensionPixelOffset(C1831wz.design_navigation_separator_vertical_padding);
    }

    public boolean a(D d2) {
        return false;
    }

    public boolean a(l lVar, p pVar) {
        return false;
    }

    public void b(int i2) {
        this.e = i2;
    }

    public boolean b() {
        return false;
    }

    public boolean b(l lVar, p pVar) {
        return false;
    }

    public p c() {
        return this.f.g();
    }

    public int d() {
        return this.b.getChildCount();
    }

    public void e(int i2) {
        this.h = i2;
        this.i = true;
        a(false);
    }

    public int f() {
        return this.m;
    }

    public int g() {
        return this.n;
    }

    public int getId() {
        return this.e;
    }

    public ColorStateList h() {
        return this.j;
    }

    public ColorStateList i() {
        return this.k;
    }

    public void b(ColorStateList colorStateList) {
        this.j = colorStateList;
        a(false);
    }

    public void c(int i2) {
        this.m = i2;
        a(false);
    }

    public void d(int i2) {
        this.n = i2;
        a(false);
    }

    public void b(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.b(z);
        }
    }

    public Drawable e() {
        return this.l;
    }

    public w a(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = (NavigationMenuView) this.g.inflate(Az.design_navigation_menu, viewGroup, false);
            if (this.f == null) {
                this.f = new b();
            }
            this.b = (LinearLayout) this.g.inflate(Az.design_navigation_item_header, this.a, false);
            this.a.setAdapter(this.f);
        }
        return this.a;
    }

    public void a(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.h();
        }
    }

    public void a(l lVar, boolean z) {
        androidx.appcompat.view.menu.v.a aVar = this.c;
        if (aVar != null) {
            aVar.a(lVar, z);
        }
    }

    public Parcelable a() {
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray sparseArray = new SparseArray();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        b bVar = this.f;
        if (bVar != null) {
            bundle.putBundle("android:menu:adapter", bVar.f());
        }
        if (this.b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f.a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void a(p pVar) {
        this.f.a(pVar);
    }

    public View a(int i2) {
        View inflate = this.g.inflate(i2, this.b, false);
        a(inflate);
        return inflate;
    }

    public void a(View view) {
        this.b.addView(view);
        NavigationMenuView navigationMenuView = this.a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void a(ColorStateList colorStateList) {
        this.k = colorStateList;
        a(false);
    }

    public void a(Drawable drawable) {
        this.l = drawable;
        a(false);
    }

    public void a(Ic ic) {
        int e2 = ic.e();
        if (this.o != e2) {
            this.o = e2;
            if (this.b.getChildCount() == 0) {
                NavigationMenuView navigationMenuView = this.a;
                navigationMenuView.setPadding(0, this.o, 0, navigationMenuView.getPaddingBottom());
            }
        }
        C1778vc.a((View) this.b, ic);
    }
}

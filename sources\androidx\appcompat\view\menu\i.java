package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.widget.K;
import androidx.appcompat.widget.L;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CascadingMenuPopup */
final class i extends s implements v, OnKeyListener, OnDismissListener {
    private static final int b = C1314g.abc_cascading_menu_item_layout;
    private OnDismissListener A;
    boolean B;
    private final Context c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    final Handler h;
    private final List<l> i = new ArrayList();
    final List<a> j = new ArrayList();
    final OnGlobalLayoutListener k = new C0330e(this);
    private final OnAttachStateChangeListener l = new f(this);
    private final K m = new h(this);
    private int n = 0;
    private int o = 0;
    private View p;
    View q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private androidx.appcompat.view.menu.v.a y;
    ViewTreeObserver z;

    /* compiled from: CascadingMenuPopup */
    private static class a {
        public final L a;
        public final l b;
        public final int c;

        public a(L l, l lVar, int i) {
            this.a = l;
            this.b = lVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.e();
        }
    }

    public i(Context context, View view, int i2, int i3, boolean z2) {
        this.c = context;
        this.p = view;
        this.e = i2;
        this.f = i3;
        this.g = z2;
        this.w = false;
        this.r = i();
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1222d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    private int d(int i2) {
        List<a> list = this.j;
        ListView a2 = ((a) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.q.getWindowVisibleDisplayFrame(rect);
        if (this.r == 1) {
            if (iArr[0] + a2.getWidth() + i2 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i2 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private L h() {
        L l2 = new L(this.c, null, this.e, this.f);
        l2.a(this.m);
        l2.a((OnItemClickListener) this);
        l2.a((OnDismissListener) this);
        l2.a(this.p);
        l2.c(this.o);
        l2.a(true);
        l2.e(2);
        return l2;
    }

    private int i() {
        return C1778vc.l(this.p) == 1 ? 0 : 1;
    }

    public Parcelable a() {
        return null;
    }

    public void a(Parcelable parcelable) {
    }

    public void a(l lVar) {
        lVar.a((v) this, this.c);
        if (d()) {
            d(lVar);
        } else {
            this.i.add(lVar);
        }
    }

    public void b(boolean z2) {
        this.w = z2;
    }

    public boolean b() {
        return false;
    }

    public void c() {
        if (!d()) {
            for (l d2 : this.i) {
                d(d2);
            }
            this.i.clear();
            this.q = this.p;
            if (this.q != null) {
                boolean z2 = this.z == null;
                this.z = this.q.getViewTreeObserver();
                if (z2) {
                    this.z.addOnGlobalLayoutListener(this.k);
                }
                this.q.addOnAttachStateChangeListener(this.l);
            }
        }
    }

    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.j.toArray(new a[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                a aVar = aVarArr[i2];
                if (aVar.a.d()) {
                    aVar.a.dismiss();
                }
            }
        }
    }

    public ListView e() {
        if (this.j.isEmpty()) {
            return null;
        }
        List<a> list = this.j;
        return ((a) list.get(list.size() - 1)).a();
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        return false;
    }

    public void onDismiss() {
        a aVar;
        int size = this.j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                aVar = null;
                break;
            }
            aVar = (a) this.j.get(i2);
            if (!aVar.a.d()) {
                break;
            }
            i2++;
        }
        if (aVar != null) {
            aVar.b.a(false);
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void b(int i2) {
        this.s = true;
        this.u = i2;
    }

    private MenuItem a(l lVar, l lVar2) {
        int size = lVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = lVar.getItem(i2);
            if (item.hasSubMenu() && lVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(a aVar, l lVar) {
        int i2;
        k kVar;
        MenuItem a2 = a(aVar.b, lVar);
        if (a2 == null) {
            return null;
        }
        ListView a3 = aVar.a();
        ListAdapter adapter = a3.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            kVar = (k) headerViewListAdapter.getWrappedAdapter();
        } else {
            kVar = (k) adapter;
            i2 = 0;
        }
        int count = kVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (a2 == kVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return null;
        }
        int firstVisiblePosition = (i3 + i2) - a3.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a3.getChildCount()) {
            return null;
        }
        return a3.getChildAt(firstVisiblePosition);
    }

    private void d(l lVar) {
        View view;
        a aVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.c);
        k kVar = new k(lVar, from, this.g, b);
        if (!d() && this.w) {
            kVar.a(true);
        } else if (d()) {
            kVar.a(s.b(lVar));
        }
        int a2 = s.a(kVar, null, this.c, this.d);
        L h2 = h();
        h2.a((ListAdapter) kVar);
        h2.b(a2);
        h2.c(this.o);
        if (this.j.size() > 0) {
            List<a> list = this.j;
            aVar = (a) list.get(list.size() - 1);
            view = a(aVar, lVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            h2.c(false);
            h2.a((Object) null);
            int d2 = d(a2);
            boolean z2 = d2 == 1;
            this.r = d2;
            if (VERSION.SDK_INT >= 26) {
                h2.a(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.o & 7) == 5) {
                    iArr[0] = iArr[0] + this.p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.o & 5) != 5) {
                if (z2) {
                    a2 = view.getWidth();
                }
                i4 = i2 - a2;
                h2.d(i4);
                h2.b(true);
                h2.h(i3);
            } else if (!z2) {
                a2 = view.getWidth();
                i4 = i2 - a2;
                h2.d(i4);
                h2.b(true);
                h2.h(i3);
            }
            i4 = i2 + a2;
            h2.d(i4);
            h2.b(true);
            h2.h(i3);
        } else {
            if (this.s) {
                h2.d(this.u);
            }
            if (this.t) {
                h2.h(this.v);
            }
            h2.a(g());
        }
        this.j.add(new a(h2, lVar, this.r));
        h2.c();
        ListView e2 = h2.e();
        e2.setOnKeyListener(this);
        if (aVar == null && this.x && lVar.h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C1314g.abc_popup_menu_header_item_layout, e2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(lVar.h());
            e2.addHeaderView(frameLayout, null, false);
            h2.c();
        }
    }

    private int c(l lVar) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (lVar == ((a) this.j.get(i2)).b) {
                return i2;
            }
        }
        return -1;
    }

    public void c(int i2) {
        this.t = true;
        this.v = i2;
    }

    public void c(boolean z2) {
        this.x = z2;
    }

    public void a(boolean z2) {
        for (a a2 : this.j) {
            s.a(a2.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public void a(androidx.appcompat.view.menu.v.a aVar) {
        this.y = aVar;
    }

    public boolean a(D d2) {
        for (a aVar : this.j) {
            if (d2 == aVar.b) {
                aVar.a().requestFocus();
                return true;
            }
        }
        if (!d2.hasVisibleItems()) {
            return false;
        }
        a((l) d2);
        androidx.appcompat.view.menu.v.a aVar2 = this.y;
        if (aVar2 != null) {
            aVar2.a(d2);
        }
        return true;
    }

    public void a(l lVar, boolean z2) {
        int c2 = c(lVar);
        if (c2 >= 0) {
            int i2 = c2 + 1;
            if (i2 < this.j.size()) {
                ((a) this.j.get(i2)).b.a(false);
            }
            a aVar = (a) this.j.remove(c2);
            aVar.b.b((v) this);
            if (this.B) {
                aVar.a.b(null);
                aVar.a.a(0);
            }
            aVar.a.dismiss();
            int size = this.j.size();
            if (size > 0) {
                this.r = ((a) this.j.get(size - 1)).c;
            } else {
                this.r = i();
            }
            if (size == 0) {
                dismiss();
                androidx.appcompat.view.menu.v.a aVar2 = this.y;
                if (aVar2 != null) {
                    aVar2.a(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.z.removeGlobalOnLayoutListener(this.k);
                    }
                    this.z = null;
                }
                this.q.removeOnAttachStateChangeListener(this.l);
                this.A.onDismiss();
            } else if (z2) {
                ((a) this.j.get(0)).b.a(false);
            }
        }
    }

    public void a(int i2) {
        if (this.n != i2) {
            this.n = i2;
            this.o = C0287Zb.a(i2, C1778vc.l(this.p));
        }
    }

    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = C0287Zb.a(this.n, C1778vc.l(this.p));
        }
    }

    public boolean d() {
        return this.j.size() > 0 && ((a) this.j.get(0)).a.d();
    }

    public void a(OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }
}

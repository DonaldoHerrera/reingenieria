package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.G.e;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.List;

public class LinearLayoutManager extends i implements e, androidx.recyclerview.widget.RecyclerView.r.b {
    int A;
    int B;
    private boolean C;
    SavedState D;
    final a E;
    private final b F;
    private int G;
    int s;
    private c t;
    T u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new L();
        int a;
        int b;
        boolean c;

        public SavedState() {
        }

        /* access modifiers changed from: 0000 */
        public boolean a() {
            return this.a >= 0;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            this.a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.c = z;
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
            this.c = savedState.c;
        }
    }

    static class a {
        T a;
        int b;
        int c;
        boolean d;
        boolean e;

        a() {
            b();
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            int i;
            if (this.d) {
                i = this.a.b();
            } else {
                i = this.a.f();
            }
            this.c = i;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        public boolean a(View view, s sVar) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return !layoutParams.c() && layoutParams.a() >= 0 && layoutParams.a() < sVar.a();
        }

        public void b(View view, int i) {
            int h = this.a.h();
            if (h >= 0) {
                a(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int b2 = (this.a.b() - h) - this.a.a(view);
                this.c = this.a.b() - b2;
                if (b2 > 0) {
                    int b3 = this.c - this.a.b(view);
                    int f = this.a.f();
                    int min = b3 - (f + Math.min(this.a.d(view) - f, 0));
                    if (min < 0) {
                        this.c += Math.min(b2, -min);
                    }
                }
            } else {
                int d2 = this.a.d(view);
                int f2 = d2 - this.a.f();
                this.c = d2;
                if (f2 > 0) {
                    int b4 = (this.a.b() - Math.min(0, (this.a.b() - h) - this.a.a(view))) - (d2 + this.a.b(view));
                    if (b4 < 0) {
                        this.c -= Math.min(f2, -b4);
                    }
                }
            }
        }

        public void a(View view, int i) {
            if (this.d) {
                this.c = this.a.a(view) + this.a.h();
            } else {
                this.c = this.a.d(view);
            }
            this.b = i;
        }
    }

    protected static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    static class c {
        boolean a = true;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h = 0;
        boolean i = false;
        int j;
        List<ViewHolder> k = null;
        boolean l;

        c() {
        }

        private View b() {
            int size = this.k.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((ViewHolder) this.k.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (!layoutParams.c() && this.d == layoutParams.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(s sVar) {
            int i2 = this.d;
            return i2 >= 0 && i2 < sVar.a();
        }

        /* access modifiers changed from: 0000 */
        public View a(o oVar) {
            if (this.k != null) {
                return b();
            }
            View d2 = oVar.d(this.d);
            this.d += this.e;
            return d2;
        }

        public void a() {
            a((View) null);
        }

        public void a(View view) {
            View b2 = b(view);
            if (b2 == null) {
                this.d = -1;
            } else {
                this.d = ((LayoutParams) b2.getLayoutParams()).a();
            }
        }

        public View b(View view) {
            int size = this.k.size();
            View view2 = null;
            int i2 = BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = ((ViewHolder) this.k.get(i3)).itemView;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.c()) {
                    int a2 = (layoutParams.a() - this.d) * this.e;
                    if (a2 >= 0 && a2 < i2) {
                        if (a2 == 0) {
                            return view3;
                        }
                        view2 = view3;
                        i2 = a2;
                    }
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private View L() {
        return d(this.x ? 0 : e() - 1);
    }

    private View M() {
        return d(this.x ? e() - 1 : 0);
    }

    private void N() {
        if (this.s == 1 || !J()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    private int j(s sVar) {
        if (e() == 0) {
            return 0;
        }
        F();
        T t2 = this.u;
        View b2 = b(!this.z, true);
        return ga.a(sVar, t2, b2, a(!this.z, true), this, this.z, this.x);
    }

    private View l(o oVar, s sVar) {
        if (this.x) {
            return g(oVar, sVar);
        }
        return i(oVar, sVar);
    }

    private View m(o oVar, s sVar) {
        if (this.x) {
            return i(oVar, sVar);
        }
        return g(oVar, sVar);
    }

    /* access modifiers changed from: 0000 */
    public boolean B() {
        return (i() == 1073741824 || s() == 1073741824 || !t()) ? false : true;
    }

    public boolean D() {
        return this.D == null && this.v == this.y;
    }

    /* access modifiers changed from: 0000 */
    public c E() {
        return new c();
    }

    /* access modifiers changed from: 0000 */
    public void F() {
        if (this.t == null) {
            this.t = E();
        }
    }

    public int G() {
        View a2 = a(0, e(), false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int H() {
        View a2 = a(e() - 1, -1, false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int I() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    public boolean J() {
        return k() == 1;
    }

    /* access modifiers changed from: 0000 */
    public boolean K() {
        return this.u.d() == 0 && this.u.a() == 0;
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            accessibilityEvent.setFromIndex(G());
            accessibilityEvent.setToIndex(H());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(o oVar, s sVar, a aVar, int i) {
    }

    public void b(RecyclerView recyclerView, o oVar) {
        super.b(recyclerView, oVar);
        if (this.C) {
            b(oVar);
            oVar.a();
        }
    }

    public LayoutParams c() {
        return new LayoutParams(-2, -2);
    }

    public int d(s sVar) {
        return i(sVar);
    }

    public void e(o oVar, s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.D == null && this.A == -1) && sVar.a() == 0) {
            b(oVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.a;
        }
        F();
        this.t.a = false;
        N();
        View g = g();
        if (!this.E.e || this.A != -1 || this.D != null) {
            this.E.b();
            a aVar = this.E;
            aVar.d = this.x ^ this.y;
            b(oVar, sVar, aVar);
            this.E.e = true;
        } else if (g != null && (this.u.d(g) >= this.u.b() || this.u.a(g) <= this.u.f())) {
            this.E.b(g, l(g));
        }
        int h = h(sVar);
        if (this.t.j >= 0) {
            i = h;
            h = 0;
        } else {
            i = 0;
        }
        int f = h + this.u.f();
        int c2 = i + this.u.c();
        if (sVar.d()) {
            int i10 = this.A;
            if (!(i10 == -1 || this.B == Integer.MIN_VALUE)) {
                View c3 = c(i10);
                if (c3 != null) {
                    if (this.x) {
                        i7 = this.u.b() - this.u.a(c3);
                        i8 = this.B;
                    } else {
                        i8 = this.u.d(c3) - this.u.f();
                        i7 = this.B;
                    }
                    int i11 = i7 - i8;
                    if (i11 > 0) {
                        f += i11;
                    } else {
                        c2 -= i11;
                    }
                }
            }
        }
        if (!this.E.d ? !this.x : this.x) {
            i9 = 1;
        }
        a(oVar, sVar, this.E, i9);
        a(oVar);
        this.t.l = K();
        this.t.i = sVar.d();
        a aVar2 = this.E;
        if (aVar2.d) {
            b(aVar2);
            c cVar = this.t;
            cVar.h = f;
            a(oVar, cVar, sVar, false);
            c cVar2 = this.t;
            i3 = cVar2.b;
            int i12 = cVar2.d;
            int i13 = cVar2.c;
            if (i13 > 0) {
                c2 += i13;
            }
            a(this.E);
            c cVar3 = this.t;
            cVar3.h = c2;
            cVar3.d += cVar3.e;
            a(oVar, cVar3, sVar, false);
            c cVar4 = this.t;
            i2 = cVar4.b;
            int i14 = cVar4.c;
            if (i14 > 0) {
                h(i12, i3);
                c cVar5 = this.t;
                cVar5.h = i14;
                a(oVar, cVar5, sVar, false);
                i3 = this.t.b;
            }
        } else {
            a(aVar2);
            c cVar6 = this.t;
            cVar6.h = c2;
            a(oVar, cVar6, sVar, false);
            c cVar7 = this.t;
            i2 = cVar7.b;
            int i15 = cVar7.d;
            int i16 = cVar7.c;
            if (i16 > 0) {
                f += i16;
            }
            b(this.E);
            c cVar8 = this.t;
            cVar8.h = f;
            cVar8.d += cVar8.e;
            a(oVar, cVar8, sVar, false);
            c cVar9 = this.t;
            i3 = cVar9.b;
            int i17 = cVar9.c;
            if (i17 > 0) {
                g(i15, i2);
                c cVar10 = this.t;
                cVar10.h = i17;
                a(oVar, cVar10, sVar, false);
                i2 = this.t.b;
            }
        }
        if (e() > 0) {
            if (this.x ^ this.y) {
                int a2 = a(i2, oVar, sVar, true);
                i5 = i3 + a2;
                i4 = i2 + a2;
                i6 = b(i5, oVar, sVar, false);
            } else {
                int b2 = b(i3, oVar, sVar, true);
                i5 = i3 + b2;
                i4 = i2 + b2;
                i6 = a(i4, oVar, sVar, false);
            }
            i3 = i5 + i6;
            i2 = i4 + i6;
        }
        b(oVar, sVar, i3, i2);
        if (!sVar.d()) {
            this.u.i();
        } else {
            this.E.b();
        }
        this.v = this.y;
    }

    public void f(int i, int i2) {
        this.A = i;
        this.B = i2;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        z();
    }

    public void g(s sVar) {
        super.g(sVar);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.b();
    }

    /* access modifiers changed from: protected */
    public int h(s sVar) {
        if (sVar.c()) {
            return this.u.g();
        }
        return 0;
    }

    public void i(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        z();
    }

    public void k(int i) {
        if (i == 0 || i == 1) {
            a((String) null);
            if (i != this.s || this.u == null) {
                this.u = T.a(this, i);
                this.E.a = this.u;
                this.s = i;
                z();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean v() {
        return true;
    }

    public Parcelable y() {
        SavedState savedState = this.D;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (e() > 0) {
            F();
            boolean z2 = this.v ^ this.x;
            savedState2.c = z2;
            if (z2) {
                View L = L();
                savedState2.b = this.u.b() - this.u.a(L);
                savedState2.a = l(L);
            } else {
                View M = M();
                savedState2.a = l(M);
                savedState2.b = this.u.d(M) - this.u.f();
            }
        } else {
            savedState2.b();
        }
        return savedState2;
    }

    public LinearLayoutManager(Context context, int i, boolean z2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        k(i);
        a(z2);
    }

    public View c(int i) {
        int e = e();
        if (e == 0) {
            return null;
        }
        int l = i - l(d(0));
        if (l >= 0 && l < e) {
            View d = d(l);
            if (l(d) == i) {
                return d;
            }
        }
        return super.c(i);
    }

    private void h(int i, int i2) {
        this.t.c = i2 - this.u.f();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f = -1;
        cVar2.b = i2;
        cVar2.g = Integer.MIN_VALUE;
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.D = (SavedState) parcelable;
            z();
        }
    }

    public boolean b() {
        return this.s == 1;
    }

    private void g(int i, int i2) {
        this.t.c = this.u.b() - i2;
        this.t.e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private int i(s sVar) {
        if (e() == 0) {
            return 0;
        }
        F();
        T t2 = this.u;
        View b2 = b(!this.z, true);
        return ga.a(sVar, t2, b2, a(!this.z, true), this, this.z);
    }

    public void b(boolean z2) {
        a((String) null);
        if (this.y != z2) {
            this.y = z2;
            z();
        }
    }

    public int f(s sVar) {
        return k(sVar);
    }

    private View f(o oVar, s sVar) {
        return e(0, e());
    }

    public int c(s sVar) {
        return k(sVar);
    }

    /* access modifiers changed from: 0000 */
    public int j(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.s != 1 && J()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.s != 1 && J()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.s != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.s != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.s != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.s != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    private int k(s sVar) {
        if (e() == 0) {
            return 0;
        }
        F();
        T t2 = this.u;
        View b2 = b(!this.z, true);
        return ga.b(sVar, t2, b2, a(!this.z, true), this, this.z);
    }

    public boolean a() {
        return this.s == 0;
    }

    /* access modifiers changed from: 0000 */
    public int c(int i, o oVar, s sVar) {
        if (e() == 0 || i == 0) {
            return 0;
        }
        this.t.a = true;
        F();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, sVar);
        c cVar = this.t;
        int a2 = cVar.g + a(oVar, cVar, sVar, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.u.a(-i);
        this.t.j = i;
        return i;
    }

    private View h(o oVar, s sVar) {
        return e(e() - 1, -1);
    }

    public void a(boolean z2) {
        a((String) null);
        if (z2 != this.w) {
            this.w = z2;
            z();
        }
    }

    private void b(o oVar, s sVar, int i, int i2) {
        o oVar2 = oVar;
        s sVar2 = sVar;
        if (sVar.e() && e() != 0 && !sVar.d() && D()) {
            List<ViewHolder> f = oVar.f();
            int size = f.size();
            int l = l(d(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                ViewHolder viewHolder = (ViewHolder) f.get(i5);
                if (!viewHolder.isRemoved()) {
                    char c2 = 1;
                    if ((viewHolder.getLayoutPosition() < l) != this.x) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i3 += this.u.b(viewHolder.itemView);
                    } else {
                        i4 += this.u.b(viewHolder.itemView);
                    }
                }
            }
            this.t.k = f;
            if (i3 > 0) {
                h(l(M()), i);
                c cVar = this.t;
                cVar.h = i3;
                cVar.c = 0;
                cVar.a();
                a(oVar2, this.t, sVar2, false);
            }
            if (i4 > 0) {
                g(l(L()), i2);
                c cVar2 = this.t;
                cVar2.h = i4;
                cVar2.c = 0;
                cVar2.a();
                a(oVar2, this.t, sVar2, false);
            }
            this.t.k = null;
        }
    }

    private View g(o oVar, s sVar) {
        return a(oVar, sVar, 0, e(), sVar.a());
    }

    private View i(o oVar, s sVar) {
        return a(oVar, sVar, e() - 1, -1, sVar.a());
    }

    public void a(RecyclerView recyclerView, s sVar, int i) {
        M m = new M(recyclerView.getContext());
        m.c(i);
        b((r) m);
    }

    private View k(o oVar, s sVar) {
        if (this.x) {
            return h(oVar, sVar);
        }
        return f(oVar, sVar);
    }

    private View j(o oVar, s sVar) {
        if (this.x) {
            return f(oVar, sVar);
        }
        return h(oVar, sVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        androidx.recyclerview.widget.RecyclerView.i.b a2 = i.a(context, attributeSet, i, i2);
        k(a2.a);
        a(a2.c);
        b(a2.d);
    }

    public PointF a(int i) {
        if (e() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < l(d(0))) {
            z2 = true;
        }
        if (z2 != this.x) {
            i2 = -1;
        }
        if (this.s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    private boolean a(o oVar, s sVar, a aVar) {
        View view;
        int i;
        boolean z2 = false;
        if (e() == 0) {
            return false;
        }
        View g = g();
        if (g != null && aVar.a(g, sVar)) {
            aVar.b(g, l(g));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            if (aVar.d) {
                view = l(oVar, sVar);
            } else {
                view = m(oVar, sVar);
            }
            if (view == null) {
                return false;
            }
            aVar.a(view, l(view));
            if (!sVar.d() && D()) {
                if (this.u.d(view) >= this.u.b() || this.u.a(view) < this.u.f()) {
                    z2 = true;
                }
                if (z2) {
                    if (aVar.d) {
                        i = this.u.b();
                    } else {
                        i = this.u.f();
                    }
                    aVar.c = i;
                }
            }
            return true;
        }
    }

    private void b(o oVar, s sVar, a aVar) {
        if (!a(sVar, aVar) && !a(oVar, sVar, aVar)) {
            aVar.a();
            aVar.b = this.y ? sVar.a() - 1 : 0;
        }
    }

    private int b(int i, o oVar, s sVar, boolean z2) {
        int f = i - this.u.f();
        if (f <= 0) {
            return 0;
        }
        int i2 = -c(f, oVar, sVar);
        int i3 = i + i2;
        if (z2) {
            int f2 = i3 - this.u.f();
            if (f2 > 0) {
                this.u.a(-f2);
                i2 -= f2;
            }
        }
        return i2;
    }

    private boolean a(s sVar, a aVar) {
        int i;
        boolean z2 = false;
        if (!sVar.d()) {
            int i2 = this.A;
            if (i2 != -1) {
                if (i2 < 0 || i2 >= sVar.a()) {
                    this.A = -1;
                    this.B = Integer.MIN_VALUE;
                } else {
                    aVar.b = this.A;
                    SavedState savedState = this.D;
                    if (savedState != null && savedState.a()) {
                        aVar.d = this.D.c;
                        if (aVar.d) {
                            aVar.c = this.u.b() - this.D.b;
                        } else {
                            aVar.c = this.u.f() + this.D.b;
                        }
                        return true;
                    } else if (this.B == Integer.MIN_VALUE) {
                        View c2 = c(this.A);
                        if (c2 == null) {
                            if (e() > 0) {
                                if ((this.A < l(d(0))) == this.x) {
                                    z2 = true;
                                }
                                aVar.d = z2;
                            }
                            aVar.a();
                        } else if (this.u.b(c2) > this.u.g()) {
                            aVar.a();
                            return true;
                        } else if (this.u.d(c2) - this.u.f() < 0) {
                            aVar.c = this.u.f();
                            aVar.d = false;
                            return true;
                        } else if (this.u.b() - this.u.a(c2) < 0) {
                            aVar.c = this.u.b();
                            aVar.d = true;
                            return true;
                        } else {
                            if (aVar.d) {
                                i = this.u.a(c2) + this.u.h();
                            } else {
                                i = this.u.d(c2);
                            }
                            aVar.c = i;
                        }
                        return true;
                    } else {
                        boolean z3 = this.x;
                        aVar.d = z3;
                        if (z3) {
                            aVar.c = this.u.b() - this.B;
                        } else {
                            aVar.c = this.u.f() + this.B;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void b(a aVar) {
        h(aVar.b, aVar.c);
    }

    public int b(int i, o oVar, s sVar) {
        if (this.s == 0) {
            return 0;
        }
        return c(i, oVar, sVar);
    }

    public int b(s sVar) {
        return j(sVar);
    }

    private void b(o oVar, int i) {
        if (i >= 0) {
            int e = e();
            if (!this.x) {
                int i2 = 0;
                while (true) {
                    if (i2 >= e) {
                        break;
                    }
                    View d = d(i2);
                    if (this.u.a(d) > i || this.u.e(d) > i) {
                        a(oVar, 0, i2);
                    } else {
                        i2++;
                    }
                }
            } else {
                int i3 = e - 1;
                for (int i4 = i3; i4 >= 0; i4--) {
                    View d2 = d(i4);
                    if (this.u.a(d2) > i || this.u.e(d2) > i) {
                        a(oVar, i3, i4);
                        return;
                    }
                }
            }
        }
    }

    private View b(boolean z2, boolean z3) {
        if (this.x) {
            return a(e() - 1, -1, z2, z3);
        }
        return a(0, e(), z2, z3);
    }

    private int a(int i, o oVar, s sVar, boolean z2) {
        int b2 = this.u.b() - i;
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -c(-b2, oVar, sVar);
        int i3 = i + i2;
        if (z2) {
            int b3 = this.u.b() - i3;
            if (b3 > 0) {
                this.u.a(b3);
                return b3 + i2;
            }
        }
        return i2;
    }

    private void a(a aVar) {
        g(aVar.b, aVar.c);
    }

    public int a(int i, o oVar, s sVar) {
        if (this.s == 1) {
            return 0;
        }
        return c(i, oVar, sVar);
    }

    public int a(s sVar) {
        return i(sVar);
    }

    private void a(int i, int i2, boolean z2, s sVar) {
        int i3;
        this.t.l = K();
        this.t.h = h(sVar);
        c cVar = this.t;
        cVar.f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.h += this.u.c();
            View L = L();
            c cVar2 = this.t;
            if (!this.x) {
                i4 = 1;
            }
            cVar2.e = i4;
            c cVar3 = this.t;
            int l = l(L);
            c cVar4 = this.t;
            cVar3.d = l + cVar4.e;
            cVar4.b = this.u.a(L);
            i3 = this.u.a(L) - this.u.b();
        } else {
            View M = M();
            this.t.h += this.u.f();
            c cVar5 = this.t;
            if (this.x) {
                i4 = 1;
            }
            cVar5.e = i4;
            c cVar6 = this.t;
            int l2 = l(M);
            c cVar7 = this.t;
            cVar6.d = l2 + cVar7.e;
            cVar7.b = this.u.d(M);
            i3 = (-this.u.d(M)) + this.u.f();
        }
        c cVar8 = this.t;
        cVar8.c = i2;
        if (z2) {
            cVar8.c -= i3;
        }
        this.t.g = i3;
    }

    public int e(s sVar) {
        return j(sVar);
    }

    /* access modifiers changed from: 0000 */
    public View e(int i, int i2) {
        int i3;
        int i4;
        View view;
        F();
        char c2 = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c2 == 0) {
            return d(i);
        }
        if (this.u.d(d(i)) < this.u.f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.s == 0) {
            view = this.e.a(i, i2, i4, i3);
        } else {
            view = this.f.a(i, i2, i4, i3);
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    public void a(s sVar, c cVar, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        int i = cVar.d;
        if (i >= 0 && i < sVar.a()) {
            aVar.a(i, Math.max(0, cVar.g));
        }
    }

    public void a(int i, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        boolean z2;
        int i2;
        SavedState savedState = this.D;
        int i3 = -1;
        if (savedState == null || !savedState.a()) {
            N();
            z2 = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z2 = savedState2.c;
            i2 = savedState2.a;
        }
        if (!z2) {
            i3 = 1;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < this.G && i4 >= 0 && i4 < i; i5++) {
            aVar.a(i4, 0);
            i4 += i3;
        }
    }

    public void a(int i, int i2, s sVar, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (e() != 0 && i != 0) {
            F();
            a(i > 0 ? 1 : -1, Math.abs(i), true, sVar);
            a(sVar, this.t, aVar);
        }
    }

    public void a(String str) {
        if (this.D == null) {
            super.a(str);
        }
    }

    private void a(o oVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, oVar);
                }
            } else {
                while (i > i2) {
                    a(i, oVar);
                    i--;
                }
            }
        }
    }

    private void a(o oVar, int i) {
        int e = e();
        if (i >= 0) {
            int a2 = this.u.a() - i;
            if (this.x) {
                for (int i2 = 0; i2 < e; i2++) {
                    View d = d(i2);
                    if (this.u.d(d) < a2 || this.u.f(d) < a2) {
                        a(oVar, 0, i2);
                        return;
                    }
                }
            } else {
                int i3 = e - 1;
                int i4 = i3;
                while (true) {
                    if (i4 < 0) {
                        break;
                    }
                    View d2 = d(i4);
                    if (this.u.d(d2) < a2 || this.u.f(d2) < a2) {
                        a(oVar, i3, i4);
                    } else {
                        i4--;
                    }
                }
                a(oVar, i3, i4);
            }
        }
    }

    private void a(o oVar, c cVar) {
        if (cVar.a && !cVar.l) {
            if (cVar.f == -1) {
                a(oVar, cVar.g);
            } else {
                b(oVar, cVar.g);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(o oVar, c cVar, s sVar, boolean z2) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            a(oVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.l && i3 <= 0) || !cVar.a(sVar)) {
                break;
            }
            bVar.a();
            a(oVar, sVar, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || this.t.k != null || !sVar.d()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.g = i6 + bVar.a;
                    int i7 = cVar.c;
                    if (i7 < 0) {
                        cVar.g += i7;
                    }
                    a(oVar, cVar);
                }
                if (z2 && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    /* access modifiers changed from: 0000 */
    public void a(o oVar, s sVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a2 = cVar.a(oVar);
        if (a2 == null) {
            bVar.b = true;
            return;
        }
        LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
        if (cVar.k == null) {
            if (this.x == (cVar.f == -1)) {
                b(a2);
            } else {
                b(a2, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                a(a2);
            } else {
                a(a2, 0);
            }
        }
        a(a2, 0, 0);
        bVar.a = this.u.b(a2);
        if (this.s == 1) {
            if (J()) {
                i5 = r() - p();
                i4 = i5 - this.u.c(a2);
            } else {
                i4 = o();
                i5 = this.u.c(a2) + i4;
            }
            if (cVar.f == -1) {
                int i6 = cVar.b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.a;
            } else {
                int i7 = cVar.b;
                i3 = i7;
                i2 = i5;
                i = bVar.a + i7;
            }
        } else {
            int q = q();
            int c2 = this.u.c(a2) + q;
            if (cVar.f == -1) {
                int i8 = cVar.b;
                i2 = i8;
                i3 = q;
                i = c2;
                i4 = i8 - bVar.a;
            } else {
                int i9 = cVar.b;
                i3 = q;
                i2 = bVar.a + i9;
                i = c2;
                i4 = i9;
            }
        }
        a(a2, i4, i3, i2, i);
        if (layoutParams.c() || layoutParams.b()) {
            bVar.c = true;
        }
        bVar.d = a2.hasFocusable();
    }

    private View a(boolean z2, boolean z3) {
        if (this.x) {
            return a(0, e(), z2, z3);
        }
        return a(e() - 1, -1, z2, z3);
    }

    /* access modifiers changed from: 0000 */
    public View a(o oVar, s sVar, int i, int i2, int i3) {
        F();
        int f = this.u.f();
        int b2 = this.u.b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d = d(i);
            int l = l(d);
            if (l >= 0 && l < i3) {
                if (((LayoutParams) d.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = d;
                    }
                } else if (this.u.d(d) < b2 && this.u.a(d) >= f) {
                    return d;
                } else {
                    if (view == null) {
                        view = d;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    public View a(int i, int i2, boolean z2, boolean z3) {
        F();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        if (this.s == 0) {
            return this.e.a(i, i2, i4, i3);
        }
        return this.f.a(i, i2, i4, i3);
    }

    public View a(View view, int i, o oVar, s sVar) {
        View view2;
        View view3;
        N();
        if (e() == 0) {
            return null;
        }
        int j = j(i);
        if (j == Integer.MIN_VALUE) {
            return null;
        }
        F();
        F();
        a(j, (int) (((float) this.u.g()) * 0.33333334f), false, sVar);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        a(oVar, cVar, sVar, true);
        if (j == -1) {
            view2 = k(oVar, sVar);
        } else {
            view2 = j(oVar, sVar);
        }
        if (j == -1) {
            view3 = M();
        } else {
            view3 = L();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void a(View view, View view2, int i, int i2) {
        a("Cannot drop a view during a scroll or layout calculation");
        F();
        N();
        int l = l(view);
        int l2 = l(view2);
        char c2 = l < l2 ? (char) 1 : 65535;
        if (this.x) {
            if (c2 == 1) {
                f(l2, this.u.b() - (this.u.d(view2) + this.u.b(view)));
            } else {
                f(l2, this.u.b() - this.u.a(view2));
            }
        } else if (c2 == 65535) {
            f(l2, this.u.d(view2));
        } else {
            f(l2, this.u.a(view2) - this.u.b(view));
        }
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    boolean H = false;
    int I = -1;
    int[] J;
    View[] K;
    final SparseIntArray L = new SparseIntArray();
    final SparseIntArray M = new SparseIntArray();
    b N = new a();
    final Rect O = new Rect();

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        int e = -1;
        int f = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static final class a extends b {
        public int b(int i) {
            return 1;
        }

        public int c(int i, int i2) {
            return i % i2;
        }
    }

    public static abstract class b {
        final SparseIntArray a = new SparseIntArray();
        private boolean b = false;

        public void a() {
            this.a.clear();
        }

        public abstract int b(int i);

        public int b(int i, int i2) {
            int b2 = b(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int b3 = b(i5);
                i3 += b3;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = b3;
                }
            }
            return i3 + b2 > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[RETURN] */
        public int c(int i, int i2) {
            int i3;
            int i4;
            int b2 = b(i);
            if (b2 == i2) {
                return 0;
            }
            if (this.b && this.a.size() > 0) {
                i4 = a(i);
                if (i4 >= 0) {
                    i3 = this.a.get(i4) + b(i4);
                    i4++;
                    if (i4 < i) {
                        int b3 = b(i4);
                        i3 += b3;
                        if (i3 == i2) {
                            i3 = 0;
                        } else if (i3 > i2) {
                            i3 = b3;
                        }
                        i4++;
                        if (i4 < i) {
                        }
                    }
                    if (b2 + i3 > i2) {
                        return i3;
                    }
                    return 0;
                }
            }
            i4 = 0;
            i3 = 0;
            if (i4 < i) {
            }
            if (b2 + i3 > i2) {
            }
        }

        /* access modifiers changed from: 0000 */
        public int a(int i, int i2) {
            if (!this.b) {
                return c(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = c(i, i2);
            this.a.put(i, c);
            return c;
        }

        /* access modifiers changed from: 0000 */
        public int a(int i) {
            int size = this.a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.a.size()) {
                return -1;
            }
            return this.a.keyAt(i4);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        l(i.a(context, attributeSet, i, i2).b);
    }

    private void O() {
        int e = e();
        for (int i = 0; i < e; i++) {
            LayoutParams layoutParams = (LayoutParams) d(i).getLayoutParams();
            int a2 = layoutParams.a();
            this.L.put(a2, layoutParams.f());
            this.M.put(a2, layoutParams.e());
        }
    }

    private void P() {
        this.L.clear();
        this.M.clear();
    }

    private void Q() {
        View[] viewArr = this.K;
        if (viewArr == null || viewArr.length != this.I) {
            this.K = new View[this.I];
        }
    }

    private void R() {
        int i;
        int i2;
        if (I() == 1) {
            i2 = r() - p();
            i = o();
        } else {
            i2 = h() - n();
            i = q();
        }
        m(i2 - i);
    }

    private void m(int i) {
        this.J = a(this.J, this.I, i);
    }

    public boolean D() {
        return this.D == null && !this.H;
    }

    public int a(o oVar, s sVar) {
        if (this.s == 1) {
            return this.I;
        }
        if (sVar.a() < 1) {
            return 0;
        }
        return a(oVar, sVar, sVar.a() - 1) + 1;
    }

    public void b(boolean z) {
        if (!z) {
            super.b(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams c() {
        if (this.s == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public void d(RecyclerView recyclerView) {
        this.N.a();
    }

    public void e(o oVar, s sVar) {
        if (sVar.d()) {
            O();
        }
        super.e(oVar, sVar);
        P();
    }

    public void g(s sVar) {
        super.g(sVar);
        this.H = false;
    }

    public void l(int i) {
        if (i != this.I) {
            this.H = true;
            if (i >= 1) {
                this.I = i;
                this.N.a();
                z();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public int b(o oVar, s sVar) {
        if (this.s == 0) {
            return this.I;
        }
        if (sVar.a() < 1) {
            return 0;
        }
        return a(oVar, sVar, sVar.a() - 1) + 1;
    }

    /* access modifiers changed from: 0000 */
    public int g(int i, int i2) {
        if (this.s != 1 || !J()) {
            int[] iArr = this.J;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.J;
        int i3 = this.I;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    private int c(o oVar, s sVar, int i) {
        if (!sVar.d()) {
            return this.N.b(i);
        }
        int i2 = this.L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = oVar.a(i);
        if (a2 != -1) {
            return this.N.b(a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    public void a(o oVar, s sVar, View view, Mc mc) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.a(view, mc);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int a2 = a(oVar, sVar, layoutParams2.a());
        if (this.s == 0) {
            mc.b((Object) c.a(layoutParams2.e(), layoutParams2.f(), a2, 1, this.I > 1 && layoutParams2.f() == this.I, false));
        } else {
            mc.b((Object) c.a(a2, 1, layoutParams2.e(), layoutParams2.f(), this.I > 1 && layoutParams2.f() == this.I, false));
        }
    }

    public void b(RecyclerView recyclerView, int i, int i2) {
        this.N.a();
    }

    public int b(int i, o oVar, s sVar) {
        R();
        Q();
        return super.b(i, oVar, sVar);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        l(i);
    }

    private void b(o oVar, s sVar, a aVar, int i) {
        boolean z = i == 1;
        int b2 = b(oVar, sVar, aVar.b);
        if (z) {
            while (b2 > 0) {
                int i2 = aVar.b;
                if (i2 > 0) {
                    aVar.b = i2 - 1;
                    b2 = b(oVar, sVar, aVar.b);
                } else {
                    return;
                }
            }
            return;
        }
        int a2 = sVar.a() - 1;
        int i3 = aVar.b;
        while (i3 < a2) {
            int i4 = i3 + 1;
            int b3 = b(oVar, sVar, i4);
            if (b3 <= b2) {
                break;
            }
            i3 = i4;
            b2 = b3;
        }
        aVar.b = i3;
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        this.N.a();
    }

    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.N.a();
    }

    private int b(o oVar, s sVar, int i) {
        if (!sVar.d()) {
            return this.N.a(i, this.I);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = oVar.a(i);
        if (a2 != -1) {
            return this.N.a(a2, this.I);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.N.a();
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public boolean a(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    private void b(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.b;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int g = g(layoutParams.e, layoutParams.f);
        if (this.s == 1) {
            i2 = i.a(g, i, i5, layoutParams.width, false);
            i3 = i.a(this.u.g(), i(), i4, layoutParams.height, true);
        } else {
            int a2 = i.a(g, i, i4, layoutParams.height, false);
            int a3 = i.a(this.u.g(), s(), i5, layoutParams.width, true);
            i3 = a2;
            i2 = a3;
        }
        a(view, i2, i3, z);
    }

    public void a(b bVar) {
        this.N = bVar;
    }

    public void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.J == null) {
            super.a(rect, i, i2);
        }
        int o = o() + p();
        int q = q() + n();
        if (this.s == 1) {
            i4 = i.a(i2, rect.height() + q, l());
            int[] iArr = this.J;
            i3 = i.a(i, iArr[iArr.length - 1] + o, m());
        } else {
            i3 = i.a(i, rect.width() + o, m());
            int[] iArr2 = this.J;
            i4 = i.a(i2, iArr2[iArr2.length - 1] + q, l());
        }
        c(i3, i4);
    }

    static int[] a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    public void a(o oVar, s sVar, a aVar, int i) {
        super.a(oVar, sVar, aVar, i);
        R();
        if (sVar.a() > 0 && !sVar.d()) {
            b(oVar, sVar, aVar, i);
        }
        Q();
    }

    public int a(int i, o oVar, s sVar) {
        R();
        Q();
        return super.a(i, oVar, sVar);
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
            if (l >= 0 && l < i3 && b(oVar, sVar, l) == 0) {
                if (((androidx.recyclerview.widget.RecyclerView.LayoutParams) d.getLayoutParams()).c()) {
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

    private int a(o oVar, s sVar, int i) {
        if (!sVar.d()) {
            return this.N.b(i, this.I);
        }
        int a2 = oVar.a(i);
        if (a2 != -1) {
            return this.N.b(a2, this.I);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public void a(s sVar, c cVar, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        int i = this.I;
        for (int i2 = 0; i2 < this.I && cVar.a(sVar) && i > 0; i2++) {
            int i3 = cVar.d;
            aVar.a(i3, Math.max(0, cVar.g));
            i -= this.N.b(i3);
            cVar.d += cVar.e;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(o oVar, s sVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        o oVar2 = oVar;
        s sVar2 = sVar;
        c cVar2 = cVar;
        b bVar2 = bVar;
        int e = this.u.e();
        boolean z2 = e != 1073741824;
        int i9 = e() > 0 ? this.J[this.I] : 0;
        if (z2) {
            R();
        }
        boolean z3 = cVar2.e == 1;
        int i10 = this.I;
        if (!z3) {
            i10 = b(oVar2, sVar2, cVar2.d) + c(oVar2, sVar2, cVar2.d);
        }
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.I && cVar2.a(sVar2) && i10 > 0) {
            int i13 = cVar2.d;
            int c = c(oVar2, sVar2, i13);
            if (c <= this.I) {
                i10 -= c;
                if (i10 < 0) {
                    break;
                }
                View a2 = cVar2.a(oVar2);
                if (a2 == null) {
                    break;
                }
                i11 += c;
                this.K[i12] = a2;
                i12++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i13);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.I);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i12 == 0) {
            bVar2.b = true;
            return;
        }
        float f = 0.0f;
        int i14 = i12;
        a(oVar, sVar, i12, i11, z3);
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            View view = this.K[i16];
            if (cVar2.k != null) {
                z = false;
                if (z3) {
                    a(view);
                } else {
                    a(view, 0);
                }
            } else if (z3) {
                b(view);
                z = false;
            } else {
                z = false;
                b(view, 0);
            }
            a(view, this.O);
            b(view, e, z);
            int b2 = this.u.b(view);
            if (b2 > i15) {
                i15 = b2;
            }
            float c2 = (((float) this.u.c(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f);
            if (c2 > f) {
                f = c2;
            }
        }
        if (z2) {
            a(f, i9);
            i15 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                View view2 = this.K[i17];
                b(view2, 1073741824, true);
                int b3 = this.u.b(view2);
                if (b3 > i15) {
                    i15 = b3;
                }
            }
        }
        for (int i18 = 0; i18 < i14; i18++) {
            View view3 = this.K[i18];
            if (this.u.b(view3) != i15) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.b;
                int i19 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i20 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int g = g(layoutParams.e, layoutParams.f);
                if (this.s == 1) {
                    i8 = i.a(g, 1073741824, i20, layoutParams.width, false);
                    i7 = MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    i7 = i.a(g, 1073741824, i19, layoutParams.height, false);
                    i8 = makeMeasureSpec;
                }
                a(view3, i8, i7, true);
            }
        }
        int i21 = 0;
        bVar2.a = i15;
        if (this.s == 1) {
            if (cVar2.f == -1) {
                int i22 = cVar2.b;
                i = i22;
                i2 = i22 - i15;
            } else {
                int i23 = cVar2.b;
                i2 = i23;
                i = i15 + i23;
            }
            i4 = 0;
            i3 = 0;
        } else if (cVar2.f == -1) {
            int i24 = cVar2.b;
            i2 = 0;
            i = 0;
            int i25 = i24 - i15;
            i3 = i24;
            i4 = i25;
        } else {
            i4 = cVar2.b;
            i3 = i15 + i4;
            i2 = 0;
            i = 0;
        }
        while (i21 < i14) {
            View view4 = this.K[i21];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.s != 1) {
                i2 = q() + this.J[layoutParams2.e];
                i = this.u.c(view4) + i2;
            } else if (J()) {
                int o = o() + this.J[this.I - layoutParams2.e];
                i5 = o;
                i6 = o - this.u.c(view4);
                int i26 = i2;
                int i27 = i;
                a(view4, i6, i26, i5, i27);
                if (!layoutParams2.c() || layoutParams2.b()) {
                    bVar2.c = true;
                }
                bVar2.d |= view4.hasFocusable();
                i21++;
                i4 = i6;
                i2 = i26;
                i3 = i5;
                i = i27;
            } else {
                i4 = o() + this.J[layoutParams2.e];
                i3 = this.u.c(view4) + i4;
            }
            i6 = i4;
            i5 = i3;
            int i262 = i2;
            int i272 = i;
            a(view4, i6, i262, i5, i272);
            if (!layoutParams2.c()) {
            }
            bVar2.c = true;
            bVar2.d |= view4.hasFocusable();
            i21++;
            i4 = i6;
            i2 = i262;
            i3 = i5;
            i = i272;
        }
        Arrays.fill(this.K, null);
    }

    private void a(float f, int i) {
        m(Math.max(Math.round(f * ((float) this.I)), i));
    }

    private void a(View view, int i, int i2, boolean z) {
        boolean z2;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = b(view, i, i2, layoutParams);
        } else {
            z2 = a(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private void a(o oVar, s sVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
        }
        while (i4 != i6) {
            View view = this.K[i4];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f = c(oVar, sVar, l(view));
            layoutParams.e = i5;
            i5 += layoutParams.f;
            i4 += i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f7, code lost:
        if (r13 == r11) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0105  */
    public View a(View view, int i, o oVar, s sVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        View view2;
        View view3;
        int i6;
        int i7;
        int i8;
        boolean z;
        o oVar2 = oVar;
        s sVar2 = sVar;
        View c = c(view);
        View view4 = null;
        if (c == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
        int i9 = layoutParams.e;
        int i10 = layoutParams.f + i9;
        if (super.a(view, i, oVar, sVar) == null) {
            return null;
        }
        if ((j(i) == 1) != this.x) {
            i4 = e() - 1;
            i3 = -1;
            i2 = -1;
        } else {
            i3 = e();
            i4 = 0;
            i2 = 1;
        }
        boolean z2 = this.s == 1 && J();
        int a2 = a(oVar2, sVar2, i4);
        View view5 = null;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (i4 != i3) {
            int a3 = a(oVar2, sVar2, i4);
            View d = d(i4);
            if (d == c) {
                break;
            }
            if (!d.hasFocusable() || a3 == a2) {
                LayoutParams layoutParams2 = (LayoutParams) d.getLayoutParams();
                int i15 = layoutParams2.e;
                view2 = c;
                int i16 = layoutParams2.f + i15;
                if (d.hasFocusable() && i15 == i9 && i16 == i10) {
                    return d;
                }
                if ((!d.hasFocusable() || view4 != null) && (d.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i16, i10) - Math.max(i15, i9);
                    if (d.hasFocusable()) {
                        if (min <= i12) {
                            if (min == i12) {
                            }
                        }
                        i6 = i11;
                    } else if (view4 == null) {
                        i6 = i11;
                        i5 = i3;
                        z = true;
                        if (a(d, false, true)) {
                            i8 = i13;
                            if (min > i8) {
                                i7 = i14;
                                if (z) {
                                    if (d.hasFocusable()) {
                                        i12 = Math.min(i16, i10) - Math.max(i15, i9);
                                        i13 = i8;
                                        i14 = i7;
                                        view5 = view3;
                                        i11 = layoutParams2.e;
                                        view4 = d;
                                    } else {
                                        view5 = d;
                                        i13 = Math.min(i16, i10) - Math.max(i15, i9);
                                        i14 = layoutParams2.e;
                                        i11 = i6;
                                    }
                                    i4 += i2;
                                    oVar2 = oVar;
                                    sVar2 = sVar;
                                    c = view2;
                                    i3 = i5;
                                }
                            } else {
                                if (min == i8) {
                                    i7 = i14;
                                    if (i15 <= i7) {
                                        z = false;
                                    }
                                }
                                i7 = i14;
                                z = false;
                                if (z) {
                                }
                            }
                        }
                        i8 = i13;
                        i7 = i14;
                        z = false;
                        if (z) {
                        }
                    }
                    i6 = i11;
                    i5 = i3;
                    i8 = i13;
                    i7 = i14;
                    z = false;
                    if (z) {
                    }
                } else {
                    i6 = i11;
                    view3 = view5;
                }
                i5 = i3;
                i8 = i13;
                i7 = i14;
                z = true;
                if (z) {
                }
            } else if (view4 != null) {
                break;
            } else {
                view2 = c;
                i6 = i11;
                view3 = view5;
                i5 = i3;
                i8 = i13;
                i7 = i14;
            }
            i13 = i8;
            i14 = i7;
            i11 = i6;
            view5 = view3;
            i4 += i2;
            oVar2 = oVar;
            sVar2 = sVar;
            c = view2;
            i3 = i5;
        }
        View view6 = view5;
        if (view4 == null) {
            view4 = view6;
        }
        return view4;
    }
}

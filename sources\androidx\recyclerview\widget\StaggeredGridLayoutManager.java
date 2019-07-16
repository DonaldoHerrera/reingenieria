package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends i implements androidx.recyclerview.widget.RecyclerView.r.b {
    boolean A = false;
    private BitSet B;
    int C = -1;
    int D = Integer.MIN_VALUE;
    LazySpanLookup E = new LazySpanLookup();
    private int F = 2;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private final Rect K = new Rect();
    private final a L = new a();
    private boolean M = false;
    private boolean N = true;
    private int[] O;
    private final Runnable P = new ka(this);
    private int s = -1;
    b[] t;
    T u;
    T v;
    private int w;
    private int x;
    private final K y;
    boolean z = false;

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {
        b e;
        boolean f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void a(boolean z) {
            this.f = z;
        }

        public final int e() {
            b bVar = this.e;
            if (bVar == null) {
                return -1;
            }
            return bVar.e;
        }

        public boolean f() {
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

    static class LazySpanLookup {
        int[] a;
        List<FullSpanItem> b;

        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new la();
            int a;
            int b;
            int[] c;
            boolean d;

            FullSpanItem(Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.c = new int[readInt];
                    parcel.readIntArray(this.c);
                }
            }

            /* access modifiers changed from: 0000 */
            public int a(int i) {
                int[] iArr = this.c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.a);
                sb.append(", mGapDir=");
                sb.append(this.b);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.d);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.c));
                sb.append('}');
                return sb.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.c);
            }

            FullSpanItem() {
            }
        }

        LazySpanLookup() {
        }

        private void c(int i, int i2) {
            List<FullSpanItem> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                    int i3 = fullSpanItem.a;
                    if (i3 >= i) {
                        fullSpanItem.a = i3 + i2;
                    }
                }
            }
        }

        private int g(int i) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem c = c(i);
            if (c != null) {
                this.b.remove(c);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((FullSpanItem) this.b.get(i2)).a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i2);
            this.b.remove(i2);
            return fullSpanItem.a;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, b bVar) {
            a(i);
            this.a[i] = bVar.e;
        }

        /* access modifiers changed from: 0000 */
        public int b(int i) {
            List<FullSpanItem> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.b.get(size)).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return e(i);
        }

        /* access modifiers changed from: 0000 */
        public int d(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: 0000 */
        public int e(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = g(i);
            if (g == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: 0000 */
        public int f(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        private void d(int i, int i2) {
            List<FullSpanItem> list = this.b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                    int i4 = fullSpanItem.a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.b.remove(size);
                        } else {
                            fullSpanItem.a = i4 - i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                this.a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.a, -1);
            } else if (i >= iArr.length) {
                this.a = new int[f(i)];
                System.arraycopy(iArr, 0, this.a, 0, iArr.length);
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        public FullSpanItem c(int i) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                if (fullSpanItem.a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void b(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                a(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                d(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                a(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                c(i, i2);
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.b.get(i);
                if (fullSpanItem2.a == fullSpanItem.a) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.a >= fullSpanItem.a) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        public FullSpanItem a(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i4);
                int i5 = fullSpanItem.a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.b == i3 || (z && fullSpanItem.d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new ma();
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List<FullSpanItem> g;
        boolean h;
        boolean i;
        boolean j;

        public SavedState() {
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            int i2 = this.c;
            if (i2 > 0) {
                this.d = new int[i2];
                parcel.readIntArray(this.d);
            }
            this.e = parcel.readInt();
            int i3 = this.e;
            if (i3 > 0) {
                this.f = new int[i3];
                parcel.readIntArray(this.f);
            }
            boolean z = false;
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.j = z;
            this.g = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }
    }

    class a {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        a() {
            b();
        }

        /* access modifiers changed from: 0000 */
        public void a(b[] bVarArr) {
            int length = bVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = bVarArr[i].b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            int i;
            if (this.c) {
                i = StaggeredGridLayoutManager.this.u.b();
            } else {
                i = StaggeredGridLayoutManager.this.u.f();
            }
            this.b = i;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.b() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.f() + i;
            }
        }
    }

    class b {
        ArrayList<View> a = new ArrayList<>();
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int d = 0;
        final int e;

        b(int i) {
            this.e = i;
        }

        /* access modifiers changed from: 0000 */
        public int a(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            a();
            return this.c;
        }

        /* access modifiers changed from: 0000 */
        public int b(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            b();
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public void c(View view) {
            LayoutParams b2 = b(view);
            b2.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        public void d(int i) {
            this.b = i;
            this.c = i;
        }

        public int e() {
            if (StaggeredGridLayoutManager.this.z) {
                return b(this.a.size() - 1, -1, false);
            }
            return b(0, this.a.size(), false);
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.z) {
                return a(0, this.a.size(), true);
            }
            return a(this.a.size() - 1, -1, true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.z) {
                return b(0, this.a.size(), false);
            }
            return b(this.a.size() - 1, -1, false);
        }

        public int h() {
            return this.d;
        }

        /* access modifiers changed from: 0000 */
        public int i() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            a();
            return this.c;
        }

        /* access modifiers changed from: 0000 */
        public int j() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            b();
            return this.b;
        }

        /* access modifiers changed from: 0000 */
        public void k() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        public void l() {
            int size = this.a.size();
            View view = (View) this.a.remove(size - 1);
            LayoutParams b2 = b(view);
            b2.e = null;
            if (b2.c() || b2.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.b(view);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        public void m() {
            View view = (View) this.a.remove(0);
            LayoutParams b2 = b(view);
            b2.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.b(view);
            }
            this.b = Integer.MIN_VALUE;
        }

        public int d() {
            if (StaggeredGridLayoutManager.this.z) {
                return a(this.a.size() - 1, -1, true);
            }
            return a(0, this.a.size(), true);
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            ArrayList<View> arrayList = this.a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams b2 = b(view);
            this.c = StaggeredGridLayoutManager.this.u.a(view);
            if (b2.f) {
                FullSpanItem c2 = StaggeredGridLayoutManager.this.E.c(b2.a());
                if (c2 != null && c2.b == 1) {
                    this.c += c2.a(this.e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            View view = (View) this.a.get(0);
            LayoutParams b2 = b(view);
            this.b = StaggeredGridLayoutManager.this.u.d(view);
            if (b2.f) {
                FullSpanItem c2 = StaggeredGridLayoutManager.this.E.c(b2.a());
                if (c2 != null && c2.b == -1) {
                    this.b -= c2.a(this.e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            this.a.clear();
            k();
            this.d = 0;
        }

        /* access modifiers changed from: 0000 */
        public void c(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(View view) {
            LayoutParams b2 = b(view);
            b2.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        public LayoutParams b(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        public int b(int i, int i2, boolean z) {
            return a(i, i2, z, true, false);
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = a(Integer.MIN_VALUE);
            } else {
                i2 = b(Integer.MIN_VALUE);
            }
            c();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.u.b()) && (z || i2 <= StaggeredGridLayoutManager.this.u.f())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.c = i2;
                    this.b = i2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public int a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f2 = StaggeredGridLayoutManager.this.u.f();
            int b2 = StaggeredGridLayoutManager.this.u.b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.a.get(i);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                int a2 = StaggeredGridLayoutManager.this.u.a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d2 < b2 : d2 <= b2;
                if (!z3 ? a2 > f2 : a2 >= f2) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.l(view);
                        }
                        if (d2 < f2 || a2 > b2) {
                            return StaggeredGridLayoutManager.this.l(view);
                        }
                    } else if (d2 >= f2 && a2 <= b2) {
                        return StaggeredGridLayoutManager.this.l(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        public int a(int i, int i2, boolean z) {
            return a(i, i2, false, false, z);
        }

        public View a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.i.b a2 = i.a(context, attributeSet, i, i2);
        j(a2.a);
        k(a2.b);
        c(a2.c);
        this.y = new K();
        O();
    }

    private void O() {
        this.u = T.a(this, this.w);
        this.v = T.a(this, 1 - this.w);
    }

    private void P() {
        if (this.v.d() != 1073741824) {
            int e = e();
            float f = 0.0f;
            for (int i = 0; i < e; i++) {
                View d = d(i);
                float b2 = (float) this.v.b(d);
                if (b2 >= f) {
                    if (((LayoutParams) d.getLayoutParams()).f()) {
                        b2 = (b2 * 1.0f) / ((float) this.s);
                    }
                    f = Math.max(f, b2);
                }
            }
            int i2 = this.x;
            int round = Math.round(f * ((float) this.s));
            if (this.v.d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.v.g());
            }
            l(round);
            if (this.x != i2) {
                for (int i3 = 0; i3 < e; i3++) {
                    View d2 = d(i3);
                    LayoutParams layoutParams = (LayoutParams) d2.getLayoutParams();
                    if (!layoutParams.f) {
                        if (!N() || this.w != 1) {
                            int i4 = layoutParams.e.e;
                            int i5 = this.x * i4;
                            int i6 = i4 * i2;
                            if (this.w == 1) {
                                d2.offsetLeftAndRight(i5 - i6);
                            } else {
                                d2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.s;
                            int i8 = i7 - 1;
                            int i9 = layoutParams.e.e;
                            d2.offsetLeftAndRight(((-(i8 - i9)) * this.x) - ((-((i7 - 1) - i9)) * i2));
                        }
                    }
                }
            }
        }
    }

    private void Q() {
        if (this.w == 1 || !N()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    private boolean a(b bVar) {
        if (this.A) {
            if (bVar.i() < this.u.b()) {
                ArrayList<View> arrayList = bVar.a;
                return !bVar.b((View) arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (bVar.j() > this.u.f()) {
            return !bVar.b((View) bVar.a.get(0)).f;
        }
        return false;
    }

    private int h(s sVar) {
        if (e() == 0) {
            return 0;
        }
        return ga.a(sVar, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int i(s sVar) {
        if (e() == 0) {
            return 0;
        }
        return ga.a(sVar, this.u, b(!this.N), a(!this.N), this, this.N, this.A);
    }

    private int m(int i) {
        int i2 = -1;
        if (e() == 0) {
            if (this.A) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < I()) == this.A) {
            i2 = 1;
        }
        return i2;
    }

    private int n(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.w != 1 && N()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.w != 1 && N()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.w != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.w != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.w != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.w != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    private FullSpanItem o(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.c = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.c[i2] = i - this.t[i2].a(i);
        }
        return fullSpanItem;
    }

    private FullSpanItem p(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.c = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            fullSpanItem.c[i2] = this.t[i2].b(i) - i;
        }
        return fullSpanItem;
    }

    private void q(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].c(view);
        }
    }

    private int r(int i) {
        for (int e = e() - 1; e >= 0; e--) {
            int l = l(d(e));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    private int s(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int t(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int u(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private boolean w(int i) {
        boolean z2 = true;
        if (this.w == 0) {
            if ((i == -1) == this.A) {
                z2 = false;
            }
            return z2;
        }
        if (((i == -1) == this.A) != N()) {
            z2 = false;
        }
        return z2;
    }

    private void x(int i) {
        K k = this.y;
        k.e = i;
        int i2 = 1;
        if (this.A != (i == -1)) {
            i2 = -1;
        }
        k.d = i2;
    }

    public boolean D() {
        return this.I == null;
    }

    /* access modifiers changed from: 0000 */
    public boolean E() {
        int a2 = this.t[0].a(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].a(Integer.MIN_VALUE) != a2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean F() {
        int b2 = this.t[0].b(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].b(Integer.MIN_VALUE) != b2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public boolean G() {
        int i;
        int i2;
        if (e() == 0 || this.F == 0 || !u()) {
            return false;
        }
        if (this.A) {
            i2 = J();
            i = I();
        } else {
            i2 = I();
            i = J();
        }
        if (i2 == 0 && L() != null) {
            this.E.a();
            A();
            z();
            return true;
        } else if (!this.M) {
            return false;
        } else {
            int i3 = this.A ? -1 : 1;
            int i4 = i + 1;
            FullSpanItem a2 = this.E.a(i2, i4, i3, true);
            if (a2 == null) {
                this.M = false;
                this.E.b(i4);
                return false;
            }
            FullSpanItem a3 = this.E.a(i2, a2.a, i3 * -1, true);
            if (a3 == null) {
                this.E.b(a2.a);
            } else {
                this.E.b(a3.a + 1);
            }
            A();
            z();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public int H() {
        View view;
        if (this.A) {
            view = a(true);
        } else {
            view = b(true);
        }
        if (view == null) {
            return -1;
        }
        return l(view);
    }

    /* access modifiers changed from: 0000 */
    public int I() {
        if (e() == 0) {
            return 0;
        }
        return l(d(0));
    }

    /* access modifiers changed from: 0000 */
    public int J() {
        int e = e();
        if (e == 0) {
            return 0;
        }
        return l(d(e - 1));
    }

    public int K() {
        return this.s;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    public View L() {
        int i;
        int e = e() - 1;
        BitSet bitSet = new BitSet(this.s);
        bitSet.set(0, this.s, true);
        int i2 = -1;
        char c = (this.w != 1 || !N()) ? (char) 65535 : 1;
        if (this.A) {
            i = -1;
        } else {
            i = e + 1;
            e = 0;
        }
        if (e < i) {
            i2 = 1;
        }
        while (e != i) {
            View d = d(e);
            LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
            if (bitSet.get(layoutParams.e.e)) {
                if (a(layoutParams.e)) {
                    return d;
                }
                bitSet.clear(layoutParams.e.e);
            }
            if (!layoutParams.f) {
                int i3 = e + i2;
                if (i3 != i) {
                    View d2 = d(i3);
                    if (this.A) {
                        int a2 = this.u.a(d);
                        int a3 = this.u.a(d2);
                        if (a2 < a3) {
                            return d;
                        }
                    } else {
                        int d3 = this.u.d(d);
                        int d4 = this.u.d(d2);
                        if (d3 > d4) {
                            return d;
                        }
                    }
                    boolean z2 = true;
                    if (z2) {
                        if ((layoutParams.e.e - ((LayoutParams) d2.getLayoutParams()).e.e < 0) != (c < 0)) {
                            return d;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            e += i2;
        }
        return null;
    }

    public void M() {
        this.E.a();
        z();
    }

    /* access modifiers changed from: 0000 */
    public boolean N() {
        return k() == 1;
    }

    public void b(RecyclerView recyclerView, o oVar) {
        super.b(recyclerView, oVar);
        a(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].c();
        }
        recyclerView.requestLayout();
    }

    public void c(boolean z2) {
        a((String) null);
        SavedState savedState = this.I;
        if (!(savedState == null || savedState.h == z2)) {
            savedState.h = z2;
        }
        this.z = z2;
        z();
    }

    public int d(s sVar) {
        return h(sVar);
    }

    public void e(o oVar, s sVar) {
        c(oVar, sVar, true);
    }

    public int f(s sVar) {
        return j(sVar);
    }

    public void g(int i) {
        if (i == 0) {
            G();
        }
    }

    public void j(int i) {
        if (i == 0 || i == 1) {
            a((String) null);
            if (i != this.w) {
                this.w = i;
                T t2 = this.u;
                this.u = this.v;
                this.v = t2;
                z();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void k(int i) {
        a((String) null);
        if (i != this.s) {
            M();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new b[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new b(i2);
            }
            z();
        }
    }

    /* access modifiers changed from: 0000 */
    public void l(int i) {
        this.x = i / this.s;
        this.J = MeasureSpec.makeMeasureSpec(i, this.v.d());
    }

    public boolean v() {
        return this.F != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    public Parcelable y() {
        int i;
        int i2;
        int i3;
        SavedState savedState = this.I;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.h = this.z;
        savedState2.i = this.G;
        savedState2.j = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup != null) {
            int[] iArr = lazySpanLookup.a;
            if (iArr != null) {
                savedState2.f = iArr;
                savedState2.e = savedState2.f.length;
                savedState2.g = lazySpanLookup.b;
                if (e() <= 0) {
                    if (this.G) {
                        i = J();
                    } else {
                        i = I();
                    }
                    savedState2.a = i;
                    savedState2.b = H();
                    int i4 = this.s;
                    savedState2.c = i4;
                    savedState2.d = new int[i4];
                    for (int i5 = 0; i5 < this.s; i5++) {
                        if (this.G) {
                            i2 = this.t[i5].a(Integer.MIN_VALUE);
                            if (i2 != Integer.MIN_VALUE) {
                                i3 = this.u.b();
                            } else {
                                savedState2.d[i5] = i2;
                            }
                        } else {
                            i2 = this.t[i5].b(Integer.MIN_VALUE);
                            if (i2 != Integer.MIN_VALUE) {
                                i3 = this.u.f();
                            } else {
                                savedState2.d[i5] = i2;
                            }
                        }
                        i2 -= i3;
                        savedState2.d[i5] = i2;
                    }
                } else {
                    savedState2.a = -1;
                    savedState2.b = -1;
                    savedState2.c = 0;
                }
                return savedState2;
            }
        }
        savedState2.e = 0;
        if (e() <= 0) {
        }
        return savedState2;
    }

    private int d(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    private int v(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    public int e(s sVar) {
        return i(sVar);
    }

    public void f(int i) {
        super.f(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c(i);
        }
    }

    public void g(s sVar) {
        super.g(sVar);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.b();
    }

    private int q(int i) {
        int e = e();
        for (int i2 = 0; i2 < e; i2++) {
            int l = l(d(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    public void e(int i) {
        super.e(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c(i);
        }
    }

    private void p(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    public void d(RecyclerView recyclerView) {
        this.E.a();
        z();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (G() != false) goto L_0x015b;
     */
    private void c(o oVar, s sVar, boolean z2) {
        a aVar = this.L;
        if (!(this.I == null && this.C == -1) && sVar.a() == 0) {
            b(oVar);
            aVar.b();
            return;
        }
        boolean z3 = true;
        boolean z4 = (aVar.e && this.C == -1 && this.I == null) ? false : true;
        if (z4) {
            aVar.b();
            if (this.I != null) {
                a(aVar);
            } else {
                Q();
                aVar.c = this.A;
            }
            b(sVar, aVar);
            aVar.e = true;
        }
        if (this.I == null && this.C == -1 && !(aVar.c == this.G && N() == this.H)) {
            this.E.a();
            aVar.d = true;
        }
        if (e() > 0) {
            SavedState savedState = this.I;
            if (savedState == null || savedState.c < 1) {
                if (aVar.d) {
                    for (int i = 0; i < this.s; i++) {
                        this.t[i].c();
                        int i2 = aVar.b;
                        if (i2 != Integer.MIN_VALUE) {
                            this.t[i].d(i2);
                        }
                    }
                } else if (z4 || this.L.f == null) {
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].a(this.A, aVar.b);
                    }
                    this.L.a(this.t);
                } else {
                    for (int i4 = 0; i4 < this.s; i4++) {
                        b bVar = this.t[i4];
                        bVar.c();
                        bVar.d(this.L.f[i4]);
                    }
                }
            }
        }
        a(oVar);
        this.y.a = false;
        this.M = false;
        l(this.v.g());
        b(aVar.a, sVar);
        if (aVar.c) {
            x(-1);
            a(oVar, this.y, sVar);
            x(1);
            K k = this.y;
            k.c = aVar.a + k.d;
            a(oVar, k, sVar);
        } else {
            x(1);
            a(oVar, this.y, sVar);
            x(-1);
            K k2 = this.y;
            k2.c = aVar.a + k2.d;
            a(oVar, k2, sVar);
        }
        P();
        if (e() > 0) {
            if (this.A) {
                a(oVar, sVar, true);
                b(oVar, sVar, false);
            } else {
                b(oVar, sVar, true);
                a(oVar, sVar, false);
            }
        }
        if (z2 && !sVar.d()) {
            if (this.F != 0 && e() > 0 && (this.M || L() != null)) {
                a(this.P);
            }
        }
        z3 = false;
        if (sVar.d()) {
            this.L.b();
        }
        this.G = aVar.c;
        this.H = N();
        if (z3) {
            this.L.b();
            c(oVar, sVar, false);
        }
    }

    private void e(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                a(this.t[i3], i, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(s sVar, a aVar) {
        if (!a(sVar, aVar) && !c(sVar, aVar)) {
            aVar.a();
            aVar.a = 0;
        }
    }

    public void i(int i) {
        SavedState savedState = this.I;
        if (!(savedState == null || savedState.a == i)) {
            savedState.a();
        }
        this.C = i;
        this.D = Integer.MIN_VALUE;
        z();
    }

    private int j(s sVar) {
        if (e() == 0) {
            return 0;
        }
        return ga.b(sVar, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    public void a(String str) {
        if (this.I == null) {
            super.a(str);
        }
    }

    public int[] b(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.s];
        } else if (iArr.length < this.s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.s);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.s; i++) {
            iArr[i] = this.t[i].g();
        }
        return iArr;
    }

    public void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int o = o() + p();
        int q = q() + n();
        if (this.w == 1) {
            i4 = i.a(i2, rect.height() + q, l());
            i3 = i.a(i, (this.x * this.s) + o, m());
        } else {
            i3 = i.a(i, rect.width() + o, m());
            i4 = i.a(i2, (this.x * this.s) + q, l());
        }
        c(i3, i4);
    }

    public int b(s sVar) {
        return i(sVar);
    }

    public int b(o oVar, s sVar) {
        if (this.w == 0) {
            return this.s;
        }
        return super.b(oVar, sVar);
    }

    /* access modifiers changed from: 0000 */
    public View b(boolean z2) {
        int f = this.u.f();
        int b2 = this.u.b();
        int e = e();
        View view = null;
        for (int i = 0; i < e; i++) {
            View d = d(i);
            int d2 = this.u.d(d);
            if (this.u.a(d) > f && d2 < b2) {
                if (d2 >= f || !z2) {
                    return d;
                }
                if (view == null) {
                    view = d;
                }
            }
        }
        return view;
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.w = i2;
        k(i);
        this.y = new K();
        O();
    }

    private void b(o oVar, s sVar, boolean z2) {
        int v2 = v(BaseClientBuilder.API_PRIORITY_OTHER);
        if (v2 != Integer.MAX_VALUE) {
            int f = v2 - this.u.f();
            if (f > 0) {
                int c = f - c(f, oVar, sVar);
                if (z2 && c > 0) {
                    this.u.a(-c);
                }
            }
        }
    }

    private void a(a aVar) {
        int i;
        SavedState savedState = this.I;
        int i2 = savedState.c;
        if (i2 > 0) {
            if (i2 == this.s) {
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].c();
                    SavedState savedState2 = this.I;
                    int i4 = savedState2.d[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.i) {
                            i = this.u.b();
                        } else {
                            i = this.u.f();
                        }
                        i4 += i;
                    }
                    this.t[i3].d(i4);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.a = savedState3.b;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.j;
        c(savedState4.h);
        Q();
        SavedState savedState5 = this.I;
        int i5 = savedState5.a;
        if (i5 != -1) {
            this.C = i5;
            aVar.c = savedState5.i;
        } else {
            aVar.c = this.A;
        }
        SavedState savedState6 = this.I;
        if (savedState6.e > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.a = savedState6.f;
            lazySpanLookup.b = savedState6.g;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    private void b(int i, s sVar) {
        int i2;
        int i3;
        K k = this.y;
        boolean z2 = false;
        k.b = 0;
        k.c = i;
        if (x()) {
            int b2 = sVar.b();
            if (b2 != -1) {
                if (this.A == (b2 < i)) {
                    i3 = this.u.g();
                    i2 = 0;
                    if (f()) {
                        this.y.f = this.u.f() - i2;
                        this.y.g = this.u.b() + i3;
                    } else {
                        this.y.g = this.u.a() + i3;
                        this.y.f = -i2;
                    }
                    K k2 = this.y;
                    k2.h = false;
                    k2.a = true;
                    if (this.u.d() == 0 && this.u.a() == 0) {
                        z2 = true;
                    }
                    k2.i = z2;
                }
                i2 = this.u.g();
                i3 = 0;
                if (f()) {
                }
                K k22 = this.y;
                k22.h = false;
                k22.a = true;
                z2 = true;
                k22.i = z2;
            }
        }
        i3 = 0;
        i2 = 0;
        if (f()) {
        }
        K k222 = this.y;
        k222.h = false;
        k222.a = true;
        z2 = true;
        k222.i = z2;
    }

    public void b(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 2);
    }

    private void b(o oVar, int i) {
        while (e() > 0) {
            View d = d(0);
            if (this.u.a(d) > i || this.u.e(d) > i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
            if (layoutParams.f) {
                int i2 = 0;
                while (i2 < this.s) {
                    if (this.t[i2].a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].m();
                }
            } else if (layoutParams.e.a.size() != 1) {
                layoutParams.e.m();
            } else {
                return;
            }
            a(d, oVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(s sVar, a aVar) {
        int i;
        int i2;
        boolean z2 = false;
        if (!sVar.d()) {
            int i3 = this.C;
            if (i3 != -1) {
                if (i3 < 0 || i3 >= sVar.a()) {
                    this.C = -1;
                    this.D = Integer.MIN_VALUE;
                } else {
                    SavedState savedState = this.I;
                    if (savedState == null || savedState.a == -1 || savedState.c < 1) {
                        View c = c(this.C);
                        if (c != null) {
                            if (this.A) {
                                i = J();
                            } else {
                                i = I();
                            }
                            aVar.a = i;
                            if (this.D != Integer.MIN_VALUE) {
                                if (aVar.c) {
                                    aVar.b = (this.u.b() - this.D) - this.u.a(c);
                                } else {
                                    aVar.b = (this.u.f() + this.D) - this.u.d(c);
                                }
                                return true;
                            } else if (this.u.b(c) > this.u.g()) {
                                if (aVar.c) {
                                    i2 = this.u.b();
                                } else {
                                    i2 = this.u.f();
                                }
                                aVar.b = i2;
                                return true;
                            } else {
                                int d = this.u.d(c) - this.u.f();
                                if (d < 0) {
                                    aVar.b = -d;
                                    return true;
                                }
                                int b2 = this.u.b() - this.u.a(c);
                                if (b2 < 0) {
                                    aVar.b = b2;
                                    return true;
                                }
                                aVar.b = Integer.MIN_VALUE;
                            }
                        } else {
                            aVar.a = this.C;
                            int i4 = this.D;
                            if (i4 == Integer.MIN_VALUE) {
                                if (m(aVar.a) == 1) {
                                    z2 = true;
                                }
                                aVar.c = z2;
                                aVar.a();
                            } else {
                                aVar.a(i4);
                            }
                            aVar.d = true;
                        }
                    } else {
                        aVar.b = Integer.MIN_VALUE;
                        aVar.a = this.C;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b() {
        return this.w == 1;
    }

    public int b(int i, o oVar, s sVar) {
        return c(i, oVar, sVar);
    }

    private boolean c(s sVar, a aVar) {
        int i;
        if (this.G) {
            i = r(sVar.a());
        } else {
            i = q(sVar.a());
        }
        aVar.a = i;
        aVar.b = Integer.MIN_VALUE;
        return true;
    }

    public int c(s sVar) {
        return j(sVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    private void c(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int J2 = this.A ? J() : I();
        if (i3 != 8) {
            i6 = i + i2;
        } else if (i < i2) {
            i6 = i2 + 1;
        } else {
            i4 = i + 1;
            i5 = i2;
            this.E.e(i5);
            if (i3 != 1) {
                this.E.a(i, i2);
            } else if (i3 == 2) {
                this.E.b(i, i2);
            } else if (i3 == 8) {
                this.E.b(i, 1);
                this.E.a(i2, 1);
            }
            if (i4 <= J2) {
                if (i5 <= (this.A ? I() : J())) {
                    z();
                }
                return;
            }
            return;
        }
        i4 = i6;
        i5 = i;
        this.E.e(i5);
        if (i3 != 1) {
        }
        if (i4 <= J2) {
        }
    }

    public int[] a(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.s];
        } else if (iArr.length < this.s) {
            StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.s);
            sb.append(", array size:");
            sb.append(iArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.s; i++) {
            iArr[i] = this.t[i].e();
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    public int c(int i, o oVar, s sVar) {
        if (e() == 0 || i == 0) {
            return 0;
        }
        a(i, sVar);
        int a2 = a(oVar, this.y, sVar);
        if (this.y.b >= a2) {
            i = i < 0 ? -a2 : a2;
        }
        this.u.a(-i);
        this.G = this.A;
        K k = this.y;
        k.b = 0;
        a(oVar, k);
        return i;
    }

    public int a(s sVar) {
        return h(sVar);
    }

    private void a(View view, LayoutParams layoutParams, boolean z2) {
        if (layoutParams.f) {
            if (this.w == 1) {
                a(view, this.J, i.a(h(), i(), q() + n(), layoutParams.height, true), z2);
            } else {
                a(view, i.a(r(), s(), o() + p(), layoutParams.width, true), this.J, z2);
            }
        } else if (this.w == 1) {
            a(view, i.a(this.x, s(), 0, layoutParams.width, false), i.a(h(), i(), q() + n(), layoutParams.height, true), z2);
        } else {
            a(view, i.a(r(), s(), o() + p(), layoutParams.width, true), i.a(this.x, i(), 0, layoutParams.height, false), z2);
        }
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutParams c() {
        if (this.w == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    private void a(View view, int i, int i2, boolean z2) {
        boolean z3;
        a(view, this.K);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.K;
        int d = d(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.K;
        int d2 = d(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z2) {
            z3 = b(view, d, d2, (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
        } else {
            z3 = a(view, d, d2, (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
        }
        if (z3) {
            view.measure(d, d2);
        }
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.I = (SavedState) parcelable;
            z();
        }
    }

    public void a(o oVar, s sVar, View view, Mc mc) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.a(view, mc);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.w == 0) {
            mc.b((Object) c.a(layoutParams2.e(), layoutParams2.f ? this.s : 1, -1, -1, layoutParams2.f, false));
        } else {
            mc.b((Object) c.a(-1, -1, layoutParams2.e(), layoutParams2.f ? this.s : 1, layoutParams2.f, false));
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            View b2 = b(false);
            View a2 = a(false);
            if (b2 != null && a2 != null) {
                int l = l(b2);
                int l2 = l(a2);
                if (l < l2) {
                    accessibilityEvent.setFromIndex(l);
                    accessibilityEvent.setToIndex(l2);
                    return;
                }
                accessibilityEvent.setFromIndex(l2);
                accessibilityEvent.setToIndex(l);
            }
        }
    }

    public int a(o oVar, s sVar) {
        if (this.w == 1) {
            return this.s;
        }
        return super.a(oVar, sVar);
    }

    /* access modifiers changed from: 0000 */
    public View a(boolean z2) {
        int f = this.u.f();
        int b2 = this.u.b();
        View view = null;
        for (int e = e() - 1; e >= 0; e--) {
            View d = d(e);
            int d2 = this.u.d(d);
            int a2 = this.u.a(d);
            if (a2 > f && d2 < b2) {
                if (a2 <= b2 || !z2) {
                    return d;
                }
                if (view == null) {
                    view = d;
                }
            }
        }
        return view;
    }

    private void a(o oVar, s sVar, boolean z2) {
        int s2 = s(Integer.MIN_VALUE);
        if (s2 != Integer.MIN_VALUE) {
            int b2 = this.u.b() - s2;
            if (b2 > 0) {
                int i = b2 - (-c(-b2, oVar, sVar));
                if (z2 && i > 0) {
                    this.u.a(i);
                }
            }
        }
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 1);
    }

    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        c(i, i2, 8);
    }

    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        c(i, i2, 4);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [boolean, int]
  assigns: []
  uses: [boolean, int, ?[int, short, byte, char]]
  mth insns count: 222
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    private int a(o oVar, K k, s sVar) {
        int i;
        int i2;
        int i3;
        b bVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        o oVar2 = oVar;
        K k2 = k;
        ? r9 = 0;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            i = k2.e == 1 ? BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE;
        } else {
            if (k2.e == 1) {
                i12 = k2.g + k2.b;
            } else {
                i12 = k2.f - k2.b;
            }
            i = i12;
        }
        e(k2.e, i);
        if (this.A) {
            i2 = this.u.b();
        } else {
            i2 = this.u.f();
        }
        int i13 = i2;
        boolean z3 = false;
        ? r92 = r9;
        while (k.a(sVar) && (this.y.i || !this.B.isEmpty())) {
            View a2 = k2.a(oVar2);
            LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
            int a3 = layoutParams.a();
            int d = this.E.d(a3);
            boolean z4 = d == -1;
            if (z4) {
                bVar = layoutParams.f ? this.t[r92] : a(k2);
                this.E.a(a3, bVar);
            } else {
                bVar = this.t[d];
            }
            b bVar2 = bVar;
            layoutParams.e = bVar2;
            if (k2.e == 1) {
                b(a2);
            } else {
                b(a2, (int) r92);
            }
            a(a2, layoutParams, (boolean) r92);
            if (k2.e == 1) {
                if (layoutParams.f) {
                    i11 = s(i13);
                } else {
                    i11 = bVar2.a(i13);
                }
                int b2 = this.u.b(a2) + i11;
                if (z4 && layoutParams.f) {
                    FullSpanItem o = o(i11);
                    o.b = -1;
                    o.a = a3;
                    this.E.a(o);
                }
                i4 = b2;
                i5 = i11;
            } else {
                if (layoutParams.f) {
                    i10 = v(i13);
                } else {
                    i10 = bVar2.b(i13);
                }
                i5 = i10 - this.u.b(a2);
                if (z4 && layoutParams.f) {
                    FullSpanItem p = p(i10);
                    p.b = 1;
                    p.a = a3;
                    this.E.a(p);
                }
                i4 = i10;
            }
            if (layoutParams.f && k2.d == -1) {
                if (z4) {
                    this.M = true;
                } else {
                    if (k2.e == 1) {
                        z2 = E();
                    } else {
                        z2 = F();
                    }
                    if (!z2) {
                        FullSpanItem c = this.E.c(a3);
                        if (c != null) {
                            c.d = true;
                        }
                        this.M = true;
                    }
                }
            }
            a(a2, layoutParams, k2);
            if (!N() || this.w != 1) {
                if (layoutParams.f) {
                    i8 = this.v.f();
                } else {
                    i8 = (bVar2.e * this.x) + this.v.f();
                }
                i7 = i8;
                i6 = this.v.b(a2) + i8;
            } else {
                if (layoutParams.f) {
                    i9 = this.v.b();
                } else {
                    i9 = this.v.b() - (((this.s - 1) - bVar2.e) * this.x);
                }
                i6 = i9;
                i7 = i9 - this.v.b(a2);
            }
            if (this.w == 1) {
                a(a2, i7, i5, i6, i4);
            } else {
                a(a2, i5, i7, i4, i6);
            }
            if (layoutParams.f) {
                e(this.y.e, i);
            } else {
                a(bVar2, this.y.e, i);
            }
            a(oVar2, this.y);
            if (this.y.h && a2.hasFocusable()) {
                if (layoutParams.f) {
                    this.B.clear();
                } else {
                    this.B.set(bVar2.e, false);
                    z3 = true;
                    r92 = 0;
                }
            }
            z3 = true;
            r92 = 0;
        }
        if (!z3) {
            a(oVar2, this.y);
        }
        if (this.y.e == -1) {
            i3 = this.u.f() - v(this.u.f());
        } else {
            i3 = s(this.u.b()) - this.u.b();
        }
        if (i3 > 0) {
            return Math.min(k2.b, i3);
        }
        return 0;
    }

    private void a(View view, LayoutParams layoutParams, K k) {
        if (k.e == 1) {
            if (layoutParams.f) {
                p(view);
            } else {
                layoutParams.e.a(view);
            }
        } else if (layoutParams.f) {
            q(view);
        } else {
            layoutParams.e.c(view);
        }
    }

    private void a(o oVar, K k) {
        int i;
        int i2;
        if (k.a && !k.i) {
            if (k.b == 0) {
                if (k.e == -1) {
                    a(oVar, k.g);
                } else {
                    b(oVar, k.f);
                }
            } else if (k.e == -1) {
                int i3 = k.f;
                int t2 = i3 - t(i3);
                if (t2 < 0) {
                    i2 = k.g;
                } else {
                    i2 = k.g - Math.min(t2, k.b);
                }
                a(oVar, i2);
            } else {
                int u2 = u(k.g) - k.g;
                if (u2 < 0) {
                    i = k.f;
                } else {
                    i = Math.min(u2, k.b) + k.f;
                }
                b(oVar, i);
            }
        }
    }

    private void a(b bVar, int i, int i2) {
        int h = bVar.h();
        if (i == -1) {
            if (bVar.j() + h <= i2) {
                this.B.set(bVar.e, false);
            }
        } else if (bVar.i() - h >= i2) {
            this.B.set(bVar.e, false);
        }
    }

    private void a(o oVar, int i) {
        for (int e = e() - 1; e >= 0; e--) {
            View d = d(e);
            if (this.u.d(d) < i || this.u.f(d) < i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
            if (layoutParams.f) {
                int i2 = 0;
                while (i2 < this.s) {
                    if (this.t[i2].a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].l();
                }
            } else if (layoutParams.e.a.size() != 1) {
                layoutParams.e.l();
            } else {
                return;
            }
            a(d, oVar);
        }
    }

    private b a(K k) {
        int i;
        int i2;
        int i3 = -1;
        if (w(k.e)) {
            i2 = this.s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.s;
            i = 1;
        }
        b bVar = null;
        if (k.e == 1) {
            int i4 = BaseClientBuilder.API_PRIORITY_OTHER;
            int f = this.u.f();
            while (i2 != i3) {
                b bVar2 = this.t[i2];
                int a2 = bVar2.a(f);
                if (a2 < i4) {
                    bVar = bVar2;
                    i4 = a2;
                }
                i2 += i;
            }
            return bVar;
        }
        int i5 = Integer.MIN_VALUE;
        int b2 = this.u.b();
        while (i2 != i3) {
            b bVar3 = this.t[i2];
            int b3 = bVar3.b(b2);
            if (b3 > i5) {
                bVar = bVar3;
                i5 = b3;
            }
            i2 += i;
        }
        return bVar;
    }

    public boolean a() {
        return this.w == 0;
    }

    public int a(int i, o oVar, s sVar) {
        return c(i, oVar, sVar);
    }

    public PointF a(int i) {
        int m = m(i);
        PointF pointF = new PointF();
        if (m == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = (float) m;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) m;
        }
        return pointF;
    }

    public void a(RecyclerView recyclerView, s sVar, int i) {
        M m = new M(recyclerView.getContext());
        m.c(i);
        b((r) m);
    }

    public void a(int i, int i2, s sVar, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        int i3;
        int i4;
        if (this.w != 0) {
            i = i2;
        }
        if (e() != 0 && i != 0) {
            a(i, sVar);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.s; i6++) {
                K k = this.y;
                if (k.d == -1) {
                    i4 = k.f;
                    i3 = this.t[i6].b(i4);
                } else {
                    i4 = this.t[i6].a(k.g);
                    i3 = this.y.g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.y.a(sVar); i8++) {
                aVar.a(this.y.c, this.O[i8]);
                K k2 = this.y;
                k2.c += k2.d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, s sVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = J();
            i2 = 1;
        } else {
            i3 = I();
            i2 = -1;
        }
        this.y.a = true;
        b(i3, sVar);
        x(i2);
        K k = this.y;
        k.c = i3 + k.d;
        k.b = Math.abs(i);
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

    public View a(View view, int i, o oVar, s sVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (e() == 0) {
            return null;
        }
        View c = c(view);
        if (c == null) {
            return null;
        }
        Q();
        int n = n(i);
        if (n == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
        boolean z2 = layoutParams.f;
        b bVar = layoutParams.e;
        if (n == 1) {
            i2 = J();
        } else {
            i2 = I();
        }
        b(i2, sVar);
        x(n);
        K k = this.y;
        k.c = k.d + i2;
        k.b = (int) (((float) this.u.g()) * 0.33333334f);
        K k2 = this.y;
        k2.h = true;
        k2.a = false;
        a(oVar, k2, sVar);
        this.G = this.A;
        if (!z2) {
            View a2 = bVar.a(i2, n);
            if (!(a2 == null || a2 == c)) {
                return a2;
            }
        }
        if (w(n)) {
            for (int i6 = this.s - 1; i6 >= 0; i6--) {
                View a3 = this.t[i6].a(i2, n);
                if (a3 != null && a3 != c) {
                    return a3;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.s; i7++) {
                View a4 = this.t[i7].a(i2, n);
                if (a4 != null && a4 != c) {
                    return a4;
                }
            }
        }
        boolean z3 = (this.z ^ true) == (n == -1);
        if (!z2) {
            if (z3) {
                i5 = bVar.d();
            } else {
                i5 = bVar.f();
            }
            View c2 = c(i5);
            if (!(c2 == null || c2 == c)) {
                return c2;
            }
        }
        if (w(n)) {
            for (int i8 = this.s - 1; i8 >= 0; i8--) {
                if (i8 != bVar.e) {
                    if (z3) {
                        i4 = this.t[i8].d();
                    } else {
                        i4 = this.t[i8].f();
                    }
                    View c3 = c(i4);
                    if (!(c3 == null || c3 == c)) {
                        return c3;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.s; i9++) {
                if (z3) {
                    i3 = this.t[i9].d();
                } else {
                    i3 = this.t[i9].f();
                }
                View c4 = c(i3);
                if (c4 != null && c4 != c) {
                    return c4;
                }
            }
        }
        return null;
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i reason: case insensitive filesystem */
/* compiled from: ChildHelper */
class C0415i {
    final b a;
    final a b = new a();
    final List<View> c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* compiled from: ChildHelper */
    static class a {
        long a = 0;
        a b;

        a() {
        }

        private void b() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(int i) {
            if (i >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i);
        }

        /* access modifiers changed from: 0000 */
        public boolean c(int i) {
            if (i >= 64) {
                b();
                return this.b.c(i - 64);
            }
            return (this.a & (1 << i)) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean d(int i) {
            if (i >= 64) {
                b();
                return this.b.d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.a & j) != 0;
            this.a &= ~j;
            long j2 = j - 1;
            long j3 = this.a;
            this.a = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.b.d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        public void e(int i) {
            if (i >= 64) {
                b();
                this.b.e(i - 64);
                return;
            }
            this.a |= 1 << i;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.a));
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        public int b(int i) {
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            } else {
                return aVar.b(i - 64) + Long.bitCount(this.a);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.a = 0;
            a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, boolean z) {
            if (i >= 64) {
                b();
                this.b.a(i - 64, z);
                return;
            }
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.a;
            this.a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                e(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                b();
                this.b.a(0, z2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* compiled from: ChildHelper */
    interface b {
        int a();

        View a(int i);

        void a(View view);

        void a(View view, int i);

        void a(View view, int i, LayoutParams layoutParams);

        ViewHolder b(View view);

        void b();

        void b(int i);

        int c(View view);

        void c(int i);

        void d(View view);
    }

    C0415i(b bVar) {
        this.a = bVar;
    }

    private int f(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = this.a.a();
        int i2 = i;
        while (i2 < a2) {
            int b2 = i - (i2 - this.b.b(i2));
            if (b2 == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void g(View view) {
        this.c.add(view);
        this.a.a(view);
    }

    private boolean h(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.d(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, boolean z) {
        a(view, -1, z);
    }

    /* access modifiers changed from: 0000 */
    public View b(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.c.get(i2);
            ViewHolder b2 = this.a.b(view);
            if (b2.getLayoutPosition() == i && !b2.isInvalid() && !b2.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public View c(int i) {
        return this.a.a(f(i));
    }

    /* access modifiers changed from: 0000 */
    public void d(View view) {
        int c2 = this.a.c(view);
        if (c2 >= 0) {
            if (this.b.d(c2)) {
                h(view);
            }
            this.a.c(c2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void e(int i) {
        int f = f(i);
        View a2 = this.a.a(f);
        if (a2 != null) {
            if (this.b.d(f)) {
                h(a2);
            }
            this.a.c(f);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.toString());
        sb.append(", hidden list:");
        sb.append(this.c.size());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.a.a();
        } else {
            i2 = f(i);
        }
        this.b.a(i2, z);
        if (z) {
            g(view);
        }
        this.a.a(view, i2);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.b.a();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.d((View) this.c.get(size));
            this.c.remove(size);
        }
        this.a.b();
    }

    /* access modifiers changed from: 0000 */
    public void f(View view) {
        int c2 = this.a.c(view);
        if (c2 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.b.c(c2)) {
            this.b.a(c2);
            h(view);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public View d(int i) {
        return this.a.a(i);
    }

    /* access modifiers changed from: 0000 */
    public boolean e(View view) {
        int c2 = this.a.c(view);
        if (c2 == -1) {
            h(view);
            return true;
        } else if (!this.b.c(c2)) {
            return false;
        } else {
            this.b.d(c2);
            h(view);
            this.a.c(c2);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.a.a();
        } else {
            i2 = f(i);
        }
        this.b.a(i2, z);
        if (z) {
            g(view);
        }
        this.a.a(view, i2, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.a.a();
    }

    /* access modifiers changed from: 0000 */
    public int b(View view) {
        int c2 = this.a.c(view);
        if (c2 != -1 && !this.b.c(c2)) {
            return c2 - this.b.b(c2);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public boolean c(View view) {
        return this.c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        return this.a.a() - this.c.size();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        int f = f(i);
        this.b.d(f);
        this.a.b(f);
    }

    /* access modifiers changed from: 0000 */
    public void a(View view) {
        int c2 = this.a.c(view);
        if (c2 >= 0) {
            this.b.e(c2);
            g(view);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }
}

package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a reason: case insensitive filesystem */
/* compiled from: AdapterHelper */
class C0407a implements a {
    private C0251Rb<b> a;
    final ArrayList<b> b;
    final ArrayList<b> c;
    final C0021a d;
    Runnable e;
    final boolean f;
    final P g;
    private int h;

    /* renamed from: androidx.recyclerview.widget.a$a reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    interface C0021a {
        ViewHolder a(int i);

        void a(int i, int i2);

        void a(int i, int i2, Object obj);

        void a(b bVar);

        void b(int i, int i2);

        void b(b bVar);

        void c(int i, int i2);

        void d(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    static class b {
        int a;
        int b;
        Object c;
        int d;

        b(int i, int i2, int i3, Object obj) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        /* access modifiers changed from: 0000 */
        public String a() {
            int i = this.a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(a());
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    C0407a(C0021a aVar) {
        this(aVar, false);
    }

    private void b(b bVar) {
        g(bVar);
    }

    private void c(b bVar) {
        g(bVar);
    }

    private void d(b bVar) {
        char c2;
        boolean z;
        boolean z2;
        int i = bVar.b;
        int i2 = bVar.d + i;
        int i3 = 0;
        char c3 = 65535;
        int i4 = i;
        while (i4 < i2) {
            if (this.d.a(i4) != null || d(i4)) {
                if (c3 == 0) {
                    f(a(2, i, i3, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    g(a(2, i, i3, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i4 -= i3;
                i2 -= i3;
                i3 = 1;
            } else {
                i3++;
            }
            i4++;
            c3 = c2;
        }
        if (i3 != bVar.d) {
            a(bVar);
            bVar = a(2, i, i3, null);
        }
        if (c3 == 0) {
            f(bVar);
        } else {
            g(bVar);
        }
    }

    private void g(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        if (i == 1) {
            this.d.c(bVar.b, bVar.d);
        } else if (i == 2) {
            this.d.b(bVar.b, bVar.d);
        } else if (i == 4) {
            this.d.a(bVar.b, bVar.d, bVar.c);
        } else if (i == 8) {
            this.d.a(bVar.b, bVar.d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.d.b((b) this.c.get(i));
        }
        a((List<b>) this.c);
        this.h = 0;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.g.a(this.b);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                b(bVar);
            } else if (i2 == 2) {
                d(bVar);
            } else if (i2 == 4) {
                e(bVar);
            } else if (i2 == 8) {
                c(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.b.clear();
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        a((List<b>) this.b);
        a((List<b>) this.c);
        this.h = 0;
    }

    C0407a(C0021a aVar, boolean z) {
        this.a = new C0255Sb(30);
        this.b = new ArrayList<>();
        this.c = new ArrayList<>();
        this.h = 0;
        this.d = aVar;
        this.f = z;
        this.g = new P(this);
    }

    /* access modifiers changed from: 0000 */
    public int b(int i) {
        return a(i, 0);
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.b.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean b(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.b.add(a(1, i, i2, null));
        this.h |= 1;
        if (this.b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public boolean c(int i) {
        return (i & this.h) != 0;
    }

    private void f(b bVar) {
        int i;
        int i2 = bVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d2 = d(bVar.b, i2);
        int i3 = bVar.b;
        int i4 = bVar.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = d2;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.d; i8++) {
            int d3 = d(bVar.b + (i * i8), bVar.a);
            int i9 = bVar.a;
            if (i9 == 2 ? d3 == i5 : i9 == 4 && d3 == i5 + 1) {
                i7++;
            } else {
                b a2 = a(bVar.a, i5, i7, bVar.c);
                a(a2, i6);
                a(a2);
                if (bVar.a == 4) {
                    i6 += i7;
                }
                i5 = d3;
                i7 = 1;
            }
        }
        Object obj = bVar.c;
        a(bVar);
        if (i7 > 0) {
            b a3 = a(bVar.a, i5, i7, obj);
            a(a3, i6);
            a(a3);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean c(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.b.add(a(2, i, i2, null));
        this.h |= 2;
        if (this.b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar, int i) {
        this.d.a(bVar);
        int i2 = bVar.a;
        if (i2 == 2) {
            this.d.d(i, bVar.d);
        } else if (i2 == 4) {
            this.d.a(i, bVar.d, bVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) this.b.get(i);
            int i2 = bVar.a;
            if (i2 == 1) {
                this.d.b(bVar);
                this.d.c(bVar.b, bVar.d);
            } else if (i2 == 2) {
                this.d.b(bVar);
                this.d.d(bVar.b, bVar.d);
            } else if (i2 == 4) {
                this.d.b(bVar);
                this.d.a(bVar.b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                this.d.b(bVar);
                this.d.a(bVar.b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        a((List<b>) this.b);
        this.h = 0;
    }

    /* access modifiers changed from: 0000 */
    public int a(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = (b) this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    private void e(b bVar) {
        int i = bVar.b;
        int i2 = bVar.d + i;
        int i3 = i;
        int i4 = 0;
        char c2 = 65535;
        while (i < i2) {
            if (this.d.a(i) != null || d(i)) {
                if (c2 == 0) {
                    f(a(4, i3, i4, bVar.c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    g(a(4, i3, i4, bVar.c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.d) {
            Object obj = bVar.c;
            a(bVar);
            bVar = a(4, i3, i4, obj);
        }
        if (c2 == 0) {
            f(bVar);
        } else {
            g(bVar);
        }
    }

    private int d(int i, int i2) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.c.get(size);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                int i5 = bVar.d;
                if (i4 >= i5) {
                    int i6 = i5;
                    i5 = i4;
                    i4 = i6;
                }
                if (i < i4 || i > i5) {
                    int i7 = bVar.b;
                    if (i < i7) {
                        if (i2 == 1) {
                            bVar.b = i7 + 1;
                            bVar.d++;
                        } else if (i2 == 2) {
                            bVar.b = i7 - 1;
                            bVar.d--;
                        }
                    }
                } else {
                    int i8 = bVar.b;
                    if (i4 == i8) {
                        if (i2 == 1) {
                            bVar.d++;
                        } else if (i2 == 2) {
                            bVar.d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.b = i8 + 1;
                        } else if (i2 == 2) {
                            bVar.b = i8 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i9 = bVar.b;
                if (i9 <= i) {
                    if (i3 == 1) {
                        i -= bVar.d;
                    } else if (i3 == 2) {
                        i += bVar.d;
                    }
                } else if (i2 == 1) {
                    bVar.b = i9 + 1;
                } else if (i2 == 2) {
                    bVar.b = i9 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.c.get(size2);
            if (bVar2.a == 8) {
                int i10 = bVar2.d;
                if (i10 == bVar2.b || i10 < 0) {
                    this.c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.b.add(a(4, i, i2, obj));
        this.h |= 4;
        if (this.b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i, int i2, int i3) {
        boolean z = false;
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.b.add(a(8, i, i2, null));
            this.h |= 8;
            if (this.b.size() == 1) {
                z = true;
            }
            return z;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    public int a(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.b.get(i2);
            int i3 = bVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.b;
                    if (i4 <= i) {
                        int i5 = bVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.b;
                    if (i6 == i) {
                        i = bVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    public b a(int i, int i2, int i3, Object obj) {
        b bVar = (b) this.a.a();
        if (bVar == null) {
            return new b(i, i2, i3, obj);
        }
        bVar.a = i;
        bVar.b = i2;
        bVar.d = i3;
        bVar.c = obj;
        return bVar;
    }

    private boolean d(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (a(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void a(b bVar) {
        if (!this.f) {
            bVar.c = null;
            this.a.a(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((b) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        return !this.c.isEmpty() && !this.b.isEmpty();
    }
}

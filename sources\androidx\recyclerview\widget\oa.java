package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.f.c;

/* compiled from: ViewInfoStore */
class oa {
    final T<ViewHolder, a> a = new T<>();
    final Y<ViewHolder> b = new Y<>();

    /* compiled from: ViewInfoStore */
    static class a {
        static C0251Rb<a> a = new C0255Sb(20);
        int b;
        c c;
        c d;

        private a() {
        }

        static void a(a aVar) {
            aVar.b = 0;
            aVar.c = null;
            aVar.d = null;
            a.a(aVar);
        }

        static a b() {
            a aVar = (a) a.a();
            return aVar == null ? new a() : aVar;
        }

        static void a() {
            do {
            } while (a.a() != null);
        }
    }

    /* compiled from: ViewInfoStore */
    interface b {
        void a(ViewHolder viewHolder);

        void a(ViewHolder viewHolder, c cVar, c cVar2);

        void b(ViewHolder viewHolder, c cVar, c cVar2);

        void c(ViewHolder viewHolder, c cVar, c cVar2);
    }

    oa() {
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.clear();
        this.b.i();
    }

    /* access modifiers changed from: 0000 */
    public boolean b(ViewHolder viewHolder) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar == null || (aVar.b & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void c(ViewHolder viewHolder, c cVar) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(viewHolder, aVar);
        }
        aVar.c = cVar;
        aVar.b |= 4;
    }

    public void d(ViewHolder viewHolder) {
        g(viewHolder);
    }

    /* access modifiers changed from: 0000 */
    public c e(ViewHolder viewHolder) {
        return a(viewHolder, 8);
    }

    /* access modifiers changed from: 0000 */
    public c f(ViewHolder viewHolder) {
        return a(viewHolder, 4);
    }

    /* access modifiers changed from: 0000 */
    public void g(ViewHolder viewHolder) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar != null) {
            aVar.b &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void h(ViewHolder viewHolder) {
        int j = this.b.j() - 1;
        while (true) {
            if (j < 0) {
                break;
            } else if (viewHolder == this.b.c(j)) {
                this.b.b(j);
                break;
            } else {
                j--;
            }
        }
        a aVar = (a) this.a.remove(viewHolder);
        if (aVar != null) {
            a.a(aVar);
        }
    }

    private c a(ViewHolder viewHolder, int i) {
        c cVar;
        int b2 = this.a.b((Object) viewHolder);
        if (b2 < 0) {
            return null;
        }
        a aVar = (a) this.a.d(b2);
        if (aVar != null) {
            int i2 = aVar.b;
            if ((i2 & i) != 0) {
                aVar.b = (~i) & i2;
                if (i == 4) {
                    cVar = aVar.c;
                } else if (i == 8) {
                    cVar = aVar.d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((aVar.b & 12) == 0) {
                    this.a.c(b2);
                    a.a(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void b(ViewHolder viewHolder, c cVar) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(viewHolder, aVar);
        }
        aVar.d = cVar;
        aVar.b |= 8;
    }

    /* access modifiers changed from: 0000 */
    public boolean c(ViewHolder viewHolder) {
        a aVar = (a) this.a.get(viewHolder);
        return (aVar == null || (aVar.b & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a.a();
    }

    /* access modifiers changed from: 0000 */
    public void a(long j, ViewHolder viewHolder) {
        this.b.c(j, viewHolder);
    }

    /* access modifiers changed from: 0000 */
    public void a(ViewHolder viewHolder, c cVar) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(viewHolder, aVar);
        }
        aVar.b |= 2;
        aVar.c = cVar;
    }

    /* access modifiers changed from: 0000 */
    public ViewHolder a(long j) {
        return (ViewHolder) this.b.b(j);
    }

    /* access modifiers changed from: 0000 */
    public void a(ViewHolder viewHolder) {
        a aVar = (a) this.a.get(viewHolder);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(viewHolder, aVar);
        }
        aVar.b |= 1;
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) this.a.b(size);
            a aVar = (a) this.a.c(size);
            int i = aVar.b;
            if ((i & 3) == 3) {
                bVar.a(viewHolder);
            } else if ((i & 1) != 0) {
                c cVar = aVar.c;
                if (cVar == null) {
                    bVar.a(viewHolder);
                } else {
                    bVar.b(viewHolder, cVar, aVar.d);
                }
            } else if ((i & 14) == 14) {
                bVar.a(viewHolder, aVar.c, aVar.d);
            } else if ((i & 12) == 12) {
                bVar.c(viewHolder, aVar.c, aVar.d);
            } else if ((i & 4) != 0) {
                bVar.b(viewHolder, aVar.c, null);
            } else if ((i & 8) != 0) {
                bVar.a(viewHolder, aVar.c, aVar.d);
            }
            a.a(aVar);
        }
    }
}

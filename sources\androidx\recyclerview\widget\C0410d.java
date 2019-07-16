package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0425t.a;

/* renamed from: androidx.recyclerview.widget.d reason: case insensitive filesystem */
/* compiled from: AsyncListDiffer */
class C0410d extends a {
    final /* synthetic */ C0412f a;

    C0410d(C0412f fVar) {
        this.a = fVar;
    }

    public int a() {
        return this.a.b.size();
    }

    public int b() {
        return this.a.a.size();
    }

    public Object c(int i, int i2) {
        Object obj = this.a.a.get(i);
        Object obj2 = this.a.b.get(i2);
        if (obj != null && obj2 != null) {
            return this.a.d.c.b().c(obj, obj2);
        }
        throw new AssertionError();
    }

    public boolean a(int i, int i2) {
        Object obj = this.a.a.get(i);
        Object obj2 = this.a.b.get(i2);
        if (obj != null && obj2 != null) {
            return this.a.d.c.b().a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean b(int i, int i2) {
        Object obj = this.a.a.get(i);
        Object obj2 = this.a.b.get(i2);
        if (obj != null && obj2 != null) {
            return this.a.d.c.b().b(obj, obj2);
        }
        return obj == null && obj2 == null;
    }
}

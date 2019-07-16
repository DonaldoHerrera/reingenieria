package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* renamed from: Pt reason: default package */
final class Pt implements Iterator<Entry<String, Object>> {
    private int a = -1;
    private Ut b;
    private Object c;
    private boolean d;
    private boolean e;
    private Ut f;
    private final /* synthetic */ Nt g;

    Pt(Nt nt) {
        this.g = nt;
    }

    public final boolean hasNext() {
        if (!this.e) {
            this.e = true;
            this.c = null;
            while (this.c == null) {
                int i = this.a + 1;
                this.a = i;
                if (i >= this.g.b.f.size()) {
                    break;
                }
                Mt mt = this.g.b;
                this.b = mt.a((String) mt.f.get(this.a));
                this.c = this.b.a(this.g.a);
            }
        }
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            this.f = this.b;
            Object obj = this.c;
            this.e = false;
            this.d = false;
            this.b = null;
            this.c = null;
            return new Qt(this.g, this.f, obj);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        Pu.a(this.f != null && !this.d);
        this.d = true;
        this.f.a(this.g.a, (Object) null);
    }
}

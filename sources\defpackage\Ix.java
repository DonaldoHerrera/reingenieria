package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: Ix reason: default package */
final class Ix implements Iterator<Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Entry<K, V>> c;
    private final /* synthetic */ Cx d;

    private Ix(Cx cx) {
        this.d = cx;
        this.a = -1;
    }

    private final Iterator<Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.c.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        if (this.a + 1 < this.d.b.size() || (!this.d.c.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.b.size()) {
            return (Entry) this.d.b.get(this.a);
        }
        return (Entry) a().next();
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.e();
            if (this.a < this.d.b.size()) {
                Cx cx = this.d;
                int i = this.a;
                this.a = i - 1;
                cx.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ Ix(Cx cx, Bx bx) {
        this(cx);
    }
}

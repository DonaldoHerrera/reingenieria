package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: St reason: default package */
final class St extends AbstractSet<Entry<String, Object>> {
    private final /* synthetic */ Nt a;

    St(Nt nt) {
        this.a = nt;
    }

    public final void clear() {
        for (String a2 : this.a.b.f) {
            this.a.b.a(a2).a(this.a.a, (Object) null);
        }
    }

    public final boolean isEmpty() {
        for (String a2 : this.a.b.f) {
            if (this.a.b.a(a2).a(this.a.a) != null) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Iterator iterator() {
        return new Pt(this.a);
    }

    public final int size() {
        int i = 0;
        for (String a2 : this.a.b.f) {
            if (this.a.b.a(a2).a(this.a.a) != null) {
                i++;
            }
        }
        return i;
    }
}

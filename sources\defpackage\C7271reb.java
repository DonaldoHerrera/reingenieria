package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: reb reason: default package and case insensitive filesystem */
/* compiled from: Annotations.kt */
public final class C7271reb implements C6723jeb {
    private final C6723jeb a;
    private final _Xa<C7349snb, Boolean> b;

    public C7271reb(C6723jeb jeb, _Xa<? super C7349snb, Boolean> _xa) {
        C7471uYa.b(jeb, "delegate");
        C7471uYa.b(_xa, "fqNameFilter");
        this.a = jeb;
        this.b = _xa;
    }

    public C6315deb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        if (((Boolean) this.b.invoke(snb)).booleanValue()) {
            return this.a.a(snb);
        }
        return null;
    }

    public boolean b(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        if (((Boolean) this.b.invoke(snb)).booleanValue()) {
            return this.a.b(snb);
        }
        return false;
    }

    public boolean isEmpty() {
        C6723jeb<C6315deb> jeb = this.a;
        if ((jeb instanceof Collection) && ((Collection) jeb).isEmpty()) {
            return false;
        }
        for (C6315deb a2 : jeb) {
            if (a(a2)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<C6315deb> iterator() {
        C6723jeb jeb = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object next : jeb) {
            if (a((C6315deb) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    private final boolean a(C6315deb deb) {
        C7349snb q = deb.q();
        return q != null && ((Boolean) this.b.invoke(q)).booleanValue();
    }
}

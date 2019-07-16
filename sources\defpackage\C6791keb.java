package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: keb reason: default package and case insensitive filesystem */
/* compiled from: AnnotationsImpl.kt */
public final class C6791keb implements C6723jeb {
    private final List<C6315deb> a;

    public C6791keb(List<? extends C6315deb> list) {
        C7471uYa.b(list, "annotations");
        this.a = list;
    }

    public C6315deb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return b.a(this, snb);
    }

    public boolean b(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return b.b(this, snb);
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public Iterator<C6315deb> iterator() {
        return this.a.iterator();
    }

    public String toString() {
        return this.a.toString();
    }
}

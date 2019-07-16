package defpackage;

import java.util.AbstractList;

/* renamed from: NKa reason: default package and case insensitive filesystem */
/* compiled from: Joiner */
final class C5146NKa extends AbstractList<Object> {
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public Object get(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i != 1) {
            return this.a[i - 2];
        }
        return this.c;
    }

    public int size() {
        return this.a.length + 2;
    }
}

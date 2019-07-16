package defpackage;

import java.util.AbstractList;
import java.util.List;

/* renamed from: ZVa reason: default package */
/* compiled from: AbstractMutableList.kt */
public abstract class ZVa<E> extends AbstractList<E> implements List<E>, QYa {
    protected ZVa() {
    }

    public abstract int c();

    public abstract E c(int i);

    public final /* bridge */ E remove(int i) {
        return c(i);
    }

    public final /* bridge */ int size() {
        return c();
    }
}

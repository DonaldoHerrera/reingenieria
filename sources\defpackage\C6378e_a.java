package defpackage;

import java.util.Comparator;

/* renamed from: e_a reason: default package and case insensitive filesystem */
/* compiled from: Comparisons.kt */
public final class C6378e_a<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return YWa.a(((CZa) t).getName(), ((CZa) t2).getName());
    }
}

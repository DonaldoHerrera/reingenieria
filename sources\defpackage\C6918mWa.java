package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mWa reason: default package and case insensitive filesystem */
/* compiled from: Collections.kt */
class C6918mWa extends C6850lWa {
    public static final <T> Collection<T> a(T[] tArr) {
        C7471uYa.b(tArr, "$this$asCollection");
        return new _Va(tArr, false);
    }

    public static <T> List<T> b(T... tArr) {
        C7471uYa.b(tArr, "elements");
        return tArr.length > 0 ? C6374eWa.a(tArr) : a();
    }

    public static <T> List<T> c(T... tArr) {
        C7471uYa.b(tArr, "elements");
        return C6578hWa.d(tArr);
    }

    public static <T> List<T> d(T... tArr) {
        C7471uYa.b(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new _Va(tArr, true));
    }

    public static <T> List<T> a() {
        return C7814zWa.a;
    }

    public static <T> List<T> b(T t) {
        return t != null ? C6850lWa.a(t) : a();
    }

    public static void c() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static C6785kZa a(Collection<?> collection) {
        C7471uYa.b(collection, "$this$indices");
        return new C6785kZa(0, collection.size() - 1);
    }

    public static <T> List<T> b(List<? extends T> list) {
        C7471uYa.b(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size == 0) {
            return a();
        }
        if (size != 1) {
            return list;
        }
        return C6850lWa.a(list.get(0));
    }

    public static <T> int a(List<? extends T> list) {
        C7471uYa.b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    public static void b() {
        throw new ArithmeticException("Count overflow has happened.");
    }
}

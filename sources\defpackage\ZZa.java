package defpackage;

import java.lang.reflect.Method;
import java.util.Comparator;

/* renamed from: ZZa reason: default package */
/* compiled from: Comparisons.kt */
public final class ZZa<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        Method method = (Method) t;
        String str = "it";
        C7471uYa.a((Object) method, str);
        String name = method.getName();
        Method method2 = (Method) t2;
        C7471uYa.a((Object) method2, str);
        return YWa.a(name, method2.getName());
    }
}

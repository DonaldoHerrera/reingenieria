package androidx.room;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: RxRoom */
public class B {
    public static final Object a = new Object();

    public static APa<Object> a(t tVar, String... strArr) {
        return APa.a((CPa<T>) new z<T>(strArr, tVar));
    }

    public static <T> APa<T> a(t tVar, boolean z, String[] strArr, Callable<T> callable) {
        HPa a2 = C6645iVa.a(a(tVar, z));
        return a(tVar, strArr).b(a2).c(a2).a(a2).f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new A<Object,Object>(C7531vPa.b(callable)));
    }

    private static Executor a(t tVar, boolean z) {
        if (z) {
            return tVar.j();
        }
        return tVar.i();
    }
}

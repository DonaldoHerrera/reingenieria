package defpackage;

import java.lang.reflect.Method;

/* renamed from: ewb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaClass.kt */
final class C6409ewb extends C7540vYa implements _Xa<Method, Boolean> {
    final /* synthetic */ C6545gwb a;

    C6409ewb(C6545gwb gwb) {
        this.a = gwb;
        super(1);
    }

    public final boolean a(Method method) {
        C7471uYa.a((Object) method, "method");
        return !method.isSynthetic() && (!this.a.o() || !this.a.a(method));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Method) obj));
    }
}

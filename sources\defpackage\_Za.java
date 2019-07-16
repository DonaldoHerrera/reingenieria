package defpackage;

import java.lang.reflect.Method;

/* renamed from: _Za reason: default package */
/* compiled from: RuntimeTypeMapper.kt */
final class _Za extends C7540vYa implements _Xa<Method, String> {
    public static final _Za a = new _Za();

    _Za() {
        super(1);
    }

    /* renamed from: a */
    public final String invoke(Method method) {
        C7471uYa.a((Object) method, "it");
        Class returnType = method.getReturnType();
        C7471uYa.a((Object) returnType, "it.returnType");
        return Rvb.c(returnType);
    }
}

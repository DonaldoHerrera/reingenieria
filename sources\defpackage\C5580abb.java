package defpackage;

import java.lang.reflect.Method;

/* renamed from: abb reason: default package and case insensitive filesystem */
/* compiled from: RuntimeTypeMapper.kt */
public final class C5580abb {
    /* access modifiers changed from: private */
    public static final String b(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C7471uYa.a((Object) parameterTypes, "parameterTypes");
        sb.append(C6578hWa.a(parameterTypes, "", "(", ")", 0, null, C5533_ab.a, 24, null));
        Class returnType = method.getReturnType();
        C7471uYa.a((Object) returnType, "returnType");
        sb.append(Rvb.c(returnType));
        return sb.toString();
    }
}

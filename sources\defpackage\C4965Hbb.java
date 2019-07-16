package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: Hbb reason: default package and case insensitive filesystem */
/* compiled from: ReflectKotlinClass.kt */
final class C4965Hbb {
    public static final C4965Hbb a = new C4965Hbb();

    private C4965Hbb() {
    }

    public final String a(Method method) {
        Class[] parameterTypes;
        C7471uYa.b(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class cls : method.getParameterTypes()) {
            C7471uYa.a((Object) cls, "parameterType");
            sb.append(Rvb.c(cls));
        }
        sb.append(")");
        Class returnType = method.getReturnType();
        C7471uYa.a((Object) returnType, "method.returnType");
        sb.append(Rvb.c(returnType));
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public final String a(Constructor<?> constructor) {
        Class[] parameterTypes;
        C7471uYa.b(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class cls : constructor.getParameterTypes()) {
            C7471uYa.a((Object) cls, "parameterType");
            sb.append(Rvb.c(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public final String a(Field field) {
        C7471uYa.b(field, "field");
        Class type = field.getType();
        C7471uYa.a((Object) type, "field.type");
        return Rvb.c(type);
    }
}

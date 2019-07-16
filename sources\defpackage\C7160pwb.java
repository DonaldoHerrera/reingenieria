package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaMethod.kt */
public final class C7160pwb extends C7091owb implements Uib {
    private final Method a;

    public C7160pwb(Method method) {
        C7471uYa.b(method, "member");
        this.a = method;
    }

    public List<C5656bjb> f() {
        Type[] genericParameterTypes = I().getGenericParameterTypes();
        C7471uYa.a((Object) genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = I().getParameterAnnotations();
        C7471uYa.a((Object) parameterAnnotations, "member.parameterAnnotations");
        return a(genericParameterTypes, parameterAnnotations, I().isVarArgs());
    }

    public List<C7505uwb> getTypeParameters() {
        TypeVariable[] typeParameters = I().getTypeParameters();
        C7471uYa.a((Object) typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable uwb : typeParameters) {
            arrayList.add(new C7505uwb(uwb));
        }
        return arrayList;
    }

    public Fib n() {
        Object defaultValue = I().getDefaultValue();
        if (defaultValue != null) {
            return Tvb.a.a(defaultValue, null);
        }
        return null;
    }

    public boolean v() {
        return a.a(this);
    }

    public Method I() {
        return this.a;
    }

    public C7436twb a() {
        a aVar = C7436twb.a;
        Type genericReturnType = I().getGenericReturnType();
        C7471uYa.a((Object) genericReturnType, "member.genericReturnType");
        return aVar.a(genericReturnType);
    }
}

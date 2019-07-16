package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaConstructor.kt */
public final class C6749jwb extends C7091owb implements Oib {
    private final Constructor<?> a;

    public C6749jwb(Constructor<?> constructor) {
        C7471uYa.b(constructor, "member");
        this.a = constructor;
    }

    public Constructor<?> I() {
        return this.a;
    }

    public List<C5656bjb> f() {
        Type[] genericParameterTypes = I().getGenericParameterTypes();
        C7471uYa.a((Object) genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return C6918mWa.a();
        }
        Class declaringClass = I().getDeclaringClass();
        C7471uYa.a((Object) declaringClass, "klass");
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C6374eWa.a(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = I().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                C7471uYa.a((Object) parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) C6374eWa.a(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            C7471uYa.a((Object) genericParameterTypes, "realTypes");
            C7471uYa.a((Object) parameterAnnotations, "realAnnotations");
            return a(genericParameterTypes, parameterAnnotations, I().isVarArgs());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal generic signature: ");
        sb.append(I());
        throw new IllegalStateException(sb.toString());
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
}

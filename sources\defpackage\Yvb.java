package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: Yvb reason: default package */
/* compiled from: ReflectJavaArrayType.kt */
public final class Yvb extends C7436twb implements Jib {
    private final C7436twb b;
    private final Type c;

    public Yvb(Type type) {
        C7436twb twb;
        C7471uYa.b(type, "reflectType");
        this.c = type;
        Type f = f();
        if (f instanceof GenericArrayType) {
            a aVar = C7436twb.a;
            Type genericComponentType = ((GenericArrayType) f).getGenericComponentType();
            C7471uYa.a((Object) genericComponentType, "genericComponentType");
            twb = aVar.a(genericComponentType);
        } else {
            if (f instanceof Class) {
                Class cls = (Class) f;
                if (cls.isArray()) {
                    a aVar2 = C7436twb.a;
                    Class componentType = cls.getComponentType();
                    C7471uYa.a((Object) componentType, "getComponentType()");
                    twb = aVar2.a(componentType);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Not an array type (");
            sb.append(f().getClass());
            sb.append("): ");
            sb.append(f());
            throw new IllegalArgumentException(sb.toString());
        }
        this.b = twb;
    }

    /* access modifiers changed from: protected */
    public Type f() {
        return this.c;
    }

    public C7436twb a() {
        return this.b;
    }
}

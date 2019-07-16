package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: iwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaClassifierType.kt */
public final class C6681iwb extends C7436twb implements Nib {
    private final Mib b;
    private final Type c;

    public C6681iwb(Type type) {
        Mib mib;
        C7471uYa.b(type, "reflectType");
        this.c = type;
        Type f = f();
        if (f instanceof Class) {
            mib = new C6545gwb((Class) f);
        } else if (f instanceof TypeVariable) {
            mib = new C7505uwb((TypeVariable) f);
        } else if (f instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) f).getRawType();
            if (rawType != null) {
                mib = new C6545gwb((Class) rawType);
            } else {
                throw new OVa("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a classifier type (");
            sb.append(f.getClass());
            sb.append("): ");
            sb.append(f);
            throw new IllegalStateException(sb.toString());
        }
        this.b = mib;
    }

    public String A() {
        return f().toString();
    }

    public String B() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type not found: ");
        sb.append(f());
        throw new UnsupportedOperationException(sb.toString());
    }

    public Eib a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return null;
    }

    public boolean c() {
        return false;
    }

    public Mib e() {
        return this.b;
    }

    public Type f() {
        return this.c;
    }

    public Collection<Eib> getAnnotations() {
        return C6918mWa.a();
    }

    public boolean y() {
        Type f = f();
        if (!(f instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) f).getTypeParameters();
        C7471uYa.a((Object) typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    public List<Zib> z() {
        List<Type> a = Rvb.a(f());
        a aVar = C7436twb.a;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) a, 10));
        for (Type a2 : a) {
            arrayList.add(aVar.a(a2));
        }
        return arrayList;
    }
}

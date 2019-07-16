package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: gwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaClass.kt */
public final class C6545gwb extends C6817kwb implements Kib, Vvb, C7229qwb {
    private final Class<?> a;

    public C6545gwb(Class<?> cls) {
        C7471uYa.b(cls, "klass");
        this.a = cls;
    }

    public Collection<Nib> b() {
        if (C7471uYa.a((Object) this.a, (Object) Object.class)) {
            return C6918mWa.a();
        }
        JYa jYa = new JYa(2);
        Object genericSuperclass = this.a.getGenericSuperclass();
        if (genericSuperclass == null) {
            genericSuperclass = Object.class;
        }
        jYa.a(genericSuperclass);
        Type[] genericInterfaces = this.a.getGenericInterfaces();
        C7471uYa.a((Object) genericInterfaces, "klass.genericInterfaces");
        jYa.b(genericInterfaces);
        List<Type> b = C6918mWa.b((Object[]) (Type[]) jYa.a((Object[]) new Type[jYa.a()]));
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) b, 10));
        for (Type iwb : b) {
            arrayList.add(new C6681iwb(iwb));
        }
        return arrayList;
    }

    public boolean c() {
        return a.b(this);
    }

    public C5583aeb d() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6545gwb) && C7471uYa.a((Object) this.a, (Object) ((C6545gwb) obj).a);
    }

    public boolean g() {
        return a.b(this);
    }

    public int getModifiers() {
        return this.a.getModifiers();
    }

    public C7694xnb getName() {
        C7694xnb b = C7694xnb.b(this.a.getSimpleName());
        C7471uYa.a((Object) b, "Name.identifier(klass.simpleName)");
        return b;
    }

    public List<C7505uwb> getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        C7471uYa.a((Object) typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable uwb : typeParameters) {
            arrayList.add(new C7505uwb(uwb));
        }
        return arrayList;
    }

    public boolean h() {
        return a.c(this);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean k() {
        return a.d(this);
    }

    public boolean m() {
        return this.a.isAnnotation();
    }

    public boolean o() {
        return this.a.isEnum();
    }

    public C7349snb q() {
        C7349snb a2 = Rvb.b(this.a).a();
        C7471uYa.a((Object) a2, "klass.classId.asSingleFqName()");
        return a2;
    }

    public boolean t() {
        return this.a.isInterface();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6545gwb.class.getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }

    public C6320djb u() {
        return null;
    }

    public Class<?> E() {
        return this.a;
    }

    public List<Svb> getAnnotations() {
        return a.a(this);
    }

    public List<C6749jwb> i() {
        Constructor[] declaredConstructors = this.a.getDeclaredConstructors();
        C7471uYa.a((Object) declaredConstructors, "klass.declaredConstructors");
        return Ywb.g(Ywb.d(Ywb.a(C6578hWa.c((T[]) declaredConstructors), (_Xa<? super T, Boolean>) Zvb.a), _vb.e));
    }

    public C6545gwb l() {
        Class declaringClass = this.a.getDeclaringClass();
        if (declaringClass != null) {
            return new C6545gwb(declaringClass);
        }
        return null;
    }

    public List<C6953mwb> p() {
        Field[] declaredFields = this.a.getDeclaredFields();
        C7471uYa.a((Object) declaredFields, "klass.declaredFields");
        return Ywb.g(Ywb.d(Ywb.a(C6578hWa.c((T[]) declaredFields), (_Xa<? super T, Boolean>) C5609awb.a), C5677bwb.e));
    }

    public List<C7694xnb> r() {
        Class[] declaredClasses = this.a.getDeclaredClasses();
        C7471uYa.a((Object) declaredClasses, "klass.declaredClasses");
        return Ywb.g(Ywb.e(Ywb.b(C6578hWa.c((T[]) declaredClasses), (_Xa<? super T, Boolean>) C6273cwb.a), C6341dwb.a));
    }

    public List<C7160pwb> s() {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        C7471uYa.a((Object) declaredMethods, "klass.declaredMethods");
        return Ywb.g(Ywb.d(Ywb.a(C6578hWa.c((T[]) declaredMethods), (_Xa<? super T, Boolean>) new C6409ewb<Object,Boolean>(this)), C6477fwb.e));
    }

    public Svb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return a.a(this, snb);
    }

    /* access modifiers changed from: private */
    public final boolean a(Method method) {
        String name = method.getName();
        if (name == null) {
            return false;
        }
        int hashCode = name.hashCode();
        if (hashCode != -823812830) {
            if (hashCode != 231605032 || !name.equals("valueOf")) {
                return false;
            }
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        } else if (!name.equals("values")) {
            return false;
        } else {
            Class[] parameterTypes = method.getParameterTypes();
            C7471uYa.a((Object) parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
            return false;
        }
    }
}

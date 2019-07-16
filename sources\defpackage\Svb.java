package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Svb reason: default package */
/* compiled from: ReflectJavaAnnotation.kt */
public final class Svb extends C6817kwb implements Eib {
    private final Annotation a;

    public Svb(Annotation annotation) {
        C7471uYa.b(annotation, "annotation");
        this.a = annotation;
    }

    public Collection<Fib> C() {
        Method[] declaredMethods = MXa.a(MXa.a(this.a)).getDeclaredMethods();
        C7471uYa.a((Object) declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            a aVar = Tvb.a;
            Object invoke = method.invoke(this.a, new Object[0]);
            C7471uYa.a(invoke, "method.invoke(annotation)");
            C7471uYa.a((Object) method, "method");
            arrayList.add(aVar.a(invoke, C7694xnb.b(method.getName())));
        }
        return arrayList;
    }

    public C7280rnb D() {
        return Rvb.b(MXa.a(MXa.a(this.a)));
    }

    public final Annotation I() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Svb) && C7471uYa.a((Object) this.a, (Object) ((Svb) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Svb.class.getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }

    public C6545gwb H() {
        return new C6545gwb(MXa.a(MXa.a(this.a)));
    }
}

package defpackage;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaTypeParameter.kt */
public final class C7505uwb extends C6817kwb implements _ib, Vvb {
    private final TypeVariable<?> a;

    public C7505uwb(TypeVariable<?> typeVariable) {
        C7471uYa.b(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    public AnnotatedElement E() {
        TypeVariable<?> typeVariable = this.a;
        if (!(typeVariable instanceof AnnotatedElement)) {
            typeVariable = null;
        }
        return (AnnotatedElement) typeVariable;
    }

    public boolean c() {
        return a.b(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7505uwb) && C7471uYa.a((Object) this.a, (Object) ((C7505uwb) obj).a);
    }

    public C7694xnb getName() {
        C7694xnb b = C7694xnb.b(this.a.getName());
        C7471uYa.a((Object) b, "Name.identifier(typeVariable.name)");
        return b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7505uwb.class.getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }

    public Svb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return a.a(this, snb);
    }

    public List<Svb> getAnnotations() {
        return a.a(this);
    }

    public List<C6681iwb> getUpperBounds() {
        Type[] bounds = this.a.getBounds();
        C7471uYa.a((Object) bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type iwb : bounds) {
            arrayList.add(new C6681iwb(iwb));
        }
        C6681iwb iwb2 = (C6681iwb) C7676xWa.k((List<? extends T>) arrayList);
        return C7471uYa.a((Object) iwb2 != null ? iwb2.f() : null, (Object) Object.class) ? C6918mWa.a() : arrayList;
    }
}

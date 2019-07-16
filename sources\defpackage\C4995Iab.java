package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

/* renamed from: Iab reason: default package and case insensitive filesystem */
/* compiled from: KTypeImpl.kt */
final class C4995Iab extends C7540vYa implements PXa<Type> {
    final /* synthetic */ int a;
    final /* synthetic */ C5058Kab b;
    final /* synthetic */ C7744yVa c;
    final /* synthetic */ DZa d;

    C4995Iab(int i, C5058Kab kab, C7744yVa yva, DZa dZa) {
        this.a = i;
        this.b = kab;
        this.c = yva;
        this.d = dZa;
        super(0);
    }

    public final Type d() {
        Type a2 = this.b.a.a();
        if (a2 instanceof Class) {
            Class cls = (Class) a2;
            Class<Object> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            C7471uYa.a((Object) componentType, "if (javaType.isArray) ja…Type else Any::class.java");
            return componentType;
        } else if (a2 instanceof GenericArrayType) {
            if (this.a == 0) {
                Type genericComponentType = ((GenericArrayType) a2).getGenericComponentType();
                C7471uYa.a((Object) genericComponentType, "javaType.genericComponentType");
                return genericComponentType;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array type has been queried for a non-0th argument: ");
            sb.append(this.b.a);
            throw new C5240Qab(sb.toString());
        } else if (a2 instanceof ParameterizedType) {
            C7744yVa yva = this.c;
            DZa dZa = this.d;
            Type type = (Type) ((List) yva.getValue()).get(this.a);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                C7471uYa.a((Object) lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) C6578hWa.f(lowerBounds);
                if (type2 != null) {
                    type = type2;
                } else {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    C7471uYa.a((Object) upperBounds, "argument.upperBounds");
                    type = (Type) C6578hWa.e((Object[]) upperBounds);
                }
            }
            C7471uYa.a((Object) type, "if (argument !is Wildcar…ument.upperBounds.first()");
            return type;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Non-generic type has been queried for arguments: ");
            sb2.append(this.b.a);
            throw new C5240Qab(sb2.toString());
        }
    }
}

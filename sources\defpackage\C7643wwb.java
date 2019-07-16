package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: wwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaWildcardType.kt */
public final class C7643wwb extends C7436twb implements C5724cjb {
    private final WildcardType b;

    public C7643wwb(WildcardType wildcardType) {
        C7471uYa.b(wildcardType, "reflectType");
        this.b = wildcardType;
    }

    public boolean d() {
        Type[] upperBounds = f().getUpperBounds();
        C7471uYa.a((Object) upperBounds, "reflectType.upperBounds");
        return !C7471uYa.a((Object) (Type) C6578hWa.f(upperBounds), (Object) Object.class);
    }

    public C7436twb b() {
        Type[] upperBounds = f().getUpperBounds();
        Type[] lowerBounds = f().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Wildcard types with many bounds are not yet supported: ");
            sb.append(f());
            throw new UnsupportedOperationException(sb.toString());
        } else if (lowerBounds.length == 1) {
            a aVar = C7436twb.a;
            C7471uYa.a((Object) lowerBounds, "lowerBounds");
            Object i = C6578hWa.i(lowerBounds);
            C7471uYa.a(i, "lowerBounds.single()");
            return aVar.a((Type) i);
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            C7471uYa.a((Object) upperBounds, "upperBounds");
            Type type = (Type) C6578hWa.i(upperBounds);
            if (!(!C7471uYa.a((Object) type, (Object) Object.class))) {
                return null;
            }
            a aVar2 = C7436twb.a;
            C7471uYa.a((Object) type, "ub");
            return aVar2.a(type);
        }
    }

    /* access modifiers changed from: protected */
    public WildcardType f() {
        return this.b;
    }
}

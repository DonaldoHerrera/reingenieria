package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: Pvb reason: default package */
/* compiled from: reflectClassUtil.kt */
final class Pvb extends C7540vYa implements _Xa<ParameterizedType, ParameterizedType> {
    public static final Pvb a = new Pvb();

    Pvb() {
        super(1);
    }

    /* renamed from: a */
    public final ParameterizedType invoke(ParameterizedType parameterizedType) {
        C7471uYa.b(parameterizedType, "it");
        Type ownerType = parameterizedType.getOwnerType();
        if (!(ownerType instanceof ParameterizedType)) {
            ownerType = null;
        }
        return (ParameterizedType) ownerType;
    }
}

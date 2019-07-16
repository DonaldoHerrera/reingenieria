package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: Qvb reason: default package */
/* compiled from: reflectClassUtil.kt */
final class Qvb extends C7540vYa implements _Xa<ParameterizedType, Iwb<? extends Type>> {
    public static final Qvb a = new Qvb();

    Qvb() {
        super(1);
    }

    /* renamed from: a */
    public final Iwb<Type> invoke(ParameterizedType parameterizedType) {
        C7471uYa.b(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C7471uYa.a((Object) actualTypeArguments, "it.actualTypeArguments");
        return C6578hWa.c((Object[]) actualTypeArguments);
    }
}

package defpackage;

import java.lang.reflect.Field;

/* renamed from: awb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaClass.kt */
final class C5609awb extends C7540vYa implements _Xa<Field, Boolean> {
    public static final C5609awb a = new C5609awb();

    C5609awb() {
        super(1);
    }

    public final boolean a(Field field) {
        C7471uYa.a((Object) field, "field");
        return !field.isSynthetic();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Field) obj));
    }
}

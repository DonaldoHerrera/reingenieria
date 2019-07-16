package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: Zvb reason: default package */
/* compiled from: ReflectJavaClass.kt */
final class Zvb extends C7540vYa implements _Xa<Constructor<?>, Boolean> {
    public static final Zvb a = new Zvb();

    Zvb() {
        super(1);
    }

    public final boolean a(Constructor<?> constructor) {
        C7471uYa.a((Object) constructor, "constructor");
        return !constructor.isSynthetic();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Constructor) obj));
    }
}

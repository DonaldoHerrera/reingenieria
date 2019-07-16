package defpackage;

import java.lang.reflect.Constructor;

/* renamed from: _vb reason: default package */
/* compiled from: ReflectJavaClass.kt */
final /* synthetic */ class _vb extends C7402tYa implements _Xa<Constructor<?>, C6749jwb> {
    public static final _vb e = new _vb();

    _vb() {
        super(1);
    }

    /* renamed from: a */
    public final C6749jwb invoke(Constructor<?> constructor) {
        C7471uYa.b(constructor, "p1");
        return new C6749jwb(constructor);
    }

    public final String getName() {
        return "<init>";
    }

    public final C7610wZa h() {
        return HYa.a(C6749jwb.class);
    }

    public final String j() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }
}

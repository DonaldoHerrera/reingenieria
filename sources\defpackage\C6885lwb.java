package defpackage;

/* renamed from: lwb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class C6885lwb extends Tvb implements Qib {
    private final Enum<?> c;

    public C6885lwb(C7694xnb xnb, Enum<?> enumR) {
        C7471uYa.b(enumR, "value");
        super(xnb);
        this.c = enumR;
    }

    public C7280rnb c() {
        Class cls = this.c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C7471uYa.a((Object) cls, "enumClass");
        return Rvb.b(cls);
    }

    public C7694xnb d() {
        return C7694xnb.b(this.c.name());
    }
}

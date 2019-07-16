package defpackage;

/* renamed from: Uab reason: default package and case insensitive filesystem */
/* compiled from: ReflectionFactoryImpl */
public class C5359Uab extends IYa {
    public C7610wZa a(Class cls, String str) {
        return new C6583hab(cls, str);
    }

    public C7472uZa a(Class cls) {
        return C6990n_a.a(cls);
    }

    public String a(C7540vYa vya) {
        return a((C7333sYa) vya);
    }

    public String a(C7333sYa sya) {
        C7679xZa a = WZa.a(sya);
        if (a != null) {
            W_a b = C6312dbb.b(a);
            if (b != null) {
                return C5475Yab.b.b(b.i());
            }
        }
        return super.a(sya);
    }

    public C7679xZa a(C7402tYa tya) {
        return new W_a(a((C6988nYa) tya), tya.getName(), tya.j(), tya.g());
    }

    public EZa a(BYa bYa) {
        return new C6991nab(a((C6988nYa) bYa), bYa.getName(), bYa.j(), bYa.g());
    }

    public C7817zZa a(C7609wYa wya) {
        return new X_a(a((C6988nYa) wya), wya.getName(), wya.j(), wya.g());
    }

    public FZa a(DYa dYa) {
        return new C7198qab(a((C6988nYa) dYa), dYa.getName(), dYa.j(), dYa.g());
    }

    public AZa a(C7678xYa xya) {
        return new Z_a(a((C6988nYa) xya), xya.getName(), xya.j(), xya.g());
    }

    private static N_a a(C6988nYa nya) {
        C7610wZa h = nya.h();
        return h instanceof N_a ? (N_a) h : XZa.d;
    }
}

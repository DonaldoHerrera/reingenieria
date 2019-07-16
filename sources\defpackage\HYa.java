package defpackage;

/* renamed from: HYa reason: default package */
/* compiled from: Reflection */
public class HYa {
    private static final IYa a;
    private static final C7472uZa[] b = new C7472uZa[0];

    static {
        IYa iYa = null;
        try {
            iYa = (IYa) Class.forName("Uab").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (iYa == null) {
            iYa = new IYa();
        }
        a = iYa;
    }

    public static C7610wZa a(Class cls, String str) {
        return a.a(cls, str);
    }

    public static C7472uZa a(Class cls) {
        return a.a(cls);
    }

    public static String a(C7540vYa vya) {
        return a.a(vya);
    }

    public static String a(C7333sYa sya) {
        return a.a(sya);
    }

    public static C7679xZa a(C7402tYa tya) {
        return a.a(tya);
    }

    public static EZa a(BYa bYa) {
        return a.a(bYa);
    }

    public static C7817zZa a(C7609wYa wya) {
        return a.a(wya);
    }

    public static FZa a(DYa dYa) {
        return a.a(dYa);
    }

    public static AZa a(C7678xYa xya) {
        return a.a(xya);
    }
}

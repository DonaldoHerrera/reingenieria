package defpackage;

/* renamed from: IYa reason: default package */
/* compiled from: ReflectionFactory */
public class IYa {
    public AZa a(C7678xYa xya) {
        return xya;
    }

    public EZa a(BYa bYa) {
        return bYa;
    }

    public FZa a(DYa dYa) {
        return dYa;
    }

    public C7610wZa a(Class cls, String str) {
        return new AYa(cls, str);
    }

    public C7679xZa a(C7402tYa tya) {
        return tya;
    }

    public C7817zZa a(C7609wYa wya) {
        return wya;
    }

    public C7472uZa a(Class cls) {
        return new C7126pYa(cls);
    }

    public String a(C7540vYa vya) {
        return a((C7333sYa) vya);
    }

    public String a(C7333sYa sya) {
        String obj = sya.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}

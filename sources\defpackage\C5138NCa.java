package defpackage;

/* renamed from: NCa reason: default package and case insensitive filesystem */
/* compiled from: SoundStreamReplaceTransactionFactory */
public class C5138NCa {
    private final C7054oVa<C3800jea> a;
    private final C7054oVa<C3768fea> b;
    private final C7054oVa<C6332dsa> c;

    public C5138NCa(C7054oVa<C3800jea> ova, C7054oVa<C3768fea> ova2, C7054oVa<C6332dsa> ova3) {
        a(ova, 1);
        this.a = ova;
        a(ova2, 2);
        this.b = ova2;
        a(ova3, 3);
        this.c = ova3;
    }

    public C5107MCa a(Iterable<C2227PP> iterable) {
        a(iterable, 1);
        Iterable iterable2 = iterable;
        Object obj = this.a.get();
        a(obj, 2);
        C3800jea jea = (C3800jea) obj;
        Object obj2 = this.b.get();
        a(obj2, 3);
        C3768fea fea = (C3768fea) obj2;
        Object obj3 = this.c.get();
        a(obj3, 4);
        return new C5107MCa(iterable2, jea, fea, (C6332dsa) obj3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}

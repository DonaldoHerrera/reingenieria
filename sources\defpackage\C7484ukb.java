package defpackage;

/* renamed from: ukb reason: default package and case insensitive filesystem */
/* compiled from: JavaClassDataFinder.kt */
public final class C7484ukb implements C6399erb {
    private final Bkb a;
    private final C7346skb b;

    public C7484ukb(Bkb bkb, C7346skb skb) {
        C7471uYa.b(bkb, "kotlinClassFinder");
        C7471uYa.b(skb, "deserializedDescriptorResolver");
        this.a = bkb;
        this.b = skb;
    }

    public C6331drb a(C7280rnb rnb) {
        C7471uYa.b(rnb, "classId");
        Dkb a2 = Ckb.a(this.a, rnb);
        if (a2 == null) {
            return null;
        }
        boolean a3 = C7471uYa.a((Object) a2.D(), (Object) rnb);
        if (!TVa.a || a3) {
            return this.b.a(a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class with incorrect id found: expected ");
        sb.append(rnb);
        sb.append(", actual ");
        sb.append(a2.D());
        throw new AssertionError(sb.toString());
    }
}

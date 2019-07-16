package defpackage;

/* renamed from: Drb reason: default package */
/* compiled from: NameResolverUtil.kt */
public final class Drb {
    public static final C7280rnb a(Emb emb, int i) {
        C7471uYa.b(emb, "$this$getClassId");
        C7280rnb a = C7280rnb.a(emb.b(i), emb.a(i));
        C7471uYa.a((Object) a, "ClassId.fromString(getQu… isLocalClassName(index))");
        return a;
    }

    public static final C7694xnb b(Emb emb, int i) {
        C7471uYa.b(emb, "$this$getName");
        C7694xnb a = C7694xnb.a(emb.getString(i));
        C7471uYa.a((Object) a, "Name.guessByFirstCharacter(getString(index))");
        return a;
    }
}

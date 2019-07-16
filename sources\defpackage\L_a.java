package defpackage;

/* renamed from: L_a reason: default package */
/* compiled from: KClassImpl.kt */
final /* synthetic */ class L_a extends C7402tYa implements C6308dYa<Crb, Olb, C7408tdb> {
    public static final L_a e = new L_a();

    L_a() {
        super(2);
    }

    /* renamed from: a */
    public final C7408tdb invoke(Crb crb, Olb olb) {
        C7471uYa.b(crb, "p1");
        C7471uYa.b(olb, "p2");
        return crb.a(olb);
    }

    public final String getName() {
        return "loadProperty";
    }

    public final C7610wZa h() {
        return HYa.a(Crb.class);
    }

    public final String j() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }
}

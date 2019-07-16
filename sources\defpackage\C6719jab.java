package defpackage;

/* renamed from: jab reason: default package and case insensitive filesystem */
/* compiled from: KPackageImpl.kt */
final /* synthetic */ class C6719jab extends C7402tYa implements C6308dYa<Crb, Olb, C7408tdb> {
    public static final C6719jab e = new C6719jab();

    C6719jab() {
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

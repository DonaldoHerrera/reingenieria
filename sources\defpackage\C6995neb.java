package defpackage;

import java.util.Map;

/* renamed from: neb reason: default package and case insensitive filesystem */
/* compiled from: BuiltInAnnotationDescriptor.kt */
public final class C6995neb implements C6315deb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C6995neb.class), C1325gg.TYPE, "getType()Lorg/jetbrains/kotlin/types/KotlinType;"))};
    private final C7744yVa b = BVa.a(DVa.PUBLICATION, new C6927meb(this));
    /* access modifiers changed from: private */
    public final C5301Sbb c;
    private final C7349snb d;
    private final Map<C7694xnb, Npb<?>> e;

    public C6995neb(C5301Sbb sbb, C7349snb snb, Map<C7694xnb, ? extends Npb<?>> map) {
        C7471uYa.b(sbb, "builtIns");
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(map, "allValueArguments");
        this.c = sbb;
        this.d = snb;
        this.e = map;
    }

    public C7822zdb getSource() {
        C7822zdb zdb = C7822zdb.a;
        C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
        return zdb;
    }

    public C7706xtb getType() {
        C7744yVa yva = this.b;
        DZa dZa = a[0];
        return (C7706xtb) yva.getValue();
    }

    public C7349snb q() {
        return this.d;
    }

    public Map<C7694xnb, Npb<?>> a() {
        return this.e;
    }
}

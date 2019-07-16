package defpackage;

import java.util.List;

/* renamed from: Ubb reason: default package and case insensitive filesystem */
/* compiled from: ReflectionTypes.kt */
public final class C5360Ubb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C5360Ubb.class), "kotlinReflectScope", "getKotlinReflectScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), HYa.a((DYa) new EYa(HYa.a(C5360Ubb.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), HYa.a((DYa) new EYa(HYa.a(C5360Ubb.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), HYa.a((DYa) new EYa(HYa.a(C5360Ubb.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), HYa.a((DYa) new EYa(HYa.a(C5360Ubb.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), HYa.a((DYa) new EYa(HYa.a(C5360Ubb.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), HYa.a((DYa) new EYa(HYa.a(C5360Ubb.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), HYa.a((DYa) new EYa(HYa.a(C5360Ubb.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    public static final b b = new b(null);
    private final C7744yVa c;
    private final a d = new a(1);
    private final a e = new a(1);
    private final a f = new a(2);
    private final a g = new a(3);
    private final a h = new a(1);
    private final a i = new a(2);
    private final a j = new a(3);
    private final C6586hdb k;

    /* renamed from: Ubb$a */
    /* compiled from: ReflectionTypes.kt */
    private static final class a {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        public final C5029Jcb a(C5360Ubb ubb, DZa<?> dZa) {
            C7471uYa.b(ubb, "types");
            C7471uYa.b(dZa, "property");
            return ubb.a(Cxb.d(dZa.getName()), this.a);
        }
    }

    /* renamed from: Ubb$b */
    /* compiled from: ReflectionTypes.kt */
    public static final class b {
        private b() {
        }

        public final C7706xtb a(C6450fdb fdb) {
            C7471uYa.b(fdb, "module");
            C7280rnb rnb = C5301Sbb.h.la;
            C7471uYa.a((Object) rnb, "KotlinBuiltIns.FQ_NAMES.kProperty");
            C5029Jcb a = C5535_cb.a(fdb, rnb);
            if (a == null) {
                return null;
            }
            C6723jeb a2 = C6723jeb.c.a();
            Ptb Q = a.Q();
            C7471uYa.a((Object) Q, "kPropertyClass.typeConstructor");
            List parameters = Q.getParameters();
            C7471uYa.a((Object) parameters, "kPropertyClass.typeConstructor.parameters");
            Object j = C7676xWa.j(parameters);
            C7471uYa.a(j, "kPropertyClass.typeConstructor.parameters.single()");
            return C7775ytb.a(a2, a, C6850lWa.a(new Jtb((C4905Fdb) j)));
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public C5360Ubb(C6450fdb fdb, C6586hdb hdb) {
        C7471uYa.b(fdb, "module");
        C7471uYa.b(hdb, "notFoundClasses");
        this.k = hdb;
        this.c = BVa.a(DVa.PUBLICATION, new C5389Vbb(fdb));
    }

    private final Eqb b() {
        C7744yVa yva = this.c;
        DZa dZa = a[0];
        return (Eqb) yva.getValue();
    }

    public final C5029Jcb a() {
        return this.d.a(this, a[1]);
    }

    /* access modifiers changed from: private */
    public final C5029Jcb a(String str, int i2) {
        C7694xnb b2 = C7694xnb.b(str);
        C7471uYa.a((Object) b2, "Name.identifier(className)");
        C5122Mcb b3 = b().b(b2, Ffb.FROM_REFLECTION);
        if (!(b3 instanceof C5029Jcb)) {
            b3 = null;
        }
        C5029Jcb jcb = (C5029Jcb) b3;
        return jcb != null ? jcb : this.k.a(new C7280rnb(C5418Wbb.a(), b2), C6850lWa.a(Integer.valueOf(i2)));
    }
}

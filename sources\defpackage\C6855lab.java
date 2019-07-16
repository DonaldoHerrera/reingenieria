package defpackage;

import java.lang.reflect.Type;

/* renamed from: lab reason: default package and case insensitive filesystem */
/* compiled from: KParameterImpl.kt */
final class C6855lab extends C7540vYa implements PXa<Type> {
    final /* synthetic */ C6923mab a;

    C6855lab(C6923mab mab) {
        this.a = mab;
        super(0);
    }

    public final Type d() {
        C7201qdb a2 = this.a.c();
        if (!(a2 instanceof C7615wdb) || !C7471uYa.a((Object) C6312dbb.a((C4904Fcb) this.a.a().i()), (Object) a2) || this.a.a().i().g() != a.FAKE_OVERRIDE) {
            return (Type) this.a.a().f().b().get(this.a.b());
        }
        C5272Rcb e = this.a.a().i().e();
        if (e != null) {
            Class a3 = C6312dbb.a((C5029Jcb) e);
            if (a3 != null) {
                return a3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot determine receiver Java type of inherited declaration: ");
            sb.append(a2);
            throw new C5240Qab(sb.toString());
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }
}

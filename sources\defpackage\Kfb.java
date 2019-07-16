package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: Kfb reason: default package */
/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class Kfb {
    /* access modifiers changed from: private */
    public static final C7349snb a = new C7349snb("javax.annotation.meta.TypeQualifierNickname");
    private static final C7349snb b = new C7349snb("javax.annotation.meta.TypeQualifier");
    /* access modifiers changed from: private */
    public static final C7349snb c = new C7349snb("javax.annotation.meta.TypeQualifierDefault");
    /* access modifiers changed from: private */
    public static final C7349snb d = new C7349snb("kotlin.annotations.jvm.UnderMigration");
    /* access modifiers changed from: private */
    public static final Map<C7349snb, C6862lhb> e = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(new C7349snb("javax.annotation.ParametersAreNullableByDefault"), new C6862lhb(new C6864ljb(C6796kjb.NULLABLE, false, 2, null), C6850lWa.a(a.VALUE_PARAMETER))), NVa.a(new C7349snb("javax.annotation.ParametersAreNonnullByDefault"), new C6862lhb(new C6864ljb(C6796kjb.NOT_NULL, false, 2, null), C6850lWa.a(a.VALUE_PARAMETER)))});
    private static final Set<C7349snb> f = SWa.c(C6725jgb.f(), C6725jgb.e());

    /* access modifiers changed from: private */
    public static final boolean b(C5029Jcb jcb) {
        return f.contains(C7148pqb.c(jcb)) || jcb.getAnnotations().b(b);
    }
}

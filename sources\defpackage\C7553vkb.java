package defpackage;

/* renamed from: vkb reason: default package and case insensitive filesystem */
/* compiled from: JavaFlexibleTypeDeserializer.kt */
public final class C7553vkb implements C7426trb {
    public static final C7553vkb a = new C7553vkb();

    private C7553vkb() {
    }

    public C7706xtb a(_lb _lb, String str, Etb etb, Etb etb2) {
        C7471uYa.b(_lb, "proto");
        C7471uYa.b(str, "flexibleId");
        C7471uYa.b(etb, "lowerBound");
        C7471uYa.b(etb2, "upperBound");
        if (!C7471uYa.a((Object) str, (Object) "kotlin.jvm.PlatformType")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error java flexible type with id: ");
            sb.append(str);
            sb.append(". (");
            sb.append(etb);
            sb.append("..");
            sb.append(etb2);
            sb.append(')');
            Etb c = C7154ptb.c(sb.toString());
            C7471uYa.a((Object) c, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
            return c;
        } else if (_lb.c(Xmb.g)) {
            return new Bib(etb, etb2);
        } else {
            return C7775ytb.a(etb, etb2);
        }
    }
}

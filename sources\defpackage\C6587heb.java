package defpackage;

/* renamed from: heb reason: default package and case insensitive filesystem */
/* compiled from: annotationUtil.kt */
public final class C6587heb {
    private static final C7694xnb a;
    private static final C7694xnb b;
    private static final C7694xnb c;
    private static final C7694xnb d;
    private static final C7694xnb e;

    static {
        C7694xnb b2 = C7694xnb.b("message");
        C7471uYa.a((Object) b2, "Name.identifier(\"message\")");
        a = b2;
        C7694xnb b3 = C7694xnb.b("replaceWith");
        C7471uYa.a((Object) b3, "Name.identifier(\"replaceWith\")");
        b = b3;
        C7694xnb b4 = C7694xnb.b("level");
        C7471uYa.a((Object) b4, "Name.identifier(\"level\")");
        c = b4;
        C7694xnb b5 = C7694xnb.b("expression");
        C7471uYa.a((Object) b5, "Name.identifier(\"expression\")");
        d = b5;
        C7694xnb b6 = C7694xnb.b("imports");
        C7471uYa.a((Object) b6, "Name.identifier(\"imports\")");
        e = b6;
    }

    public static /* synthetic */ C6315deb a(C5301Sbb sbb, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return a(sbb, str, str2, str3);
    }

    public static final C6315deb a(C5301Sbb sbb, String str, String str2, String str3) {
        C7471uYa.b(sbb, "$this$createDeprecatedAnnotation");
        C7471uYa.b(str, "message");
        C7471uYa.b(str2, "replaceWith");
        C7471uYa.b(str3, "level");
        C7349snb snb = C5301Sbb.h.z;
        C7471uYa.a((Object) snb, "KotlinBuiltIns.FQ_NAMES.replaceWith");
        C6995neb neb = new C6995neb(sbb, snb, LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(d, new C5665bqb(str2)), NVa.a(e, new Ipb(C6918mWa.a(), new C6519geb(sbb)))}));
        C7349snb snb2 = C5301Sbb.h.x;
        C7471uYa.a((Object) snb2, "KotlinBuiltIns.FQ_NAMES.deprecated");
        C7694xnb xnb = c;
        C7280rnb a2 = C7280rnb.a(C5301Sbb.h.y);
        C7471uYa.a((Object) a2, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
        C7694xnb b2 = C7694xnb.b(str3);
        C7471uYa.a((Object) b2, "Name.identifier(level)");
        return new C6995neb(sbb, snb2, LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(a, new C5665bqb(str)), NVa.a(b, new Hpb(neb)), NVa.a(xnb, new Spb(a2, b2))}));
    }
}

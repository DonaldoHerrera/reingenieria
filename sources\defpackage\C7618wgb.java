package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;

/* renamed from: wgb reason: default package and case insensitive filesystem */
/* compiled from: JavaAnnotationMapper.kt */
public final class C7618wgb {
    private static final C7349snb a = new C7349snb(Target.class.getCanonicalName());
    private static final C7349snb b = new C7349snb(Retention.class.getCanonicalName());
    private static final C7349snb c = new C7349snb(Deprecated.class.getCanonicalName());
    private static final C7349snb d = new C7349snb(Documented.class.getCanonicalName());
    private static final C7349snb e = new C7349snb("java.lang.annotation.Repeatable");
    private static final C7694xnb f;
    private static final C7694xnb g;
    private static final C7694xnb h;
    private static final Map<C7349snb, C7349snb> i = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(C5301Sbb.h.D, a), NVa.a(C5301Sbb.h.G, b), NVa.a(C5301Sbb.h.H, e), NVa.a(C5301Sbb.h.I, d)});
    private static final Map<C7349snb, C7349snb> j = LWa.b((HVa<? extends K, ? extends V>[]) new HVa[]{NVa.a(a, C5301Sbb.h.D), NVa.a(b, C5301Sbb.h.G), NVa.a(c, C5301Sbb.h.x), NVa.a(e, C5301Sbb.h.H), NVa.a(d, C5301Sbb.h.I)});
    public static final C7618wgb k = new C7618wgb();

    static {
        C7694xnb b2 = C7694xnb.b("message");
        C7471uYa.a((Object) b2, "Name.identifier(\"message\")");
        f = b2;
        C7694xnb b3 = C7694xnb.b("allowedTargets");
        C7471uYa.a((Object) b3, "Name.identifier(\"allowedTargets\")");
        g = b3;
        C7694xnb b4 = C7694xnb.b("value");
        C7471uYa.a((Object) b4, "Name.identifier(\"value\")");
        h = b4;
    }

    private C7618wgb() {
    }

    public final C7694xnb a() {
        return f;
    }

    public final C7694xnb b() {
        return h;
    }

    public final C7694xnb c() {
        return g;
    }

    public final C6315deb a(Eib eib, C6590hhb hhb) {
        C7471uYa.b(eib, "annotation");
        C7471uYa.b(hhb, "c");
        C7280rnb D = eib.D();
        if (C7471uYa.a((Object) D, (Object) C7280rnb.a(a))) {
            return new Hgb(eib, hhb);
        }
        if (C7471uYa.a((Object) D, (Object) C7280rnb.a(b))) {
            return new Fgb(eib, hhb);
        }
        if (C7471uYa.a((Object) D, (Object) C7280rnb.a(e))) {
            C7349snb snb = C5301Sbb.h.H;
            C7471uYa.a((Object) snb, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new C7549vgb(hhb, eib, snb);
        } else if (C7471uYa.a((Object) D, (Object) C7280rnb.a(d))) {
            C7349snb snb2 = C5301Sbb.h.I;
            C7471uYa.a((Object) snb2, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new C7549vgb(hhb, eib, snb2);
        } else if (C7471uYa.a((Object) D, (Object) C7280rnb.a(c))) {
            return null;
        } else {
            return new C7688xhb(hhb, eib);
        }
    }

    public final C6315deb a(C7349snb snb, Hib hib, C6590hhb hhb) {
        C7471uYa.b(snb, "kotlinName");
        C7471uYa.b(hib, "annotationOwner");
        C7471uYa.b(hhb, "c");
        if (C7471uYa.a((Object) snb, (Object) C5301Sbb.h.x)) {
            Eib a2 = hib.a(c);
            if (a2 != null || hib.c()) {
                return new Agb(a2, hhb);
            }
        }
        C7349snb snb2 = (C7349snb) i.get(snb);
        C6315deb deb = null;
        if (snb2 != null) {
            Eib a3 = hib.a(snb2);
            if (a3 != null) {
                deb = k.a(a3, hhb);
            }
        }
        return deb;
    }
}

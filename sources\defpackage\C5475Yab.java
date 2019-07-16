package defpackage;

import java.util.List;

/* renamed from: Yab reason: default package and case insensitive filesystem */
/* compiled from: ReflectionObjectRenderer.kt */
public final class C5475Yab {
    private static final Cob a = Cob.f;
    public static final C5475Yab b = new C5475Yab();

    private C5475Yab() {
    }

    private final void a(StringBuilder sb, C7615wdb wdb) {
        if (wdb != null) {
            C7706xtb type = wdb.getType();
            C7471uYa.a((Object) type, "receiver.type");
            sb.append(a(type));
            sb.append(".");
        }
    }

    public final String b(C5582adb adb) {
        C7471uYa.b(adb, "invoke");
        StringBuilder sb = new StringBuilder();
        b.a(sb, (C4904Fcb) adb);
        List f = adb.f();
        C7471uYa.a((Object) f, "invoke.valueParameters");
        StringBuilder sb2 = sb;
        C7676xWa.a(f, sb2, ", ", "(", ")", 0, null, C5446Xab.a, 48, null);
        sb.append(" -> ");
        C5475Yab yab = b;
        C7706xtb a2 = adb.a();
        if (a2 != null) {
            C7471uYa.a((Object) a2, "invoke.returnType!!");
            sb.append(yab.a(a2));
            String sb3 = sb.toString();
            C7471uYa.a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        C7471uYa.a();
        throw null;
    }

    private final void a(StringBuilder sb, C4904Fcb fcb) {
        C7615wdb a2 = C6312dbb.a(fcb);
        C7615wdb l = fcb.l();
        a(sb, a2);
        boolean z = (a2 == null || l == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        a(sb, l);
        if (z) {
            sb.append(")");
        }
    }

    private final String a(C4904Fcb fcb) {
        if (fcb instanceof C7408tdb) {
            return a((C7408tdb) fcb);
        }
        if (fcb instanceof C5582adb) {
            return a((C5582adb) fcb);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal callable: ");
        sb.append(fcb);
        throw new IllegalStateException(sb.toString().toString());
    }

    public final String a(C7408tdb tdb) {
        C7471uYa.b(tdb, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(tdb.V() ? "var " : "val ");
        b.a(sb, (C4904Fcb) tdb);
        Cob cob = a;
        C7694xnb name = tdb.getName();
        C7471uYa.a((Object) name, "descriptor.name");
        sb.append(cob.a(name, true));
        sb.append(": ");
        C5475Yab yab = b;
        C7706xtb type = tdb.getType();
        C7471uYa.a((Object) type, "descriptor.type");
        sb.append(yab.a(type));
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String a(C5582adb adb) {
        C7471uYa.b(adb, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        b.a(sb, (C4904Fcb) adb);
        Cob cob = a;
        C7694xnb name = adb.getName();
        C7471uYa.a((Object) name, "descriptor.name");
        sb.append(cob.a(name, true));
        List f = adb.f();
        C7471uYa.a((Object) f, "descriptor.valueParameters");
        StringBuilder sb2 = sb;
        C7676xWa.a(f, sb2, ", ", "(", ")", 0, null, C5417Wab.a, 48, null);
        sb.append(": ");
        C5475Yab yab = b;
        C7706xtb a2 = adb.a();
        if (a2 != null) {
            C7471uYa.a((Object) a2, "descriptor.returnType!!");
            sb.append(yab.a(a2));
            String sb3 = sb.toString();
            C7471uYa.a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        C7471uYa.a();
        throw null;
    }

    public final String a(C6923mab mab) {
        C7471uYa.b(mab, "parameter");
        StringBuilder sb = new StringBuilder();
        int i = C5388Vab.a[mab.g().ordinal()];
        if (i == 1) {
            sb.append("extension receiver");
        } else if (i == 2) {
            sb.append("instance");
        } else if (i == 3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("parameter #");
            sb2.append(mab.b());
            sb2.append(' ');
            sb2.append(mab.getName());
            sb.append(sb2.toString());
        }
        sb.append(" of ");
        sb.append(b.a((C4904Fcb) mab.a().i()));
        String sb3 = sb.toString();
        C7471uYa.a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String a(C4905Fdb fdb) {
        C7471uYa.b(fdb, "typeParameter");
        StringBuilder sb = new StringBuilder();
        int i = C5388Vab.b[fdb.pa().ordinal()];
        if (i != 1) {
            if (i == 2) {
                sb.append("in ");
            } else if (i == 3) {
                sb.append("out ");
            }
        }
        sb.append(fdb.getName());
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String a(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        return a.a(xtb);
    }
}

package defpackage;

/* renamed from: Wtb reason: default package */
/* compiled from: TypeSubstitution.kt */
public abstract class Wtb {
    public static final Wtb a = new Vtb();
    public static final a b = new a(null);

    /* renamed from: Wtb$a */
    /* compiled from: TypeSubstitution.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public abstract Stb a(C7706xtb xtb);

    public C6723jeb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "annotations");
        return jeb;
    }

    public C7706xtb a(C7706xtb xtb, C6473fub fub) {
        C7471uYa.b(xtb, "topLevelType");
        C7471uYa.b(fub, "position");
        return xtb;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final _tb c() {
        _tb a2 = _tb.a(this);
        C7471uYa.a((Object) a2, "TypeSubstitutor.create(this)");
        return a2;
    }

    public boolean d() {
        return false;
    }
}

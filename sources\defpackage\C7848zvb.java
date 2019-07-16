package defpackage;

import java.util.Map;

/* renamed from: zvb reason: default package and case insensitive filesystem */
/* compiled from: Jsr305State.kt */
public final class C7848zvb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C7848zvb.class), "description", "getDescription()[Ljava/lang/String;"))};
    public static final C7848zvb b;
    public static final C7848zvb c;
    public static final C7848zvb d;
    public static final a e = new a(null);
    private final C7744yVa f;
    private final Dvb g;
    private final Dvb h;
    private final Map<String, Dvb> i;
    private final boolean j;

    /* renamed from: zvb$a */
    /* compiled from: Jsr305State.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        C7848zvb zvb = new C7848zvb(Dvb.WARN, null, LWa.a(), false, 8, null);
        b = zvb;
        Dvb dvb = Dvb.IGNORE;
        C7848zvb zvb2 = new C7848zvb(dvb, dvb, LWa.a(), false, 8, null);
        c = zvb2;
        Dvb dvb2 = Dvb.STRICT;
        C7848zvb zvb3 = new C7848zvb(dvb2, dvb2, LWa.a(), false, 8, null);
        d = zvb3;
    }

    public C7848zvb(Dvb dvb, Dvb dvb2, Map<String, ? extends Dvb> map, boolean z) {
        C7471uYa.b(dvb, "global");
        C7471uYa.b(map, "user");
        this.g = dvb;
        this.h = dvb2;
        this.i = map;
        this.j = z;
        this.f = BVa.a(new Avb(this));
    }

    public final boolean a() {
        return this == c;
    }

    public final boolean b() {
        return this.j;
    }

    public final Dvb c() {
        return this.g;
    }

    public final Dvb d() {
        return this.h;
    }

    public final Map<String, Dvb> e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7848zvb) {
                C7848zvb zvb = (C7848zvb) obj;
                if (C7471uYa.a((Object) this.g, (Object) zvb.g) && C7471uYa.a((Object) this.h, (Object) zvb.h) && C7471uYa.a((Object) this.i, (Object) zvb.i)) {
                    if (this.j == zvb.j) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Dvb dvb = this.g;
        int i2 = 0;
        int hashCode = (dvb != null ? dvb.hashCode() : 0) * 31;
        Dvb dvb2 = this.h;
        int hashCode2 = (hashCode + (dvb2 != null ? dvb2.hashCode() : 0)) * 31;
        Map<String, Dvb> map = this.i;
        if (map != null) {
            i2 = map.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.j;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jsr305State(global=");
        sb.append(this.g);
        sb.append(", migration=");
        sb.append(this.h);
        sb.append(", user=");
        sb.append(this.i);
        sb.append(", enableCompatqualCheckerFrameworkAnnotations=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C7848zvb(Dvb dvb, Dvb dvb2, Map map, boolean z, int i2, C7264rYa rya) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        this(dvb, dvb2, map, z);
    }
}

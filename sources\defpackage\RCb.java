package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: RCb reason: default package */
/* compiled from: DateTimeParseContext */
final class RCb {
    private Locale a;
    private WCb b;
    private C6625iCb c;
    /* access modifiers changed from: private */
    public NBb d;
    private boolean e = true;
    private boolean f = true;
    private final ArrayList<a> g = new ArrayList<>();

    /* renamed from: RCb$a */
    /* compiled from: DateTimeParseContext */
    final class a extends C6287dDb {
        C6625iCb a;
        NBb b;
        final Map<C7381tDb, Long> c;
        boolean d;
        EBb e;
        List<Object[]> f;

        /* access modifiers changed from: protected */
        public a J() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c.putAll(this.c);
            aVar.d = this.d;
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        public GCb K() {
            GCb gCb = new GCb();
            gCb.a.putAll(this.c);
            gCb.b = RCb.this.b();
            NBb nBb = this.b;
            if (nBb != null) {
                gCb.c = nBb;
            } else {
                gCb.c = RCb.this.d;
            }
            gCb.f = this.d;
            gCb.g = this.e;
            return gCb;
        }

        public <R> R a(CDb<R> cDb) {
            if (cDb == BDb.a()) {
                return this.a;
            }
            if (cDb == BDb.g() || cDb == BDb.f()) {
                return this.b;
            }
            return super.a(cDb);
        }

        public boolean b(C7381tDb tdb) {
            return this.c.containsKey(tdb);
        }

        public int c(C7381tDb tdb) {
            if (this.c.containsKey(tdb)) {
                return C6355eDb.a(((Long) this.c.get(tdb)).longValue());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }

        public long d(C7381tDb tdb) {
            if (this.c.containsKey(tdb)) {
                return ((Long) this.c.get(tdb)).longValue();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(tdb);
            throw new EDb(sb.toString());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c.toString());
            String str = ",";
            sb.append(str);
            sb.append(this.a);
            sb.append(str);
            sb.append(this.b);
            return sb.toString();
        }

        private a() {
            this.a = null;
            this.b = null;
            this.c = new HashMap();
            this.e = EBb.a;
        }
    }

    RCb(JCb jCb) {
        this.a = jCb.c();
        this.b = jCb.b();
        this.c = jCb.a();
        this.d = jCb.d();
        this.g.add(new a());
    }

    private a j() {
        ArrayList<a> arrayList = this.g;
        return (a) arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: 0000 */
    public C6625iCb b() {
        C6625iCb icb = j().a;
        if (icb != null) {
            return icb;
        }
        C6625iCb icb2 = this.c;
        return icb2 == null ? C7034oCb.e : icb2;
    }

    /* access modifiers changed from: 0000 */
    public Locale c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public WCb d() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public boolean e() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public boolean f() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        j().d = true;
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        this.g.add(j().J());
    }

    /* access modifiers changed from: 0000 */
    public a i() {
        return j();
    }

    public String toString() {
        return j().toString();
    }

    /* access modifiers changed from: 0000 */
    public RCb a() {
        return new RCb(this);
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z) {
        this.f = z;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (e()) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
        } else {
            for (int i5 = 0; i5 < i3; i5++) {
                char charAt = charSequence.charAt(i + i5);
                char charAt2 = charSequence2.charAt(i2 + i5);
                if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        this.e = z;
    }

    static boolean b(char c2, char c3) {
        return c2 == c3 || Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
    }

    RCb(RCb rCb) {
        this.a = rCb.a;
        this.b = rCb.b;
        this.c = rCb.c;
        this.d = rCb.d;
        this.e = rCb.e;
        this.f = rCb.f;
        this.g.add(new a());
    }

    /* access modifiers changed from: 0000 */
    public boolean a(char c2, char c3) {
        if (!e()) {
            return b(c2, c3);
        }
        return c2 == c3;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        if (z) {
            ArrayList<a> arrayList = this.g;
            arrayList.remove(arrayList.size() - 2);
            return;
        }
        ArrayList<a> arrayList2 = this.g;
        arrayList2.remove(arrayList2.size() - 1);
    }

    /* access modifiers changed from: 0000 */
    public Long a(C7381tDb tdb) {
        return (Long) j().c.get(tdb);
    }

    /* access modifiers changed from: 0000 */
    public int a(C7381tDb tdb, long j, int i, int i2) {
        C6355eDb.a(tdb, "field");
        Long l = (Long) j().c.put(tdb, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    /* access modifiers changed from: 0000 */
    public void a(j jVar, long j, int i, int i2) {
        a j2 = j();
        if (j2.f == null) {
            j2.f = new ArrayList(2);
        }
        j2.f.add(new Object[]{jVar, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* access modifiers changed from: 0000 */
    public void a(NBb nBb) {
        C6355eDb.a(nBb, "zone");
        j().b = nBb;
    }
}

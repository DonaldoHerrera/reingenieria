package defpackage;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: hC reason: default package and case insensitive filesystem */
/* compiled from: CacheBuilder */
public final class C3024hC<K, V> {
    static final Supplier<? extends C2475cC> a = Suppliers.ofInstance(new C2967eC());
    static final C3062jC b;
    static final Supplier<C2475cC> c = new C2986fC();
    static final Ticker d = new C3005gC();
    private static final Logger e = Logger.getLogger(C3024hC.class.getName());
    boolean f = true;
    int g = -1;
    int h = -1;
    long i = -1;
    long j = -1;
    C2345WC<? super K, ? super V> k;
    r l;
    r m;
    long n = -1;
    long o = -1;
    long p = -1;
    Equivalence<Object> q;
    Equivalence<Object> r;
    C2271SC<? super K, ? super V> s;
    Ticker t;
    Supplier<? extends C2475cC> u = a;

    /* renamed from: hC$a */
    /* compiled from: CacheBuilder */
    enum a implements C2271SC<Object, Object> {
        INSTANCE;

        public void a(C2290TC<Object, Object> tc) {
        }
    }

    /* renamed from: hC$b */
    /* compiled from: CacheBuilder */
    enum b implements C2345WC<Object, Object> {
        INSTANCE;

        public int a(Object obj, Object obj2) {
            return 1;
        }
    }

    static {
        C3062jC jCVar = new C3062jC(0, 0, 0, 0, 0, 0);
        b = jCVar;
    }

    private C3024hC() {
    }

    public static C3024hC<Object, Object> o() {
        return new C3024hC<>();
    }

    private void p() {
        Preconditions.checkState(this.p == -1, "refreshAfterWrite requires a LoadingCache");
    }

    private void q() {
        boolean z = true;
        if (this.k == null) {
            if (this.j != -1) {
                z = false;
            }
            Preconditions.checkState(z, "maximumWeight requires weigher");
        } else if (this.f) {
            if (this.j == -1) {
                z = false;
            }
            Preconditions.checkState(z, "weigher requires maximumWeight");
        } else if (this.j == -1) {
            e.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    /* access modifiers changed from: 0000 */
    public C3024hC<K, V> a(Equivalence<Object> equivalence) {
        Preconditions.checkState(this.q == null, "key equivalence was already set to %s", (Object) this.q);
        Preconditions.checkNotNull(equivalence);
        this.q = equivalence;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public C3024hC<K, V> b(Equivalence<Object> equivalence) {
        Preconditions.checkState(this.r == null, "value equivalence was already set to %s", (Object) this.r);
        Preconditions.checkNotNull(equivalence);
        this.r = equivalence;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public long c() {
        long j2 = this.o;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    /* access modifiers changed from: 0000 */
    public long d() {
        long j2 = this.n;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        int i2 = this.g;
        if (i2 == -1) {
            return 16;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public Equivalence<Object> f() {
        return (Equivalence) MoreObjects.firstNonNull(this.q, g().a());
    }

    /* access modifiers changed from: 0000 */
    public r g() {
        return (r) MoreObjects.firstNonNull(this.l, r.STRONG);
    }

    /* access modifiers changed from: 0000 */
    public long h() {
        if (this.n == 0 || this.o == 0) {
            return 0;
        }
        return this.k == null ? this.i : this.j;
    }

    /* access modifiers changed from: 0000 */
    public long i() {
        long j2 = this.p;
        if (j2 == -1) {
            return 0;
        }
        return j2;
    }

    /* access modifiers changed from: 0000 */
    public <K1 extends K, V1 extends V> C2271SC<K1, V1> j() {
        return (C2271SC) MoreObjects.firstNonNull(this.s, a.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public Supplier<? extends C2475cC> k() {
        return this.u;
    }

    /* access modifiers changed from: 0000 */
    public Equivalence<Object> l() {
        return (Equivalence) MoreObjects.firstNonNull(this.r, m().a());
    }

    /* access modifiers changed from: 0000 */
    public r m() {
        return (r) MoreObjects.firstNonNull(this.m, r.STRONG);
    }

    /* access modifiers changed from: 0000 */
    public <K1 extends K, V1 extends V> C2345WC<K1, V1> n() {
        return (C2345WC) MoreObjects.firstNonNull(this.k, b.INSTANCE);
    }

    public String toString() {
        ToStringHelper stringHelper = MoreObjects.toStringHelper((Object) this);
        int i2 = this.g;
        if (i2 != -1) {
            stringHelper.add("initialCapacity", i2);
        }
        int i3 = this.h;
        if (i3 != -1) {
            stringHelper.add("concurrencyLevel", i3);
        }
        long j2 = this.i;
        if (j2 != -1) {
            stringHelper.add("maximumSize", j2);
        }
        long j3 = this.j;
        if (j3 != -1) {
            stringHelper.add("maximumWeight", j3);
        }
        String str = "ns";
        if (this.n != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.n);
            sb.append(str);
            stringHelper.add("expireAfterWrite", (Object) sb.toString());
        }
        if (this.o != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.o);
            sb2.append(str);
            stringHelper.add("expireAfterAccess", (Object) sb2.toString());
        }
        r rVar = this.l;
        if (rVar != null) {
            stringHelper.add("keyStrength", (Object) Ascii.toLowerCase(rVar.toString()));
        }
        r rVar2 = this.m;
        if (rVar2 != null) {
            stringHelper.add("valueStrength", (Object) Ascii.toLowerCase(rVar2.toString()));
        }
        if (this.q != null) {
            stringHelper.addValue((Object) "keyEquivalence");
        }
        if (this.r != null) {
            stringHelper.addValue((Object) "valueEquivalence");
        }
        if (this.s != null) {
            stringHelper.addValue((Object) "removalListener");
        }
        return stringHelper.toString();
    }

    public C3024hC<K, V> a(int i2) {
        boolean z = true;
        Preconditions.checkState(this.h == -1, "concurrency level was already set to %s", this.h);
        if (i2 <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.h = i2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        int i2 = this.h;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    public C3024hC<K, V> b(long j2) {
        boolean z = true;
        Preconditions.checkState(this.j == -1, "maximum weight was already set to %s", this.j);
        Preconditions.checkState(this.i == -1, "maximum size was already set to %s", this.i);
        this.j = j2;
        if (j2 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "maximum weight must not be negative");
        return this;
    }

    public C3024hC<K, V> a(long j2) {
        boolean z = true;
        Preconditions.checkState(this.i == -1, "maximum size was already set to %s", this.i);
        Preconditions.checkState(this.j == -1, "maximum weight was already set to %s", this.j);
        Preconditions.checkState(this.k == null, "maximum size can not be combined with weigher");
        if (j2 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "maximum size must not be negative");
        this.i = j2;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public C3024hC<K, V> b(r rVar) {
        Preconditions.checkState(this.m == null, "Value strength was already set to %s", (Object) this.m);
        Preconditions.checkNotNull(rVar);
        this.m = rVar;
        return this;
    }

    public C3024hC<K, V> b(long j2, TimeUnit timeUnit) {
        boolean z = true;
        Preconditions.checkState(this.n == -1, "expireAfterWrite was already set to %s ns", this.n);
        if (j2 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "duration cannot be negative: %s %s", j2, (Object) timeUnit);
        this.n = timeUnit.toNanos(j2);
        return this;
    }

    public <K1 extends K, V1 extends V> C3024hC<K1, V1> a(C2345WC<? super K1, ? super V1> wc) {
        boolean z = true;
        Preconditions.checkState(this.k == null);
        if (this.f) {
            if (this.i != -1) {
                z = false;
            }
            Preconditions.checkState(z, "weigher can not be combined with maximum size", this.i);
        }
        Preconditions.checkNotNull(wc);
        this.k = wc;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public C3024hC<K, V> a(r rVar) {
        Preconditions.checkState(this.l == null, "Key strength was already set to %s", (Object) this.l);
        Preconditions.checkNotNull(rVar);
        this.l = rVar;
        return this;
    }

    public C3024hC<K, V> a(long j2, TimeUnit timeUnit) {
        boolean z = true;
        Preconditions.checkState(this.o == -1, "expireAfterAccess was already set to %s ns", this.o);
        if (j2 < 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "duration cannot be negative: %s %s", j2, (Object) timeUnit);
        this.o = timeUnit.toNanos(j2);
        return this;
    }

    public C3024hC<K, V> a(Ticker ticker) {
        Preconditions.checkState(this.t == null);
        Preconditions.checkNotNull(ticker);
        this.t = ticker;
        return this;
    }

    /* access modifiers changed from: 0000 */
    public Ticker a(boolean z) {
        Ticker ticker = this.t;
        if (ticker != null) {
            return ticker;
        }
        return z ? Ticker.systemTicker() : d;
    }

    @CheckReturnValue
    public <K1 extends K, V1 extends V> C3024hC<K1, V1> a(C2271SC<? super K1, ? super V1> sc) {
        Preconditions.checkState(this.s == null);
        Preconditions.checkNotNull(sc);
        this.s = sc;
        return this;
    }

    public <K1 extends K, V1 extends V> C3100lC<K1, V1> a(C3043iC<? super K1, V1> iCVar) {
        q();
        return new l(this, iCVar);
    }

    public <K1 extends K, V1 extends V> C2948dC<K1, V1> a() {
        q();
        p();
        return new m(this);
    }
}

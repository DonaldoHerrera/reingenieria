package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: JobRequest */
public final class s {
    public static final a a = a.EXPONENTIAL;
    public static final d b = d.ANY;
    public static final c c = new p();
    public static final long d = TimeUnit.MINUTES.toMillis(15);
    public static final long e = TimeUnit.MINUTES.toMillis(5);
    /* access modifiers changed from: private */
    public static final Dj f = new Dj("JobRequest");
    private final b g;
    private int h;
    private long i;
    private boolean j;
    private boolean k;
    private long l;

    /* compiled from: JobRequest */
    public enum a {
        LINEAR,
        EXPONENTIAL
    }

    /* compiled from: JobRequest */
    public static final class b {
        /* access modifiers changed from: private */
        public int a;
        final String b;
        /* access modifiers changed from: private */
        public long c;
        /* access modifiers changed from: private */
        public long d;
        /* access modifiers changed from: private */
        public long e;
        /* access modifiers changed from: private */
        public a f;
        /* access modifiers changed from: private */
        public long g;
        /* access modifiers changed from: private */
        public long h;
        /* access modifiers changed from: private */
        public boolean i;
        /* access modifiers changed from: private */
        public boolean j;
        /* access modifiers changed from: private */
        public boolean k;
        /* access modifiers changed from: private */
        public boolean l;
        /* access modifiers changed from: private */
        public boolean m;
        /* access modifiers changed from: private */
        public boolean n;
        /* access modifiers changed from: private */
        public d o;
        /* access modifiers changed from: private */
        public Ij p;
        /* access modifiers changed from: private */
        public String q;
        /* access modifiers changed from: private */
        public boolean r;
        /* access modifiers changed from: private */
        public boolean s;
        /* access modifiers changed from: private */
        public Bundle t;

        /* synthetic */ b(Cursor cursor, p pVar) {
            this(cursor);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            if (this.a != ((b) obj).a) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.a;
        }

        /* synthetic */ b(b bVar, p pVar) {
            this(bVar);
        }

        public b b(boolean z) {
            this.l = z;
            return this;
        }

        public b c(boolean z) {
            this.j = z;
            return this;
        }

        public b d(boolean z) {
            this.k = z;
            return this;
        }

        public b e(boolean z) {
            this.m = z;
            return this;
        }

        public b f(boolean z) {
            this.r = z;
            return this;
        }

        /* synthetic */ b(b bVar, boolean z, p pVar) {
            this(bVar, z);
        }

        public b b() {
            a(1);
            return this;
        }

        public b(String str) {
            this.t = Bundle.EMPTY;
            Fj.a(str);
            this.b = str;
            this.a = -8765;
            this.c = -1;
            this.d = -1;
            this.e = 30000;
            this.f = s.a;
            this.o = s.b;
        }

        /* access modifiers changed from: private */
        public void a(ContentValues contentValues) {
            contentValues.put("_id", Integer.valueOf(this.a));
            contentValues.put("tag", this.b);
            contentValues.put("startMs", Long.valueOf(this.c));
            contentValues.put("endMs", Long.valueOf(this.d));
            contentValues.put("backoffMs", Long.valueOf(this.e));
            contentValues.put("backoffPolicy", this.f.toString());
            contentValues.put("intervalMs", Long.valueOf(this.g));
            contentValues.put("flexMs", Long.valueOf(this.h));
            contentValues.put("requirementsEnforced", Boolean.valueOf(this.i));
            contentValues.put("requiresCharging", Boolean.valueOf(this.j));
            contentValues.put("requiresDeviceIdle", Boolean.valueOf(this.k));
            contentValues.put("requiresBatteryNotLow", Boolean.valueOf(this.l));
            contentValues.put("requiresStorageNotLow", Boolean.valueOf(this.m));
            contentValues.put("exact", Boolean.valueOf(this.n));
            contentValues.put("networkType", this.o.toString());
            Ij ij = this.p;
            String str = "extras";
            if (ij != null) {
                contentValues.put(str, ij.a());
            } else if (!TextUtils.isEmpty(this.q)) {
                contentValues.put(str, this.q);
            }
            contentValues.put("transient", Boolean.valueOf(this.s));
        }

        public b b(long j2, long j3) {
            Fj.a(j2, s.m(), Long.MAX_VALUE, "intervalMs");
            this.g = j2;
            Fj.a(j3, s.l(), this.g, "flexMs");
            this.h = j3;
            return this;
        }

        private b(Cursor cursor) {
            this.t = Bundle.EMPTY;
            this.a = cursor.getInt(cursor.getColumnIndex("_id"));
            this.b = cursor.getString(cursor.getColumnIndex("tag"));
            this.c = cursor.getLong(cursor.getColumnIndex("startMs"));
            this.d = cursor.getLong(cursor.getColumnIndex("endMs"));
            this.e = cursor.getLong(cursor.getColumnIndex("backoffMs"));
            try {
                this.f = a.valueOf(cursor.getString(cursor.getColumnIndex("backoffPolicy")));
            } catch (Throwable th) {
                s.f.a(th);
                this.f = s.a;
            }
            this.g = cursor.getLong(cursor.getColumnIndex("intervalMs"));
            this.h = cursor.getLong(cursor.getColumnIndex("flexMs"));
            boolean z = true;
            this.i = cursor.getInt(cursor.getColumnIndex("requirementsEnforced")) > 0;
            this.j = cursor.getInt(cursor.getColumnIndex("requiresCharging")) > 0;
            this.k = cursor.getInt(cursor.getColumnIndex("requiresDeviceIdle")) > 0;
            this.l = cursor.getInt(cursor.getColumnIndex("requiresBatteryNotLow")) > 0;
            this.m = cursor.getInt(cursor.getColumnIndex("requiresStorageNotLow")) > 0;
            this.n = cursor.getInt(cursor.getColumnIndex("exact")) > 0;
            try {
                this.o = d.valueOf(cursor.getString(cursor.getColumnIndex("networkType")));
            } catch (Throwable th2) {
                s.f.a(th2);
                this.o = s.b;
            }
            this.q = cursor.getString(cursor.getColumnIndex("extras"));
            if (cursor.getInt(cursor.getColumnIndex("transient")) <= 0) {
                z = false;
            }
            this.s = z;
        }

        public b a(long j2, long j3) {
            Fj.b(j2, "startInMs must be greater than 0");
            this.c = j2;
            Fj.a(j3, j2, Long.MAX_VALUE, "endInMs");
            this.d = j3;
            if (this.c > 6148914691236517204L) {
                s.f.c("startInMs reduced from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(this.c)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                this.c = 6148914691236517204L;
            }
            if (this.d > 6148914691236517204L) {
                s.f.c("endInMs reduced from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(this.d)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                this.d = 6148914691236517204L;
            }
            return this;
        }

        public b a(Ij ij) {
            if (ij == null) {
                this.p = null;
                this.q = null;
            } else {
                this.p = new Ij(ij);
            }
            return this;
        }

        public b a(boolean z) {
            this.i = z;
            return this;
        }

        private b(b bVar) {
            this(bVar, false);
        }

        public b a(d dVar) {
            this.o = dVar;
            return this;
        }

        private b(b bVar, boolean z) {
            int i2;
            this.t = Bundle.EMPTY;
            if (z) {
                i2 = -8765;
            } else {
                i2 = bVar.a;
            }
            this.a = i2;
            this.b = bVar.b;
            this.c = bVar.c;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
        }

        public b a(long j2) {
            this.n = true;
            if (j2 > 6148914691236517204L) {
                s.f.c("exactInMs clamped from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(j2)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                j2 = 6148914691236517204L;
            }
            a(j2, j2);
            return this;
        }

        public b a(long j2, a aVar) {
            Fj.b(j2, "backoffMs must be > 0");
            this.e = j2;
            Fj.a(aVar);
            this.f = aVar;
            return this;
        }

        public b a(Bundle bundle) {
            this.s = bundle != null && !bundle.isEmpty();
            this.t = this.s ? new Bundle(bundle) : Bundle.EMPTY;
            return this;
        }

        public s a() {
            Fj.a(this.b);
            Fj.b(this.e, "backoffMs must be > 0");
            Fj.a(this.f);
            Fj.a(this.o);
            long j2 = this.g;
            if (j2 > 0) {
                Fj.a(j2, s.m(), Long.MAX_VALUE, "intervalMs");
                Fj.a(this.h, s.l(), this.g, "flexMs");
                if (this.g < s.d || this.h < s.e) {
                    s.f.d("AllowSmallerIntervals enabled, this will crash on Android N and later, interval %d (minimum is %d), flex %d (minimum is %d)", Long.valueOf(this.g), Long.valueOf(s.d), Long.valueOf(this.h), Long.valueOf(s.e));
                }
            }
            if (this.n && this.g > 0) {
                throw new IllegalArgumentException("Can't call setExact() on a periodic job.");
            } else if (this.n && this.c != this.d) {
                throw new IllegalArgumentException("Can't call setExecutionWindow() for an exact job.");
            } else if (this.n && (this.i || this.k || this.j || !s.b.equals(this.o) || this.l || this.m)) {
                throw new IllegalArgumentException("Can't require any condition for an exact job.");
            } else if (this.g <= 0 && (this.c == -1 || this.d == -1)) {
                throw new IllegalArgumentException("You're trying to build a job with no constraints, this is not allowed.");
            } else if (this.g > 0 && (this.c != -1 || this.d != -1)) {
                throw new IllegalArgumentException("Can't call setExecutionWindow() on a periodic job.");
            } else if (this.g <= 0 || (this.e == 30000 && s.a.equals(this.f))) {
                if (this.g <= 0 && (this.c > 3074457345618258602L || this.d > 3074457345618258602L)) {
                    s.f.d("Attention: your execution window is too large. This could result in undesired behavior, see https://github.com/evernote/android-job/wiki/FAQ");
                }
                if (this.g <= 0 && this.c > TimeUnit.DAYS.toMillis(365)) {
                    s.f.d("Warning: job with tag %s scheduled over a year in the future", this.b);
                }
                int i2 = this.a;
                String str = "id can't be negative";
                if (i2 != -8765) {
                    Fj.a(i2, str);
                }
                b bVar = new b(this);
                if (this.a == -8765) {
                    bVar.a = l.g().f().d();
                    Fj.a(bVar.a, str);
                }
                return new s(bVar, null);
            } else {
                throw new IllegalArgumentException("A periodic job will not respect any back-off policy, so calling setBackoffCriteria() with setPeriodic() is an error.");
            }
        }
    }

    /* compiled from: JobRequest */
    public interface c {
        void a(int i, String str, Exception exc);
    }

    /* compiled from: JobRequest */
    public enum d {
        ANY,
        CONNECTED,
        UNMETERED,
        NOT_ROAMING,
        METERED
    }

    /* synthetic */ s(b bVar, p pVar) {
        this(bVar);
    }

    private static Context H() {
        return l.g().c();
    }

    static long l() {
        return g.e() ? TimeUnit.SECONDS.toMillis(30) : e;
    }

    static long m() {
        return g.e() ? TimeUnit.MINUTES.toMillis(1) : d;
    }

    public boolean A() {
        return this.g.l;
    }

    public boolean B() {
        return this.g.j;
    }

    public boolean C() {
        return this.g.k;
    }

    public boolean D() {
        return this.g.m;
    }

    public int E() {
        l.g().a(this);
        return k();
    }

    public void F() {
        a(c);
    }

    /* access modifiers changed from: 0000 */
    public ContentValues G() {
        ContentValues contentValues = new ContentValues();
        this.g.a(contentValues);
        contentValues.put("numFailures", Integer.valueOf(this.h));
        contentValues.put("scheduledAt", Long.valueOf(this.i));
        contentValues.put("started", Boolean.valueOf(this.j));
        contentValues.put("flexSupport", Boolean.valueOf(this.k));
        contentValues.put("lastRun", Long.valueOf(this.l));
        return contentValues;
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z) {
        this.k = z;
    }

    public long c() {
        return this.g.e;
    }

    public a d() {
        return this.g.f;
    }

    public long e() {
        return this.g.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return this.g.equals(((s) obj).g);
    }

    public Ij f() {
        if (this.g.p == null && !TextUtils.isEmpty(this.g.q)) {
            b bVar = this.g;
            bVar.p = Ij.a(bVar.q);
        }
        return this.g.p;
    }

    public int g() {
        return this.h;
    }

    public long h() {
        return this.g.h;
    }

    public int hashCode() {
        return this.g.hashCode();
    }

    public long i() {
        return this.g.g;
    }

    /* access modifiers changed from: 0000 */
    public e j() {
        return this.g.n ? e.V_14 : e.a(H());
    }

    public int k() {
        return this.g.a;
    }

    public long n() {
        return this.i;
    }

    public long o() {
        return this.g.c;
    }

    public String p() {
        return this.g.b;
    }

    public Bundle q() {
        return this.g.t;
    }

    public boolean r() {
        return B() || C() || A() || D() || y() != b;
    }

    public boolean s() {
        return this.g.n;
    }

    /* access modifiers changed from: 0000 */
    public boolean t() {
        return this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("request{id=");
        sb.append(k());
        sb.append(", tag=");
        sb.append(p());
        sb.append(", transient=");
        sb.append(w());
        sb.append('}');
        return sb.toString();
    }

    public boolean u() {
        return i() > 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean v() {
        return this.j;
    }

    public boolean w() {
        return this.g.s;
    }

    public boolean x() {
        return this.g.r;
    }

    public d y() {
        return this.g.o;
    }

    public boolean z() {
        return this.g.i;
    }

    private s(b bVar) {
        this.g = bVar;
    }

    /* access modifiers changed from: 0000 */
    public long a(boolean z) {
        long j2 = 0;
        if (u()) {
            return 0;
        }
        int i2 = r.a[d().ordinal()];
        if (i2 == 1) {
            j2 = ((long) this.h) * c();
        } else if (i2 != 2) {
            throw new IllegalStateException("not implemented");
        } else if (this.h != 0) {
            j2 = (long) (((double) c()) * Math.pow(2.0d, (double) (this.h - 1)));
        }
        if (z && !s()) {
            j2 = (long) (((float) j2) * 1.2f);
        }
        return Math.min(j2, TimeUnit.HOURS.toMillis(5));
    }

    public b b() {
        long j2 = this.i;
        l.g().a(k());
        b bVar = new b(this.g, (p) null);
        this.j = false;
        if (!u()) {
            long currentTimeMillis = g.a().currentTimeMillis() - j2;
            bVar.a(Math.max(1, o() - currentTimeMillis), Math.max(1, e() - currentTimeMillis));
        }
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z) {
        this.j = z;
        ContentValues contentValues = new ContentValues();
        contentValues.put("started", Boolean.valueOf(this.j));
        l.g().f().a(this, contentValues);
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z, boolean z2) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            this.h++;
            contentValues.put("numFailures", Integer.valueOf(this.h));
        }
        if (z2) {
            this.l = g.a().currentTimeMillis();
            contentValues.put("lastRun", Long.valueOf(this.l));
        }
        l.g().f().a(this, contentValues);
    }

    /* access modifiers changed from: 0000 */
    public void a(long j2) {
        this.i = j2;
    }

    public void a(c cVar) {
        Fj.a(cVar);
        g.b().execute(new q(this, cVar));
    }

    /* access modifiers changed from: 0000 */
    public s a(boolean z, boolean z2) {
        s a2 = new b(this.g, z2, null).a();
        if (z) {
            a2.h = this.h + 1;
        }
        try {
            a2.E();
        } catch (Exception e2) {
            f.a((Throwable) e2);
        }
        return a2;
    }

    static s a(Cursor cursor) {
        s a2 = new b(cursor, (p) null).a();
        a2.h = cursor.getInt(cursor.getColumnIndex("numFailures"));
        a2.i = cursor.getLong(cursor.getColumnIndex("scheduledAt"));
        boolean z = true;
        a2.j = cursor.getInt(cursor.getColumnIndex("started")) > 0;
        if (cursor.getInt(cursor.getColumnIndex("flexSupport")) <= 0) {
            z = false;
        }
        a2.k = z;
        a2.l = cursor.getLong(cursor.getColumnIndex("lastRun"));
        Fj.a(a2.h, "failure count can't be negative");
        Fj.a(a2.i, "scheduled at can't be negative");
        return a2;
    }
}

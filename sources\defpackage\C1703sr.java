package defpackage;

import android.text.format.DateUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.internal.cast.X;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: sr reason: default package and case insensitive filesystem */
public final class C1703sr {
    private static int a = C1733tr.b;
    C0650e b;

    private C1703sr() {
    }

    public static C1703sr b() {
        return new C1703sr();
    }

    private final MediaMetadata j() {
        C0650e eVar = this.b;
        if (eVar == null || !eVar.m()) {
            return null;
        }
        MediaInfo g = this.b.g();
        if (g == null) {
            return null;
        }
        return g.getMetadata();
    }

    private final Long k() {
        C0650e eVar = this.b;
        if (eVar != null && eVar.m() && this.b.o()) {
            MediaInfo g = this.b.g();
            MediaMetadata j = j();
            if (!(g == null || j == null)) {
                String str = "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA";
                if (j.a(str) && (j.a("com.google.android.gms.cast.metadata.SECTION_DURATION") || this.b.A())) {
                    return Long.valueOf(j.c(str));
                }
            }
        }
        return null;
    }

    private final Long l() {
        C0650e eVar = this.b;
        if (eVar != null && eVar.m() && this.b.o() && this.b.A()) {
            MediaStatus i = this.b.i();
            if (!(i == null || i.X() == null)) {
                return Long.valueOf(this.b.c());
            }
        }
        return null;
    }

    private final Long m() {
        C0650e eVar = this.b;
        if (eVar != null && eVar.m() && this.b.o() && this.b.A()) {
            MediaStatus i = this.b.i();
            if (!(i == null || i.X() == null)) {
                return Long.valueOf(this.b.b());
            }
        }
        return null;
    }

    private final Long n() {
        C0650e eVar = this.b;
        if (eVar != null && eVar.m() && this.b.o()) {
            MediaInfo g = this.b.g();
            if (!(g == null || g.Z() == -1)) {
                return Long.valueOf(g.Z());
            }
        }
        return null;
    }

    public final int a() {
        C0650e eVar = this.b;
        long j = 1;
        if (eVar != null && eVar.m()) {
            if (this.b.o()) {
                Long i = i();
                if (i != null) {
                    j = i.longValue();
                } else {
                    Long m = m();
                    j = m != null ? m.longValue() : Math.max(this.b.d(), 1);
                }
            } else if (this.b.p()) {
                MediaQueueItem f = this.b.f();
                if (f != null) {
                    MediaInfo H = f.H();
                    if (H != null) {
                        j = Math.max(H.aa(), 1);
                    }
                }
            } else {
                j = Math.max(this.b.l(), 1);
            }
        }
        return Math.max((int) (j - h()), 1);
    }

    public final int c() {
        C0650e eVar = this.b;
        if (eVar == null || !eVar.m()) {
            return 0;
        }
        if (!this.b.o() && this.b.p()) {
            return 0;
        }
        int d = (int) (this.b.d() - h());
        if (this.b.A()) {
            d = X.a(d, f(), g());
        }
        return X.a(d, 0, a());
    }

    public final boolean d() {
        return (((long) c()) + h()) - (((long) f()) + h()) < 10000;
    }

    public final boolean e() {
        return a(((long) c()) + h());
    }

    public final int f() {
        C0650e eVar = this.b;
        if (eVar == null || !eVar.m() || !this.b.o() || !this.b.A()) {
            return 0;
        }
        return X.a((int) (l().longValue() - h()), 0, a());
    }

    public final int g() {
        C0650e eVar = this.b;
        if (eVar == null || !eVar.m() || !this.b.o()) {
            return a();
        }
        if (!this.b.A()) {
            return 0;
        }
        return X.a((int) (m().longValue() - h()), 0, a());
    }

    public final long h() {
        C0650e eVar = this.b;
        if (eVar == null || !eVar.m() || !this.b.o()) {
            return 0;
        }
        Long k = k();
        if (k != null) {
            return k.longValue();
        }
        Long l = l();
        if (l != null) {
            return l.longValue();
        }
        return this.b.d();
    }

    public final Long i() {
        C0650e eVar = this.b;
        if (eVar != null && eVar.m() && this.b.o()) {
            MediaMetadata j = j();
            if (j != null) {
                String str = "com.google.android.gms.cast.metadata.SECTION_DURATION";
                if (j.a(str)) {
                    Long k = k();
                    if (k != null) {
                        return Long.valueOf(k.longValue() + j.c(str));
                    }
                }
            }
        }
        return null;
    }

    public final int b(long j) {
        return (int) (j - h());
    }

    private static String d(long j) {
        if (j >= 0) {
            return DateUtils.formatElapsedTime(j / 1000);
        }
        String str = "-";
        String valueOf = String.valueOf(DateUtils.formatElapsedTime((-j) / 1000));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public final String c(long j) {
        C0650e eVar = this.b;
        if (eVar == null || !eVar.m()) {
            return null;
        }
        int[] iArr = C1763ur.a;
        C0650e eVar2 = this.b;
        int i = (eVar2 == null || !eVar2.m()) ? C1733tr.a : (!this.b.o() || a == C1733tr.a) ? C1733tr.a : n() != null ? C1733tr.b : C1733tr.a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            return DateFormat.getTimeInstance().format(new Date(n().longValue() + j));
        } else if (i2 != 2) {
            return null;
        } else {
            if (!this.b.o() || k() != null) {
                return d(j - h());
            }
            return d(j);
        }
    }

    public final boolean a(long j) {
        C0650e eVar = this.b;
        if (eVar == null || !eVar.m() || !this.b.A() || (((long) g()) + h()) - j >= 10000) {
            return false;
        }
        return true;
    }

    public final long a(int i) {
        return ((long) i) + h();
    }
}

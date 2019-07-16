package com.soundcloud.android.stream;

import com.soundcloud.android.stream.C6109va.b;
import com.soundcloud.android.tracks.C6185ma;
import java.util.Date;

/* compiled from: StreamItem.kt */
public final class tb extends C6109va {
    private final C3508cda d;
    private final long e;
    private final C6185ma f;
    private final boolean g;
    private final Date h;
    private final String i;
    private final int j;

    public tb(long j2, C6185ma maVar, boolean z, Date date, String str, int i2) {
        C7471uYa.b(maVar, "trackItem");
        C7471uYa.b(date, "createdAt");
        super(b.TRACK, Long.valueOf(j2), null);
        this.e = j2;
        this.f = maVar;
        this.g = z;
        this.h = date;
        this.i = str;
        this.j = i2;
        C3508cda a = this.f.a();
        C7471uYa.a((Object) a, "trackItem.urn");
        this.d = a;
    }

    public boolean a(C6109va vaVar) {
        C7471uYa.b(vaVar, "streamItem");
        Long c = vaVar.c();
        return c != null && c.longValue() == c().longValue();
    }

    public Date b() {
        return this.h;
    }

    public Long c() {
        return Long.valueOf(this.e);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tb) {
                tb tbVar = (tb) obj;
                if ((c().longValue() == tbVar.c().longValue()) && C7471uYa.a((Object) this.f, (Object) tbVar.f)) {
                    if ((this.g == tbVar.g) && C7471uYa.a((Object) b(), (Object) tbVar.b()) && C7471uYa.a((Object) this.i, (Object) tbVar.i)) {
                        if (k().intValue() == tbVar.k().intValue()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long longValue = c().longValue();
        int i2 = ((int) (longValue ^ (longValue >>> 32))) * 31;
        C6185ma maVar = this.f;
        int i3 = 0;
        int hashCode = (i2 + (maVar != null ? maVar.hashCode() : 0)) * 31;
        boolean z = this.g;
        if (z) {
            z = true;
        }
        int i4 = (hashCode + (z ? 1 : 0)) * 31;
        Date b = b();
        int hashCode2 = (i4 + (b != null ? b.hashCode() : 0)) * 31;
        String str = this.i;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((hashCode2 + i3) * 31) + k().intValue();
    }

    public final String j() {
        return this.i;
    }

    public Integer k() {
        return Integer.valueOf(this.j);
    }

    public final boolean l() {
        return this.g;
    }

    public final C6185ma m() {
        return this.f;
    }

    public final C3508cda n() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackStreamItem(id=");
        sb.append(c());
        sb.append(", trackItem=");
        sb.append(this.f);
        sb.append(", promoted=");
        sb.append(this.g);
        sb.append(", createdAt=");
        sb.append(b());
        sb.append(", avatarUrlTemplate=");
        sb.append(this.i);
        sb.append(", position=");
        sb.append(k());
        sb.append(")");
        return sb.toString();
    }
}

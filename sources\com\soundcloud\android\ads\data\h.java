package com.soundcloud.android.ads.data;

import com.soundcloud.android.foundation.ads.C3691s.b;
import com.soundcloud.android.foundation.ads.aa.a;

/* compiled from: VideoAdEntity.kt */
public final class h {
    private long a;
    private final a b;
    private final b c;
    private final long d;
    private final int e;

    public h(a aVar, b bVar, long j, int i) {
        this.b = aVar;
        this.c = bVar;
        this.d = j;
        this.e = i;
    }

    public final a a() {
        return this.b;
    }

    public final int b() {
        return this.e;
    }

    public final b c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (C7471uYa.a((Object) this.b, (Object) hVar.b) && C7471uYa.a((Object) this.c, (Object) hVar.c)) {
                    if (this.d == hVar.d) {
                        if (this.e == hVar.e) {
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
        a aVar = this.b;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        b bVar = this.c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        long j = this.d;
        return ((i2 + ((int) (j ^ (j >>> 32)))) * 31) + this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoAdEntity(ad=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", expiryTimestamp=");
        sb.append(this.d);
        sb.append(", appVersion=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public final void a(long j) {
        this.a = j;
    }
}

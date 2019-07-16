package com.soundcloud.android.trackinfo;

import com.soundcloud.android.trackinfo.C.a;
import com.soundcloud.android.trackinfo.C.b;
import com.soundcloud.android.trackinfo.C.c;
import com.soundcloud.android.trackinfo.C.d;

/* compiled from: NewTrackStatsMapper.kt */
public class u {
    private C5408WFa a;

    public u(C5408WFa wFa) {
        C7471uYa.b(wFa, "numberFormatter");
        this.a = wFa;
    }

    public C a(D d, C3508cda cda, C3493aea aea) {
        C7471uYa.b(d, "trackStatsType");
        C7471uYa.b(cda, "userUrn");
        C7471uYa.b(aea, "fullTrack");
        int i = 0;
        boolean z = true;
        boolean z2 = aea.b().h() || C7471uYa.a((Object) cda, (Object) aea.b().y());
        int i2 = t.a[d.ordinal()];
        if (i2 == 1) {
            boolean z3 = aea.b().p() > 0;
            if (!z2 || !z3) {
                z = false;
            }
            if (z) {
                i = aea.b().p();
            }
            return new c(z, a(i));
        } else if (i2 == 2) {
            boolean z4 = aea.b().l() > 0;
            if (!z2 || !z4) {
                z = false;
            }
            if (z) {
                i = aea.b().l();
            }
            return new b(z, a(i));
        } else if (i2 == 3) {
            boolean z5 = aea.b().b() && aea.b().c() > 0;
            if (!z2 || !z5) {
                z = false;
            }
            if (z) {
                i = aea.b().c();
            }
            return new a(z, i);
        } else if (i2 == 4) {
            boolean z6 = aea.b().q() > 0;
            if (!z2 || !z6) {
                z = false;
            }
            if (z) {
                i = aea.b().q();
            }
            return new d(z, a(i));
        } else {
            throw new FVa();
        }
    }

    private String a(int i) {
        String a2 = this.a.a((long) i);
        C7471uYa.a((Object) a2, "numberFormatter.format(stat.toLong())");
        return a2;
    }
}

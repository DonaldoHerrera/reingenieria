package com.soundcloud.android.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3680g;
import com.soundcloud.android.foundation.ads.C3681h;
import com.soundcloud.android.foundation.ads.C3684k;
import com.soundcloud.android.foundation.ads.X;
import com.soundcloud.android.foundation.ads.X.a;
import com.soundcloud.android.foundation.ads.ea;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.soundcloud.android.ads.qb reason: case insensitive filesystem */
/* compiled from: ApiPrestitialAd */
public class C2615qb extends Pca<C3684k> implements C3680g {
    @JsonCreator
    public C2615qb(@JsonProperty("collection") List<C3684k> list, @JsonProperty("_links") Map<String, Oca> map, @JsonProperty("query_urn") String str) {
        super(list, map, str);
    }

    private C4928GKa<a> m() {
        Iterator it = iterator();
        while (it.hasNext()) {
            C3684k kVar = (C3684k) it.next();
            if (kVar.f() != null) {
                return C4928GKa.c(kVar.f());
            }
        }
        return C4928GKa.a();
    }

    private C4928GKa<ea.a> n() {
        Iterator it = iterator();
        while (it.hasNext()) {
            C3684k kVar = (C3684k) it.next();
            if (kVar.h() != null) {
                return C4928GKa.c(kVar.h());
            }
        }
        return C4928GKa.a();
    }

    public String i() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("prestitials received:");
        for (T t : this.a) {
            if (t.h() != null) {
                sb.append(" display");
            } else if (t.f() != null) {
                sb.append(" sponsored session w/ length: ");
                sb.append(t.f().a());
            }
        }
        return sb.toString();
    }

    public C3681h k() {
        return C3681h.a(n().c() ? ((ea.a) n().b()).e() : C3508cda.a, m().c() ? ((a) m().b()).b() : C3508cda.a);
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3676c> l() {
        for (T t : this.a) {
            if (t.h() != null) {
                return C4928GKa.c(ea.a(t.h()));
            }
            if (t.f() != null) {
                return C4928GKa.c(X.a(t.f()));
            }
        }
        return C4928GKa.a();
    }
}

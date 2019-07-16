package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.soundcloud.android.foundation.ads.C3691s.b;
import com.soundcloud.android.foundation.ads.P.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.soundcloud.android.foundation.ads.m reason: case insensitive filesystem */
/* compiled from: ApiAdsForTrack.kt */
public final class C3686m extends Pca<C3684k> implements C3680g {
    private final a d;
    private final C3693u.a e;
    private final aa.a f;
    private final C3691s.a g;
    private final b h;
    private final T i;
    private final T j;

    @JsonCreator
    public C3686m(@JsonProperty("collection") List<C3684k> list, @JsonProperty("_links") Map<String, Oca> map, @JsonProperty("query_urn") String str) {
        b bVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C7471uYa.b(list, "collection");
        super(list, map, str);
        Iterator it = iterator();
        while (true) {
            bVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C3684k) obj).e() != null) {
                z5 = true;
                continue;
            } else {
                z5 = false;
                continue;
            }
            if (z5) {
                break;
            }
        }
        C3684k kVar = (C3684k) obj;
        this.d = kVar != null ? kVar.e() : null;
        Iterator it2 = iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((C3684k) obj2).b() != null) {
                z4 = true;
                continue;
            } else {
                z4 = false;
                continue;
            }
            if (z4) {
                break;
            }
        }
        C3684k kVar2 = (C3684k) obj2;
        this.e = kVar2 != null ? kVar2.b() : null;
        Iterator it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (((C3684k) obj3).g() != null) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                break;
            }
        }
        C3684k kVar3 = (C3684k) obj3;
        this.f = kVar3 != null ? kVar3.g() : null;
        Iterator it4 = iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            if (((C3684k) obj4).c() != null) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C3684k kVar4 = (C3684k) obj4;
        this.g = kVar4 != null ? kVar4.c() : null;
        Iterator it5 = iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj5 = null;
                break;
            }
            obj5 = it5.next();
            if (((C3684k) obj5).d() != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C3684k kVar5 = (C3684k) obj5;
        if (kVar5 != null) {
            bVar = kVar5.d();
        }
        this.h = bVar;
        this.i = b(C6918mWa.c(this.f, this.d, this.e, this.g, this.h));
        this.j = b(C6918mWa.c(this.e, this.d, this.g));
    }

    private final T b(List<? extends T> list) {
        return (T) C7676xWa.g(C7676xWa.a((Iterable) list, (Comparator) new C3685l()));
    }

    public String i() {
        ArrayList arrayList = new ArrayList();
        C3693u.a aVar = this.e;
        String str = "leave behind";
        if (aVar != null) {
            arrayList.add("audio ad");
            if (aVar.k() != null) {
                arrayList.add(str);
            }
        }
        aa.a aVar2 = this.f;
        if (aVar2 != null) {
            arrayList.add("video ad");
            if (aVar2.l() != null) {
                arrayList.add(str);
            }
        }
        if (this.d != null) {
            arrayList.add("interstitial");
        }
        if (this.g != null) {
            arrayList.add("error audio ad");
        }
        return C7676xWa.a(arrayList, null, null, null, 0, null, null, 63, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r4 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r6 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3 != null) goto L_0x0024;
     */
    public C3681h k() {
        C3508cda cda;
        C3508cda cda2;
        C3508cda cda3;
        C3508cda cda4;
        C3508cda cda5;
        C3681h.a aVar = C3681h.a;
        aa.a aVar2 = this.f;
        String str = "Urn.NOT_SET";
        if (aVar2 != null) {
            cda = aVar2.b();
        }
        cda = C3508cda.a;
        C7471uYa.a((Object) cda, str);
        C3693u.a aVar3 = this.e;
        if (aVar3 != null) {
            cda2 = aVar3.b();
        }
        cda2 = C3508cda.a;
        C7471uYa.a((Object) cda2, str);
        a aVar4 = this.d;
        if (aVar4 != null) {
            cda3 = aVar4.e();
        }
        cda3 = C3508cda.a;
        C7471uYa.a((Object) cda3, str);
        C3691s.a aVar5 = this.g;
        if (aVar5 != null) {
            cda4 = aVar5.c();
        }
        cda4 = C3508cda.a;
        C7471uYa.a((Object) cda4, str);
        b bVar = this.h;
        if (bVar != null) {
            cda5 = bVar.c();
        }
        cda5 = C3508cda.a;
        C7471uYa.a((Object) cda5, str);
        return aVar.a(cda, cda2, cda3, cda4, cda5);
    }

    public final C3693u.a l() {
        return this.e;
    }

    public final b m() {
        return this.h;
    }

    public final T n() {
        return this.i;
    }

    public final T o() {
        return this.j;
    }

    public final a p() {
        return this.d;
    }

    public final aa.a q() {
        return this.f;
    }

    public C3686m(List<C3684k> list) {
        C7471uYa.b(list, "collection");
        this(list, LWa.a(), null);
    }
}

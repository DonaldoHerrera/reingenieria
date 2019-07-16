package com.soundcloud.android.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3680g;
import com.soundcloud.android.foundation.ads.C3681h;
import com.soundcloud.android.foundation.ads.C3684k;
import com.soundcloud.android.foundation.ads.C3692t;
import com.soundcloud.android.foundation.ads.aa;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.soundcloud.android.ads.pb reason: case insensitive filesystem */
/* compiled from: ApiAdsForStream */
public class C2611pb extends Pca<C3684k> implements C3680g {

    /* renamed from: com.soundcloud.android.ads.pb$a */
    /* compiled from: ApiAdsForStream */
    private static final class a implements Function<C3684k, C3676c> {
        private final C5694cGa a;

        /* renamed from: a */
        public C3676c apply(C3684k kVar) {
            if (kVar.a() != null) {
                return C3692t.a(kVar.a(), this.a.a());
            }
            return aa.a(kVar.g(), this.a.a(), com.soundcloud.android.foundation.ads.C3676c.a.INLAY);
        }

        private a(C5694cGa cga) {
            this.a = cga;
        }
    }

    @JsonCreator
    public C2611pb(@JsonProperty("collection") List<C3684k> list, @JsonProperty("_links") Map<String, Oca> map, @JsonProperty("query_urn") String str) {
        super(list, map, str);
    }

    private Predicate<C3684k> l() {
        return C2581i.a;
    }

    /* access modifiers changed from: 0000 */
    public List<C3676c> a(C5694cGa cga) {
        return C2063HD.a((List<F>) C2063HD.a(C1943BD.b(f(), l())), (Function<? super F, ? extends T>) new a<Object,Object>(cga));
    }

    public String i() {
        StringBuilder sb = new StringBuilder();
        sb.append(f().size());
        sb.append(" inlay ads");
        return sb.toString();
    }

    public C3681h k() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C3684k kVar : f()) {
            if (kVar.a() != null) {
                arrayList.add(kVar.a().b());
            } else if (kVar.g() != null) {
                arrayList2.add(kVar.g().b());
            }
        }
        return C3681h.a((List<C3508cda>) arrayList, (List<C3508cda>) arrayList2);
    }

    static /* synthetic */ boolean a(C3684k kVar) {
        return (kVar.a() == null && kVar.g() == null) ? false : true;
    }
}

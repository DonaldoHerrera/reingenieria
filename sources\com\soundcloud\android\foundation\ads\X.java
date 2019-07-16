package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: SponsoredSessionAd */
public abstract class X extends C3676c implements V {

    /* compiled from: SponsoredSessionAd */
    public static abstract class a {
        @JsonCreator
        public static a a(@JsonProperty("ad_urn") C3508cda cda, @JsonProperty("ad_free_minutes") int i, @JsonProperty("reward_urls") List<String> list, @JsonProperty("video") com.soundcloud.android.foundation.ads.aa.a aVar, @JsonProperty("opt_in_card") b bVar) {
            A a = new A(cda, i, list, aVar, bVar);
            return a;
        }

        public abstract int a();

        public abstract C3508cda b();

        public abstract b c();

        public abstract List<String> d();

        public abstract com.soundcloud.android.foundation.ads.aa.a e();
    }

    /* compiled from: SponsoredSessionAd */
    public static abstract class b implements C3687n {
        @JsonCreator
        public static b a(@JsonProperty("urn") C3508cda cda, @JsonProperty("image_url") String str, @JsonProperty("clickthrough_url") String str2, @JsonProperty("tracking_impression_urls") List<Y> list, @JsonProperty("tracking_click_urls") List<Y> list2) {
            B b = new B(cda, str, str2, list, list2);
            return b;
        }
    }

    public static X a(a aVar) {
        com.soundcloud.android.foundation.ads.C3676c.a aVar2 = com.soundcloud.android.foundation.ads.C3676c.a.SPONSORED_SESSION;
        C3698z zVar = new C3698z(aVar.b(), aVar2, aVar.a(), aVar.d(), aVar.c(), aa.a(aVar.e(), 0, aVar2));
        return zVar;
    }

    public String c() {
        return n().c();
    }

    public abstract int m();

    public abstract b n();

    public abstract List<String> o();

    public abstract aa p();
}

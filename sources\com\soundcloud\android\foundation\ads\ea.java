package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: VisualPrestitialAd */
public abstract class ea extends O implements V {

    /* compiled from: VisualPrestitialAd */
    public static abstract class a implements C3687n {
        @JsonCreator
        public static a a(@JsonProperty("urn") C3508cda cda, @JsonProperty("image_url") String str, @JsonProperty("clickthrough_url") String str2, @JsonProperty("tracking_impression_urls") List<Y> list, @JsonProperty("tracking_click_urls") List<Y> list2) {
            F f = new F(cda, str, str2, list, list2);
            return f;
        }
    }

    public static ea a(a aVar) {
        E e = new E(aVar.c(), aVar.e(), com.soundcloud.android.foundation.ads.C3676c.a.PRESTITIAL, aVar.h(), aVar.g(), aVar.f());
        return e;
    }
}

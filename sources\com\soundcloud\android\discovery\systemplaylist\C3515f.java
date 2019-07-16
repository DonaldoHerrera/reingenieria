package com.soundcloud.android.discovery.systemplaylist;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.f reason: case insensitive filesystem */
/* compiled from: ApiSystemPlaylist */
public abstract class C3515f {
    @JsonCreator
    public static C3515f a(@JsonProperty("urn") C3508cda cda, @JsonProperty("track_count") C4928GKa<Integer> gKa, @JsonProperty("last_updated") C4928GKa<Date> gKa2, @JsonProperty("title") C4928GKa<String> gKa3, @JsonProperty("description") C4928GKa<String> gKa4, @JsonProperty("artwork_url_template") C4928GKa<String> gKa5, @JsonProperty("tracking_feature_name") C4928GKa<String> gKa6, @JsonProperty("tracks") Pca<Yda> pca) {
        C3516g gVar = new C3516g(cda, gKa, gKa2, gKa3, gKa4, gKa5, gKa6, pca);
        return gVar;
    }

    public abstract C4928GKa<String> a();

    public abstract C4928GKa<String> b();

    public abstract C4928GKa<Date> c();

    public abstract C4928GKa<String> d();

    public abstract C4928GKa<Integer> e();

    public abstract C4928GKa<String> f();

    public abstract Pca<Yda> g();

    public abstract C3508cda h();
}

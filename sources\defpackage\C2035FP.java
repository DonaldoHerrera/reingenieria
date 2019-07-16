package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: FP reason: default package and case insensitive filesystem */
/* compiled from: ApiUserProfileInfo */
public abstract class C2035FP {
    @JsonCreator
    public static C2035FP a(@JsonProperty("social_media_links") Pca<C1935AP> pca, @JsonProperty("description") C4928GKa<String> gKa, @JsonProperty("user") C3776gea gea) {
        return new C2113JP(pca, gKa, gea);
    }

    public abstract C4928GKa<String> a();

    public abstract Pca<C1935AP> b();

    public abstract C3776gea c();
}

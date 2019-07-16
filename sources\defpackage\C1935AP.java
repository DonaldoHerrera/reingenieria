package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;

/* renamed from: AP reason: default package and case insensitive filesystem */
/* compiled from: ApiSocialMediaLink */
public abstract class C1935AP {
    @JsonCreator
    public static C1935AP a(@JsonProperty("title") C4928GKa<String> gKa, @JsonProperty("network") String str, @JsonProperty("url") String str2) {
        return new C2094IP(gKa.a((Function<? super T, Boolean>) C3258sP.a), str, str2);
    }

    public abstract String a();

    public abstract C4928GKa<String> b();

    public abstract String c();
}

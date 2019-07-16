package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: zP reason: default package and case insensitive filesystem */
/* compiled from: ApiRecentlyPlayed */
public abstract class C3398zP {
    @JsonCreator
    public static C3398zP a(@JsonProperty("played_at") long j, @JsonProperty("urn") String str) {
        return new C2075HP(j, str);
    }

    @JsonGetter("played_at")
    public abstract long a();

    @JsonGetter("urn")
    public abstract String b();
}

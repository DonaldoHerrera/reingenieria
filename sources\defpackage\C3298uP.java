package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: uP reason: default package and case insensitive filesystem */
/* compiled from: ApiPlayHistory */
public abstract class C3298uP {
    @JsonCreator
    public static C3298uP a(@JsonProperty("played_at") long j, @JsonProperty("urn") String str) {
        return new C2055GP(j, str);
    }

    @JsonGetter("played_at")
    public abstract long a();

    @JsonGetter("urn")
    public abstract String b();
}

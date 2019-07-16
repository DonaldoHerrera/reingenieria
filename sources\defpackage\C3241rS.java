package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: rS reason: default package and case insensitive filesystem */
/* compiled from: CastMessage */
public abstract class C3241rS {
    @JsonCreator
    public static C3241rS a(@JsonProperty("type") String str, @JsonProperty("payload") C3261sS sSVar) {
        return new C3097kS(str, sSVar);
    }

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("payload")
    public abstract C3261sS a();

    @JsonProperty("type")
    public abstract String b();
}

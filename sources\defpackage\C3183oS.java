package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: oS reason: default package and case insensitive filesystem */
/* compiled from: CastCredentials */
public abstract class C3183oS {
    @JsonCreator
    public static C3183oS a(@JsonProperty("authorization") String str) {
        return new C3078jS(str);
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("authorization")
    public abstract String a();
}

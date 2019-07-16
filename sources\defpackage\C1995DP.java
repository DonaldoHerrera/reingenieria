package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: DP reason: default package and case insensitive filesystem */
/* compiled from: ApiTrackPost */
public class C1995DP implements Sca {
    private final Yda a;

    @JsonCreator
    public C1995DP(@JsonProperty("track") Yda yda) {
        this.a = yda;
    }

    public Yda a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1995DP)) {
            return false;
        }
        return this.a.equals(((C1995DP) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: BP reason: default package and case insensitive filesystem */
/* compiled from: ApiTrackHolder */
public class C1955BP implements Sca {
    private final Yda a;

    @JsonCreator
    public C1955BP(@JsonProperty("track") Yda yda) {
        this.a = yda;
    }

    public Yda a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1955BP)) {
            return false;
        }
        return this.a.equals(((C1955BP) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

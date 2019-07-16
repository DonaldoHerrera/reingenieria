package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: wP reason: default package and case insensitive filesystem */
/* compiled from: ApiPlaylistPost */
public class C3338wP implements Sca, Ada {
    private final C3927zda a;

    @JsonCreator
    public C3338wP(@JsonProperty("playlist") C3927zda zda) {
        this.a = zda;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3338wP)) {
            return false;
        }
        return this.a.equals(((C3338wP) obj).a);
    }

    public C3927zda f() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

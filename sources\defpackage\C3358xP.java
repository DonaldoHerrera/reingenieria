package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: xP reason: default package and case insensitive filesystem */
/* compiled from: ApiPlaylistRepost */
public class C3358xP implements Sca, Ada {
    private final C3927zda a;
    private final Date b;

    @JsonCreator
    public C3358xP(@JsonProperty("playlist") C3927zda zda, @JsonProperty("created_at") Date date) {
        this.a = zda;
        this.b = date;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3358xP)) {
            return false;
        }
        C3358xP xPVar = (C3358xP) obj;
        if (!this.a.equals(xPVar.a) || !this.b.equals(xPVar.b)) {
            z = false;
        }
        return z;
    }

    public C3927zda f() {
        return this.a;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}

package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: EP reason: default package and case insensitive filesystem */
/* compiled from: ApiTrackRepost */
public class C2015EP implements Sca {
    private final Yda a;
    private final Date b;

    @JsonCreator
    public C2015EP(@JsonProperty("track") Yda yda, @JsonProperty("created_at") Date date) {
        this.a = yda;
        this.b = date;
    }

    public Yda a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2015EP)) {
            return false;
        }
        C2015EP ep = (C2015EP) obj;
        if (!this.a.equals(ep.a) || !this.b.equals(ep.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}

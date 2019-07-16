package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: SP reason: default package and case insensitive filesystem */
/* compiled from: ApiStreamTrackPost */
public class C2284SP {
    private final Yda a;
    private final long b;

    @JsonCreator
    public C2284SP(@JsonProperty("track") Yda yda, @JsonProperty("created_at") Date date) {
        this.a = yda;
        this.b = date.getTime();
    }

    public Yda a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }
}

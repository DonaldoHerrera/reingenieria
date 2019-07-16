package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: TP reason: default package and case insensitive filesystem */
/* compiled from: ApiStreamTrackRepost */
public class C2303TP {
    private final Yda a;
    private final C3776gea b;
    private final long c;

    @JsonCreator
    public C2303TP(@JsonProperty("track") Yda yda, @JsonProperty("reposter") C3776gea gea, @JsonProperty("created_at") Date date) {
        this.a = yda;
        this.b = gea;
        this.c = date.getTime();
    }

    public Yda a() {
        return this.a;
    }

    public long b() {
        return this.c;
    }

    public C3776gea c() {
        return this.b;
    }
}

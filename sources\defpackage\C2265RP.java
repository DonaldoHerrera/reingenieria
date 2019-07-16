package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: RP reason: default package and case insensitive filesystem */
/* compiled from: ApiStreamPlaylistRepost */
public class C2265RP {
    private final C3927zda a;
    private final C3776gea b;
    private final long c;

    @JsonCreator
    public C2265RP(@JsonProperty("playlist") C3927zda zda, @JsonProperty("reposter") C3776gea gea, @JsonProperty("created_at") Date date) {
        this.a = zda;
        this.b = gea;
        this.c = date.getTime();
    }

    public C3927zda a() {
        return this.a;
    }

    public long b() {
        return this.c;
    }

    public C3776gea c() {
        return this.b;
    }
}

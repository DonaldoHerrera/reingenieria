package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: Iza reason: default package and case insensitive filesystem */
/* compiled from: ApiPlaylistLikeActivity */
public class C5010Iza implements Bia, C4979Hza {
    private final C3927zda a;
    private final C3776gea b;
    private final Date c;

    @JsonCreator
    public C5010Iza(@JsonProperty("playlist") C3927zda zda, @JsonProperty("user") C3776gea gea, @JsonProperty("created_at") Date date) {
        this.a = zda;
        this.b = gea;
        this.c = date;
    }

    public C3927zda a() {
        return this.a;
    }

    public Date b() {
        return this.c;
    }

    public C3508cda c() {
        return this.a.a();
    }

    public C3776gea d() {
        return this.b;
    }

    public C3508cda e() {
        return this.b.l();
    }
}

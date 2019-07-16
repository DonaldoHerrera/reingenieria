package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: Lza reason: default package and case insensitive filesystem */
/* compiled from: ApiTrackLikeActivity */
public class C5104Lza implements Cia, C4979Hza {
    private final Yda a;
    private final C3776gea b;
    private final Date c;

    @JsonCreator
    public C5104Lza(@JsonProperty("track") Yda yda, @JsonProperty("user") C3776gea gea, @JsonProperty("created_at") Date date) {
        this.a = yda;
        this.b = gea;
        this.c = date;
    }

    public Yda a() {
        return this.a;
    }

    public Date b() {
        return this.c;
    }

    public C3508cda c() {
        return this.a.w();
    }

    public C3776gea d() {
        return this.b;
    }

    public C3508cda e() {
        return this.b.l();
    }
}

package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: Kza reason: default package and case insensitive filesystem */
/* compiled from: ApiTrackCommentActivity */
public class C5073Kza implements Cia, C4979Hza {
    private final C3508cda a;
    private final Yda b;
    private final C3342wT c;
    private final Date d;

    @JsonCreator
    public C5073Kza(@JsonProperty("target_urn") String str, @JsonProperty("track") Yda yda, @JsonProperty("comment") C3342wT wTVar, @JsonProperty("created_at") Date date) {
        this.a = new C3508cda(str);
        this.b = yda;
        this.c = wTVar;
        this.d = date;
    }

    public C3342wT a() {
        return this.c;
    }

    public Date b() {
        return this.d;
    }

    public C3508cda c() {
        return this.a;
    }

    public C3776gea d() {
        return this.c.d();
    }

    public C3508cda e() {
        return d().l();
    }

    public Yda f() {
        return this.b;
    }
}

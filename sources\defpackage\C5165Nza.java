package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: Nza reason: default package and case insensitive filesystem */
/* compiled from: ApiUserFollowActivity */
public class C5165Nza implements C4917Fza {
    private final C3776gea a;
    private final Date b;

    @JsonCreator
    public C5165Nza(@JsonProperty("user") C3776gea gea, @JsonProperty("created_at") Date date) {
        this.a = gea;
        this.b = date;
    }

    public Date b() {
        return this.b;
    }

    public C3776gea d() {
        return this.a;
    }

    public C3508cda e() {
        return this.a.l();
    }
}

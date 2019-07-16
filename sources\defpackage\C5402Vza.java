package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import java.util.Date;

/* renamed from: Vza reason: default package and case insensitive filesystem */
/* compiled from: ApiFollowing */
public abstract class C5402Vza {
    static final Function<C5402Vza, C3508cda> a = C5373Uza.a;

    @JsonCreator
    public static C5402Vza a(@JsonProperty("user") C3508cda cda, @JsonProperty("created") Date date, @JsonProperty("target") C3508cda cda2) {
        return new C5431Wza(cda2, cda, date);
    }

    public abstract Date a();

    public abstract C3508cda b();

    public abstract C3508cda c();
}

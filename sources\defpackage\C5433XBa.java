package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: XBa reason: default package and case insensitive filesystem */
/* compiled from: ApiPost */
public abstract class C5433XBa implements C6760kCa {
    @JsonCreator
    public static C5433XBa a(@JsonProperty("target_urn") C3508cda cda, @JsonProperty("created_at") Date date) {
        return new C5520_Ba(cda, date, false);
    }
}

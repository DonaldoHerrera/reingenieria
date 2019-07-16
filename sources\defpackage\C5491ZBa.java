package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/* renamed from: ZBa reason: default package and case insensitive filesystem */
/* compiled from: ApiRepost */
public abstract class C5491ZBa implements C6760kCa {
    @JsonCreator
    public static C5491ZBa a(@JsonProperty("target_urn") C3508cda cda, @JsonProperty("created_at") Date date) {
        return new C5552aCa(cda, date, true);
    }
}

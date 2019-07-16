package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: tka reason: default package and case insensitive filesystem */
/* compiled from: ResetPasswordBody */
public abstract class C4674tka {
    @JsonCreator
    public static C4674tka a(@JsonProperty("identifier") String str) {
        return new C4598kka(str);
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("identifier")
    public abstract String a();
}

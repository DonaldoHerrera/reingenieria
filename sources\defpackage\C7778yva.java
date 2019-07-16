package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: yva reason: default package and case insensitive filesystem */
/* compiled from: Autocompletion */
public abstract class C7778yva {
    @JsonCreator
    public static C7778yva a(@JsonProperty("query") String str, @JsonProperty("output") String str2) {
        return new C7502uva(str, str2);
    }

    /* access modifiers changed from: 0000 */
    public abstract String a();

    /* access modifiers changed from: 0000 */
    public abstract String b();
}

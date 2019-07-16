package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: Xza reason: default package and case insensitive filesystem */
/* compiled from: FollowError */
class C5460Xza {
    public final String a;
    public final Integer b;

    @JsonCreator
    public C5460Xza(@JsonProperty("error_key") String str, @JsonProperty("age") Integer num) {
        this.a = str;
        this.b = num;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return "age_restricted".equals(this.a);
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return "age_unknown".equals(this.a);
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return "blocked".equals(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiError{error='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", age=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}

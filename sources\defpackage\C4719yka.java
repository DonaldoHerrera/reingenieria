package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.soundcloud.android.accounts.E;

/* renamed from: yka reason: default package and case insensitive filesystem */
/* compiled from: AuthResponse */
public class C4719yka {
    public final E a;
    public final C2358WP b;

    @JsonCreator
    public C4719yka(@JsonProperty("token") C2358WP wp, @JsonProperty("me") E e) {
        this.a = e;
        this.b = wp;
    }
}

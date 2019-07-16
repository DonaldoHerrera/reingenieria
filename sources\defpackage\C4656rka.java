package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: rka reason: default package and case insensitive filesystem */
/* compiled from: FacebookToken */
public abstract class C4656rka implements C4630oka {
    static C4656rka a(String str) {
        return new C4582ika(str);
    }

    @JsonProperty("token")
    public abstract String a();
}

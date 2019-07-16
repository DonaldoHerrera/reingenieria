package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: xka reason: default package and case insensitive filesystem */
/* compiled from: UserCredentials */
public abstract class C4710xka implements C4630oka {
    static C4710xka a(String str, String str2) {
        return new C4622nka(str, str2);
    }

    @JsonProperty("identifier")
    public abstract String a();

    @JsonProperty("password")
    public abstract String b();
}

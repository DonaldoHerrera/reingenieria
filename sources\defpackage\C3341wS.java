package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: wS reason: default package and case insensitive filesystem */
/* compiled from: RemoteTrack */
public abstract class C3341wS {
    @JsonCreator
    public static C3341wS a(@JsonProperty("id") String str, @JsonProperty("urn") C3508cda cda) {
        return new C3154nS(C4928GKa.b(str), cda);
    }

    public abstract C4928GKa<String> a();

    public abstract C3508cda b();

    public static C3341wS a(C3508cda cda) {
        return new C3154nS(C4928GKa.a(), cda);
    }
}

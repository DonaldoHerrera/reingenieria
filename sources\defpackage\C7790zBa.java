package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import java.util.List;

/* renamed from: zBa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistApiUpdateObject */
public abstract class C7790zBa {
    public static C7790zBa a(C4928GKa<C7376tBa> gKa, List<C3508cda> list) {
        return new C6690jBa((String) gKa.b((Function<? super T, V>) C6418fBa.a).d(), a(gKa), C5526_Ha.b(list));
    }

    public abstract Boolean a();

    public abstract String b();

    @JsonProperty("track_urns")
    public abstract List<String> c();

    private static Boolean a(C4928GKa<C7376tBa> gKa) {
        if (gKa.c()) {
            return Boolean.valueOf(!((C7376tBa) gKa.b()).a());
        }
        return null;
    }
}

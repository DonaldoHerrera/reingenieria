package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: KX reason: default package and case insensitive filesystem */
/* compiled from: ApiDiscoveryCard */
public abstract class C3435KX {
    @JsonCreator
    public static C3435KX a(@JsonProperty("single_content_selection_card") C3447OX ox, @JsonProperty("multiple_content_selection_card") C3438LX lx, @JsonProperty("promoted_track_card") C3441MX mx) {
        return new C3450PX(C4928GKa.b(ox), C4928GKa.b(lx), C4928GKa.b(mx));
    }

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<C3438LX> a();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<C3441MX> b();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<C3447OX> c();
}

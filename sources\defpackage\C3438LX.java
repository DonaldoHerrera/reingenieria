package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: LX reason: default package and case insensitive filesystem */
/* compiled from: ApiMultipleContentSelectionCard */
public abstract class C3438LX {
    @JsonCreator
    public static C3438LX a(@JsonProperty("selection_urn") C3508cda cda, @JsonProperty("style") String str, @JsonProperty("title") String str2, @JsonProperty("description") String str3, @JsonProperty("tracking_feature_name") String str4, @JsonProperty("selection_items") Pca<C3444NX> pca) {
        C3453QX qx = new C3453QX(cda, C4928GKa.b(str), C4928GKa.b(str2), C4928GKa.b(str3), C4928GKa.b(str4), pca);
        return qx;
    }

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> a();

    /* access modifiers changed from: 0000 */
    public abstract Pca<C3444NX> b();

    /* access modifiers changed from: 0000 */
    public abstract C3508cda c();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> d();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> e();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> f();
}

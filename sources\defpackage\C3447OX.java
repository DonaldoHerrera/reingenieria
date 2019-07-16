package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: OX reason: default package and case insensitive filesystem */
/* compiled from: ApiSingleContentSelectionCard */
public abstract class C3447OX {
    @JsonCreator
    public static C3447OX a(@JsonProperty("selection_urn") C3508cda cda, @JsonProperty("query_urn") C3508cda cda2, @JsonProperty("style") String str, @JsonProperty("title") String str2, @JsonProperty("description") String str3, @JsonProperty("social_proof") String str4, @JsonProperty("tracking_feature_name") String str5, @JsonProperty("selection_item") C3444NX nx, @JsonProperty("social_proof_avatar_url_templates") List<String> list) {
        C3459SX sx = new C3459SX(cda, C4928GKa.b(cda2), C4928GKa.b(str), C4928GKa.b(str2), C4928GKa.b(str3), C4928GKa.b(str4), C4928GKa.b(str5), nx, list);
        return sx;
    }

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> a();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<C3508cda> b();

    /* access modifiers changed from: 0000 */
    public abstract C3444NX c();

    /* access modifiers changed from: 0000 */
    public abstract C3508cda d();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> e();

    /* access modifiers changed from: 0000 */
    public abstract List<String> f();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> g();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> h();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> i();
}

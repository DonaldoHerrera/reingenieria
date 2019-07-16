package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.soundcloud.android.image.W;

/* renamed from: NX reason: default package and case insensitive filesystem */
/* compiled from: ApiSelectionItem */
public abstract class C3444NX {
    @JsonCreator
    public static C3444NX a(@JsonProperty("urn") C3508cda cda, @JsonProperty("artwork_url_template") String str, @JsonProperty("artwork_style") W w, @JsonProperty("count") Integer num, @JsonProperty("short_title") String str2, @JsonProperty("short_subtitle") String str3, @JsonProperty("app_link") String str4, @JsonProperty("web_link") String str5) {
        C3456RX rx = new C3456RX(C4928GKa.b(cda), C4928GKa.b(str), C4928GKa.b(w), C4928GKa.b(num), C4928GKa.b(str2), C4928GKa.b(str3), C4928GKa.b(str4), C4928GKa.b(str5));
        return rx;
    }

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> a();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<W> b();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> c();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<Integer> d();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> e();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> f();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<C3508cda> g();

    /* access modifiers changed from: 0000 */
    public abstract C4928GKa<String> h();
}

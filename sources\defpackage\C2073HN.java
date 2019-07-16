package defpackage;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: HN reason: default package and case insensitive filesystem */
/* compiled from: EventLoggerEventData */
class C2073HN {
    @JsonProperty("event")
    private final String a;
    @JsonProperty("version")
    private final String b;
    @JsonProperty("event-id")
    private final String c;
    @JsonProperty("payload")
    final HashMap<String, Object> d = new HashMap<>();

    public C2073HN(String str, String str2, int i, String str3, C3508cda cda, long j, String str4, String str5, C5628bIa bia) {
        this.a = str;
        this.b = str2;
        this.c = bia.a();
        a("client_id", i);
        a("anonymous_id", (Object) str3);
        a("ts", j);
        a("connection_type", (Object) str4);
        a("app_version", (Object) str5);
        g(cda);
    }

    public C2073HN A(String str) {
        a("impression_category", (Object) str);
        return this;
    }

    public C2073HN B(String str) {
        a("impression_name", (Object) str);
        return this;
    }

    public C2073HN C(String str) {
        a("impression_object", (Object) str);
        return this;
    }

    public C2073HN D(String str) {
        a("item", (Object) str);
        return this;
    }

    public C2073HN E(String str) {
        a("link_type", (Object) str);
        return this;
    }

    public C2073HN F(String str) {
        a("media_type", (Object) str);
        return this;
    }

    public C2073HN G(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        a("context", (Map<String, ?>) hashMap);
        return this;
    }

    public C2073HN H(String str) {
        a("monetization_model", (Object) str);
        return this;
    }

    public C2073HN I(String str) {
        a("monetization_type", (Object) str);
        return this;
    }

    public C2073HN J(String str) {
        a("monetized_object", (Object) str);
        return this;
    }

    public C2073HN K(String str) {
        a("os", (Object) str);
        return this;
    }

    public C2073HN L(String str) {
        a("page_name", (Object) str);
        return this;
    }

    public C2073HN M(String str) {
        a("page_urn", (Object) str);
        return this;
    }

    public C2073HN N(String str) {
        a("page_variant", (Object) str);
        return this;
    }

    public C2073HN O(String str) {
        a("play_id", (Object) str);
        return this;
    }

    public C2073HN P(String str) {
        a("player_interface", (Object) str);
        return this;
    }

    public C2073HN Q(String str) {
        a("player_type", (Object) str);
        return this;
    }

    public C2073HN R(String str) {
        a("player_variant", (Object) str);
        return this;
    }

    public C2073HN S(String str) {
        a("player_version", (Object) str);
        return this;
    }

    public C2073HN T(String str) {
        a("policy", (Object) str);
        return this;
    }

    public C2073HN U(String str) {
        a("preset", (Object) str);
        return this;
    }

    public C2073HN V(String str) {
        a("promoted_by", (Object) str);
        return this;
    }

    public C2073HN W(String str) {
        a("protocol", (Object) str);
        return this;
    }

    public C2073HN X(String str) {
        a("quality", (Object) str);
        return this;
    }

    public C2073HN Y(String str) {
        a("query_urn", (Object) str);
        return this;
    }

    public C2073HN Z(String str) {
        a("pause_reason", (Object) str);
        return this;
    }

    public C2073HN a(C4928GKa<C3508cda> gKa) {
        if (gKa.c()) {
            a("ad_urn", (Object) ((C3508cda) gKa.b()).toString());
        }
        return this;
    }

    public C2073HN aa(String str) {
        a(Constants.REFERRER, (Object) str);
        return this;
    }

    public C2073HN b(String str) {
        a("ad_delivered", (Object) str);
        return this;
    }

    public C2073HN ba(String str) {
        if (C5206PKa.b(str)) {
            a().put("q", str);
        }
        return this;
    }

    public C2073HN c(int i) {
        a("context_position", i);
        return this;
    }

    public C2073HN ca(String str) {
        if (C5206PKa.b(str)) {
            a().put("term", str);
        }
        return this;
    }

    public C2073HN d(String str) {
        a("ad_urn", (Object) str);
        return this;
    }

    public C2073HN da(String str) {
        if (C5206PKa.b(str)) {
            a().put("share_link_type", str);
        }
        return this;
    }

    public C2073HN e(String str) {
        a("request_endpoint", (Object) str);
        return this;
    }

    public C2073HN ea(String str) {
        a("source", (Object) str);
        return this;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2073HN)) {
            return false;
        }
        C2073HN hn = (C2073HN) obj;
        if (!C4804CKa.a(this.a, hn.a) || !C4804CKa.a(this.b, hn.b) || !C4804CKa.a(this.c, hn.c) || !C4804CKa.a(this.d, hn.d)) {
            z = false;
        }
        return z;
    }

    public C2073HN f(String str) {
        a("ads_received", (Object) str);
        return this;
    }

    public C2073HN fa(String str) {
        a("source_urn", (Object) str);
        return this;
    }

    public C2073HN g(boolean z) {
        a("is_player_visible", z);
        return this;
    }

    public C2073HN ga(String str) {
        a("source_version", (Object) str);
        return this;
    }

    public C2073HN h(String str) {
        a("audio_port", (Object) str);
        return this;
    }

    public C2073HN ha(String str) {
        a("trigger", (Object) str);
        return this;
    }

    public final int hashCode() {
        return C4804CKa.a(this.a, this.b, this.c, this.d);
    }

    public C2073HN i(String str) {
        a("click_category", (Object) str);
        return this;
    }

    public C2073HN ia(String str) {
        a(ImagesContract.URL, (Object) str);
        return this;
    }

    public C2073HN j(String str) {
        a("click_name", (Object) str);
        return this;
    }

    public C2073HN k(String str) {
        a("click_object", (Object) str);
        return this;
    }

    public C2073HN l(String str) {
        if (C5206PKa.b(str)) {
            a().put("repeat", str);
        }
        return this;
    }

    public C2073HN m(String str) {
        if (C5206PKa.b(str)) {
            a().put("source", str);
        }
        return this;
    }

    public C2073HN n(String str) {
        a().put("source_query_urn", str);
        return this;
    }

    public C2073HN o(String str) {
        if (C5206PKa.b(str)) {
            a().put("source_urn", str);
        }
        return this;
    }

    public C2073HN p(String str) {
        a("click_target", (Object) str);
        return this;
    }

    public C2073HN q(String str) {
        if (C5206PKa.b(str)) {
            a().put("trigger", str);
        }
        return this;
    }

    public C2073HN r(String str) {
        a().put("version", str);
        return this;
    }

    public C2073HN s(String str) {
        a("client_event_id", (Object) str);
        return this;
    }

    public C2073HN t(String str) {
        a().put(C1325gg.TYPE, str);
        return this;
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("event", (Object) this.a).a("version", (Object) this.b).a("event-id", (Object) this.c).a("payload", (Object) this.d).toString();
    }

    public C2073HN u(String str) {
        a("entity_type", (Object) str);
        return this;
    }

    public C2073HN v(String str) {
        a("error_code", (Object) str);
        return this;
    }

    public C2073HN w(String str) {
        a("event_stage", (Object) str);
        return this;
    }

    public C2073HN x(String str) {
        a("external_media", (Object) str);
        return this;
    }

    public C2073HN y(String str) {
        a("format", (Object) str.toLowerCase(Locale.US));
        return this;
    }

    public C2073HN z(String str) {
        a("host", (Object) str);
        return this;
    }

    public C2073HN b(C4928GKa<String> gKa) {
        return gKa.c() ? x((String) gKa.b()) : this;
    }

    public C2073HN c(boolean z) {
        a("in_foreground", z);
        return this;
    }

    public C2073HN d(C3508cda cda) {
        a("reposted_by", (Object) String.valueOf(cda));
        return this;
    }

    public C2073HN e(int i) {
        a("position_in_context", i);
        return this;
    }

    public C2073HN f(C3508cda cda) {
        a("track_owner", (Object) String.valueOf(cda));
        return this;
    }

    public C2073HN g(String str) {
        a("app_state", (Object) str);
        return this;
    }

    public C2073HN a(boolean z) {
        a("request_success", z);
        return this;
    }

    public C2073HN c(String str) {
        a("ad_request_event_id", (Object) str);
        return this;
    }

    public C2073HN d(int i) {
        a().put("history_length", Integer.valueOf(i));
        return this;
    }

    public C2073HN e(C3508cda cda) {
        a("track", (Object) String.valueOf(cda));
        return this;
    }

    public C2073HN f(boolean z) {
        a("local_storage_playback", z);
        return this;
    }

    public C2073HN g(int i) {
        a("query_position", i);
        return this;
    }

    private void g(C3508cda cda) {
        if (cda.K()) {
            a("user", (Object) cda.toString());
        }
    }

    public C2073HN a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("activity_type", str);
        hashMap.put("resource", str2);
        a("attributing_activity", (Map<String, ?>) hashMap);
        return this;
    }

    public C2073HN b(long j) {
        a("track_length", j);
        return this;
    }

    public C2073HN c(C3508cda cda) {
        a("in_system_playlist", (Object) String.valueOf(cda));
        return this;
    }

    public C2073HN d(boolean z) {
        a("in_likes", z);
        return this;
    }

    public C2073HN e(boolean z) {
        a("in_playlist", z);
        return this;
    }

    public C2073HN f(int i) {
        a("playlist_position", i);
        return this;
    }

    public C2073HN b(C3508cda cda) {
        a("in_playlist", (Object) String.valueOf(cda));
        return this;
    }

    public C2073HN b(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    public C2073HN b(int i) {
        a("num_columns", i);
        return this;
    }

    public C2073HN a(Long l) {
        a().put("commented_at", l);
        return this;
    }

    public C2073HN b(boolean z) {
        a().put("overflow_menu", Boolean.valueOf(z));
        return this;
    }

    public C2073HN a(C3508cda cda) {
        a().put("comment_urn", cda.b());
        return this;
    }

    public C2073HN a(C2455aV aVVar) {
        a("consumer_subs_plan", (Object) aVVar.a());
        return this;
    }

    public C2073HN a(int i) {
        a("bitrate", i);
        return this;
    }

    public C2073HN a(String str) {
        a("action", (Object) str);
        return this;
    }

    public C2073HN a(long j) {
        a("playhead_position", j);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public C2073HN a(String str, c cVar) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("column", Integer.valueOf(cVar.a()));
        hashMap.put("position", Integer.valueOf(cVar.b()));
        hashMap.put("percentage_viewable", Float.valueOf(cVar.c()));
        a(str, (Map<String, ?>) hashMap);
        return this;
    }

    public C2073HN a(Integer num) {
        a().put("source_position", num);
        return this;
    }

    private void a(String str, boolean z) {
        this.d.put(str, Boolean.valueOf(z));
    }

    private void a(String str, int i) {
        this.d.put(str, Integer.valueOf(i));
    }

    private void a(String str, long j) {
        this.d.put(str, Long.valueOf(j));
    }

    private void a(String str, Map<String, ?> map) {
        if (!map.isEmpty()) {
            this.d.put(str, map);
        }
    }

    public final C2073HN a(String str, Object obj) {
        if (obj instanceof String) {
            if (C5206PKa.b((String) obj)) {
                this.d.put(str, obj);
            }
            return this;
        }
        if (obj != null) {
            this.d.put(str, obj);
        }
        return this;
    }

    private HashMap<String, Object> a() {
        String str = "click_attributes";
        if (!this.d.containsKey(str)) {
            this.d.put(str, new HashMap());
        }
        return (HashMap) this.d.get(str);
    }
}

package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;

/* renamed from: OP reason: default package and case insensitive filesystem */
/* compiled from: ApiPromotedPlaylist */
public class C2208OP {
    private final C3927zda a;
    private final C3776gea b;
    private final String c;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private final List<String> g;

    @JsonCreator
    public C2208OP(@JsonProperty("playlist") C3927zda zda, @JsonProperty("promoter") C3776gea gea, @JsonProperty("urn") String str, @JsonProperty("tracking_playlist_clicked_urls") List<String> list, @JsonProperty("tracking_playlist_impression_urls") List<String> list2, @JsonProperty("tracking_profile_clicked_urls") List<String> list3, @JsonProperty("tracking_promoter_clicked_urls") List<String> list4) {
        this.a = zda;
        this.b = gea;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = list4;
    }

    public String a() {
        return this.c;
    }

    public C3927zda b() {
        return this.a;
    }

    public C3776gea c() {
        return this.b;
    }

    public List<String> d() {
        return this.d;
    }

    public List<String> e() {
        return this.e;
    }

    public List<String> f() {
        return this.f;
    }

    public List<String> g() {
        return this.g;
    }

    public List<String> h() {
        return Collections.emptyList();
    }
}

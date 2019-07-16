package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/* renamed from: Qca reason: default package */
/* compiled from: RecommendedTracksCollection */
public class Qca extends Pca<Yda> {
    private String d;

    @JsonCreator
    public Qca(@JsonProperty("collection") List<Yda> list, @JsonProperty("_links") Map<String, Oca> map, @JsonProperty("query_urn") String str, @JsonProperty("source_version") String str2) {
        super(list, map, str);
        this.d = str2;
    }

    @JsonProperty("source_version")
    public void a(String str) {
        this.d = str;
    }

    public String l() {
        return this.d;
    }
}

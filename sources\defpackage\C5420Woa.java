package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/* renamed from: Woa reason: default package and case insensitive filesystem */
/* compiled from: ApiPlaylistCollection */
public final class C5420Woa extends Pca<C3927zda> {
    @JsonCreator
    public C5420Woa(@JsonProperty("collection") List<C3927zda> list, @JsonProperty("_links") Map<String, Oca> map, @JsonProperty("query_urn") String str) {
        super(list, map, str);
    }
}

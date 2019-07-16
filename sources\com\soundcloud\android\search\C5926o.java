package com.soundcloud.android.search;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Function;
import java.util.List;
import java.util.Map;

/* renamed from: com.soundcloud.android.search.o reason: case insensitive filesystem */
/* compiled from: SearchModelCollection */
public class C5926o<T> extends Pca<T> {
    private final int d;
    private final int e;
    private final int f;

    @JsonCreator
    C5926o(@JsonProperty("collection") List<T> list, @JsonProperty("_links") Map<String, Oca> map, @JsonProperty("query_urn") String str, @JsonProperty("tracks_count") int i, @JsonProperty("playlists_count") int i2, @JsonProperty("users_count") int i3) {
        super(list, map, str);
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public int l() {
        return this.d + this.e + this.f;
    }

    public <S> C5926o<S> a(Function<T, S> function) {
        C5926o oVar = new C5926o((List<T>) C2063HD.a(C1943BD.a((Iterable<F>) this.a, function)), this.b, this.c, this.d, this.e, this.f);
        return oVar;
    }

    C5926o(List<T> list, Map<String, Oca> map, C3508cda cda, int i, int i2, int i3) {
        super(list, map, cda);
        this.d = i;
        this.e = i2;
        this.f = i3;
    }
}

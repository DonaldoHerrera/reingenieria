package com.soundcloud.android.stations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collections;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.t reason: case insensitive filesystem */
/* compiled from: ApiStationsCollections */
public abstract class C6046t {
    @JsonCreator
    public static C6046t a(@JsonProperty("recent") Pca<C6043s> pca) {
        return new C6049u(b(pca));
    }

    private static List<C6043s> b(Pca<C6043s> pca) {
        if (pca == null) {
            return Collections.emptyList();
        }
        return pca.f();
    }

    public abstract List<C6043s> a();
}

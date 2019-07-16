package com.soundcloud.android.stations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize
/* renamed from: com.soundcloud.android.stations.pa reason: case insensitive filesystem */
/* compiled from: LikedStationsPostBody */
abstract class C6036pa {
    C6036pa() {
    }

    static C6036pa a(List<C3508cda> list, List<C3508cda> list2) {
        return new C6052v(list, list2);
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("liked")
    public abstract List<C3508cda> a();

    /* access modifiers changed from: 0000 */
    @JsonProperty("unliked")
    public abstract List<C3508cda> b();
}

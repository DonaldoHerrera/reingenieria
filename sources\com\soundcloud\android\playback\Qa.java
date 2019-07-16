package com.soundcloud.android.playback;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: PlayPublisherPayload */
public abstract class Qa {
    @JsonCreator
    public static Qa a(@JsonProperty("gateway_id") String str, @JsonProperty("registration_id") String str2, @JsonProperty("timestamp") long j) {
        return new G(str, str2, j);
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("gateway_id")
    public abstract String a();

    /* access modifiers changed from: 0000 */
    @JsonProperty("registration_id")
    public abstract String b();

    /* access modifiers changed from: 0000 */
    @JsonProperty("timestamp")
    public abstract long c();
}

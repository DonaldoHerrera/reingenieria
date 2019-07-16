package com.soundcloud.android.ads.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.soundcloud.android.foundation.ads.Y;

/* renamed from: com.soundcloud.android.ads.data.c reason: case insensitive filesystem */
/* compiled from: Converters.kt */
public final class C2559c extends JsonSerializer<Y> {
    C2559c() {
    }

    /* renamed from: a */
    public void serialize(Y y, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        C7471uYa.b(y, "value");
        C7471uYa.b(jsonGenerator, "gen");
        C7471uYa.b(serializerProvider, "serializers");
        jsonGenerator.writeString(y.a());
    }
}

package com.soundcloud.android.ads.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/* renamed from: com.soundcloud.android.ads.data.b reason: case insensitive filesystem */
/* compiled from: Converters.kt */
public final class C2558b extends JsonSerializer<C3508cda> {
    C2558b() {
    }

    /* renamed from: a */
    public void serialize(C3508cda cda, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        C7471uYa.b(cda, "value");
        C7471uYa.b(jsonGenerator, "gen");
        C7471uYa.b(serializerProvider, "serializers");
        jsonGenerator.writeString(cda.toString());
    }
}

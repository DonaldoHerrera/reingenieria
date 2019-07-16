package com.soundcloud.android.ads.data;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.TextNode;
import com.soundcloud.android.foundation.ads.Y;

/* renamed from: com.soundcloud.android.ads.data.d reason: case insensitive filesystem */
/* compiled from: Converters.kt */
public final class C2560d extends JsonDeserializer<Y> {
    C2560d() {
    }

    public Y deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        C7471uYa.b(jsonParser, "p");
        C7471uYa.b(deserializationContext, "ctxt");
        String asText = ((TextNode) jsonParser.getCodec().readTree(jsonParser)).asText();
        C7471uYa.a((Object) asText, "node.asText()");
        return new Y(asText);
    }
}

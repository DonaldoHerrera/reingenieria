package com.soundcloud.android.ads.data;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.module.kotlin.ExtensionsKt;
import com.soundcloud.android.foundation.ads.C3691s.b;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.ads.aa.a;

/* renamed from: com.soundcloud.android.ads.data.e reason: case insensitive filesystem */
/* compiled from: Converters.kt */
public final class C2561e {
    private final ObjectMapper a = new ObjectMapper();

    public C2561e() {
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(C3508cda.class, new C2558b());
        simpleModule.addSerializer(Y.class, new C2559c());
        simpleModule.addDeserializer(Y.class, new C2560d());
        ExtensionsKt.registerKotlinModule(this.a);
        this.a.registerModule(simpleModule);
        this.a.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.a.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
    }

    public final a a(String str) {
        C7471uYa.b(str, "src");
        return (a) this.a.readValue(str, a.class);
    }

    public final b b(String str) {
        C7471uYa.b(str, "src");
        return (b) this.a.readValue(str, b.class);
    }

    public final String a(a aVar) {
        String writeValueAsString = this.a.writeValueAsString(aVar);
        C7471uYa.a((Object) writeValueAsString, "objectMapper.writeValueAsString(src)");
        return writeValueAsString;
    }

    public final String a(b bVar) {
        String writeValueAsString = this.a.writeValueAsString(bVar);
        C7471uYa.a((Object) writeValueAsString, "objectMapper.writeValueAsString(src)");
        return writeValueAsString;
    }
}

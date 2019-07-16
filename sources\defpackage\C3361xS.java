package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/* renamed from: xS reason: default package and case insensitive filesystem */
/* compiled from: RemoteTrackSerializer */
public class C3361xS extends JsonSerializer<C3341wS> {
    /* renamed from: a */
    public void serialize(C3341wS wSVar, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        if (wSVar.a().c()) {
            jsonGenerator.writeStringField("id", (String) wSVar.a().b());
        } else {
            jsonGenerator.writeStringField("urn", wSVar.b().toString());
        }
        jsonGenerator.writeEndObject();
    }
}

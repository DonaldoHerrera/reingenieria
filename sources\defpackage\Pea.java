package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;

/* renamed from: Pea reason: default package */
/* compiled from: OptionalSerializer.kt */
public final class Pea extends JsonSerializer<C4928GKa<?>> implements ContextualSerializer {
    private final BeanProperty a;

    public Pea() {
        this.a = null;
    }

    /* renamed from: a */
    public void serialize(C4928GKa<?> gKa, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        C7471uYa.b(gKa, "value");
        C7471uYa.b(jsonGenerator, "gen");
        C7471uYa.b(serializerProvider, "serializers");
        if (this.a == null) {
            throw new IllegalStateException("No property set.");
        } else if (gKa.c()) {
            serializerProvider.findValueSerializer(this.a.getType().containedType(0), this.a).serialize(gKa.b(), jsonGenerator, serializerProvider);
        } else {
            jsonGenerator.writeNull();
        }
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        C7471uYa.b(serializerProvider, "prov");
        C7471uYa.b(beanProperty, "property");
        return new Pea(beanProperty);
    }

    private Pea(BeanProperty beanProperty) {
        this.a = beanProperty;
    }
}

package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import java.io.IOException;

/* renamed from: Oea reason: default package */
/* compiled from: OptionalDeserializer.kt */
public final class Oea extends JsonDeserializer<C4928GKa<?>> implements ContextualDeserializer {
    private final JavaType a;

    public Oea() {
        this.a = null;
    }

    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        C7471uYa.b(deserializationContext, "ctxt");
        C7471uYa.b(beanProperty, "property");
        JavaType containedType = beanProperty.getType().containedType(0);
        C7471uYa.a((Object) containedType, "property.type.containedType(0)");
        return new Oea(containedType);
    }

    private Oea(JavaType javaType) {
        this.a = javaType;
    }

    public C4928GKa<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        C7471uYa.b(jsonParser, "parser");
        C7471uYa.b(deserializationContext, "ctxt");
        JavaType javaType = this.a;
        if (javaType != null) {
            C4928GKa<?> c = C4928GKa.c(deserializationContext.findRootValueDeserializer(javaType).deserialize(jsonParser, deserializationContext));
            C7471uYa.a((Object) c, "Optional.of(ctxt.findRoo…eserialize(parser, ctxt))");
            return c;
        }
        throw new IllegalStateException("No value type set.");
    }

    public C4928GKa<?> getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        C4928GKa<?> a2 = C4928GKa.a();
        C7471uYa.a((Object) a2, "Optional.absent<Any>()");
        return a2;
    }
}

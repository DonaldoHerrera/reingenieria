package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;

@JacksonStdImpl
public final class BooleanSerializer extends StdScalarSerializer<Object> implements ContextualSerializer {
    protected final boolean _forPrimitive;

    static final class AsNumber extends StdScalarSerializer<Object> implements ContextualSerializer {
        protected final boolean _forPrimitive;

        public AsNumber(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class, false);
            this._forPrimitive = z;
        }

        public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
            Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Boolean.class);
            return (findFormatOverrides == null || findFormatOverrides.getShape().isNumeric()) ? this : new BooleanSerializer(this._forPrimitive);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeNumber(Boolean.FALSE.equals(obj) ^ true ? 1 : 0);
        }

        public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
            jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
        }
    }

    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, false);
        this._forPrimitive = z;
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Boolean.class);
        return (findFormatOverrides == null || !findFormatOverrides.getShape().isNumeric()) ? this : new AsNumber(this._forPrimitive);
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
    }
}

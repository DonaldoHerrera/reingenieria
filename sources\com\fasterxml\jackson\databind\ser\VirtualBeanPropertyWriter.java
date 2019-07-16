package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;

public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    protected VirtualBeanPropertyWriter() {
    }

    protected static boolean _suppressNulls(Value value) {
        boolean z = false;
        if (value == null) {
            return false;
        }
        Include valueInclusion = value.getValueInclusion();
        if (!(valueInclusion == Include.ALWAYS || valueInclusion == Include.USE_DEFAULTS)) {
            z = true;
        }
        return z;
    }

    protected static Object _suppressableValue(Value value) {
        if (value == null) {
            return Boolean.valueOf(false);
        }
        Include valueInclusion = value.getValueInclusion();
        if (valueInclusion == Include.ALWAYS || valueInclusion == Include.NON_NULL || valueInclusion == Include.USE_DEFAULTS) {
            return null;
        }
        return BeanPropertyWriter.MARKER_FOR_EMPTY;
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object value = value(obj, jsonGenerator, serializerProvider);
        if (value == null) {
            JsonSerializer<Object> jsonSerializer = this._nullSerializer;
            if (jsonSerializer != null) {
                jsonSerializer.serialize(null, jsonGenerator, serializerProvider);
            } else {
                jsonGenerator.writeNull();
            }
            return;
        }
        JsonSerializer<Object> jsonSerializer2 = this._serializer;
        if (jsonSerializer2 == null) {
            Class cls = value.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
            jsonSerializer2 = serializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : serializerFor;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (jsonSerializer2.isEmpty(serializerProvider, value)) {
                    serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                    return;
                }
            } else if (obj2.equals(value)) {
                serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                return;
            }
        }
        if (value != obj || !_handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer2)) {
            TypeSerializer typeSerializer = this._typeSerializer;
            if (typeSerializer == null) {
                jsonSerializer2.serialize(value, jsonGenerator, serializerProvider);
            } else {
                jsonSerializer2.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
            }
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Object value = value(obj, jsonGenerator, serializerProvider);
        if (value == null) {
            if (this._nullSerializer != null) {
                jsonGenerator.writeFieldName((SerializableString) this._name);
                this._nullSerializer.serialize(null, jsonGenerator, serializerProvider);
            }
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._serializer;
        if (jsonSerializer == null) {
            Class cls = value.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
            jsonSerializer = serializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : serializerFor;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj2) {
                if (jsonSerializer.isEmpty(serializerProvider, value)) {
                    return;
                }
            } else if (obj2.equals(value)) {
                return;
            }
        }
        if (value != obj || !_handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer)) {
            jsonGenerator.writeFieldName((SerializableString) this._name);
            TypeSerializer typeSerializer = this._typeSerializer;
            if (typeSerializer == null) {
                jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
            } else {
                jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object value(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception;

    public abstract VirtualBeanPropertyWriter withConfig(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType);

    protected VirtualBeanPropertyWriter(BeanPropertyDefinition beanPropertyDefinition, Annotations annotations, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, Value value, Class<?>[] clsArr) {
        super(beanPropertyDefinition, beanPropertyDefinition.getPrimaryMember(), annotations, javaType, jsonSerializer, typeSerializer, javaType2, _suppressNulls(value), _suppressableValue(value), clsArr);
    }
}

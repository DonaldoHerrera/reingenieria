package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult;
import java.io.IOException;

@JacksonStdImpl
public class ObjectArraySerializer extends ArraySerializerBase<Object[]> implements ContextualSerializer {
    protected PropertySerializerMap _dynamicSerializers = PropertySerializerMap.emptyForProperties();
    protected JsonSerializer<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final boolean _staticTyping;
    protected final TypeSerializer _valueTypeSerializer;

    public ObjectArraySerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(Object[].class);
        this._elementType = javaType;
        this._staticTyping = z;
        this._valueTypeSerializer = typeSerializer;
        this._elementSerializer = jsonSerializer;
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        ObjectArraySerializer objectArraySerializer = new ObjectArraySerializer(this, beanProperty, this._valueTypeSerializer, this._elementSerializer, bool);
        return objectArraySerializer;
    }

    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new ObjectArraySerializer(this._elementType, this._staticTyping, typeSerializer, this._elementSerializer);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer;
        Value findFormatOverrides;
        JsonSerializer findContextualConvertingSerializer;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        Boolean bool = null;
        if (beanProperty != null) {
            AnnotatedMember member = beanProperty.getMember();
            AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
            if (member != null) {
                Object findContentSerializer = annotationIntrospector.findContentSerializer(member);
                if (findContentSerializer != null) {
                    jsonSerializer = serializerProvider.serializerInstance(member, findContentSerializer);
                    findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
                    if (findFormatOverrides != null) {
                        bool = findFormatOverrides.getFeature(Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
                    }
                    if (jsonSerializer == null) {
                        jsonSerializer = this._elementSerializer;
                    }
                    findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer);
                    if (findContextualConvertingSerializer == null) {
                        JavaType javaType = this._elementType;
                        if (javaType != null && this._staticTyping && !javaType.isJavaLangObject()) {
                            findContextualConvertingSerializer = serializerProvider.findValueSerializer(this._elementType, beanProperty);
                        }
                    }
                    return withResolved(beanProperty, typeSerializer, findContextualConvertingSerializer, bool);
                }
            }
        }
        jsonSerializer = null;
        findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides != null) {
        }
        if (jsonSerializer == null) {
        }
        findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer);
        if (findContextualConvertingSerializer == null) {
        }
        return withResolved(beanProperty, typeSerializer, findContextualConvertingSerializer, bool);
    }

    public void serializeContentsUsing(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        int length = objArr.length;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        int i = 0;
        Object obj = null;
        while (i < length) {
            try {
                obj = objArr[i];
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
                i++;
            } catch (Exception e) {
                wrapAndThrow(serializerProvider, (Throwable) e, obj, i);
                return;
            }
        }
    }

    public void serializeTypedContents(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj;
        int length = objArr.length;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        int i = 0;
        try {
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            obj = null;
            while (i < length) {
                try {
                    obj = objArr[i];
                    if (obj == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        Class cls = obj.getClass();
                        JsonSerializer serializerFor = propertySerializerMap.serializerFor(cls);
                        if (serializerFor == null) {
                            serializerFor = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                        }
                        serializerFor.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                    }
                    i++;
                } catch (Exception e) {
                    e = e;
                    wrapAndThrow(serializerProvider, (Throwable) e, obj, i);
                    throw null;
                }
            }
        } catch (Exception e2) {
            e = e2;
            obj = null;
            wrapAndThrow(serializerProvider, (Throwable) e, obj, i);
            throw null;
        }
    }

    public ObjectArraySerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        if (this._property == beanProperty && jsonSerializer == this._elementSerializer && this._valueTypeSerializer == typeSerializer && this._unwrapSingle == bool) {
            return this;
        }
        ObjectArraySerializer objectArraySerializer = new ObjectArraySerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
        return objectArraySerializer;
    }

    public boolean isEmpty(SerializerProvider serializerProvider, Object[] objArr) {
        return objArr.length == 0;
    }

    public final void serialize(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int length = objArr.length;
        if (length != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray(length);
            serializeContents(objArr, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(objArr, jsonGenerator, serializerProvider);
    }

    public void serializeContents(Object[] objArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj;
        int length = objArr.length;
        if (length != 0) {
            JsonSerializer<Object> jsonSerializer = this._elementSerializer;
            if (jsonSerializer != null) {
                serializeContentsUsing(objArr, jsonGenerator, serializerProvider, jsonSerializer);
            } else if (this._valueTypeSerializer != null) {
                serializeTypedContents(objArr, jsonGenerator, serializerProvider);
            } else {
                int i = 0;
                try {
                    PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                    obj = null;
                    while (i < length) {
                        try {
                            obj = objArr[i];
                            if (obj == null) {
                                serializerProvider.defaultSerializeNull(jsonGenerator);
                            } else {
                                Class cls = obj.getClass();
                                JsonSerializer serializerFor = propertySerializerMap.serializerFor(cls);
                                if (serializerFor == null) {
                                    if (this._elementType.hasGenericTypes()) {
                                        serializerFor = _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider);
                                    } else {
                                        serializerFor = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                                    }
                                }
                                serializerFor.serialize(obj, jsonGenerator, serializerProvider);
                            }
                            i++;
                        } catch (Exception e) {
                            e = e;
                            wrapAndThrow(serializerProvider, (Throwable) e, obj, i);
                            throw null;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    obj = null;
                    wrapAndThrow(serializerProvider, (Throwable) e, obj, i);
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public ObjectArraySerializer(ObjectArraySerializer objectArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(objectArraySerializer, beanProperty, bool);
        this._elementType = objectArraySerializer._elementType;
        this._valueTypeSerializer = typeSerializer;
        this._staticTyping = objectArraySerializer._staticTyping;
        this._elementSerializer = jsonSerializer;
    }
}

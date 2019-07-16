package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.util.Collection;

public abstract class StaticListSerializerBase<T extends Collection<?>> extends StdSerializer<T> implements ContextualSerializer {
    protected final Boolean _unwrapSingle;

    protected StaticListSerializerBase(Class<?> cls) {
        super(cls, false);
        this._unwrapSingle = null;
    }

    public abstract JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool);

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer jsonSerializer;
        JsonSerializer findContextualConvertingSerializer;
        if (beanProperty != null) {
            AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
            AnnotatedMember member = beanProperty.getMember();
            if (member != null) {
                Object findContentSerializer = annotationIntrospector.findContentSerializer(member);
                if (findContentSerializer != null) {
                    jsonSerializer = serializerProvider.serializerInstance(member, findContentSerializer);
                    Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
                    Boolean feature = findFormatOverrides == null ? findFormatOverrides.getFeature(Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : null;
                    findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer);
                    if (findContextualConvertingSerializer == null) {
                        findContextualConvertingSerializer = serializerProvider.findValueSerializer(String.class, beanProperty);
                    }
                    if (isDefaultSerializer(findContextualConvertingSerializer)) {
                        return new CollectionSerializer(serializerProvider.constructType(String.class), true, null, findContextualConvertingSerializer);
                    }
                    if (feature == this._unwrapSingle) {
                        return this;
                    }
                    return _withResolved(beanProperty, feature);
                }
            }
        }
        jsonSerializer = null;
        Value findFormatOverrides2 = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides2 == null) {
        }
        findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer);
        if (findContextualConvertingSerializer == null) {
        }
        if (isDefaultSerializer(findContextualConvertingSerializer)) {
        }
    }

    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return t == null || t.size() == 0;
    }

    protected StaticListSerializerBase(StaticListSerializerBase<?> staticListSerializerBase, Boolean bool) {
        super((StdSerializer<?>) staticListSerializerBase);
        this._unwrapSingle = bool;
    }
}

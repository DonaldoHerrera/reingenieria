package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.Collection;

@JacksonStdImpl
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements ContextualDeserializer {
    protected final JsonDeserializer<Object> _delegateDeserializer;
    protected final JsonDeserializer<String> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    public StringCollectionDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, valueInstantiator, null, jsonDeserializer, jsonDeserializer, null);
    }

    private Collection<String> deserializeUsingCustom(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection, JsonDeserializer<String> jsonDeserializer) throws IOException {
        Object obj;
        while (true) {
            if (jsonParser.nextTextValue() == null) {
                JsonToken currentToken = jsonParser.getCurrentToken();
                if (currentToken == JsonToken.END_ARRAY) {
                    return collection;
                }
                if (currentToken != JsonToken.VALUE_NULL) {
                    obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                } else if (!this._skipNullValues) {
                    obj = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
            }
            collection.add((String) obj);
        }
    }

    private final Collection<String> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str;
        Boolean bool = this._unwrapSingle;
        if (!(bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType.getRawClass(), jsonParser);
        }
        JsonDeserializer<String> jsonDeserializer = this._valueDeserializer;
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
            str = jsonDeserializer == null ? _parseString(jsonParser, deserializationContext) : (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else if (this._skipNullValues) {
            return collection;
        } else {
            str = (String) this._nullProvider.getNullValue(deserializationContext);
        }
        collection.add(str);
        return collection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer jsonDeserializer;
        JsonDeserializer<String> jsonDeserializer2;
        JsonDeserializer jsonDeserializer3;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        JsonDeserializer jsonDeserializer4 = null;
        if (valueInstantiator != null) {
            if (valueInstantiator.getArrayDelegateCreator() != null) {
                jsonDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig()), beanProperty);
            } else if (this._valueInstantiator.getDelegateCreator() != null) {
                jsonDeserializer = findDeserializer(deserializationContext, this._valueInstantiator.getDelegateType(deserializationContext.getConfig()), beanProperty);
            }
            jsonDeserializer2 = this._valueDeserializer;
            JavaType contentType = this._containerType.getContentType();
            if (jsonDeserializer2 != null) {
                jsonDeserializer3 = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer2);
                if (jsonDeserializer3 == null) {
                    jsonDeserializer3 = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
                }
            } else {
                jsonDeserializer3 = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, contentType);
            }
            Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, Collection.class, Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
            NullValueProvider findContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer3);
            if (!isDefaultDeserializer(jsonDeserializer3)) {
                jsonDeserializer4 = jsonDeserializer3;
            }
            return withResolved(jsonDeserializer, jsonDeserializer4, findContentNullProvider, findFormatFeature);
        }
        jsonDeserializer = null;
        jsonDeserializer2 = this._valueDeserializer;
        JavaType contentType2 = this._containerType.getContentType();
        if (jsonDeserializer2 != null) {
        }
        Boolean findFormatFeature2 = findFormatFeature(deserializationContext, beanProperty, Collection.class, Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        NullValueProvider findContentNullProvider2 = findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer3);
        if (!isDefaultDeserializer(jsonDeserializer3)) {
        }
        return withResolved(jsonDeserializer, jsonDeserializer4, findContentNullProvider2, findFormatFeature2);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public boolean isCachable() {
        return this._valueDeserializer == null && this._delegateDeserializer == null;
    }

    /* access modifiers changed from: protected */
    public StringCollectionDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        if (this._unwrapSingle == bool && this._nullProvider == nullValueProvider && this._valueDeserializer == jsonDeserializer2 && this._delegateDeserializer == jsonDeserializer) {
            return this;
        }
        StringCollectionDeserializer stringCollectionDeserializer = new StringCollectionDeserializer(this._containerType, this._valueInstantiator, jsonDeserializer, jsonDeserializer2, nullValueProvider, bool);
        return stringCollectionDeserializer;
    }

    protected StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this._valueDeserializer = jsonDeserializer2;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer;
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        return deserialize(jsonParser, deserializationContext, (Collection) this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) throws IOException {
        String str;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        JsonDeserializer<String> jsonDeserializer = this._valueDeserializer;
        if (jsonDeserializer != null) {
            deserializeUsingCustom(jsonParser, deserializationContext, collection, jsonDeserializer);
            return collection;
        }
        while (true) {
            try {
                String nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue != null) {
                    collection.add(nextTextValue);
                } else {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (currentToken != JsonToken.VALUE_NULL) {
                        str = _parseString(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        str = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                    collection.add(str);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath((Throwable) e, (Object) collection, collection.size());
            }
        }
    }
}

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    private volatile transient NameTransformer _currentlyTransforming;
    protected transient Exception _nullFromCreator;

    /* renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 1;
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 5;
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 6;
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 7;
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 8;
            $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 9;
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static class BeanReferring extends Referring {
        private Object _bean;
        private final DeserializationContext _context;
        private final SettableBeanProperty _prop;

        BeanReferring(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, PropertyValueBuffer propertyValueBuffer, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this._context = deserializationContext;
            this._prop = settableBeanProperty;
        }

        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            Object obj3 = this._bean;
            if (obj3 != null) {
                this._prop.set(obj3, obj2);
                return;
            }
            DeserializationContext deserializationContext = this._context;
            SettableBeanProperty settableBeanProperty = this._prop;
            deserializationContext.reportInputMismatch((BeanProperty) settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this._prop.getDeclaringClass().getName());
            throw null;
        }

        public void setBean(Object obj) {
            this._bean = obj;
        }
    }

    public BeanDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(beanDeserializerBuilder, beanDescription, beanPropertyMap, map, hashSet, z, z2);
    }

    private BeanReferring handleUnresolvedReference(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyValueBuffer propertyValueBuffer, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        BeanReferring beanReferring = new BeanReferring(deserializationContext, unresolvedForwardReference, settableBeanProperty.getType(), propertyValueBuffer, settableBeanProperty);
        unresolvedForwardReference.getRoid().appendReferring(beanReferring);
        return beanReferring;
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                        throw null;
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return createUsingDefault;
    }

    /* access modifiers changed from: protected */
    public Exception _creatorReturnedNullException() {
        if (this._nullFromCreator == null) {
            this._nullFromCreator = new NullPointerException("JSON Creator returned null");
        }
        return this._nullFromCreator;
    }

    /* access modifiers changed from: protected */
    public final Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken != null) {
            switch (AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()]) {
                case 1:
                    return deserializeFromString(jsonParser, deserializationContext);
                case 2:
                    return deserializeFromNumber(jsonParser, deserializationContext);
                case 3:
                    return deserializeFromDouble(jsonParser, deserializationContext);
                case 4:
                    return deserializeFromEmbedded(jsonParser, deserializationContext);
                case 5:
                case 6:
                    return deserializeFromBoolean(jsonParser, deserializationContext);
                case 7:
                    return deserializeFromNull(jsonParser, deserializationContext);
                case 8:
                    return deserializeFromArray(jsonParser, deserializationContext);
                case 9:
                case 10:
                    if (this._vanillaProcessing) {
                        return vanillaDeserialize(jsonParser, deserializationContext, jsonToken);
                    }
                    if (this._objectIdReader != null) {
                        return deserializeWithObjectId(jsonParser, deserializationContext);
                    }
                    return deserializeFromObject(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
    }

    /* access modifiers changed from: protected */
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        Object obj2;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        Class activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken currentToken = jsonParser.getCurrentToken();
        List<BeanReferring> list = null;
        TokenBuffer tokenBuffer = null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
                if (findCreatorProperty == null) {
                    SettableBeanProperty find = this._beanProperties.find(currentName);
                    if (find != null) {
                        try {
                            startBuilding.bufferProperty(find, _deserializeWithErrorWrapping(jsonParser, deserializationContext, find));
                        } catch (UnresolvedForwardReference e) {
                            BeanReferring handleUnresolvedReference = handleUnresolvedReference(deserializationContext, find, startBuilding, e);
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            list.add(handleUnresolvedReference);
                        }
                    } else {
                        Set<String> set = this._ignorableProps;
                        if (set == null || !set.contains(currentName)) {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                try {
                                    startBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                                } catch (Exception e2) {
                                    wrapAndThrow(e2, this._beanType.getRawClass(), currentName, deserializationContext);
                                    throw null;
                                }
                            } else {
                                if (tokenBuffer == null) {
                                    tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                                }
                                tokenBuffer.writeFieldName(currentName);
                                tokenBuffer.copyCurrentStructure(jsonParser);
                            }
                        } else {
                            handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                        }
                    }
                } else if (activeView != null && !findCreatorProperty.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else if (startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty))) {
                    jsonParser.nextToken();
                    try {
                        obj2 = propertyBasedCreator.build(deserializationContext, startBuilding);
                    } catch (Exception e3) {
                        obj2 = wrapInstantiationProblem(e3, deserializationContext);
                    }
                    if (obj2 == null) {
                        return deserializationContext.handleInstantiationProblem(handledType(), null, _creatorReturnedNullException());
                    }
                    jsonParser.setCurrentValue(obj2);
                    if (obj2.getClass() != this._beanType.getRawClass()) {
                        return handlePolymorphic(jsonParser, deserializationContext, obj2, tokenBuffer);
                    }
                    if (tokenBuffer != null) {
                        handleUnknownProperties(deserializationContext, obj2, tokenBuffer);
                    }
                    deserialize(jsonParser, deserializationContext, obj2);
                    return obj2;
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            obj = propertyBasedCreator.build(deserializationContext, startBuilding);
        } catch (Exception e4) {
            wrapInstantiationProblem(e4, deserializationContext);
            obj = null;
        }
        if (list != null) {
            for (BeanReferring bean : list) {
                bean.setBean(obj);
            }
        }
        if (tokenBuffer != null) {
            if (obj.getClass() != this._beanType.getRawClass()) {
                return handlePolymorphic(null, deserializationContext, obj, tokenBuffer);
            }
            handleUnknownProperties(deserializationContext, obj, tokenBuffer);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e) {
            wrapAndThrow(e, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.isExpectedStartObjectToken()) {
            return _deserializeOther(jsonParser, deserializationContext, jsonParser.getCurrentToken());
        }
        if (this._vanillaProcessing) {
            return vanillaDeserialize(jsonParser, deserializationContext, jsonParser.nextToken());
        }
        jsonParser.nextToken();
        if (this._objectIdReader != null) {
            return deserializeWithObjectId(jsonParser, deserializationContext);
        }
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public Object deserializeFromNull(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        if (!jsonParser.requiresCustomCodec()) {
            return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeEndObject();
        JsonParser asParser = tokenBuffer.asParser(jsonParser);
        asParser.nextToken();
        if (this._vanillaProcessing) {
            obj = vanillaDeserialize(asParser, deserializationContext, JsonToken.END_OBJECT);
        } else {
            obj = deserializeFromObject(asParser, deserializationContext);
        }
        asParser.close();
        return obj;
    }

    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null && objectIdReader.maySerializeAsObject() && jsonParser.hasTokenId(5) && this._objectIdReader.isValidReferencePropertyName(jsonParser.getCurrentName(), jsonParser)) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        if (!this._nonStandardCreation) {
            Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            jsonParser.setCurrentValue(createUsingDefault);
            if (jsonParser.canReadObjectId()) {
                Object objectId = jsonParser.getObjectId();
                if (objectId != null) {
                    _handleTypedObjectId(jsonParser, deserializationContext, createUsingDefault, objectId);
                }
            }
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDefault);
            }
            if (this._needViewProcesing) {
                Class activeView = deserializationContext.getActiveView();
                if (activeView != null) {
                    deserializeWithView(jsonParser, deserializationContext, createUsingDefault, activeView);
                    return createUsingDefault;
                }
            }
            if (jsonParser.hasTokenId(5)) {
                String currentName = jsonParser.getCurrentName();
                do {
                    jsonParser.nextToken();
                    SettableBeanProperty find = this._beanProperties.find(currentName);
                    if (find != null) {
                        try {
                            find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                        } catch (Exception e) {
                            wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                            throw null;
                        }
                    } else {
                        handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
                    }
                    currentName = jsonParser.nextFieldName();
                } while (currentName != null);
            }
            return createUsingDefault;
        } else if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext);
        } else {
            if (this._externalTypeIdHandler != null) {
                return deserializeWithExternalTypeId(jsonParser, deserializationContext);
            }
            Object deserializeFromObjectUsingNonDefault = deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
            if (this._injectables != null) {
                injectValues(deserializationContext, deserializeFromObjectUsingNonDefault);
            }
            return deserializeFromObjectUsingNonDefault;
        }
    }

    /* access modifiers changed from: protected */
    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ExternalTypeHandler start = this._externalTypeIdHandler.start();
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, null) && startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty))) {
                    JsonToken nextToken = jsonParser.nextToken();
                    try {
                        Object build = propertyBasedCreator.build(deserializationContext, startBuilding);
                        while (nextToken == JsonToken.FIELD_NAME) {
                            jsonParser.nextToken();
                            tokenBuffer.copyCurrentStructure(jsonParser);
                            nextToken = jsonParser.nextToken();
                        }
                        if (build.getClass() == this._beanType.getRawClass()) {
                            start.complete(jsonParser, deserializationContext, build);
                            return build;
                        }
                        JavaType javaType = this._beanType;
                        deserializationContext.reportBadDefinition(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", new Object[]{javaType, build.getClass()}));
                        throw null;
                    } catch (Exception e) {
                        wrapAndThrow(e, this._beanType.getRawClass(), currentName, deserializationContext);
                        throw null;
                    }
                }
            } else if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    startBuilding.bufferProperty(find, find.deserialize(jsonParser, deserializationContext));
                } else if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, null)) {
                    Set<String> set = this._ignorableProps;
                    if (set == null || !set.contains(currentName)) {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            startBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        }
                    } else {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        tokenBuffer.writeEndObject();
        try {
            return start.complete(jsonParser, deserializationContext, startBuilding, propertyBasedCreator);
        } catch (Exception e2) {
            return wrapInstantiationProblem(e2, deserializationContext);
        }
    }

    /* access modifiers changed from: protected */
    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                if (startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty))) {
                    JsonToken nextToken = jsonParser.nextToken();
                    try {
                        obj = propertyBasedCreator.build(deserializationContext, startBuilding);
                    } catch (Exception e) {
                        obj = wrapInstantiationProblem(e, deserializationContext);
                    }
                    jsonParser.setCurrentValue(obj);
                    while (nextToken == JsonToken.FIELD_NAME) {
                        tokenBuffer.copyCurrentStructure(jsonParser);
                        nextToken = jsonParser.nextToken();
                    }
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    if (nextToken == jsonToken) {
                        tokenBuffer.writeEndObject();
                        if (obj.getClass() == this._beanType.getRawClass()) {
                            this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, obj, tokenBuffer);
                            return obj;
                        }
                        deserializationContext.reportInputMismatch((BeanProperty) findCreatorProperty, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                        throw null;
                    }
                    deserializationContext.reportWrongTokenException((JsonDeserializer<?>) this, jsonToken, "Attempted to unwrap '%s' value", handledType().getName());
                    throw null;
                }
            } else if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    startBuilding.bufferProperty(find, _deserializeWithErrorWrapping(jsonParser, deserializationContext, find));
                } else {
                    Set<String> set = this._ignorableProps;
                    if (set != null && set.contains(currentName)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                    } else if (this._anySetter == null) {
                        tokenBuffer.writeFieldName(currentName);
                        tokenBuffer.copyCurrentStructure(jsonParser);
                    } else {
                        TokenBuffer asCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                        tokenBuffer.writeFieldName(currentName);
                        tokenBuffer.append(asCopyOfValue);
                        try {
                            startBuilding.bufferAnyProperty(this._anySetter, currentName, this._anySetter.deserialize(asCopyOfValue.asParserOnFirstToken(), deserializationContext));
                        } catch (Exception e2) {
                            wrapAndThrow(e2, this._beanType.getRawClass(), currentName, deserializationContext);
                            throw null;
                        }
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            Object build = propertyBasedCreator.build(deserializationContext, startBuilding);
            this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, build, tokenBuffer);
            return build;
        } catch (Exception e3) {
            wrapInstantiationProblem(e3, deserializationContext);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        deserializeWithExternalTypeId(jsonParser, deserializationContext, createUsingDefault);
        return createUsingDefault;
    }

    /* access modifiers changed from: protected */
    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonParser, deserializationContext);
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        Class activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        String currentName = jsonParser.hasTokenId(5) ? jsonParser.getCurrentName() : null;
        while (currentName != null) {
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find == null) {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, createUsingDefault, currentName);
                } else if (this._anySetter == null) {
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                } else {
                    TokenBuffer asCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.append(asCopyOfValue);
                    try {
                        this._anySetter.deserializeAndSet(asCopyOfValue.asParserOnFirstToken(), deserializationContext, createUsingDefault, currentName);
                    } catch (Exception e) {
                        wrapAndThrow(e, createUsingDefault, currentName, deserializationContext);
                        throw null;
                    }
                }
            } else if (activeView == null || find.visibleInView(activeView)) {
                try {
                    find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                } catch (Exception e2) {
                    wrapAndThrow(e2, createUsingDefault, currentName, deserializationContext);
                    throw null;
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
        tokenBuffer.writeEndObject();
        this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, createUsingDefault, tokenBuffer);
        return createUsingDefault;
    }

    /* access modifiers changed from: protected */
    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find == null) {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, currentName);
                } else if (!find.visibleInView(cls)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, currentName, deserializationContext);
                        throw null;
                    }
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return obj;
    }

    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this._currentlyTransforming == nameTransformer) {
            return this;
        }
        this._currentlyTransforming = nameTransformer;
        try {
            return new BeanDeserializer((BeanDeserializerBase) this, nameTransformer);
        } finally {
            this._currentlyTransforming = null;
        }
    }

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer((BeanDeserializerBase) this, beanPropertyMap);
    }

    protected BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializer withIgnorableProperties(Set<String> set) {
        return new BeanDeserializer((BeanDeserializerBase) this, set);
    }

    public BeanDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer((BeanDeserializerBase) this, objectIdReader);
    }

    protected BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }

    /* access modifiers changed from: protected */
    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        ExternalTypeHandler start = this._externalTypeIdHandler.start();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            JsonToken nextToken = jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                if (nextToken.isScalarValue()) {
                    start.handleTypePropertyValue(jsonParser, deserializationContext, currentName, obj);
                }
                if (activeView == null || find.visibleInView(activeView)) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, currentName, deserializationContext);
                        throw null;
                    }
                } else {
                    jsonParser.skipChildren();
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                } else if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, obj)) {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                        } catch (Exception e2) {
                            wrapAndThrow(e2, obj, currentName, deserializationContext);
                            throw null;
                        }
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        start.complete(jsonParser, deserializationContext, obj);
        return obj;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String str;
        jsonParser.setCurrentValue(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            deserializeWithUnwrapped(jsonParser, deserializationContext, obj);
            return obj;
        } else if (this._externalTypeIdHandler != null) {
            deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
            return obj;
        } else {
            if (jsonParser.isExpectedStartObjectToken()) {
                str = jsonParser.nextFieldName();
                if (str == null) {
                    return obj;
                }
            } else if (!jsonParser.hasTokenId(5)) {
                return obj;
            } else {
                str = jsonParser.getCurrentName();
            }
            if (this._needViewProcesing) {
                Class activeView = deserializationContext.getActiveView();
                if (activeView != null) {
                    deserializeWithView(jsonParser, deserializationContext, obj, activeView);
                    return obj;
                }
            }
            do {
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(str);
                if (find != null) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, str, deserializationContext);
                        throw null;
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, str);
                }
                str = jsonParser.nextFieldName();
            } while (str != null);
            return obj;
        }
    }

    /* access modifiers changed from: protected */
    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        Class activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (find == null) {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                } else if (this._anySetter == null) {
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                } else {
                    TokenBuffer asCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.append(asCopyOfValue);
                    try {
                        this._anySetter.deserializeAndSet(asCopyOfValue.asParserOnFirstToken(), deserializationContext, obj, currentName);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, currentName, deserializationContext);
                        throw null;
                    }
                }
            } else if (activeView == null || find.visibleInView(activeView)) {
                try {
                    find.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e2) {
                    wrapAndThrow(e2, obj, currentName, deserializationContext);
                    throw null;
                }
            } else {
                jsonParser.skipChildren();
            }
            currentToken = jsonParser.nextToken();
        }
        tokenBuffer.writeEndObject();
        this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, obj, tokenBuffer);
        return obj;
    }
}

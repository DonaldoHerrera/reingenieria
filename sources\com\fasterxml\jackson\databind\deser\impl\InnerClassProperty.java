package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.Constructor;

public final class InnerClassProperty extends Delegating {
    protected AnnotatedConstructor _annotated;
    protected final transient Constructor<?> _creator;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this._creator = constructor;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            obj2 = this._valueDeserializer.getNullValue(deserializationContext);
        } else {
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            if (typeDeserializer != null) {
                obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            } else {
                try {
                    Object newInstance = this._creator.newInstance(new Object[]{obj});
                    this._valueDeserializer.deserialize(jsonParser, deserializationContext, newInstance);
                    obj2 = newInstance;
                } catch (Exception e) {
                    ClassUtil.unwrapAndThrowAsIAE(e, String.format("Failed to instantiate class %s, problem: %s", new Object[]{this._creator.getDeclaringClass().getName(), e.getMessage()}));
                    throw null;
                }
            }
        }
        set(obj, obj2);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    /* access modifiers changed from: 0000 */
    public Object readResolve() {
        return new InnerClassProperty((SettableBeanProperty) this, this._annotated);
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        if (settableBeanProperty == this.delegate) {
            return this;
        }
        return new InnerClassProperty(settableBeanProperty, this._creator);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return this._annotated == null ? new InnerClassProperty((SettableBeanProperty) this, new AnnotatedConstructor(null, this._creator, null, null)) : this;
    }

    protected InnerClassProperty(SettableBeanProperty settableBeanProperty, AnnotatedConstructor annotatedConstructor) {
        super(settableBeanProperty);
        this._annotated = annotatedConstructor;
        AnnotatedConstructor annotatedConstructor2 = this._annotated;
        this._creator = annotatedConstructor2 == null ? null : annotatedConstructor2.getAnnotated();
        if (this._creator == null) {
            throw new IllegalArgumentException("Missing constructor (broken JDK (de)serialization?)");
        }
    }
}

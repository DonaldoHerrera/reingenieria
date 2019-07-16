package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class SimpleModule extends Module implements Serializable {
    protected SimpleAbstractTypeResolver _abstractTypes = null;
    protected BeanDeserializerModifier _deserializerModifier = null;
    protected SimpleDeserializers _deserializers = null;
    protected SimpleKeyDeserializers _keyDeserializers = null;
    protected SimpleSerializers _keySerializers = null;
    protected HashMap<Class<?>, Class<?>> _mixins = null;
    protected final String _name;
    protected PropertyNamingStrategy _namingStrategy = null;
    protected BeanSerializerModifier _serializerModifier = null;
    protected SimpleSerializers _serializers = null;
    protected LinkedHashSet<NamedType> _subtypes = null;
    protected SimpleValueInstantiators _valueInstantiators = null;
    protected final Version _version;

    public SimpleModule() {
        String str;
        if (getClass() == SimpleModule.class) {
            StringBuilder sb = new StringBuilder();
            sb.append("SimpleModule-");
            sb.append(System.identityHashCode(this));
            str = sb.toString();
        } else {
            str = getClass().getName();
        }
        this._name = str;
        this._version = Version.unknownVersion();
    }

    /* access modifiers changed from: protected */
    public void _checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", new Object[]{str}));
        }
    }

    public <T> SimpleModule addDeserializer(Class<T> cls, JsonDeserializer<? extends T> jsonDeserializer) {
        _checkNotNull(cls, "type to register deserializer for");
        _checkNotNull(jsonDeserializer, "deserializer");
        if (this._deserializers == null) {
            this._deserializers = new SimpleDeserializers();
        }
        this._deserializers.addDeserializer(cls, jsonDeserializer);
        return this;
    }

    public <T> SimpleModule addSerializer(Class<? extends T> cls, JsonSerializer<T> jsonSerializer) {
        _checkNotNull(cls, "type to register serializer for");
        _checkNotNull(jsonSerializer, "serializer");
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(cls, jsonSerializer);
        return this;
    }

    public String getModuleName() {
        return this._name;
    }

    public Object getTypeId() {
        if (getClass() == SimpleModule.class) {
            return null;
        }
        return super.getTypeId();
    }

    public void setupModule(SetupContext setupContext) {
        SimpleSerializers simpleSerializers = this._serializers;
        if (simpleSerializers != null) {
            setupContext.addSerializers(simpleSerializers);
        }
        SimpleDeserializers simpleDeserializers = this._deserializers;
        if (simpleDeserializers != null) {
            setupContext.addDeserializers(simpleDeserializers);
        }
        SimpleSerializers simpleSerializers2 = this._keySerializers;
        if (simpleSerializers2 != null) {
            setupContext.addKeySerializers(simpleSerializers2);
        }
        SimpleKeyDeserializers simpleKeyDeserializers = this._keyDeserializers;
        if (simpleKeyDeserializers != null) {
            setupContext.addKeyDeserializers(simpleKeyDeserializers);
        }
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = this._abstractTypes;
        if (simpleAbstractTypeResolver != null) {
            setupContext.addAbstractTypeResolver(simpleAbstractTypeResolver);
        }
        SimpleValueInstantiators simpleValueInstantiators = this._valueInstantiators;
        if (simpleValueInstantiators != null) {
            setupContext.addValueInstantiators(simpleValueInstantiators);
        }
        BeanDeserializerModifier beanDeserializerModifier = this._deserializerModifier;
        if (beanDeserializerModifier != null) {
            setupContext.addBeanDeserializerModifier(beanDeserializerModifier);
        }
        BeanSerializerModifier beanSerializerModifier = this._serializerModifier;
        if (beanSerializerModifier != null) {
            setupContext.addBeanSerializerModifier(beanSerializerModifier);
        }
        LinkedHashSet<NamedType> linkedHashSet = this._subtypes;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet<NamedType> linkedHashSet2 = this._subtypes;
            setupContext.registerSubtypes((NamedType[]) linkedHashSet2.toArray(new NamedType[linkedHashSet2.size()]));
        }
        PropertyNamingStrategy propertyNamingStrategy = this._namingStrategy;
        if (propertyNamingStrategy != null) {
            setupContext.setNamingStrategy(propertyNamingStrategy);
        }
        HashMap<Class<?>, Class<?>> hashMap = this._mixins;
        if (hashMap != null) {
            for (Entry entry : hashMap.entrySet()) {
                setupContext.setMixInAnnotations((Class) entry.getKey(), (Class) entry.getValue());
            }
        }
    }

    public Version version() {
        return this._version;
    }

    public SimpleModule(Version version) {
        this._name = version.getArtifactId();
        this._version = version;
    }
}

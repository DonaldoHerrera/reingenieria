package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.lang.reflect.Type;
import java.util.Collection;

public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    protected TypeIdResolver _customIdResolver;
    protected Class<?> _defaultImpl;
    protected Id _idType;
    protected As _includeAs;
    protected boolean _typeIdVisible = false;
    protected String _typeProperty;

    /* renamed from: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = new int[As.values().length];
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id = new int[Id.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        static {
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[Id.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[Id.MINIMAL_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[Id.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[Id.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[Id.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.WRAPPER_ARRAY.ordinal()] = 1;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.PROPERTY.ordinal()] = 2;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.WRAPPER_OBJECT.ordinal()] = 3;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.EXTERNAL_PROPERTY.ordinal()] = 4;
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static StdTypeResolverBuilder noTypeInfoBuilder() {
        StdTypeResolverBuilder stdTypeResolverBuilder = new StdTypeResolverBuilder();
        stdTypeResolverBuilder.init(Id.NONE, (TypeIdResolver) null);
        return stdTypeResolverBuilder;
    }

    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(deserializationConfig, javaType, collection, false, true);
        JavaType defineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    AsWrapperTypeDeserializer asWrapperTypeDeserializer = new AsWrapperTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
                    return asWrapperTypeDeserializer;
                } else if (i == 4) {
                    AsExternalTypeDeserializer asExternalTypeDeserializer = new AsExternalTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
                    return asExternalTypeDeserializer;
                } else if (i != 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Do not know how to construct standard type serializer for inclusion type: ");
                    sb.append(this._includeAs);
                    throw new IllegalStateException(sb.toString());
                }
            }
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl, this._includeAs);
            return asPropertyTypeDeserializer;
        }
        AsArrayTypeDeserializer asArrayTypeDeserializer = new AsArrayTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
        return asArrayTypeDeserializer;
    }

    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(serializationConfig, javaType, collection, true, false);
        int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()];
        if (i == 1) {
            return new AsArrayTypeSerializer(idResolver, null);
        }
        if (i == 2) {
            return new AsPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        if (i == 3) {
            return new AsWrapperTypeSerializer(idResolver, null);
        }
        if (i == 4) {
            return new AsExternalTypeSerializer(idResolver, null, this._typeProperty);
        }
        if (i == 5) {
            return new AsExistingPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Do not know how to construct standard type serializer for inclusion type: ");
        sb.append(this._includeAs);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public JavaType defineDefaultImpl(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> cls = this._defaultImpl;
        if (cls == null) {
            if (deserializationConfig.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) && !javaType.isAbstract()) {
                return javaType;
            }
        } else if (cls == Void.class || cls == NoClass.class) {
            return deserializationConfig.getTypeFactory().constructType((Type) this._defaultImpl);
        } else {
            if (javaType.hasRawClass(cls)) {
                return javaType;
            }
            if (javaType.isTypeOrSuperTypeOf(this._defaultImpl)) {
                return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
            }
        }
        return null;
    }

    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    /* access modifiers changed from: protected */
    public TypeIdResolver idResolver(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        Id id = this._idType;
        if (id != null) {
            int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[id.ordinal()];
            if (i == 1) {
                return new ClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
            }
            if (i == 2) {
                return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
            }
            if (i == 3) {
                return TypeNameIdResolver.construct(mapperConfig, javaType, collection, z, z2);
            }
            if (i == 4) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Do not know how to construct standard type id resolver for idType: ");
            sb.append(this._idType);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Cannot build, 'init()' not yet called");
    }

    public StdTypeResolverBuilder defaultImpl(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    public StdTypeResolverBuilder inclusion(As as) {
        if (as != null) {
            this._includeAs = as;
            return this;
        }
        throw new IllegalArgumentException("includeAs cannot be null");
    }

    public StdTypeResolverBuilder init(Id id, TypeIdResolver typeIdResolver) {
        if (id != null) {
            this._idType = id;
            this._customIdResolver = typeIdResolver;
            this._typeProperty = id.getDefaultPropertyName();
            return this;
        }
        throw new IllegalArgumentException("idType cannot be null");
    }

    public StdTypeResolverBuilder typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }
}

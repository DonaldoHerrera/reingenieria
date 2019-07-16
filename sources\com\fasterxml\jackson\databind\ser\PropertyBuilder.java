package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class PropertyBuilder {
    private static final Object NO_DEFAULT_MARKER = Boolean.FALSE;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final Value _defaultInclusion;
    protected final boolean _useRealPropertyDefaults;

    /* renamed from: com.fasterxml.jackson.databind.ser.PropertyBuilder$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[Include.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[Include.NON_DEFAULT.ordinal()] = 1;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[Include.NON_ABSENT.ordinal()] = 2;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[Include.NON_EMPTY.ordinal()] = 3;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[Include.CUSTOM.ordinal()] = 4;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[Include.NON_NULL.ordinal()] = 5;
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        Value merge = Value.merge(beanDescription.findPropertyInclusion(Value.empty()), serializationConfig.getDefaultPropertyInclusion(beanDescription.getBeanClass(), Value.empty()));
        this._defaultInclusion = Value.merge(serializationConfig.getDefaultPropertyInclusion(), merge);
        this._useRealPropertyDefaults = merge.getValueInclusion() == Include.NON_DEFAULT;
        this._annotationIntrospector = this._config.getAnnotationIntrospector();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Exception, code=java.lang.Throwable, for r3v0, types: [java.lang.Throwable, java.lang.Exception] */
    public Object _throwWrapped(Throwable th, String str, Object obj) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        ClassUtil.throwIfRTE(th);
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to get property '");
        sb.append(str);
        sb.append("' of default ");
        sb.append(obj.getClass().getName());
        sb.append(" instance");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    public BeanPropertyWriter buildWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, TypeSerializer typeSerializer2, AnnotatedMember annotatedMember, boolean z) throws JsonMappingException {
        JavaType javaType2;
        Object obj;
        boolean z2;
        Class[] findViews;
        Object findNullSerializer;
        Object obj2;
        Object obj3;
        SerializerProvider serializerProvider2 = serializerProvider;
        BeanPropertyDefinition beanPropertyDefinition2 = beanPropertyDefinition;
        JavaType javaType3 = javaType;
        TypeSerializer typeSerializer3 = typeSerializer2;
        AnnotatedMember annotatedMember2 = annotatedMember;
        boolean z3 = false;
        try {
            JavaType findSerializationType = findSerializationType(annotatedMember2, z, javaType3);
            if (typeSerializer3 != null) {
                if (findSerializationType == null) {
                    findSerializationType = javaType3;
                }
                if (findSerializationType.getContentType() != null) {
                    JavaType withContentTypeHandler = findSerializationType.withContentTypeHandler(typeSerializer3);
                    withContentTypeHandler.getContentType();
                    javaType2 = withContentTypeHandler;
                } else {
                    BeanDescription beanDescription = this._beanDesc;
                    StringBuilder sb = new StringBuilder();
                    sb.append("serialization type ");
                    sb.append(findSerializationType);
                    sb.append(" has no content");
                    serializerProvider2.reportBadPropertyDefinition(beanDescription, beanPropertyDefinition2, sb.toString(), new Object[0]);
                    throw null;
                }
            } else {
                javaType2 = findSerializationType;
            }
            JavaType javaType4 = javaType2 == null ? javaType3 : javaType2;
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (accessor != null) {
                Value withOverrides = this._config.getDefaultInclusion(javaType4.getRawClass(), accessor.getRawType(), this._defaultInclusion).withOverrides(beanPropertyDefinition.findInclusion());
                Include valueInclusion = withOverrides.getValueInclusion();
                if (valueInclusion == Include.USE_DEFAULTS) {
                    valueInclusion = Include.ALWAYS;
                }
                int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[valueInclusion.ordinal()];
                boolean z4 = true;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            obj2 = BeanPropertyWriter.MARKER_FOR_EMPTY;
                        } else if (i != 4) {
                            if (i != 5) {
                                z4 = false;
                            }
                            obj = (!javaType4.isContainerType() || this._config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? null : BeanPropertyWriter.MARKER_FOR_EMPTY;
                            z2 = z4;
                            findViews = beanPropertyDefinition.findViews();
                            if (findViews == null) {
                                findViews = this._beanDesc.findDefaultViews();
                            }
                            BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, findViews);
                            findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember2);
                            if (findNullSerializer != null) {
                                beanPropertyWriter.assignNullSerializer(serializerProvider2.serializerInstance(annotatedMember2, findNullSerializer));
                            }
                            NameTransformer findUnwrappingNameTransformer = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember2);
                            return findUnwrappingNameTransformer == null ? beanPropertyWriter.unwrappingWriter(findUnwrappingNameTransformer) : beanPropertyWriter;
                        } else {
                            obj2 = serializerProvider2.includeFilterInstance(beanPropertyDefinition2, withOverrides.getValueFilter());
                            if (obj2 != null) {
                                z3 = serializerProvider2.includeFilterSuppressNulls(obj2);
                            }
                        }
                    } else if (javaType4.isReferenceType()) {
                        obj2 = BeanPropertyWriter.MARKER_FOR_EMPTY;
                    } else {
                        obj3 = null;
                        z2 = true;
                        findViews = beanPropertyDefinition.findViews();
                        if (findViews == null) {
                        }
                        BeanPropertyWriter beanPropertyWriter2 = new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, findViews);
                        findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember2);
                        if (findNullSerializer != null) {
                        }
                        NameTransformer findUnwrappingNameTransformer2 = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember2);
                        if (findUnwrappingNameTransformer2 == null) {
                        }
                    }
                    obj3 = obj2;
                    z2 = true;
                    findViews = beanPropertyDefinition.findViews();
                    if (findViews == null) {
                    }
                    BeanPropertyWriter beanPropertyWriter22 = new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, findViews);
                    findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember2);
                    if (findNullSerializer != null) {
                    }
                    NameTransformer findUnwrappingNameTransformer22 = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember2);
                    if (findUnwrappingNameTransformer22 == null) {
                    }
                } else {
                    if (this._useRealPropertyDefaults) {
                        Object defaultBean = getDefaultBean();
                        if (defaultBean != null) {
                            if (serializerProvider2.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                                annotatedMember2.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                            }
                            try {
                                obj2 = annotatedMember2.getValue(defaultBean);
                                if (obj2 != null) {
                                    if (obj2.getClass().isArray()) {
                                        obj2 = ArrayBuilders.getArrayComparator(obj2);
                                    }
                                }
                                obj3 = obj2;
                                z2 = true;
                                findViews = beanPropertyDefinition.findViews();
                                if (findViews == null) {
                                }
                                BeanPropertyWriter beanPropertyWriter222 = new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, findViews);
                                findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember2);
                                if (findNullSerializer != null) {
                                }
                                NameTransformer findUnwrappingNameTransformer222 = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember2);
                                if (findUnwrappingNameTransformer222 == null) {
                                }
                            } catch (Exception e) {
                                _throwWrapped(e, beanPropertyDefinition.getName(), defaultBean);
                                throw null;
                            }
                        }
                    }
                    obj2 = BeanUtil.getDefaultValue(javaType4);
                    z3 = true;
                    if (obj2 != null) {
                    }
                    obj3 = obj2;
                    z2 = true;
                    findViews = beanPropertyDefinition.findViews();
                    if (findViews == null) {
                    }
                    BeanPropertyWriter beanPropertyWriter2222 = new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, findViews);
                    findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember2);
                    if (findNullSerializer != null) {
                    }
                    NameTransformer findUnwrappingNameTransformer2222 = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember2);
                    if (findUnwrappingNameTransformer2222 == null) {
                    }
                }
                obj = obj2;
                z2 = z3;
                findViews = beanPropertyDefinition.findViews();
                if (findViews == null) {
                }
                BeanPropertyWriter beanPropertyWriter22222 = new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, findViews);
                findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember2);
                if (findNullSerializer != null) {
                }
                NameTransformer findUnwrappingNameTransformer22222 = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember2);
                if (findUnwrappingNameTransformer22222 == null) {
                }
            } else {
                serializerProvider2.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition2, "could not determine property type", new Object[0]);
                throw null;
            }
        } catch (JsonMappingException e2) {
            JsonMappingException jsonMappingException = e2;
            if (beanPropertyDefinition2 == null) {
                serializerProvider2.reportBadDefinition(javaType3, ClassUtil.exceptionMessage(jsonMappingException));
                throw null;
            }
            serializerProvider2.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition2, ClassUtil.exceptionMessage(jsonMappingException), new Object[0]);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public JavaType findSerializationType(Annotated annotated, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType refineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        if (refineSerializationType != javaType) {
            Class rawClass = refineSerializationType.getRawClass();
            Class rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Illegal concrete-type annotation for method '");
                sb.append(annotated.getName());
                sb.append("': class ");
                sb.append(rawClass.getName());
                sb.append(" not a super-type of (declared) class ");
                sb.append(rawClass2.getName());
                throw new IllegalArgumentException(sb.toString());
            }
            javaType = refineSerializationType;
            z = true;
        }
        Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (!(findSerializationTyping == null || findSerializationTyping == Typing.DEFAULT_TYPING)) {
            z = findSerializationTyping == Typing.STATIC;
        }
        if (z) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Object getDefaultBean() {
        Object obj = this._defaultBean;
        if (obj == null) {
            obj = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            if (obj == null) {
                obj = NO_DEFAULT_MARKER;
            }
            this._defaultBean = obj;
        }
        if (obj == NO_DEFAULT_MARKER) {
            return null;
        }
        return this._defaultBean;
    }
}

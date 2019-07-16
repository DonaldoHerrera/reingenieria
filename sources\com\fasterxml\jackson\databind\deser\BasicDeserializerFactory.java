package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ConstantValueInstantiator;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Entry.class;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");
    static final HashMap<String, Class<? extends Collection>> _collectionFallbacks = new HashMap<>();
    static final HashMap<String, Class<? extends Map>> _mapFallbacks = new HashMap<>();
    protected final DeserializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode = new int[Mode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[Mode.DELEGATING.ordinal()] = 1;
            $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[Mode.PROPERTIES.ordinal()] = 2;
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        Class<LinkedHashMap> cls = LinkedHashMap.class;
        _mapFallbacks.put(Map.class.getName(), cls);
        _mapFallbacks.put(AbstractMap.class.getName(), cls);
        _mapFallbacks.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        _mapFallbacks.put(SortedMap.class.getName(), TreeMap.class);
        _mapFallbacks.put(NavigableMap.class.getName(), TreeMap.class);
        _mapFallbacks.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        Class<ArrayList> cls2 = ArrayList.class;
        Class<HashSet> cls3 = HashSet.class;
        _collectionFallbacks.put(Collection.class.getName(), cls2);
        _collectionFallbacks.put(List.class.getName(), cls2);
        _collectionFallbacks.put(Set.class.getName(), cls3);
        _collectionFallbacks.put(SortedSet.class.getName(), TreeSet.class);
        _collectionFallbacks.put(Queue.class.getName(), LinkedList.class);
        _collectionFallbacks.put(AbstractList.class.getName(), cls2);
        _collectionFallbacks.put(AbstractSet.class.getName(), cls3);
        _collectionFallbacks.put("java.util.Deque", LinkedList.class);
        _collectionFallbacks.put("java.util.NavigableSet", TreeSet.class);
    }

    protected BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    private boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        if ((beanPropertyDefinition != null && beanPropertyDefinition.isExplicitlyNamed()) || annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) != null) {
            return true;
        }
        if (beanPropertyDefinition != null) {
            String name = beanPropertyDefinition.getName();
            return name != null && !name.isEmpty() && beanPropertyDefinition.couldSerialize();
        }
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedWithParams> list) throws JsonMappingException {
        int i;
        Iterator it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams annotatedWithParams3 = (AnnotatedWithParams) it.next();
            if (visibilityChecker.isCreatorVisible(annotatedWithParams3)) {
                int parameterCount = annotatedWithParams3.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i2 = 0;
                while (true) {
                    if (i2 < parameterCount) {
                        AnnotatedParameter parameter = annotatedWithParams3.getParameter(i2);
                        PropertyName _findParamName = _findParamName(parameter, annotationIntrospector);
                        if (_findParamName == null || _findParamName.isEmpty()) {
                            break;
                        }
                        settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, _findParamName, parameter.getIndex(), parameter, null);
                        i2++;
                    } else if (annotatedWithParams2 != null) {
                        break;
                    } else {
                        annotatedWithParams2 = annotatedWithParams3;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            creatorCollector.addPropertyCreator(annotatedWithParams, false, settableBeanPropertyArr);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class rawClass = javaType.getRawClass();
        BeanDescription introspect = config.introspect(javaType);
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findKeyDeserializerFromAnnotation != null) {
            return findKeyDeserializerFromAnnotation;
        }
        JsonDeserializer _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, introspect);
        if (_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, _findCustomEnumDeserializer);
        }
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
        }
        EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.findJsonValueAccessor());
        for (AnnotatedMethod annotatedMethod : introspect.getFactoryMethods()) {
            if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.getParameterCount() != 1 || !annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsuitable method (");
                    sb.append(annotatedMethod);
                    sb.append(") decorated with @JsonCreator (for Enum type ");
                    sb.append(rawClass.getName());
                    sb.append(")");
                    throw new IllegalArgumentException(sb.toString());
                } else if (annotatedMethod.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, annotatedMethod);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter #0 type for factory method (");
                    sb2.append(annotatedMethod);
                    sb2.append(") not suitable, must be java.lang.String");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (!(annotatedParameter == null || annotationIntrospector == null)) {
            PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
            if (findNameForDeserialization != null) {
                return findNameForDeserialization;
            }
            String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
            if (findImplicitPropertyName != null && !findImplicitPropertyName.isEmpty()) {
                return PropertyName.construct(findImplicitPropertyName);
            }
        }
        return null;
    }

    private ValueInstantiator _findStdValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Class<JsonLocation> beanClass = beanDescription.getBeanClass();
        if (beanClass == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(beanClass)) {
            if (Collections.EMPTY_SET.getClass() == beanClass) {
                return new ConstantValueInstantiator(Collections.EMPTY_SET);
            }
            if (Collections.EMPTY_LIST.getClass() == beanClass) {
                return new ConstantValueInstantiator(Collections.EMPTY_LIST);
            }
        } else if (Map.class.isAssignableFrom(beanClass) && Collections.EMPTY_MAP.getClass() == beanClass) {
            return new ConstantValueInstantiator(Collections.EMPTY_MAP);
        }
        return null;
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Class rawClass = javaType.getRawClass();
        if (this._factoryConfig.hasAbstractTypeResolvers()) {
            for (AbstractTypeResolver findTypeMapping : this._factoryConfig.abstractTypeResolvers()) {
                JavaType findTypeMapping2 = findTypeMapping.findTypeMapping(deserializationConfig, javaType);
                if (findTypeMapping2 != null && !findTypeMapping2.hasRawClass(rawClass)) {
                    return findTypeMapping2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void _addDeserializerConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) throws JsonMappingException {
        int i;
        Iterator it;
        PropertyName propertyName;
        int i2;
        CreatorCandidate creatorCandidate;
        Iterator it2;
        int i3;
        int i4;
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        CreatorCollector creatorCollector2 = creatorCollector;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map2 = map;
        if (!beanDescription.isNonStaticInnerClass()) {
            AnnotatedConstructor findDefaultConstructor = beanDescription.findDefaultConstructor();
            if (findDefaultConstructor != null && (!creatorCollector.hasDefaultCreator() || _hasCreatorAnnotation(deserializationContext2, findDefaultConstructor))) {
                creatorCollector2.setDefaultCreator(findDefaultConstructor);
            }
            LinkedList linkedList = new LinkedList();
            Iterator it3 = beanDescription.getConstructors().iterator();
            int i5 = 0;
            while (true) {
                i = 1;
                if (!it3.hasNext()) {
                    break;
                }
                AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) it3.next();
                Mode findCreatorAnnotation = annotationIntrospector2.findCreatorAnnotation(deserializationContext.getConfig(), annotatedConstructor);
                if (Mode.DISABLED != findCreatorAnnotation) {
                    if (findCreatorAnnotation != null) {
                        int i6 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[findCreatorAnnotation.ordinal()];
                        if (i6 == 1) {
                            _addExplicitDelegatingCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, annotatedConstructor, null));
                        } else if (i6 != 2) {
                            _addExplicitAnyCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, annotatedConstructor, (BeanPropertyDefinition[]) map2.get(annotatedConstructor)));
                        } else {
                            _addExplicitPropertyCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, annotatedConstructor, (BeanPropertyDefinition[]) map2.get(annotatedConstructor)));
                        }
                        i5++;
                    } else if (visibilityChecker2.isCreatorVisible(annotatedConstructor)) {
                        linkedList.add(CreatorCandidate.construct(annotationIntrospector2, annotatedConstructor, (BeanPropertyDefinition[]) map2.get(annotatedConstructor)));
                    }
                }
            }
            if (i5 <= 0) {
                Iterator it4 = linkedList.iterator();
                List list = null;
                while (it4.hasNext()) {
                    CreatorCandidate creatorCandidate2 = (CreatorCandidate) it4.next();
                    int paramCount = creatorCandidate2.paramCount();
                    AnnotatedWithParams creator = creatorCandidate2.creator();
                    if (paramCount == i) {
                        BeanPropertyDefinition propertyDef = creatorCandidate2.propertyDef(0);
                        if (_checkIfCreatorPropertyBased(annotationIntrospector2, creator, propertyDef)) {
                            AnnotatedWithParams annotatedWithParams = creator;
                            SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[i];
                            settableBeanPropertyArr[0] = constructCreatorProperty(deserializationContext, beanDescription, creatorCandidate2.paramName(0), 0, creatorCandidate2.parameter(0), creatorCandidate2.injection(0));
                            creatorCollector2.addPropertyCreator(annotatedWithParams, false, settableBeanPropertyArr);
                        } else {
                            AnnotatedWithParams annotatedWithParams2 = creator;
                            _handleSingleArgumentCreator(creatorCollector2, annotatedWithParams2, false, visibilityChecker2.isCreatorVisible(annotatedWithParams2));
                            if (propertyDef != null) {
                                ((POJOPropertyBuilder) propertyDef).removeConstructors();
                            }
                        }
                        it = it4;
                    } else {
                        AnnotatedWithParams annotatedWithParams3 = creator;
                        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[paramCount];
                        int i7 = -1;
                        int i8 = 0;
                        int i9 = 0;
                        int i10 = 0;
                        while (i8 < paramCount) {
                            AnnotatedParameter parameter = annotatedWithParams3.getParameter(i8);
                            BeanPropertyDefinition propertyDef2 = creatorCandidate2.propertyDef(i8);
                            Value findInjectableValue = annotationIntrospector2.findInjectableValue(parameter);
                            if (propertyDef2 == null) {
                                propertyName = null;
                            } else {
                                propertyName = propertyDef2.getFullName();
                            }
                            if (propertyDef2 == null || !propertyDef2.isExplicitlyNamed()) {
                                AnnotatedParameter annotatedParameter = parameter;
                                i4 = i7;
                                creatorCandidate = creatorCandidate2;
                                i2 = i8;
                                it2 = it4;
                                i3 = paramCount;
                                if (findInjectableValue != null) {
                                    i10++;
                                    settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i2, annotatedParameter, findInjectableValue);
                                } else {
                                    AnnotatedParameter annotatedParameter2 = annotatedParameter;
                                    if (annotationIntrospector2.findUnwrappingNameTransformer(annotatedParameter2) != null) {
                                        _reportUnwrappedCreatorProperty(deserializationContext2, beanDescription2, annotatedParameter2);
                                        throw null;
                                    } else if (i4 < 0) {
                                        i7 = i2;
                                        i8 = i2 + 1;
                                        VisibilityChecker<?> visibilityChecker3 = visibilityChecker;
                                        paramCount = i3;
                                        it4 = it2;
                                        creatorCandidate2 = creatorCandidate;
                                    }
                                }
                            } else {
                                i9++;
                                i4 = i7;
                                it2 = it4;
                                i3 = paramCount;
                                creatorCandidate = creatorCandidate2;
                                i2 = i8;
                                settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i8, parameter, findInjectableValue);
                            }
                            i7 = i4;
                            i8 = i2 + 1;
                            VisibilityChecker<?> visibilityChecker32 = visibilityChecker;
                            paramCount = i3;
                            it4 = it2;
                            creatorCandidate2 = creatorCandidate;
                        }
                        int i11 = i7;
                        CreatorCandidate creatorCandidate3 = creatorCandidate2;
                        it = it4;
                        int i12 = paramCount;
                        int i13 = i9 + 0;
                        if (i9 > 0 || i10 > 0) {
                            if (i13 + i10 == i12) {
                                creatorCollector2.addPropertyCreator(annotatedWithParams3, false, settableBeanPropertyArr2);
                            } else if (i9 == 0 && i10 + 1 == i12) {
                                creatorCollector2.addDelegatingCreator(annotatedWithParams3, false, settableBeanPropertyArr2, 0);
                            } else {
                                PropertyName findImplicitParamName = creatorCandidate3.findImplicitParamName(i11);
                                if (findImplicitParamName == null || findImplicitParamName.isEmpty()) {
                                    deserializationContext2.reportBadTypeDefinition(beanDescription2, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i11), annotatedWithParams3);
                                    throw null;
                                }
                            }
                        }
                        if (!creatorCollector.hasDefaultCreator()) {
                            List linkedList2 = list == null ? new LinkedList() : list;
                            linkedList2.add(annotatedWithParams3);
                            list = linkedList2;
                        }
                    }
                    visibilityChecker2 = visibilityChecker;
                    it4 = it;
                    i = 1;
                }
                if (list != null && !creatorCollector.hasDelegatingCreator() && !creatorCollector.hasPropertyBasedCreator()) {
                    _checkImplicitlyNamedConstructors(deserializationContext, beanDescription, visibilityChecker, annotationIntrospector, creatorCollector, list);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r16v1, types: [com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition[]] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r19v0 */
    /* JADX WARNING: type inference failed for: r19v1, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter, com.fasterxml.jackson.databind.introspect.AnnotatedMember] */
    /* JADX WARNING: type inference failed for: r20v0, types: [com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition] */
    /* JADX WARNING: type inference failed for: r22v0 */
    /* JADX WARNING: type inference failed for: r25v1 */
    /* JADX WARNING: type inference failed for: r19v2 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r20v1 */
    /* JADX WARNING: type inference failed for: r25v2, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r0v12, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter, com.fasterxml.jackson.databind.introspect.AnnotatedMember] */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.fasterxml.jackson.databind.PropertyName] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter] */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r3v5, types: [com.fasterxml.jackson.databind.PropertyName] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.fasterxml.jackson.databind.introspect.AnnotatedParameter] */
    /* JADX WARNING: type inference failed for: r25v3 */
    /* JADX WARNING: type inference failed for: r22v1, types: [com.fasterxml.jackson.databind.PropertyName] */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: type inference failed for: r20v4 */
    /* JADX WARNING: type inference failed for: r20v5 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r19v4 */
    /* JADX WARNING: type inference failed for: r19v5 */
    /* JADX WARNING: type inference failed for: r19v6 */
    /* JADX WARNING: type inference failed for: r19v7 */
    /* JADX WARNING: type inference failed for: r25v4 */
    /* JADX WARNING: type inference failed for: r25v5 */
    /* JADX WARNING: type inference failed for: r25v6 */
    /* JADX WARNING: type inference failed for: r22v3 */
    /* JADX WARNING: type inference failed for: r20v6 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
  assigns: []
  uses: []
  mth insns count: 173
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 22 */
    public void _addDeserializerFactoryMethods(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) throws JsonMappingException {
        ? r6;
        int i;
        ? r62;
        ? r20;
        ? r22;
        ? r25;
        int i2;
        ? r19;
        SettableBeanProperty[] settableBeanPropertyArr;
        int i3;
        AnnotatedWithParams annotatedWithParams;
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        VisibilityChecker<?> visibilityChecker2 = visibilityChecker;
        AnnotationIntrospector annotationIntrospector2 = annotationIntrospector;
        CreatorCollector creatorCollector2 = creatorCollector;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map2 = map;
        LinkedList<CreatorCandidate> linkedList = new LinkedList<>();
        Iterator it = beanDescription.getFactoryMethods().iterator();
        int i4 = 0;
        while (true) {
            r6 = 0;
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) it.next();
            Mode findCreatorAnnotation = annotationIntrospector2.findCreatorAnnotation(deserializationContext.getConfig(), annotatedMethod);
            int parameterCount = annotatedMethod.getParameterCount();
            if (findCreatorAnnotation == null) {
                if (parameterCount == 1 && visibilityChecker2.isCreatorVisible(annotatedMethod)) {
                    linkedList.add(CreatorCandidate.construct(annotationIntrospector2, annotatedMethod, null));
                }
            } else if (findCreatorAnnotation != Mode.DISABLED) {
                if (parameterCount == 0) {
                    creatorCollector2.setDefaultCreator(annotatedMethod);
                } else {
                    int i5 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[findCreatorAnnotation.ordinal()];
                    if (i5 == 1) {
                        _addExplicitDelegatingCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, annotatedMethod, null));
                    } else if (i5 != 2) {
                        _addExplicitAnyCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, annotatedMethod, (BeanPropertyDefinition[]) map2.get(annotatedMethod)));
                    } else {
                        _addExplicitPropertyCreator(deserializationContext2, beanDescription2, creatorCollector2, CreatorCandidate.construct(annotationIntrospector2, annotatedMethod, (BeanPropertyDefinition[]) map2.get(annotatedMethod)));
                    }
                    i4++;
                }
            }
        }
        if (i4 <= 0) {
            ? r63 = r6;
            for (CreatorCandidate creatorCandidate : linkedList) {
                int paramCount = creatorCandidate.paramCount();
                AnnotatedWithParams creator = creatorCandidate.creator();
                ? r16 = (BeanPropertyDefinition[]) map2.get(creator);
                if (paramCount != i) {
                    r62 = r63;
                } else {
                    BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
                    if (!_checkIfCreatorPropertyBased(annotationIntrospector2, creator, propertyDef)) {
                        _handleSingleArgumentCreator(creatorCollector2, creator, false, visibilityChecker2.isCreatorVisible(creator));
                        if (propertyDef != null) {
                            ((POJOPropertyBuilder) propertyDef).removeConstructors();
                            r62 = r63;
                        } else {
                            r62 = r63;
                        }
                    } else {
                        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[paramCount];
                        ? r192 = r63;
                        int i6 = 0;
                        int i7 = 0;
                        int i8 = 0;
                        ? r64 = r63;
                        while (i6 < paramCount) {
                            ? parameter = creator.getParameter(i6);
                            if (r16 == 0) {
                                r20 = r64;
                            } else {
                                r20 = r16[i6];
                            }
                            Value findInjectableValue = annotationIntrospector2.findInjectableValue(parameter);
                            if (r20 == 0) {
                                r22 = r64;
                            } else {
                                r22 = r20.getFullName();
                            }
                            if (r20 == 0 || !r20.isExplicitlyNamed()) {
                                ? r202 = parameter;
                                i2 = i6;
                                settableBeanPropertyArr = settableBeanPropertyArr2;
                                annotatedWithParams = creator;
                                i3 = paramCount;
                                ? r252 = r64;
                                if (findInjectableValue != null) {
                                    i8++;
                                    settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, r22, i2, r202, findInjectableValue);
                                    r19 = r192;
                                    r25 = r252;
                                } else {
                                    ? r0 = r202;
                                    if (annotationIntrospector2.findUnwrappingNameTransformer(r0) != null) {
                                        _reportUnwrappedCreatorProperty(deserializationContext2, beanDescription2, r0);
                                        throw r252;
                                    } else if (r192 == 0) {
                                        r19 = r0;
                                        r25 = r252;
                                    } else {
                                        r19 = r192;
                                        r25 = r252;
                                    }
                                }
                            } else {
                                i7++;
                                i2 = i6;
                                settableBeanPropertyArr = settableBeanPropertyArr2;
                                annotatedWithParams = creator;
                                i3 = paramCount;
                                r25 = r64;
                                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, r22, i2, parameter, findInjectableValue);
                                r19 = r192;
                            }
                            i6 = i2 + 1;
                            creator = annotatedWithParams;
                            paramCount = i3;
                            settableBeanPropertyArr2 = settableBeanPropertyArr;
                            r64 = r25;
                            VisibilityChecker<?> visibilityChecker3 = visibilityChecker;
                            Map<AnnotatedWithParams, BeanPropertyDefinition[]> map3 = map;
                            r192 = r19;
                        }
                        SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                        AnnotatedWithParams annotatedWithParams2 = creator;
                        int i9 = paramCount;
                        ? r253 = r64;
                        int i10 = i7 + 0;
                        if (i7 > 0 || i8 > 0) {
                            if (i10 + i8 == i9) {
                                creatorCollector2.addPropertyCreator(annotatedWithParams2, false, settableBeanPropertyArr3);
                            } else if (i7 == 0 && i8 + 1 == i9) {
                                creatorCollector2.addDelegatingCreator(annotatedWithParams2, false, settableBeanPropertyArr3, 0);
                            } else {
                                deserializationContext2.reportBadTypeDefinition(beanDescription2, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(r192.getIndex()), annotatedWithParams2);
                                throw r253;
                            }
                        }
                        visibilityChecker2 = visibilityChecker;
                        map2 = map;
                        r62 = r253;
                        i = 1;
                    }
                }
                r63 = r62;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        if (1 != creatorCandidate.paramCount()) {
            int findOnlyParamWithoutInjection = creatorCandidate.findOnlyParamWithoutInjection();
            if (findOnlyParamWithoutInjection < 0 || creatorCandidate.paramName(findOnlyParamWithoutInjection) != null) {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
            } else {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
            }
        } else {
            AnnotatedParameter parameter = creatorCandidate.parameter(0);
            Value injection = creatorCandidate.injection(0);
            PropertyName explicitParamName = creatorCandidate.explicitParamName(0);
            BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
            boolean z = (explicitParamName == null && injection == null) ? false : true;
            if (!z && propertyDef != null) {
                explicitParamName = creatorCandidate.paramName(0);
                z = explicitParamName != null && propertyDef.couldSerialize();
            }
            PropertyName propertyName = explicitParamName;
            if (z) {
                creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName, 0, parameter, injection)});
                return;
            }
            _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
            if (propertyDef != null) {
                ((POJOPropertyBuilder) propertyDef).removeConstructors();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        CreatorCollector creatorCollector2 = creatorCollector;
        CreatorCandidate creatorCandidate2 = creatorCandidate;
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        int i = -1;
        for (int i2 = 0; i2 < paramCount; i2++) {
            AnnotatedParameter parameter = creatorCandidate2.parameter(i2);
            Value injection = creatorCandidate2.injection(i2);
            if (injection != null) {
                settableBeanPropertyArr[i2] = constructCreatorProperty(deserializationContext, beanDescription, null, i2, parameter, injection);
            } else if (i < 0) {
                i = i2;
            } else {
                deserializationContext2.reportBadTypeDefinition(beanDescription2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), creatorCandidate2);
                throw null;
            }
        }
        if (i < 0) {
            deserializationContext2.reportBadTypeDefinition(beanDescription2, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate2);
            throw null;
        } else if (paramCount == 1) {
            _handleSingleArgumentCreator(creatorCollector2, creatorCandidate.creator(), true, true);
            BeanPropertyDefinition propertyDef = creatorCandidate2.propertyDef(0);
            if (propertyDef != null) {
                ((POJOPropertyBuilder) propertyDef).removeConstructors();
            }
        } else {
            creatorCollector2.addDelegatingCreator(creatorCandidate.creator(), true, settableBeanPropertyArr, i);
        }
    }

    /* access modifiers changed from: protected */
    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        for (int i = 0; i < paramCount; i++) {
            Value injection = creatorCandidate.injection(i);
            AnnotatedParameter parameter = creatorCandidate.parameter(i);
            PropertyName paramName = creatorCandidate.paramName(i);
            if (paramName == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(parameter) == null) {
                    paramName = creatorCandidate.findImplicitParamName(i);
                    if (paramName == null && injection == null) {
                        deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d has no property name, is not Injectable: can not use as Creator %s", Integer.valueOf(i), creatorCandidate);
                        throw null;
                    }
                } else {
                    _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                    throw null;
                }
            }
            settableBeanPropertyArr[i] = constructCreatorProperty(deserializationContext, beanDescription, paramName, i, parameter, injection);
        }
        creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, settableBeanPropertyArr);
    }

    /* access modifiers changed from: protected */
    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        CreatorCollector creatorCollector = new CreatorCollector(beanDescription, deserializationContext.getConfig());
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        VisibilityChecker defaultVisibilityChecker = deserializationContext.getConfig().getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Map _findCreatorsFromProperties = _findCreatorsFromProperties(deserializationContext, beanDescription);
        _addDeserializerFactoryMethods(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        if (beanDescription.getType().isConcrete()) {
            _addDeserializerConstructors(deserializationContext, beanDescription, defaultVisibilityChecker, annotationIntrospector, creatorCollector, _findCreatorsFromProperties);
        }
        return creatorCollector.constructValueInstantiator(deserializationContext);
    }

    /* access modifiers changed from: protected */
    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> emptyMap = Collections.emptyMap();
        for (BeanPropertyDefinition beanPropertyDefinition : beanDescription.findProperties()) {
            Iterator constructorParameters = beanPropertyDefinition.getConstructorParameters();
            while (true) {
                if (constructorParameters.hasNext()) {
                    AnnotatedParameter annotatedParameter = (AnnotatedParameter) constructorParameters.next();
                    AnnotatedWithParams owner = annotatedParameter.getOwner();
                    BeanPropertyDefinition[] beanPropertyDefinitionArr = (BeanPropertyDefinition[]) emptyMap.get(owner);
                    int index = annotatedParameter.getIndex();
                    if (beanPropertyDefinitionArr == null) {
                        if (emptyMap.isEmpty()) {
                            emptyMap = new LinkedHashMap<>();
                        }
                        beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                        emptyMap.put(owner, beanPropertyDefinitionArr);
                    } else if (beanPropertyDefinitionArr[index] != null) {
                        deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, beanPropertyDefinitionArr[index], beanPropertyDefinition);
                        throw null;
                    }
                    beanPropertyDefinitionArr[index] = beanPropertyDefinition;
                }
            }
        }
        return emptyMap;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findArrayDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findArrayDeserializer2 = findArrayDeserializer.findArrayDeserializer(arrayType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findArrayDeserializer2 != null) {
                return findArrayDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findBeanDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<Object> findBeanDeserializer2 = findBeanDeserializer.findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (findBeanDeserializer2 != null) {
                return findBeanDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findCollectionDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionDeserializer2 = findCollectionDeserializer.findCollectionDeserializer(collectionType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionDeserializer2 != null) {
                return findCollectionDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findCollectionLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findCollectionLikeDeserializer2 = findCollectionLikeDeserializer.findCollectionLikeDeserializer(collectionLikeType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findCollectionLikeDeserializer2 != null) {
                return findCollectionLikeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findEnumDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findEnumDeserializer2 = findEnumDeserializer.findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (findEnumDeserializer2 != null) {
                return findEnumDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findMapDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapDeserializer2 = findMapDeserializer.findMapDeserializer(mapType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapDeserializer2 != null) {
                return findMapDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findMapLikeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findMapLikeDeserializer2 = findMapLikeDeserializer.findMapLikeDeserializer(mapLikeType, deserializationConfig, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
            if (findMapLikeDeserializer2 != null) {
                return findMapLikeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        for (Deserializers findReferenceDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findReferenceDeserializer2 = findReferenceDeserializer.findReferenceDeserializer(referenceType, deserializationConfig, beanDescription, typeDeserializer, jsonDeserializer);
            if (findReferenceDeserializer2 != null) {
                return findReferenceDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        for (Deserializers findTreeNodeDeserializer : this._factoryConfig.deserializers()) {
            JsonDeserializer<?> findTreeNodeDeserializer2 = findTreeNodeDeserializer.findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (findTreeNodeDeserializer2 != null) {
                return findTreeNodeDeserializer2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType mapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (mapAbstractType == null || mapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return mapAbstractType;
    }

    /* access modifiers changed from: protected */
    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<Boolean> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z || z2) {
                creatorCollector.addStringCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                creatorCollector.addIntCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                creatorCollector.addLongCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                creatorCollector.addDoubleCreator(annotatedWithParams, z);
            }
            return true;
        } else if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                creatorCollector.addBooleanCreator(annotatedWithParams, z);
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            creatorCollector.addDelegatingCreator(annotatedWithParams, z, null, 0);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return false;
        }
        Mode findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotated);
        if (findCreatorAnnotation == null || findCreatorAnnotation == Mode.DISABLED) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class cls = (Class) _collectionFallbacks.get(javaType.getRawClass().getName());
        if (cls == null) {
            return null;
        }
        return (CollectionType) deserializationConfig.constructSpecializedType(javaType, cls);
    }

    /* access modifiers changed from: protected */
    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadDefinition(beanDescription.getType(), String.format("Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", new Object[]{Integer.valueOf(annotatedParameter.getIndex())}));
        throw null;
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (ValueInstantiator.class.isAssignableFrom(cls)) {
                HandlerInstantiator handlerInstantiator = deserializationConfig.getHandlerInstantiator();
                if (handlerInstantiator != null) {
                    ValueInstantiator valueInstantiatorInstance = handlerInstantiator.valueInstantiatorInstance(deserializationConfig, annotated, cls);
                    if (valueInstantiatorInstance != null) {
                        return valueInstantiatorInstance;
                    }
                }
                return (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AnnotationIntrospector returned Class ");
            sb.append(cls.getName());
            sb.append("; expected Class<ValueInstantiator>");
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AnnotationIntrospector returned key deserializer definition of type ");
        sb2.append(obj.getClass().getName());
        sb2.append("; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, Value value) throws JsonMappingException {
        PropertyMetadata propertyMetadata;
        Object obj;
        DeserializationContext deserializationContext2 = deserializationContext;
        AnnotatedParameter annotatedParameter2 = annotatedParameter;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        } else {
            propertyMetadata = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter2), annotationIntrospector.findPropertyDescription(annotatedParameter2), annotationIntrospector.findPropertyIndex(annotatedParameter2), annotationIntrospector.findPropertyDefaultValue(annotatedParameter2));
        }
        PropertyMetadata propertyMetadata2 = propertyMetadata;
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext2, annotatedParameter2, annotatedParameter.getType());
        Std std = new Std(propertyName, resolveMemberAndTypeAnnotations, annotationIntrospector.findWrapperName(annotatedParameter2), annotatedParameter, propertyMetadata2);
        TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, resolveMemberAndTypeAnnotations);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        if (value == null) {
            obj = null;
        } else {
            obj = value.getId();
        }
        CreatorProperty creatorProperty = new CreatorProperty(propertyName, resolveMemberAndTypeAnnotations, std.getWrapperName(), typeDeserializer2, beanDescription.getClassAnnotations(), annotatedParameter, i, obj, propertyMetadata2);
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext2, annotatedParameter2);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? creatorProperty.withValueDeserializer(deserializationContext2.handlePrimaryContextualization(findDeserializerFromAnnotation, creatorProperty, resolveMemberAndTypeAnnotations)) : creatorProperty;
    }

    /* access modifiers changed from: protected */
    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructUnsafe(cls, deserializationConfig.getAnnotationIntrospector());
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUnsafeUsingMethod(cls, annotatedMember, deserializationConfig.getAnnotationIntrospector());
    }

    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<String> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer<>(arrayType, jsonDeserializer, typeDeserializer2);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyArrayDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomArrayDeserializer = modifyArrayDeserializer.modifyArrayDeserializer(config, arrayType, beanDescription, _findCustomArrayDeserializer);
            }
        }
        return _findCustomArrayDeserializer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b4  */
    public JsonDeserializer<?> createCollectionDeserializer(DeserializationContext deserializationContext, CollectionType collectionType, BeanDescription beanDescription) throws JsonMappingException {
        JsonDeserializer<?> jsonDeserializer;
        JavaType contentType = collectionType.getContentType();
        JsonDeserializer jsonDeserializer2 = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomCollectionDeserializer = _findCustomCollectionDeserializer(collectionType, config, beanDescription, typeDeserializer2, jsonDeserializer2);
        if (_findCustomCollectionDeserializer == null) {
            Class rawClass = collectionType.getRawClass();
            if (jsonDeserializer2 == null && EnumSet.class.isAssignableFrom(rawClass)) {
                _findCustomCollectionDeserializer = new EnumSetDeserializer<>(contentType, null);
            }
        }
        if (_findCustomCollectionDeserializer == null) {
            if (collectionType.isInterface() || collectionType.isAbstract()) {
                CollectionType _mapAbstractCollectionType = _mapAbstractCollectionType(collectionType, config);
                if (_mapAbstractCollectionType != null) {
                    beanDescription = config.introspectForCreation(_mapAbstractCollectionType);
                    collectionType = _mapAbstractCollectionType;
                } else if (collectionType.getTypeHandler() != null) {
                    _findCustomCollectionDeserializer = AbstractDeserializer.constructForNonPOJO(beanDescription);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot find a deserializer for non-concrete Collection type ");
                    sb.append(collectionType);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (_findCustomCollectionDeserializer == null) {
                ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
                if (!findValueInstantiator.canCreateUsingDefault()) {
                    if (collectionType.hasRawClass(ArrayBlockingQueue.class)) {
                        return new ArrayBlockingQueueDeserializer(collectionType, jsonDeserializer2, typeDeserializer2, findValueInstantiator);
                    }
                    JsonDeserializer<?> findForCollection = JavaUtilCollectionsDeserializers.findForCollection(deserializationContext, collectionType);
                    if (findForCollection != null) {
                        return findForCollection;
                    }
                }
                jsonDeserializer = contentType.hasRawClass(String.class) ? new StringCollectionDeserializer<>(collectionType, jsonDeserializer2, findValueInstantiator) : new CollectionDeserializer<>(collectionType, jsonDeserializer2, typeDeserializer2, findValueInstantiator);
                if (this._factoryConfig.hasDeserializerModifiers()) {
                    for (BeanDeserializerModifier modifyCollectionDeserializer : this._factoryConfig.deserializerModifiers()) {
                        jsonDeserializer = modifyCollectionDeserializer.modifyCollectionDeserializer(config, collectionType, beanDescription, jsonDeserializer);
                    }
                }
                return jsonDeserializer;
            }
        }
        jsonDeserializer = _findCustomCollectionDeserializer;
        if (this._factoryConfig.hasDeserializerModifiers()) {
        }
        return jsonDeserializer;
    }

    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        JsonDeserializer<?> _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer, jsonDeserializer);
        if (_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyCollectionLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomCollectionLikeDeserializer = modifyCollectionLikeDeserializer.modifyCollectionLikeDeserializer(config, collectionLikeType, beanDescription, _findCustomCollectionLikeDeserializer);
            }
        }
        return _findCustomCollectionLikeDeserializer;
    }

    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        SettableBeanProperty[] settableBeanPropertyArr;
        JsonDeserializer<?> deserializerForNoArgsCreator;
        DeserializationConfig config = deserializationContext.getConfig();
        Class rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (_findCustomEnumDeserializer == null) {
            ValueInstantiator _constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            if (_constructDefaultValueInstantiator == null) {
                settableBeanPropertyArr = null;
            } else {
                settableBeanPropertyArr = _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            }
            Iterator it = beanDescription.getFactoryMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod annotatedMethod = (AnnotatedMethod) it.next();
                if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                    if (annotatedMethod.getParameterCount() == 0) {
                        deserializerForNoArgsCreator = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, annotatedMethod);
                        break;
                    } else if (annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                        deserializerForNoArgsCreator = EnumDeserializer.deserializerForCreator(config, rawClass, annotatedMethod, _constructDefaultValueInstantiator, settableBeanPropertyArr);
                        break;
                    }
                }
            }
            _findCustomEnumDeserializer = deserializerForNoArgsCreator;
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer<>(constructEnumResolver(rawClass, config, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyEnumDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomEnumDeserializer = modifyEnumDeserializer.modifyEnumDeserializer(config, javaType, beanDescription, _findCustomEnumDeserializer);
            }
        }
        return _findCustomEnumDeserializer;
    }

    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        KeyDeserializer keyDeserializer = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            BeanDescription introspectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            for (KeyDeserializers findKeyDeserializer : this._factoryConfig.keyDeserializers()) {
                keyDeserializer = findKeyDeserializer.findKeyDeserializer(javaType, config, introspectClassAnnotations);
                if (keyDeserializer != null) {
                    break;
                }
            }
        }
        if (keyDeserializer == null) {
            if (javaType.isEnumType()) {
                keyDeserializer = _createEnumKeyDeserializer(deserializationContext, javaType);
            } else {
                keyDeserializer = StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
            }
        }
        if (keyDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyKeyDeserializer : this._factoryConfig.deserializerModifiers()) {
                keyDeserializer = modifyKeyDeserializer.modifyKeyDeserializer(config, javaType, keyDeserializer);
            }
        }
        return keyDeserializer;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.fasterxml.jackson.databind.JsonDeserializer<?>] */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.fasterxml.jackson.databind.deser.AbstractDeserializer] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r12v1, types: [com.fasterxml.jackson.databind.deser.std.MapDeserializer] */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer<?>] */
    /* JADX WARNING: type inference failed for: r0v20, types: [com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer] */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r12v2, types: [com.fasterxml.jackson.databind.deser.std.MapDeserializer] */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v7
  assigns: [com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.AbstractDeserializer, com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer]
  uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.fasterxml.jackson.databind.JsonDeserializer<?>, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer]
  mth insns count: 115
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 6 */
    public JsonDeserializer<?> createMapDeserializer(DeserializationContext deserializationContext, MapType mapType, BeanDescription beanDescription) throws JsonMappingException {
        BeanDescription beanDescription2;
        ? r0;
        MapType mapType2;
        ? constructForNonPOJO;
        ? r02;
        ValueInstantiator valueInstantiator;
        DeserializationContext deserializationContext2 = deserializationContext;
        MapType mapType3 = mapType;
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType keyType = mapType.getKeyType();
        JavaType contentType = mapType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        TypeDeserializer findTypeDeserializer = typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer;
        ? _findCustomMapDeserializer = _findCustomMapDeserializer(mapType, config, beanDescription, keyDeserializer, findTypeDeserializer, jsonDeserializer);
        if (_findCustomMapDeserializer == 0) {
            Class<EnumMap> rawClass = mapType.getRawClass();
            Set set = null;
            if (EnumMap.class.isAssignableFrom(rawClass)) {
                if (rawClass == EnumMap.class) {
                    beanDescription2 = beanDescription;
                    valueInstantiator = null;
                } else {
                    beanDescription2 = beanDescription;
                    valueInstantiator = findValueInstantiator(deserializationContext2, beanDescription2);
                }
                Class rawClass2 = keyType.getRawClass();
                if (rawClass2 == null || !rawClass2.isEnum()) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                ? enumMapDeserializer = new EnumMapDeserializer(mapType, valueInstantiator, null, jsonDeserializer, findTypeDeserializer, null);
                r0 = enumMapDeserializer;
            } else {
                beanDescription2 = beanDescription;
                r0 = _findCustomMapDeserializer;
            }
            if (r0 == 0) {
                if (mapType.isInterface() || mapType.isAbstract()) {
                    Class cls = (Class) _mapFallbacks.get(rawClass.getName());
                    if (cls != null) {
                        mapType2 = (MapType) config.constructSpecializedType(mapType3, cls);
                        beanDescription2 = config.introspectForCreation(mapType2);
                    } else if (mapType.getTypeHandler() != null) {
                        mapType2 = mapType3;
                        r0 = AbstractDeserializer.constructForNonPOJO(beanDescription);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot find a deserializer for non-concrete Map type ");
                        sb.append(mapType3);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    mapType3 = mapType2;
                    constructForNonPOJO = r0;
                } else {
                    constructForNonPOJO = JavaUtilCollectionsDeserializers.findForMap(deserializationContext, mapType);
                    if (constructForNonPOJO != 0) {
                        return constructForNonPOJO;
                    }
                }
                BeanDescription beanDescription3 = beanDescription2;
                if (r02 == 0) {
                    constructForNonPOJO = new MapDeserializer(mapType3, findValueInstantiator(deserializationContext2, beanDescription3), keyDeserializer, jsonDeserializer, findTypeDeserializer);
                    JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescription3.getClassInfo());
                    if (defaultPropertyIgnorals != null) {
                        set = defaultPropertyIgnorals.findIgnoredForDeserialization();
                    }
                    constructForNonPOJO.setIgnorableProperties(set);
                    r02 = constructForNonPOJO;
                }
                beanDescription2 = beanDescription3;
                r0 = r02;
            }
        } else {
            beanDescription2 = beanDescription;
            r0 = _findCustomMapDeserializer;
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyMapDeserializer : this._factoryConfig.deserializerModifiers()) {
                r0 = modifyMapDeserializer.modifyMapDeserializer(config, mapType3, beanDescription2, r0);
            }
            r0 = r0;
        }
        return r0;
    }

    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyMapLikeDeserializer : this._factoryConfig.deserializerModifiers()) {
                _findCustomMapLikeDeserializer = modifyMapLikeDeserializer.modifyMapLikeDeserializer(config, mapLikeType, beanDescription, _findCustomMapLikeDeserializer);
            }
        }
        return _findCustomMapLikeDeserializer;
    }

    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) throws JsonMappingException {
        ValueInstantiator valueInstantiator;
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        TypeDeserializer findTypeDeserializer = typeDeserializer == null ? findTypeDeserializer(config, contentType) : typeDeserializer;
        JsonDeserializer<?> _findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, findTypeDeserializer, jsonDeserializer);
        if (_findCustomReferenceDeserializer != null || !referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            if (_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyReferenceDeserializer : this._factoryConfig.deserializerModifiers()) {
                    _findCustomReferenceDeserializer = modifyReferenceDeserializer.modifyReferenceDeserializer(config, referenceType, beanDescription, _findCustomReferenceDeserializer);
                }
            }
            return _findCustomReferenceDeserializer;
        }
        if (referenceType.getRawClass() == AtomicReference.class) {
            valueInstantiator = null;
        } else {
            valueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
        }
        return new AtomicReferenceDeserializer(referenceType, valueInstantiator, findTypeDeserializer, jsonDeserializer);
    }

    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        if (_findCustomTreeNodeDeserializer != null) {
            return _findCustomTreeNodeDeserializer;
        }
        return JsonNodeDeserializer.getDeserializer(rawClass);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findContentDeserializer = annotationIntrospector.findContentDeserializer(annotated);
            if (findContentDeserializer != null) {
                return deserializationContext.deserializerInstance(annotated, findContentDeserializer);
            }
        }
        return null;
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType javaType2;
        JavaType javaType3;
        Class<TokenBuffer> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType2 = _findRemappedType(config, List.class);
                javaType3 = _findRemappedType(config, Map.class);
            } else {
                javaType2 = null;
                javaType3 = null;
            }
            return new UntypedObjectDeserializer(javaType2, javaType3);
        } else if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return StringDeserializer.instance;
        } else {
            if (rawClass == CLASS_ITERABLE) {
                TypeFactory typeFactory = deserializationContext.getTypeFactory();
                JavaType[] findTypeParameters = typeFactory.findTypeParameters(javaType, CLASS_ITERABLE);
                return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]), beanDescription);
            } else if (rawClass == CLASS_MAP_ENTRY) {
                JavaType containedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
                JavaType containedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
                TypeDeserializer typeDeserializer = (TypeDeserializer) containedTypeOrUnknown2.getTypeHandler();
                if (typeDeserializer == null) {
                    typeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), containedTypeOrUnknown2);
                }
                return new MapEntryDeserializer(javaType, (KeyDeserializer) containedTypeOrUnknown.getValueHandler(), (JsonDeserializer) containedTypeOrUnknown2.getValueHandler(), typeDeserializer);
            } else {
                String name = rawClass.getName();
                if (rawClass.isPrimitive() || name.startsWith("java.")) {
                    JsonDeserializer<?> find = NumberDeserializers.find(rawClass, name);
                    if (find == null) {
                        find = DateDeserializers.find(rawClass, name);
                    }
                    if (find != null) {
                        return find;
                    }
                }
                if (rawClass == TokenBuffer.class) {
                    return new TokenBufferDeserializer();
                }
                JsonDeserializer<?> findOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
                if (findOptionalStdDeserializer != null) {
                    return findOptionalStdDeserializer;
                }
                return JdkDeserializers.find(rawClass, name);
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findDeserializer = annotationIntrospector.findDeserializer(annotated);
            if (findDeserializer != null) {
                return deserializationContext.deserializerInstance(annotated, findDeserializer);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector != null) {
            Object findKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated);
            if (findKeyDeserializer != null) {
                return deserializationContext.keyDeserializerInstance(annotated, findKeyDeserializer);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder findPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        if (findPropertyContentTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, contentType);
        }
        return findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder findPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
    }

    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        Collection collection;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = deserializationConfig.getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
            collection = null;
        } else {
            collection = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        }
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract()) {
            JavaType mapAbstractType = mapAbstractType(deserializationConfig, javaType);
            if (mapAbstractType != null && !mapAbstractType.hasRawClass(javaType.getRawClass())) {
                findTypeResolver.defaultImpl(mapAbstractType.getRawClass());
            }
        }
        try {
            return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collection);
        } catch (IllegalArgumentException e) {
            InvalidDefinitionException from = InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e), javaType);
            from.initCause(e);
            throw from;
        }
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator _valueInstantiatorInstance = findValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, findValueInstantiator) : null;
        if (_valueInstantiatorInstance == null) {
            _valueInstantiatorInstance = _findStdValueInstantiator(config, beanDescription);
            if (_valueInstantiatorInstance == null) {
                _valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            }
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators valueInstantiators : this._factoryConfig.valueInstantiators()) {
                _valueInstantiatorInstance = valueInstantiators.findValueInstantiator(config, beanDescription, _valueInstantiatorInstance);
                if (_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", valueInstantiators.getClass().getName());
                    throw null;
                }
            }
        }
        if (_valueInstantiatorInstance.getIncompleteParameter() == null) {
            return _valueInstantiatorInstance;
        }
        AnnotatedParameter incompleteParameter = _valueInstantiatorInstance.getIncompleteParameter();
        AnnotatedWithParams owner = incompleteParameter.getOwner();
        StringBuilder sb = new StringBuilder();
        sb.append("Argument #");
        sb.append(incompleteParameter.getIndex());
        sb.append(" of constructor ");
        sb.append(owner);
        sb.append(" has no property name annotation; must have name when multiple-parameter constructor annotated as Creator");
        throw new IllegalArgumentException(sb.toString());
    }

    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType _mapAbstractType2;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class rawClass = javaType.getRawClass();
            Class rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid abstract type resolution from ");
                sb.append(javaType);
                sb.append(" to ");
                sb.append(_mapAbstractType2);
                sb.append(": latter is not a subtype of former");
            } else {
                javaType = _mapAbstractType2;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid abstract type resolution from ");
        sb2.append(javaType);
        sb2.append(" to ");
        sb2.append(_mapAbstractType2);
        sb2.append(": latter is not a subtype of former");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* access modifiers changed from: protected */
    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null) {
            KeyDeserializer keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember));
            if (keyDeserializerInstance != null) {
                r5 = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
                r5.getKeyType();
                javaType = r5;
            }
        }
        if (javaType.hasContentType()) {
            JsonDeserializer deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (deserializerInstance != null) {
                javaType = javaType.withContentValueHandler(deserializerInstance);
            }
            TypeDeserializer findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (findPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(findPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (findPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(findPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }

    public final DeserializerFactory withAbstractTypeResolver(AbstractTypeResolver abstractTypeResolver) {
        return withConfig(this._factoryConfig.withAbstractTypeResolver(abstractTypeResolver));
    }

    public final DeserializerFactory withAdditionalDeserializers(Deserializers deserializers) {
        return withConfig(this._factoryConfig.withAdditionalDeserializers(deserializers));
    }

    public final DeserializerFactory withAdditionalKeyDeserializers(KeyDeserializers keyDeserializers) {
        return withConfig(this._factoryConfig.withAdditionalKeyDeserializers(keyDeserializers));
    }

    /* access modifiers changed from: protected */
    public abstract DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig);

    public final DeserializerFactory withDeserializerModifier(BeanDeserializerModifier beanDeserializerModifier) {
        return withConfig(this._factoryConfig.withDeserializerModifier(beanDeserializerModifier));
    }

    public final DeserializerFactory withValueInstantiators(ValueInstantiators valueInstantiators) {
        return withConfig(this._factoryConfig.withValueInstantiators(valueInstantiators));
    }
}

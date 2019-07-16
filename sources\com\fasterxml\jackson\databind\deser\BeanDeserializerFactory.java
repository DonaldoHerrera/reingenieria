package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class<?>[] INIT_CAUSE_PARAMS = {Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    private boolean _isSetterlessType(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    /* access modifiers changed from: protected */
    public void _validateSubType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        SubTypeValidator.instance().validateSubType(deserializationContext, javaType, beanDescription);
    }

    /* access modifiers changed from: protected */
    public void addBackReferenceProperties(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws JsonMappingException {
        List<BeanPropertyDefinition> findBackReferences = beanDescription.findBackReferences();
        if (findBackReferences != null) {
            for (BeanPropertyDefinition beanPropertyDefinition : findBackReferences) {
                beanDeserializerBuilder.addBackReferenceProperty(beanPropertyDefinition.findReferenceName(), constructSettableProperty(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getPrimaryType()));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016b A[SYNTHETIC] */
    public void addBeanProps(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws JsonMappingException {
        Set<String> set;
        SettableBeanProperty settableBeanProperty;
        CreatorProperty creatorProperty;
        DeserializationContext deserializationContext2 = deserializationContext;
        BeanDescription beanDescription2 = beanDescription;
        BeanDeserializerBuilder beanDeserializerBuilder2 = beanDeserializerBuilder;
        Object[] fromObjectArguments = beanDescription.getType().isAbstract() ^ true ? beanDeserializerBuilder.getValueInstantiator().getFromObjectArguments(deserializationContext.getConfig()) : null;
        boolean z = fromObjectArguments != null;
        Value defaultPropertyIgnorals = deserializationContext.getConfig().getDefaultPropertyIgnorals(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        if (defaultPropertyIgnorals != null) {
            beanDeserializerBuilder2.setIgnoreUnknownProperties(defaultPropertyIgnorals.getIgnoreUnknown());
            set = defaultPropertyIgnorals.findIgnoredForDeserialization();
            for (String addIgnorable : set) {
                beanDeserializerBuilder2.addIgnorable(addIgnorable);
            }
        } else {
            set = Collections.emptySet();
        }
        Set set2 = set;
        AnnotatedMember findAnySetterAccessor = beanDescription.findAnySetterAccessor();
        if (findAnySetterAccessor != null) {
            beanDeserializerBuilder2.setAnySetter(constructAnySetter(deserializationContext2, beanDescription2, findAnySetterAccessor));
        } else {
            Set<String> ignoredPropertyNames = beanDescription.getIgnoredPropertyNames();
            if (ignoredPropertyNames != null) {
                for (String addIgnorable2 : ignoredPropertyNames) {
                    beanDeserializerBuilder2.addIgnorable(addIgnorable2);
                }
            }
        }
        boolean z2 = deserializationContext2.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS) && deserializationContext2.isEnabled(MapperFeature.AUTO_DETECT_GETTERS);
        List<BeanPropertyDefinition> filterBeanProps = filterBeanProps(deserializationContext, beanDescription, beanDeserializerBuilder, beanDescription.findProperties(), set2);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateProperties : this._factoryConfig.deserializerModifiers()) {
                filterBeanProps = updateProperties.updateProperties(deserializationContext.getConfig(), beanDescription2, filterBeanProps);
            }
        }
        for (BeanPropertyDefinition beanPropertyDefinition : filterBeanProps) {
            if (beanPropertyDefinition.hasSetter()) {
                settableBeanProperty = constructSettableProperty(deserializationContext2, beanDescription2, beanPropertyDefinition, beanPropertyDefinition.getSetter().getParameterType(0));
            } else if (beanPropertyDefinition.hasField()) {
                settableBeanProperty = constructSettableProperty(deserializationContext2, beanDescription2, beanPropertyDefinition, beanPropertyDefinition.getField().getType());
            } else {
                AnnotatedMethod getter = beanPropertyDefinition.getGetter();
                if (getter != null) {
                    if (!z2 || !_isSetterlessType(getter.getRawType())) {
                        if (!beanPropertyDefinition.hasConstructorParameter() && beanPropertyDefinition.getMetadata().getMergeInfo() != null) {
                            settableBeanProperty = constructSetterlessProperty(deserializationContext2, beanDescription2, beanPropertyDefinition);
                        }
                    } else if (!beanDeserializerBuilder2.hasIgnorable(beanPropertyDefinition.getName())) {
                        settableBeanProperty = constructSetterlessProperty(deserializationContext2, beanDescription2, beanPropertyDefinition);
                    }
                }
                settableBeanProperty = null;
            }
            if (z && beanPropertyDefinition.hasConstructorParameter()) {
                String name = beanPropertyDefinition.getName();
                if (fromObjectArguments != null) {
                    int length = fromObjectArguments.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        CreatorProperty creatorProperty2 = fromObjectArguments[i];
                        if (name.equals(creatorProperty2.getName()) && (creatorProperty2 instanceof CreatorProperty)) {
                            creatorProperty = creatorProperty2;
                            break;
                        }
                        i++;
                    }
                    if (creatorProperty != null) {
                        ArrayList arrayList = new ArrayList();
                        for (CreatorProperty name2 : fromObjectArguments) {
                            arrayList.add(name2.getName());
                        }
                        deserializationContext2.reportBadPropertyDefinition(beanDescription2, beanPropertyDefinition, "Could not find creator property with name '%s' (known Creator properties: %s)", name, arrayList);
                        throw null;
                    }
                    if (settableBeanProperty != null) {
                        creatorProperty.setFallbackSetter(settableBeanProperty);
                    }
                    Class[] findViews = beanPropertyDefinition.findViews();
                    if (findViews == null) {
                        findViews = beanDescription.findDefaultViews();
                    }
                    creatorProperty.setViews(findViews);
                    beanDeserializerBuilder2.addCreatorProperty(creatorProperty);
                }
                creatorProperty = null;
                if (creatorProperty != null) {
                }
            } else if (settableBeanProperty != null) {
                Class[] findViews2 = beanPropertyDefinition.findViews();
                if (findViews2 == null) {
                    findViews2 = beanDescription.findDefaultViews();
                }
                settableBeanProperty.setViews(findViews2);
                beanDeserializerBuilder2.addProperty(settableBeanProperty);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addInjectables(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws JsonMappingException {
        Map findInjectables = beanDescription.findInjectables();
        if (findInjectables != null) {
            for (Entry entry : findInjectables.entrySet()) {
                AnnotatedMember annotatedMember = (AnnotatedMember) entry.getValue();
                beanDeserializerBuilder.addInjectable(PropertyName.construct(annotatedMember.getName()), annotatedMember.getType(), beanDescription.getClassAnnotations(), annotatedMember, entry.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addObjectIdReader(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws JsonMappingException {
        ObjectIdGenerator objectIdGenerator;
        JavaType javaType;
        SettableBeanProperty settableBeanProperty;
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo != null) {
            Class<PropertyGenerator> generatorType = objectIdInfo.getGeneratorType();
            ObjectIdResolver objectIdResolverInstance = deserializationContext.objectIdResolverInstance(beanDescription.getClassInfo(), objectIdInfo);
            if (generatorType == PropertyGenerator.class) {
                PropertyName propertyName = objectIdInfo.getPropertyName();
                settableBeanProperty = beanDeserializerBuilder.findProperty(propertyName);
                if (settableBeanProperty != null) {
                    JavaType type = settableBeanProperty.getType();
                    javaType = type;
                    objectIdGenerator = new PropertyBasedObjectIdGenerator(objectIdInfo.getScope());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid Object Id definition for ");
                    sb.append(beanDescription.getBeanClass().getName());
                    sb.append(": cannot find property with name '");
                    sb.append(propertyName);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(generatorType), ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                objectIdGenerator = deserializationContext.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo);
                javaType = javaType2;
            }
            SettableBeanProperty settableBeanProperty2 = settableBeanProperty;
            beanDeserializerBuilder.setObjectIdReader(ObjectIdReader.construct(javaType, objectIdInfo.getPropertyName(), objectIdGenerator, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty2, objectIdResolverInstance));
        }
    }

    public JsonDeserializer<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonDeserializer<Object> jsonDeserializer;
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
            constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
            addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                    constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
                }
            }
            if (!javaType.isAbstract() || findValueInstantiator.canInstantiate()) {
                jsonDeserializer = constructBeanDeserializerBuilder.build();
            } else {
                jsonDeserializer = constructBeanDeserializerBuilder.buildAbstract();
            }
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                    jsonDeserializer = modifyDeserializer.modifyDeserializer(config, beanDescription, jsonDeserializer);
                }
            }
            return jsonDeserializer;
        } catch (NoClassDefFoundError e) {
            return new ErrorThrowingDeserializer(e);
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), ClassUtil.exceptionMessage(e2), beanDescription, (BeanPropertyDefinition) null);
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        String str;
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            DeserializationConfig config = deserializationContext.getConfig();
            BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
            constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
            addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            JsonPOJOBuilder.Value findPOJOBuilderConfig = beanDescription.findPOJOBuilderConfig();
            if (findPOJOBuilderConfig == null) {
                str = "build";
            } else {
                str = findPOJOBuilderConfig.buildMethodName;
            }
            AnnotatedMethod findMethod = beanDescription.findMethod(str, null);
            if (findMethod != null && config.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(findMethod.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            constructBeanDeserializerBuilder.setPOJOBuilder(findMethod, findPOJOBuilderConfig);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                    constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
                }
            }
            JsonDeserializer<Object> buildBuilderBased = constructBeanDeserializerBuilder.buildBuilderBased(javaType, str);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                    buildBuilderBased = modifyDeserializer.modifyDeserializer(config, beanDescription, buildBuilderBased);
                }
            }
            return buildBuilderBased;
        } catch (NoClassDefFoundError e) {
            return new ErrorThrowingDeserializer(e);
        } catch (IllegalArgumentException e2) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), ClassUtil.exceptionMessage(e2), beanDescription, (BeanPropertyDefinition) null);
        }
    }

    public JsonDeserializer<Object> buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
        constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator(deserializationContext, beanDescription));
        addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        AnnotatedMethod findMethod = beanDescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (findMethod != null) {
            SettableBeanProperty constructSettableProperty = constructSettableProperty(deserializationContext, beanDescription, SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), findMethod, new PropertyName("cause")), findMethod.getParameterType(0));
            if (constructSettableProperty != null) {
                constructBeanDeserializerBuilder.addOrReplaceProperty(constructSettableProperty, true);
            }
        }
        constructBeanDeserializerBuilder.addIgnorable("localizedMessage");
        constructBeanDeserializerBuilder.addIgnorable("suppressed");
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier updateBuilder : this._factoryConfig.deserializerModifiers()) {
                constructBeanDeserializerBuilder = updateBuilder.updateBuilder(config, beanDescription, constructBeanDeserializerBuilder);
            }
        }
        JsonDeserializer build = constructBeanDeserializerBuilder.build();
        if (build instanceof BeanDeserializer) {
            build = new ThrowableDeserializer((BeanDeserializer) build);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                build = modifyDeserializer.modifyDeserializer(config, beanDescription, build);
            }
        }
        return build;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    public SettableAnyProperty constructAnySetter(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType javaType;
        JavaType javaType2;
        Std std;
        KeyDeserializer keyDeserializer;
        JsonDeserializer findContentDeserializerFromAnnotation;
        KeyDeserializer createContextual;
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            JavaType parameterType = annotatedMethod.getParameterType(0);
            javaType2 = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, annotatedMethod.getParameterType(1));
            std = new Std(PropertyName.construct(annotatedMember.getName()), javaType2, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
            javaType = parameterType;
        } else if (annotatedMember instanceof AnnotatedField) {
            JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, ((AnnotatedField) annotatedMember).getType());
            javaType = resolveMemberAndTypeAnnotations.getKeyType();
            JavaType contentType = resolveMemberAndTypeAnnotations.getContentType();
            Std std2 = new Std(PropertyName.construct(annotatedMember.getName()), resolveMemberAndTypeAnnotations, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
            javaType2 = contentType;
            std = std2;
        } else {
            deserializationContext.reportBadDefinition(beanDescription.getType(), String.format("Unrecognized mutator type for any setter: %s", new Object[]{annotatedMember.getClass()}));
            throw null;
        }
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (findKeyDeserializerFromAnnotation == null) {
            findKeyDeserializerFromAnnotation = (KeyDeserializer) javaType.getValueHandler();
        }
        if (findKeyDeserializerFromAnnotation == null) {
            createContextual = deserializationContext.findKeyDeserializer(javaType, std);
        } else if (findKeyDeserializerFromAnnotation instanceof ContextualKeyDeserializer) {
            createContextual = ((ContextualKeyDeserializer) findKeyDeserializerFromAnnotation).createContextual(deserializationContext, std);
        } else {
            keyDeserializer = findKeyDeserializerFromAnnotation;
            findContentDeserializerFromAnnotation = findContentDeserializerFromAnnotation(deserializationContext, annotatedMember);
            if (findContentDeserializerFromAnnotation == null) {
                findContentDeserializerFromAnnotation = (JsonDeserializer) javaType2.getValueHandler();
            }
            SettableAnyProperty settableAnyProperty = new SettableAnyProperty(std, annotatedMember, javaType2, keyDeserializer, findContentDeserializerFromAnnotation == null ? deserializationContext.handlePrimaryContextualization(findContentDeserializerFromAnnotation, std, javaType2) : findContentDeserializerFromAnnotation, (TypeDeserializer) javaType2.getTypeHandler());
            return settableAnyProperty;
        }
        keyDeserializer = createContextual;
        findContentDeserializerFromAnnotation = findContentDeserializerFromAnnotation(deserializationContext, annotatedMember);
        if (findContentDeserializerFromAnnotation == null) {
        }
        SettableAnyProperty settableAnyProperty2 = new SettableAnyProperty(std, annotatedMember, javaType2, keyDeserializer, findContentDeserializerFromAnnotation == null ? deserializationContext.handlePrimaryContextualization(findContentDeserializerFromAnnotation, std, javaType2) : findContentDeserializerFromAnnotation, (TypeDeserializer) javaType2.getTypeHandler());
        return settableAnyProperty2;
    }

    /* access modifiers changed from: protected */
    public BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        return new BeanDeserializerBuilder(beanDescription, deserializationContext);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.fasterxml.jackson.databind.deser.impl.MethodProperty] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.fasterxml.jackson.databind.deser.impl.MethodProperty] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v4, types: [com.fasterxml.jackson.databind.deser.impl.FieldProperty]
  assigns: [com.fasterxml.jackson.databind.deser.impl.FieldProperty, com.fasterxml.jackson.databind.deser.impl.MethodProperty]
  uses: [com.fasterxml.jackson.databind.deser.impl.FieldProperty, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.deser.impl.MethodProperty]
  mth insns count: 44
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    public SettableBeanProperty constructSettableProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType) throws JsonMappingException {
        ? r7;
        AnnotatedMember nonConstructorMutator = beanPropertyDefinition.getNonConstructorMutator();
        if (nonConstructorMutator != null) {
            JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, nonConstructorMutator, javaType);
            TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
            if (nonConstructorMutator instanceof AnnotatedMethod) {
                ? methodProperty = new MethodProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, typeDeserializer, beanDescription.getClassAnnotations(), (AnnotatedMethod) nonConstructorMutator);
                r7 = methodProperty;
            } else {
                ? withValueDeserializer = new FieldProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, typeDeserializer, beanDescription.getClassAnnotations(), (AnnotatedField) nonConstructorMutator);
                r7 = withValueDeserializer;
            }
            JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, nonConstructorMutator);
            if (findDeserializerFromAnnotation == null) {
                findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
            }
            if (findDeserializerFromAnnotation != null) {
                r7 = r7.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, r7, resolveMemberAndTypeAnnotations));
            }
            ReferenceProperty findReferenceType = beanPropertyDefinition.findReferenceType();
            if (findReferenceType != null && findReferenceType.isManagedReference()) {
                r7.setManagedReferenceName(findReferenceType.getName());
            }
            ObjectIdInfo findObjectIdInfo = beanPropertyDefinition.findObjectIdInfo();
            if (findObjectIdInfo != null) {
                r7.setObjectIdInfo(findObjectIdInfo);
            }
            return r7;
        }
        deserializationContext.reportBadPropertyDefinition(beanDescription, beanPropertyDefinition, "No non-constructor mutator available", new Object[0]);
        throw null;
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) throws JsonMappingException {
        AnnotatedMethod getter = beanPropertyDefinition.getGetter();
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, getter, getter.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler(), beanDescription.getClassAnnotations(), getter);
        JsonDeserializer findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, getter);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, setterlessProperty, resolveMemberAndTypeAnnotations)) : setterlessProperty;
    }

    public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer<Object> _findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, beanDescription);
        if (_findCustomBeanDeserializer != null) {
            return _findCustomBeanDeserializer;
        }
        if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType()) {
            JavaType materializeAbstractType = materializeAbstractType(deserializationContext, javaType, beanDescription);
            if (materializeAbstractType != null) {
                return buildBeanDeserializer(deserializationContext, materializeAbstractType, config.introspect(materializeAbstractType));
            }
        }
        JsonDeserializer<Object> findStdDeserializer = findStdDeserializer(deserializationContext, javaType, beanDescription);
        if (findStdDeserializer != null) {
            return findStdDeserializer;
        }
        if (!isPotentialBeanType(javaType.getRawClass())) {
            return null;
        }
        _validateSubType(deserializationContext, javaType, beanDescription);
        return buildBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class<?> cls) throws JsonMappingException {
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(deserializationContext.constructType(cls)));
    }

    /* access modifiers changed from: protected */
    public List<BeanPropertyDefinition> filterBeanProps(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder, List<BeanPropertyDefinition> list, Set<String> set) throws JsonMappingException {
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap hashMap = new HashMap();
        for (BeanPropertyDefinition beanPropertyDefinition : list) {
            String name = beanPropertyDefinition.getName();
            if (!set.contains(name)) {
                if (!beanPropertyDefinition.hasConstructorParameter()) {
                    Class rawPrimaryType = beanPropertyDefinition.getRawPrimaryType();
                    if (rawPrimaryType != null && isIgnorableType(deserializationContext.getConfig(), beanPropertyDefinition, rawPrimaryType, hashMap)) {
                        beanDeserializerBuilder.addIgnorable(name);
                    }
                }
                arrayList.add(beanPropertyDefinition);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<?> findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonDeserializer<?> findDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, beanDescription);
        if (findDefaultDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            for (BeanDeserializerModifier modifyDeserializer : this._factoryConfig.deserializerModifiers()) {
                findDefaultDeserializer = modifyDeserializer.modifyDeserializer(deserializationContext.getConfig(), beanDescription, findDefaultDeserializer);
            }
        }
        return findDefaultDeserializer;
    }

    /* access modifiers changed from: protected */
    public boolean isIgnorableType(DeserializationConfig deserializationConfig, BeanPropertyDefinition beanPropertyDefinition, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean bool;
        Boolean bool2 = (Boolean) map.get(cls);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            bool = Boolean.FALSE;
        } else {
            bool = deserializationConfig.getConfigOverride(cls).getIsIgnoredType();
            if (bool == null) {
                bool = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).getClassInfo());
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
            }
        }
        map.put(cls, bool);
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public boolean isPotentialBeanType(Class<?> cls) {
        String canBeABeanType = ClassUtil.canBeABeanType(cls);
        String str = ") as a Bean";
        String str2 = " (of type ";
        String str3 = "Cannot deserialize Class ";
        if (canBeABeanType != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(cls.getName());
            sb.append(str2);
            sb.append(canBeABeanType);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (!ClassUtil.isProxyType(cls)) {
            String isLocalType = ClassUtil.isLocalType(cls, true);
            if (isLocalType == null) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(cls.getName());
            sb2.append(str2);
            sb2.append(isLocalType);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot deserialize Proxy class ");
            sb3.append(cls.getName());
            sb3.append(" as a Bean");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        for (AbstractTypeResolver resolveAbstractType : this._factoryConfig.abstractTypeResolvers()) {
            JavaType resolveAbstractType2 = resolveAbstractType.resolveAbstractType(deserializationContext.getConfig(), beanDescription);
            if (resolveAbstractType2 != null) {
                return resolveAbstractType2;
            }
        }
        return null;
    }

    public DeserializerFactory withConfig(DeserializerFactoryConfig deserializerFactoryConfig) {
        if (this._factoryConfig == deserializerFactoryConfig) {
            return this;
        }
        ClassUtil.verifyMustOverride(BeanDeserializerFactory.class, this, "withConfig");
        return new BeanDeserializerFactory(deserializerFactoryConfig);
    }
}

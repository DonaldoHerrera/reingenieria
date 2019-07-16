package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J/\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0017¢\u0006\u0002\u0010\u000fJ%\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000bH\u0016¢\u0006\u0002\u0010\u0011J\f\u0010\u0012\u001a\u00020\u0013*\u00020\fH\u0002J\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;", "Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;", "src", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "(Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;)V", "createFromObjectWith", "", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "props", "", "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;", "buffer", "Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;", "(Lcom/fasterxml/jackson/databind/DeserializationContext;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;", "args", "(Lcom/fasterxml/jackson/databind/DeserializationContext;[Ljava/lang/Object;)Ljava/lang/Object;", "hasInjectableValueId", "", "isPrimitive", "Lkotlin/reflect/KParameter;", "jackson-module-kotlin"}, mv = {1, 1, 9})
/* compiled from: KotlinValueInstantiator.kt */
public final class KotlinValueInstantiator extends StdValueInstantiator {
    private final ReflectionCache cache;

    public KotlinValueInstantiator(StdValueInstantiator stdValueInstantiator, ReflectionCache reflectionCache) {
        C7471uYa.b(stdValueInstantiator, "src");
        C7471uYa.b(reflectionCache, "cache");
        super(stdValueInstantiator);
        this.cache = reflectionCache;
    }

    private final boolean hasInjectableValueId(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty.getInjectableValueId() != null;
    }

    private final boolean isPrimitive(CZa cZa) {
        Type a = UZa.a(cZa.getType());
        if (a instanceof Class) {
            return ((Class) a).isPrimitive();
        }
        return false;
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, SettableBeanProperty[] settableBeanPropertyArr, PropertyValueBuffer propertyValueBuffer) {
        C7679xZa xza;
        Object obj;
        Object obj2;
        C7471uYa.b(deserializationContext, "ctxt");
        C7471uYa.b(settableBeanPropertyArr, "props");
        C7471uYa.b(propertyValueBuffer, "buffer");
        AnnotatedWithParams annotatedWithParams = this._withArgsCreator;
        String str = "_withArgsCreator";
        if (annotatedWithParams instanceof AnnotatedConstructor) {
            ReflectionCache reflectionCache = this.cache;
            C7471uYa.a((Object) annotatedWithParams, str);
            AnnotatedElement annotated = annotatedWithParams.getAnnotated();
            if (annotated != null) {
                xza = reflectionCache.kotlinFromJava((Constructor) annotated);
            } else {
                throw new OVa("null cannot be cast to non-null type java.lang.reflect.Constructor<kotlin.Any>");
            }
        } else if (annotatedWithParams instanceof AnnotatedMethod) {
            ReflectionCache reflectionCache2 = this.cache;
            C7471uYa.a((Object) annotatedWithParams, str);
            AnnotatedElement annotated2 = annotatedWithParams.getAnnotated();
            if (annotated2 != null) {
                xza = reflectionCache2.kotlinFromJava((Method) annotated2);
            } else {
                throw new OVa("null cannot be cast to non-null type java.lang.reflect.Method");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a constructor or method to create a Kotlin object, instead found ");
            AnnotatedWithParams annotatedWithParams2 = this._withArgsCreator;
            C7471uYa.a((Object) annotatedWithParams2, str);
            sb.append(annotatedWithParams2.getAnnotated().getClass().getName());
            throw new IllegalStateException(sb.toString());
        }
        if (xza == null) {
            return super.createFromObjectWith(deserializationContext, settableBeanPropertyArr, propertyValueBuffer);
        }
        CZa[] cZaArr = new CZa[settableBeanPropertyArr.length];
        Object[] objArr = new Object[settableBeanPropertyArr.length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (CZa cZa : xza.getParameters()) {
            int i4 = i3 + 1;
            if (C7471uYa.a((Object) cZa.g(), (Object) a.INSTANCE) || C7471uYa.a((Object) cZa.g(), (Object) a.EXTENSION_RECEIVER)) {
                return super.createFromObjectWith(deserializationContext, settableBeanPropertyArr, propertyValueBuffer);
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i3];
            boolean hasParameter = true ^ propertyValueBuffer.hasParameter(settableBeanProperty);
            if (!hasParameter || !cZa.h()) {
                if (!hasParameter || isPrimitive(cZa) || hasInjectableValueId(settableBeanProperty)) {
                    obj2 = propertyValueBuffer.getParameter(settableBeanProperty);
                } else {
                    obj2 = null;
                }
                objArr[i3] = obj2;
                if (obj2 != null || cZa.getType().f()) {
                    i2++;
                    cZaArr[i3] = cZa;
                } else {
                    JsonParser parser = deserializationContext.getParser();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Instantiation of ");
                    sb2.append(getValueTypeDesc());
                    sb2.append(" value failed for JSON property ");
                    sb2.append(settableBeanProperty.getName());
                    sb2.append(" due to missing (therefore NULL) value for creator parameter ");
                    sb2.append(cZa.getName());
                    sb2.append(" which is a non-nullable type");
                    MissingKotlinParameterException missingKotlinParameterException = new MissingKotlinParameterException(cZa, parser, sb2.toString());
                    Class valueClass = getValueClass();
                    String name = settableBeanProperty.getName();
                    C7471uYa.a((Object) name, "jsonProp.name");
                    JsonMappingException wrapWithPath = ExtensionsKt.wrapWithPath(missingKotlinParameterException, valueClass, name);
                    C7471uYa.a((Object) wrapWithPath, "MissingKotlinParameterEx…alueClass, jsonProp.name)");
                    throw wrapWithPath;
                }
            }
            i3 = i4;
        }
        if (i2 == objArr.length) {
            obj = super.createFromObjectWith(deserializationContext, objArr);
        } else {
            boolean a = RZa.a(xza);
            if ((!a && deserializationContext.getConfig().isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) || (a && deserializationContext.getConfig().isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))) {
                RZa.a(xza, true);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList(cZaArr.length);
            int length = cZaArr.length;
            int i5 = 0;
            while (i < length) {
                CZa cZa2 = cZaArr[i];
                int i6 = i5 + 1;
                if (cZa2 != null) {
                    linkedHashMap.put(cZa2, objArr[i5]);
                }
                arrayList.add(RVa.a);
                i++;
                i5 = i6;
            }
            obj = xza.a((Map<CZa, ? extends Object>) linkedHashMap);
        }
        return obj;
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        C7471uYa.b(deserializationContext, "ctxt");
        C7471uYa.b(objArr, "args");
        Object createFromObjectWith = super.createFromObjectWith(deserializationContext, objArr);
        C7471uYa.a(createFromObjectWith, "super.createFromObjectWith(ctxt, args)");
        return createFromObjectWith;
    }
}

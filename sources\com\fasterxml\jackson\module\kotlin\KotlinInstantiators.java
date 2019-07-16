package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinInstantiators;", "Lcom/fasterxml/jackson/databind/deser/ValueInstantiators;", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "(Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;)V", "findValueInstantiator", "Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;", "deserConfig", "Lcom/fasterxml/jackson/databind/DeserializationConfig;", "beanDescriptor", "Lcom/fasterxml/jackson/databind/BeanDescription;", "defaultInstantiator", "jackson-module-kotlin"}, mv = {1, 1, 9})
/* compiled from: KotlinValueInstantiator.kt */
public final class KotlinInstantiators implements ValueInstantiators {
    private final ReflectionCache cache;

    public KotlinInstantiators(ReflectionCache reflectionCache) {
        C7471uYa.b(reflectionCache, "cache");
        this.cache = reflectionCache;
    }

    public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationConfig, BeanDescription beanDescription, ValueInstantiator valueInstantiator) {
        C7471uYa.b(deserializationConfig, "deserConfig");
        C7471uYa.b(beanDescription, "beanDescriptor");
        C7471uYa.b(valueInstantiator, "defaultInstantiator");
        Class beanClass = beanDescription.getBeanClass();
        C7471uYa.a((Object) beanClass, "beanDescriptor.beanClass");
        if (!KotlinModuleKt.isKotlinClass(beanClass)) {
            return valueInstantiator;
        }
        if (valueInstantiator instanceof StdValueInstantiator) {
            return new KotlinValueInstantiator((StdValueInstantiator) valueInstantiator, this.cache);
        }
        throw new IllegalStateException("KotlinValueInstantiator requires that the default ValueInstantiator is StdValueInstantiator");
    }
}

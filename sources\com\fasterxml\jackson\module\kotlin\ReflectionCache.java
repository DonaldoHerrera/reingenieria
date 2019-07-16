package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@EVa(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0014J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007J\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\rJ\u0014\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0010R&\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "", "reflectionCacheSize", "", "(I)V", "javaClassToKotlin", "Lcom/fasterxml/jackson/databind/util/LRUMap;", "Ljava/lang/Class;", "Lkotlin/reflect/KClass;", "javaConstructorIsCreatorAnnotated", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "", "javaConstructorToKotlin", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/KFunction;", "javaMethodToKotlin", "Ljava/lang/reflect/Method;", "checkConstructorIsCreatorAnnotated", "key", "calc", "Lkotlin/Function1;", "kotlinFromJava", "jackson-module-kotlin"}, mv = {1, 1, 9})
/* compiled from: KotlinModule.kt */
public final class ReflectionCache {
    private final LRUMap<Class<Object>, C7472uZa<Object>> javaClassToKotlin;
    private final LRUMap<AnnotatedConstructor, Boolean> javaConstructorIsCreatorAnnotated;
    private final LRUMap<Constructor<Object>, C7679xZa<Object>> javaConstructorToKotlin;
    private final LRUMap<Method, C7679xZa<?>> javaMethodToKotlin;

    public ReflectionCache(int i) {
        this.javaClassToKotlin = new LRUMap<>(i, i);
        this.javaConstructorToKotlin = new LRUMap<>(i, i);
        this.javaMethodToKotlin = new LRUMap<>(i, i);
        this.javaConstructorIsCreatorAnnotated = new LRUMap<>(i, i);
    }

    public final boolean checkConstructorIsCreatorAnnotated(AnnotatedConstructor annotatedConstructor, _Xa<? super AnnotatedConstructor, Boolean> _xa) {
        C7471uYa.b(annotatedConstructor, "key");
        C7471uYa.b(_xa, "calc");
        Boolean bool = (Boolean) this.javaConstructorIsCreatorAnnotated.get(annotatedConstructor);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean booleanValue = ((Boolean) _xa.invoke(annotatedConstructor)).booleanValue();
        Boolean bool2 = (Boolean) this.javaConstructorIsCreatorAnnotated.putIfAbsent(annotatedConstructor, Boolean.valueOf(booleanValue));
        return bool2 != null ? bool2.booleanValue() : booleanValue;
    }

    public final C7472uZa<Object> kotlinFromJava(Class<Object> cls) {
        C7471uYa.b(cls, "key");
        C7472uZa<Object> uza = (C7472uZa) this.javaClassToKotlin.get(cls);
        if (uza != null) {
            return uza;
        }
        C7472uZa<Object> a = MXa.a(cls);
        C7472uZa uza2 = (C7472uZa) this.javaClassToKotlin.putIfAbsent(cls, a);
        return uza2 != null ? uza2 : a;
    }

    public final C7679xZa<Object> kotlinFromJava(Constructor<Object> constructor) {
        C7471uYa.b(constructor, "key");
        C7679xZa<Object> xza = (C7679xZa) this.javaConstructorToKotlin.get(constructor);
        if (xza != null) {
            return xza;
        }
        C7679xZa<Object> a = UZa.a(constructor);
        if (a == null) {
            return null;
        }
        C7679xZa xza2 = (C7679xZa) this.javaConstructorToKotlin.putIfAbsent(constructor, a);
        return xza2 != null ? xza2 : a;
    }

    public final C7679xZa<?> kotlinFromJava(Method method) {
        C7471uYa.b(method, "key");
        C7679xZa<?> xza = (C7679xZa) this.javaMethodToKotlin.get(method);
        if (xza != null) {
            return xza;
        }
        C7679xZa<?> a = UZa.a(method);
        if (a == null) {
            return null;
        }
        C7679xZa xza2 = (C7679xZa) this.javaMethodToKotlin.putIfAbsent(method, a);
        return xza2 != null ? xza2 : a;
    }
}

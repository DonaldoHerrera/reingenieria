package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0014H\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinNamesAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;", "module", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "(Lcom/fasterxml/jackson/module/kotlin/KotlinModule;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;)V", "getCache", "()Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "getModule", "()Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "findImplicitPropertyName", "", "member", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "findKotlinParameterName", "param", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", "hasCreatorAnnotation", "", "Lcom/fasterxml/jackson/databind/introspect/Annotated;", "jackson-module-kotlin"}, mv = {1, 1, 9})
/* compiled from: KotlinModule.kt */
public final class KotlinNamesAnnotationIntrospector extends NopAnnotationIntrospector {
    private final ReflectionCache cache;
    private final KotlinModule module;

    public KotlinNamesAnnotationIntrospector(KotlinModule kotlinModule, ReflectionCache reflectionCache) {
        C7471uYa.b(kotlinModule, "module");
        C7471uYa.b(reflectionCache, "cache");
        this.module = kotlinModule;
        this.cache = reflectionCache;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        C7471uYa.b(annotatedMember, "member");
        if (annotatedMember instanceof AnnotatedParameter) {
            return findKotlinParameterName((AnnotatedParameter) annotatedMember);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084 A[Catch:{ Qab -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b A[Catch:{ Qab -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091 A[Catch:{ Qab -> 0x00b2 }] */
    public final String findKotlinParameterName(AnnotatedParameter annotatedParameter) {
        Object obj;
        int index;
        C7471uYa.b(annotatedParameter, "param");
        Class declaringClass = annotatedParameter.getDeclaringClass();
        C7471uYa.a((Object) declaringClass, "param.getDeclaringClass()");
        if (!KotlinModuleKt.isKotlinClass(declaringClass)) {
            return null;
        }
        Member member = annotatedParameter.getOwner().getMember();
        int i = 0;
        if (member instanceof Constructor) {
            Constructor constructor = (Constructor) member;
            int length = constructor.getParameterTypes().length;
            try {
                C7679xZa a = UZa.a(constructor);
                if (a != null) {
                    List parameters = a.getParameters();
                    if (parameters != null) {
                        i = parameters.size();
                    }
                }
            } catch (C5240Qab unused) {
            }
            if (i <= 0 || i != length) {
                return null;
            }
            C7679xZa a2 = UZa.a(constructor);
            if (a2 == null) {
                return null;
            }
            List parameters2 = a2.getParameters();
            if (parameters2 == null) {
                return null;
            }
            CZa cZa = (CZa) parameters2.get(annotatedParameter.getIndex());
            if (cZa != null) {
                return cZa.getName();
            }
            return null;
        } else if (!(member instanceof Method)) {
            return null;
        } else {
            try {
                C7679xZa a3 = UZa.a((Method) member);
                if (a3 != null) {
                    List parameters3 = a3.getParameters();
                    if (parameters3 != null) {
                        CZa cZa2 = (CZa) C7676xWa.g(parameters3);
                        if (cZa2 != null) {
                            obj = cZa2.g();
                            index = !(C7471uYa.a(obj, (Object) a.VALUE) ^ true) ? annotatedParameter.getIndex() + 1 : annotatedParameter.getIndex();
                            if (a3 != null) {
                                List parameters4 = a3.getParameters();
                                if (parameters4 != null) {
                                    i = parameters4.size();
                                }
                            }
                            if (i <= index && a3 != null) {
                                List parameters5 = a3.getParameters();
                                if (parameters5 == null) {
                                    return null;
                                }
                                CZa cZa3 = (CZa) parameters5.get(index);
                                if (cZa3 != null) {
                                    return cZa3.getName();
                                }
                                return null;
                            }
                        }
                    }
                }
                obj = null;
                if (!(C7471uYa.a(obj, (Object) a.VALUE) ^ true)) {
                }
                if (a3 != null) {
                }
                return i <= index ? null : null;
            } catch (C5240Qab unused2) {
                return null;
            }
        }
    }

    public final ReflectionCache getCache() {
        return this.cache;
    }

    public boolean hasCreatorAnnotation(Annotated annotated) {
        C7471uYa.b(annotated, "member");
        if (annotated instanceof AnnotatedConstructor) {
            AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) annotated;
            Class declaringClass = annotatedConstructor.getDeclaringClass();
            C7471uYa.a((Object) declaringClass, "member.declaringClass");
            if (!declaringClass.isEnum() && annotatedConstructor.getParameterCount() > 0) {
                Class declaringClass2 = annotatedConstructor.getDeclaringClass();
                C7471uYa.a((Object) declaringClass2, "member.getDeclaringClass()");
                if (KotlinModuleKt.isKotlinClass(declaringClass2)) {
                    return this.cache.checkConstructorIsCreatorAnnotated(annotatedConstructor, new KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$1(this, annotated));
                }
            }
        }
        return false;
    }
}

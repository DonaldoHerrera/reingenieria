package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AnnotatedMethodCollector extends CollectorBase {
    private final MixInResolver _mixInResolver;

    private static final class MethodBuilder {
        public AnnotationCollector annotations;
        public Method method;
        public TypeResolutionContext typeContext;

        public MethodBuilder(TypeResolutionContext typeResolutionContext, Method method2, AnnotationCollector annotationCollector) {
            this.typeContext = typeResolutionContext;
            this.method = method2;
            this.annotations = annotationCollector;
        }

        public AnnotatedMethod build() {
            Method method2 = this.method;
            if (method2 == null) {
                return null;
            }
            return new AnnotatedMethod(this.typeContext, method2, this.annotations.asAnnotationMap(), null);
        }
    }

    AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, MixInResolver mixInResolver) {
        super(annotationIntrospector);
        if (annotationIntrospector == null) {
            mixInResolver = null;
        }
        this._mixInResolver = mixInResolver;
    }

    private void _addMemberMethods(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        Method[] classMethods;
        AnnotationCollector annotationCollector;
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, map, cls2);
        }
        if (cls != null) {
            for (Method method : ClassUtil.getClassMethods(cls)) {
                if (_isIncludableMemberMethod(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    MethodBuilder methodBuilder = (MethodBuilder) map.get(memberKey);
                    if (methodBuilder == null) {
                        if (this._intr == null) {
                            annotationCollector = AnnotationCollector.emptyCollector();
                        } else {
                            annotationCollector = collectAnnotations(method.getDeclaredAnnotations());
                        }
                        map.put(memberKey, new MethodBuilder(typeResolutionContext, method, annotationCollector));
                    } else {
                        if (this._intr != null) {
                            methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, method.getDeclaredAnnotations());
                        }
                        Method method2 = methodBuilder.method;
                        if (method2 == null) {
                            methodBuilder.method = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            methodBuilder.method = method;
                            methodBuilder.typeContext = typeResolutionContext;
                        }
                    }
                }
            }
        }
    }

    private boolean _isIncludableMemberMethod(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls) {
        return new AnnotatedMethodCollector(annotationIntrospector, mixInResolver).collect(typeFactory, typeResolutionContext, javaType, list, cls);
    }

    /* access modifiers changed from: protected */
    public void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        Method[] declaredMethods;
        if (this._intr != null) {
            for (Class declaredMethods2 : ClassUtil.findRawSuperTypes(cls2, cls, true)) {
                for (Method method : ClassUtil.getDeclaredMethods(declaredMethods2)) {
                    if (_isIncludableMemberMethod(method)) {
                        MemberKey memberKey = new MemberKey(method);
                        MethodBuilder methodBuilder = (MethodBuilder) map.get(memberKey);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (methodBuilder == null) {
                            map.put(memberKey, new MethodBuilder(typeResolutionContext, null, collectAnnotations(declaredAnnotations)));
                        } else {
                            methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    public AnnotatedMethodMap collect(TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, JavaType javaType, List<JavaType> list, Class<?> cls) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _addMemberMethods(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType javaType2 : list) {
            MixInResolver mixInResolver = this._mixInResolver;
            _addMemberMethods(new Basic(typeFactory, javaType2.getBindings()), javaType2.getRawClass(), linkedHashMap, mixInResolver == null ? null : mixInResolver.findMixInClassFor(javaType2.getRawClass()));
        }
        MixInResolver mixInResolver2 = this._mixInResolver;
        if (mixInResolver2 != null) {
            Class findMixInClassFor = mixInResolver2.findMixInClassFor(Object.class);
            if (findMixInClassFor != null) {
                _addMethodMixIns(typeResolutionContext, javaType.getRawClass(), linkedHashMap, findMixInClassFor);
                z = true;
                if (z && this._intr != null && !linkedHashMap.isEmpty()) {
                    for (Entry entry : linkedHashMap.entrySet()) {
                        MemberKey memberKey = (MemberKey) entry.getKey();
                        if ("hashCode".equals(memberKey.getName()) && memberKey.argCount() == 0) {
                            try {
                                Method declaredMethod = Object.class.getDeclaredMethod(memberKey.getName(), new Class[0]);
                                if (declaredMethod != null) {
                                    MethodBuilder methodBuilder = (MethodBuilder) entry.getValue();
                                    methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredMethod.getDeclaredAnnotations());
                                    methodBuilder.method = declaredMethod;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return new AnnotatedMethodMap();
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                for (Entry entry2 : linkedHashMap.entrySet()) {
                    AnnotatedMethod build = ((MethodBuilder) entry2.getValue()).build();
                    if (build != null) {
                        linkedHashMap2.put(entry2.getKey(), build);
                    }
                }
                return new AnnotatedMethodMap(linkedHashMap2);
            }
        }
        z = false;
        for (Entry entry3 : linkedHashMap.entrySet()) {
        }
        if (!linkedHashMap.isEmpty()) {
        }
    }
}

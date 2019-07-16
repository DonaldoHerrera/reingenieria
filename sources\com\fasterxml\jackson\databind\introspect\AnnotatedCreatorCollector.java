package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass.Creators;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.ClassUtil.Ctor;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class AnnotatedCreatorCollector extends CollectorBase {
    private AnnotatedConstructor _defaultConstructor;
    private final TypeResolutionContext _typeContext;

    AnnotatedCreatorCollector(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext) {
        super(annotationIntrospector);
        this._typeContext = typeResolutionContext;
    }

    private List<AnnotatedConstructor> _findPotentialConstructors(JavaType javaType, Class<?> cls) {
        List list;
        Ctor ctor;
        int i;
        List<AnnotatedConstructor> list2;
        Ctor[] constructors;
        Ctor[] constructors2;
        if (!javaType.isEnumType()) {
            ctor = null;
            list = null;
            for (Ctor ctor2 : ClassUtil.getConstructors(javaType.getRawClass())) {
                if (isIncludableConstructor(ctor2.getConstructor())) {
                    if (ctor2.getParamCount() == 0) {
                        ctor = ctor2;
                    } else {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(ctor2);
                    }
                }
            }
        } else {
            ctor = null;
            list = null;
        }
        if (list == null) {
            List<AnnotatedConstructor> emptyList = Collections.emptyList();
            if (ctor == null) {
                return emptyList;
            }
            list2 = emptyList;
            i = 0;
        } else {
            i = list.size();
            list2 = new ArrayList<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                list2.add(null);
            }
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            Ctor ctor3 = ctor;
            for (Ctor ctor4 : ClassUtil.getConstructors(cls)) {
                if (ctor4.getParamCount() == 0) {
                    if (ctor3 != null) {
                        this._defaultConstructor = constructDefaultConstructor(ctor3, ctor4);
                        ctor3 = null;
                    }
                } else if (list != null) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            memberKeyArr[i3] = new MemberKey(((Ctor) list.get(i3)).getConstructor());
                        }
                    }
                    MemberKey memberKey = new MemberKey(ctor4.getConstructor());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i) {
                            break;
                        } else if (memberKey.equals(memberKeyArr[i4])) {
                            list2.set(i4, constructNonDefaultConstructor((Ctor) list.get(i4), ctor4));
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            ctor = ctor3;
        }
        if (ctor != null) {
            this._defaultConstructor = constructDefaultConstructor(ctor, null);
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (((AnnotatedConstructor) list2.get(i5)) == null) {
                list2.set(i5, constructNonDefaultConstructor((Ctor) list.get(i5), null));
            }
        }
        return list2;
    }

    private List<AnnotatedMethod> _findPotentialFactories(JavaType javaType, Class<?> cls) {
        Method[] classMethods;
        Method[] declaredMethods;
        List list = null;
        for (Method method : ClassUtil.getClassMethods(javaType.getRawClass())) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(method);
            }
        }
        if (list == null) {
            return Collections.emptyList();
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(null);
        }
        if (cls != null) {
            MemberKey[] memberKeyArr = null;
            for (Method method2 : ClassUtil.getDeclaredMethods(cls)) {
                if (Modifier.isStatic(method2.getModifiers())) {
                    if (memberKeyArr == null) {
                        memberKeyArr = new MemberKey[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            memberKeyArr[i2] = new MemberKey((Method) list.get(i2));
                        }
                    }
                    MemberKey memberKey = new MemberKey(method2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        } else if (memberKey.equals(memberKeyArr[i3])) {
                            arrayList.set(i3, constructFactoryCreator((Method) list.get(i3), method2));
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            if (((AnnotatedMethod) arrayList.get(i4)) == null) {
                arrayList.set(i4, constructFactoryCreator((Method) list.get(i4), null));
            }
        }
        return arrayList;
    }

    private AnnotationMap[] collectAnnotations(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        int length = annotationArr.length;
        AnnotationMap[] annotationMapArr = new AnnotationMap[length];
        for (int i = 0; i < length; i++) {
            AnnotationCollector collectAnnotations = collectAnnotations(AnnotationCollector.emptyCollector(), annotationArr[i]);
            if (annotationArr2 != null) {
                collectAnnotations = collectAnnotations(collectAnnotations, annotationArr2[i]);
            }
            annotationMapArr[i] = collectAnnotations.asAnnotationMap();
        }
        return annotationMapArr;
    }

    public static Creators collectCreators(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, JavaType javaType, Class<?> cls) {
        return new AnnotatedCreatorCollector(annotationIntrospector, typeResolutionContext).collect(javaType, cls);
    }

    private static boolean isIncludableConstructor(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    /* access modifiers changed from: 0000 */
    public Creators collect(JavaType javaType, Class<?> cls) {
        List _findPotentialConstructors = _findPotentialConstructors(javaType, cls);
        List _findPotentialFactories = _findPotentialFactories(javaType, cls);
        AnnotationIntrospector annotationIntrospector = this._intr;
        if (annotationIntrospector != null) {
            AnnotatedConstructor annotatedConstructor = this._defaultConstructor;
            if (annotatedConstructor != null && annotationIntrospector.hasIgnoreMarker(annotatedConstructor)) {
                this._defaultConstructor = null;
            }
            int size = _findPotentialConstructors.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this._intr.hasIgnoreMarker((AnnotatedMember) _findPotentialConstructors.get(size))) {
                    _findPotentialConstructors.remove(size);
                }
            }
            int size2 = _findPotentialFactories.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (this._intr.hasIgnoreMarker((AnnotatedMember) _findPotentialFactories.get(size2))) {
                    _findPotentialFactories.remove(size2);
                }
            }
        }
        return new Creators(this._defaultConstructor, _findPotentialConstructors, _findPotentialFactories);
    }

    /* access modifiers changed from: protected */
    public AnnotatedConstructor constructDefaultConstructor(Ctor ctor, Ctor ctor2) {
        Annotation[][] annotationArr;
        if (this._intr == null) {
            return new AnnotatedConstructor(this._typeContext, ctor.getConstructor(), CollectorBase._emptyAnnotationMap(), CollectorBase.NO_ANNOTATION_MAPS);
        }
        TypeResolutionContext typeResolutionContext = this._typeContext;
        Constructor constructor = ctor.getConstructor();
        AnnotationMap collectAnnotations = collectAnnotations(ctor, ctor2);
        Annotation[][] parameterAnnotations = ctor.getConstructor().getParameterAnnotations();
        if (ctor2 == null) {
            annotationArr = null;
        } else {
            annotationArr = ctor2.getConstructor().getParameterAnnotations();
        }
        return new AnnotatedConstructor(typeResolutionContext, constructor, collectAnnotations, collectAnnotations(parameterAnnotations, annotationArr));
    }

    /* access modifiers changed from: protected */
    public AnnotatedMethod constructFactoryCreator(Method method, Method method2) {
        Annotation[][] annotationArr;
        int length = method.getParameterTypes().length;
        if (this._intr == null) {
            return new AnnotatedMethod(this._typeContext, method, CollectorBase._emptyAnnotationMap(), CollectorBase._emptyAnnotationMaps(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(this._typeContext, method, collectAnnotations((AnnotatedElement) method, (AnnotatedElement) method2), CollectorBase.NO_ANNOTATION_MAPS);
        }
        TypeResolutionContext typeResolutionContext = this._typeContext;
        AnnotationMap collectAnnotations = collectAnnotations((AnnotatedElement) method, (AnnotatedElement) method2);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (method2 == null) {
            annotationArr = null;
        } else {
            annotationArr = method2.getParameterAnnotations();
        }
        return new AnnotatedMethod(typeResolutionContext, method, collectAnnotations, collectAnnotations(parameterAnnotations, annotationArr));
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.fasterxml.jackson.databind.introspect.AnnotationMap[]] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.annotation.Annotation[][]] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.fasterxml.jackson.databind.introspect.AnnotationMap[]] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.annotation.Annotation[][]] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [com.fasterxml.jackson.databind.introspect.AnnotationMap[]] */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.fasterxml.jackson.databind.introspect.AnnotationMap[]] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
  assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.fasterxml.jackson.databind.introspect.AnnotationMap[], java.lang.annotation.Annotation[][]]
  uses: [java.lang.annotation.Annotation[][], ?[int, boolean, OBJECT, ARRAY, byte, short, char], com.fasterxml.jackson.databind.introspect.AnnotationMap[]]
  mth insns count: 72
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
    /* JADX WARNING: Unknown variable types count: 4 */
    public AnnotatedConstructor constructNonDefaultConstructor(Ctor ctor, Ctor ctor2) {
        Annotation[][] annotationArr;
        int paramCount = ctor.getParamCount();
        if (this._intr == null) {
            return new AnnotatedConstructor(this._typeContext, ctor.getConstructor(), CollectorBase._emptyAnnotationMap(), CollectorBase._emptyAnnotationMaps(paramCount));
        }
        if (paramCount == 0) {
            return new AnnotatedConstructor(this._typeContext, ctor.getConstructor(), collectAnnotations(ctor, ctor2), CollectorBase.NO_ANNOTATION_MAPS);
        }
        Annotation[][] parameterAnnotations = ctor.getParameterAnnotations();
        ? r3 = 0;
        if (paramCount != parameterAnnotations.length) {
            Class declaringClass = ctor.getDeclaringClass();
            if (declaringClass.isEnum() && paramCount == parameterAnnotations.length + 2) {
                annotationArr = new Annotation[(parameterAnnotations.length + 2)][];
                System.arraycopy(parameterAnnotations, 0, annotationArr, 2, parameterAnnotations.length);
                r3 = collectAnnotations(annotationArr, (Annotation[][]) null);
            } else if (!declaringClass.isMemberClass() || paramCount != parameterAnnotations.length + 1) {
                annotationArr = parameterAnnotations;
            } else {
                annotationArr = new Annotation[(parameterAnnotations.length + 1)][];
                System.arraycopy(parameterAnnotations, 0, annotationArr, 1, parameterAnnotations.length);
                annotationArr[0] = CollectorBase.NO_ANNOTATIONS;
                r3 = collectAnnotations(annotationArr, (Annotation[][]) null);
            }
            if (r3 == 0) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", new Object[]{ctor.getDeclaringClass().getName(), Integer.valueOf(paramCount), Integer.valueOf(annotationArr.length)}));
            }
        } else {
            if (ctor2 != null) {
                r3 = ctor2.getParameterAnnotations();
            }
            r3 = collectAnnotations(parameterAnnotations, (Annotation[][]) r3);
        }
        return new AnnotatedConstructor(this._typeContext, ctor.getConstructor(), collectAnnotations(ctor, ctor2), r3);
    }

    private AnnotationMap collectAnnotations(Ctor ctor, Ctor ctor2) {
        AnnotationCollector collectAnnotations = collectAnnotations(ctor.getConstructor().getDeclaredAnnotations());
        if (ctor2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, ctor2.getConstructor().getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }

    private final AnnotationMap collectAnnotations(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector collectAnnotations = collectAnnotations(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            collectAnnotations = collectAnnotations(collectAnnotations, annotatedElement2.getDeclaredAnnotations());
        }
        return collectAnnotations.asAnnotationMap();
    }
}

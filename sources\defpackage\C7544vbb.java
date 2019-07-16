package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: vbb reason: default package and case insensitive filesystem */
/* compiled from: ReflectKotlinClass.kt */
final class C7544vbb {
    public static final C7544vbb a = new C7544vbb();

    private C7544vbb() {
    }

    private final void b(Class<?> cls, d dVar) {
        int i;
        Constructor[] constructorArr;
        String str;
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor constructor = declaredConstructors[i2];
            C7694xnb d = C7694xnb.d("<init>");
            C7471uYa.a((Object) d, "Name.special(\"<init>\")");
            C4965Hbb hbb = C4965Hbb.a;
            C7471uYa.a((Object) constructor, "constructor");
            e a2 = dVar.a(d, hbb.a(constructor));
            if (a2 != null) {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                int length2 = declaredAnnotations.length;
                int i3 = 0;
                while (true) {
                    str = "annotation";
                    if (i3 >= length2) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i3];
                    C7471uYa.a((Object) annotation, str);
                    a((c) a2, annotation);
                    i3++;
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                C7471uYa.a((Object) parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length4 = parameterAnnotations.length;
                    for (int i4 = 0; i4 < length4; i4++) {
                        Annotation[] annotationArr = parameterAnnotations[i4];
                        int length5 = annotationArr.length;
                        int i5 = 0;
                        while (i5 < length5) {
                            Annotation annotation2 = annotationArr[i5];
                            Class a3 = MXa.a(MXa.a(annotation2));
                            Constructor[] constructorArr2 = declaredConstructors;
                            int i6 = i4 + length3;
                            int i7 = length;
                            C7280rnb b = Rvb.b(a3);
                            int i8 = length3;
                            C7471uYa.a((Object) annotation2, str);
                            a a4 = a2.a(i6, b, new C7475ubb(annotation2));
                            if (a4 != null) {
                                a.a(a4, annotation2, a3);
                            }
                            i5++;
                            declaredConstructors = constructorArr2;
                            length = i7;
                            length3 = i8;
                        }
                        Constructor[] constructorArr3 = declaredConstructors;
                        int i9 = length;
                        int i10 = length3;
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                a2.a();
            } else {
                constructorArr = declaredConstructors;
                i = length;
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    private final void c(Class<?> cls, d dVar) {
        Field[] declaredFields;
        Annotation[] declaredAnnotations;
        for (Field field : cls.getDeclaredFields()) {
            C7471uYa.a((Object) field, "field");
            C7694xnb b = C7694xnb.b(field.getName());
            C7471uYa.a((Object) b, "Name.identifier(field.name)");
            c a2 = dVar.a(b, C4965Hbb.a.a(field), null);
            if (a2 != null) {
                for (Annotation annotation : field.getDeclaredAnnotations()) {
                    C7471uYa.a((Object) annotation, "annotation");
                    a(a2, annotation);
                }
                a2.a();
            }
        }
    }

    private final void d(Class<?> cls, d dVar) {
        Method[] methodArr;
        String str;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            C7471uYa.a((Object) method, "method");
            C7694xnb b = C7694xnb.b(method.getName());
            C7471uYa.a((Object) b, "Name.identifier(method.name)");
            e a2 = dVar.a(b, C4965Hbb.a.a(method));
            if (a2 != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                int length2 = declaredAnnotations.length;
                int i2 = 0;
                while (true) {
                    str = "annotation";
                    if (i2 >= length2) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[i2];
                    C7471uYa.a((Object) annotation, str);
                    a((c) a2, annotation);
                    i2++;
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                C7471uYa.a((Object) parameterAnnotations, "method.parameterAnnotations");
                int length3 = parameterAnnotations.length;
                for (int i3 = 0; i3 < length3; i3++) {
                    Annotation[] annotationArr = parameterAnnotations[i3];
                    int length4 = annotationArr.length;
                    int i4 = 0;
                    while (i4 < length4) {
                        Annotation annotation2 = annotationArr[i4];
                        Class a3 = MXa.a(MXa.a(annotation2));
                        C7280rnb b2 = Rvb.b(a3);
                        Method[] methodArr2 = declaredMethods;
                        C7471uYa.a((Object) annotation2, str);
                        a a4 = a2.a(i3, b2, new C7475ubb(annotation2));
                        if (a4 != null) {
                            a.a(a4, annotation2, a3);
                        }
                        i4++;
                        declaredMethods = methodArr2;
                    }
                    Method[] methodArr3 = declaredMethods;
                }
                methodArr = declaredMethods;
                a2.a();
            } else {
                methodArr = declaredMethods;
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    public final void a(Class<?> cls, c cVar) {
        Annotation[] declaredAnnotations;
        C7471uYa.b(cls, "klass");
        C7471uYa.b(cVar, "visitor");
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            C7471uYa.a((Object) annotation, "annotation");
            a(cVar, annotation);
        }
        cVar.a();
    }

    public final void a(Class<?> cls, d dVar) {
        C7471uYa.b(cls, "klass");
        C7471uYa.b(dVar, "memberVisitor");
        d(cls, dVar);
        b(cls, dVar);
        c(cls, dVar);
    }

    private final void a(c cVar, Annotation annotation) {
        Class a2 = MXa.a(MXa.a(annotation));
        a a3 = cVar.a(Rvb.b(a2), new C7475ubb(annotation));
        if (a3 != null) {
            a.a(a3, annotation, a2);
        }
    }

    private final void a(a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                if (invoke != null) {
                    C7471uYa.a((Object) method, "method");
                    C7694xnb b = C7694xnb.b(method.getName());
                    C7471uYa.a((Object) b, "Name.identifier(method.name)");
                    a(aVar, b, invoke);
                    i++;
                } else {
                    C7471uYa.a();
                    throw null;
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    private final Mpb a(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            C7471uYa.a((Object) cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C7280rnb b = Rvb.b(cls);
            C6721jcb jcb = C6721jcb.m;
            C7349snb a2 = b.a();
            C7471uYa.a((Object) a2, "javaClassId.asSingleFqName()");
            C7280rnb a3 = jcb.a(a2);
            if (a3 != null) {
                b = a3;
            }
            return new Mpb(b, i);
        } else if (C7471uYa.a((Object) cls, (Object) Void.TYPE)) {
            C7280rnb a4 = C7280rnb.a(C5301Sbb.h.e.h());
            C7471uYa.a((Object) a4, "ClassId.topLevel(KotlinB…s.FQ_NAMES.unit.toSafe())");
            return new Mpb(a4, i);
        } else {
            C7424tqb a5 = C7424tqb.a(cls.getName());
            C7471uYa.a((Object) a5, "JvmPrimitiveType.get(currentClass.name)");
            C5331Tbb c = a5.c();
            C7471uYa.a((Object) c, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
            if (i > 0) {
                C7280rnb a6 = C7280rnb.a(c.a());
                C7471uYa.a((Object) a6, "ClassId.topLevel(primitiveType.arrayTypeFqName)");
                return new Mpb(a6, i - 1);
            }
            C7280rnb a7 = C7280rnb.a(c.c());
            C7471uYa.a((Object) a7, "ClassId.topLevel(primitiveType.typeFqName)");
            return new Mpb(a7, i);
        }
    }

    private final void a(a aVar, C7694xnb xnb, Object obj) {
        Class cls = obj.getClass();
        String str = "null cannot be cast to non-null type java.lang.Class<*>";
        if (C7471uYa.a((Object) cls, (Object) Class.class)) {
            if (obj != null) {
                aVar.a(xnb, a((Class) obj));
            } else {
                throw new OVa(str);
            }
        } else if (C4779Bbb.a.contains(cls)) {
            aVar.a(xnb, obj);
        } else {
            String str2 = "null cannot be cast to non-null type kotlin.Enum<*>";
            if (Rvb.g(cls)) {
                if (!cls.isEnum()) {
                    cls = cls.getEnclosingClass();
                }
                C7471uYa.a((Object) cls, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
                C7280rnb b = Rvb.b(cls);
                if (obj != null) {
                    C7694xnb b2 = C7694xnb.b(((Enum) obj).name());
                    C7471uYa.a((Object) b2, "Name.identifier((value as Enum<*>).name)");
                    aVar.a(xnb, b, b2);
                } else {
                    throw new OVa(str2);
                }
            } else if (Annotation.class.isAssignableFrom(cls)) {
                Class[] interfaces = cls.getInterfaces();
                C7471uYa.a((Object) interfaces, "clazz.interfaces");
                Class cls2 = (Class) C6578hWa.i(interfaces);
                C7471uYa.a((Object) cls2, "annotationClass");
                a a2 = aVar.a(xnb, Rvb.b(cls2));
                if (a2 == null) {
                    return;
                }
                if (obj != null) {
                    a(a2, (Annotation) obj, cls2);
                } else {
                    throw new OVa("null cannot be cast to non-null type kotlin.Annotation");
                }
            } else if (cls.isArray()) {
                b a3 = aVar.a(xnb);
                if (a3 != null) {
                    Class componentType = cls.getComponentType();
                    C7471uYa.a((Object) componentType, "componentType");
                    String str3 = "null cannot be cast to non-null type kotlin.Array<*>";
                    int i = 0;
                    if (componentType.isEnum()) {
                        C7280rnb b3 = Rvb.b(componentType);
                        if (obj != null) {
                            Object[] objArr = (Object[]) obj;
                            int length = objArr.length;
                            while (i < length) {
                                Object obj2 = objArr[i];
                                if (obj2 != null) {
                                    C7694xnb b4 = C7694xnb.b(((Enum) obj2).name());
                                    C7471uYa.a((Object) b4, "Name.identifier((element as Enum<*>).name)");
                                    a3.a(b3, b4);
                                    i++;
                                } else {
                                    throw new OVa(str2);
                                }
                            }
                        } else {
                            throw new OVa(str3);
                        }
                    } else if (C7471uYa.a((Object) componentType, (Object) Class.class)) {
                        if (obj != null) {
                            Object[] objArr2 = (Object[]) obj;
                            int length2 = objArr2.length;
                            while (i < length2) {
                                Object obj3 = objArr2[i];
                                if (obj3 != null) {
                                    a3.a(a((Class) obj3));
                                    i++;
                                } else {
                                    throw new OVa(str);
                                }
                            }
                        } else {
                            throw new OVa(str3);
                        }
                    } else if (obj != null) {
                        Object[] objArr3 = (Object[]) obj;
                        int length3 = objArr3.length;
                        while (i < length3) {
                            a3.a(objArr3[i]);
                            i++;
                        }
                    } else {
                        throw new OVa(str3);
                    }
                    a3.a();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported annotation argument value (");
                sb.append(cls);
                sb.append("): ");
                sb.append(obj);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }
}

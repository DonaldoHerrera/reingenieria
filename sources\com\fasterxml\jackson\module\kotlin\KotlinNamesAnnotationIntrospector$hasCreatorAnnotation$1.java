package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@EVa(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "invoke"}, mv = {1, 1, 9})
/* compiled from: KotlinModule.kt */
final class KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$1 extends C7540vYa implements _Xa<AnnotatedConstructor, Boolean> {
    final /* synthetic */ Annotated $member;
    final /* synthetic */ KotlinNamesAnnotationIntrospector this$0;

    KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$1(KotlinNamesAnnotationIntrospector kotlinNamesAnnotationIntrospector, Annotated annotated) {
        this.this$0 = kotlinNamesAnnotationIntrospector;
        this.$member = annotated;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((AnnotatedConstructor) obj));
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x0153 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014e  */
    public final boolean invoke(AnnotatedConstructor annotatedConstructor) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        String str = "it";
        C7471uYa.b(annotatedConstructor, str);
        ReflectionCache cache = this.this$0.getCache();
        Class declaringClass = ((AnnotatedConstructor) this.$member).getDeclaringClass();
        if (declaringClass != null) {
            C7472uZa kotlinFromJava = cache.kotlinFromJava(declaringClass);
            ReflectionCache cache2 = this.this$0.getCache();
            Constructor annotated = ((AnnotatedConstructor) this.$member).getAnnotated();
            if (annotated != null) {
                C7679xZa kotlinFromJava2 = cache2.kotlinFromJava(annotated);
                if (kotlinFromJava2 != null) {
                    boolean z12 = C7471uYa.a((Object) NZa.f(kotlinFromJava), (Object) kotlinFromJava2) || (NZa.f(kotlinFromJava) == null && kotlinFromJava.i().size() == 1);
                    Collection i2 = kotlinFromJava.i();
                    if (!(i2 instanceof Collection) || !i2.isEmpty()) {
                        Iterator it = i2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            List annotations = ((C7679xZa) it.next()).getAnnotations();
                            if (!(annotations instanceof Collection) || !annotations.isEmpty()) {
                                Iterator it2 = annotations.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (C7471uYa.a((Object) MXa.a(MXa.a((Annotation) it2.next())), (Object) JsonCreator.class)) {
                                            z11 = true;
                                            continue;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            z11 = false;
                            continue;
                            if (z11) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    JavaType type = ((AnnotatedConstructor) this.$member).getType();
                    String str2 = "member.type";
                    C7471uYa.a((Object) type, str2);
                    Class rawClass = type.getRawClass();
                    String str3 = "member.type.rawClass";
                    C7471uYa.a((Object) rawClass, str3);
                    C7472uZa a = NZa.a(MXa.a(rawClass));
                    if (a != null) {
                        Collection b = NZa.b(a);
                        if (b != null && (!(b instanceof Collection) || !b.isEmpty())) {
                            Iterator it3 = b.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                C7679xZa xza = (C7679xZa) it3.next();
                                List annotations2 = xza.getAnnotations();
                                if (!(annotations2 instanceof Collection) || !annotations2.isEmpty()) {
                                    Iterator it4 = annotations2.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (C7471uYa.a((Object) MXa.a(MXa.a((Annotation) it4.next())), (Object) NXa.class)) {
                                                z8 = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    if (z8) {
                                        List annotations3 = xza.getAnnotations();
                                        if (!(annotations3 instanceof Collection) || !annotations3.isEmpty()) {
                                            Iterator it5 = annotations3.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (C7471uYa.a((Object) MXa.a(MXa.a((Annotation) it5.next())), (Object) JsonCreator.class)) {
                                                        z10 = true;
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            if (z10) {
                                                z9 = true;
                                                continue;
                                                if (z9) {
                                                    z2 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z10 = false;
                                        if (z10) {
                                        }
                                    }
                                    z9 = false;
                                    continue;
                                    if (z9) {
                                    }
                                }
                                z8 = false;
                                if (z8) {
                                }
                                z9 = false;
                                continue;
                                if (z9) {
                                }
                            }
                        }
                    }
                    z2 = false;
                    JavaType type2 = ((AnnotatedConstructor) this.$member).getType();
                    C7471uYa.a((Object) type2, str2);
                    Class rawClass2 = type2.getRawClass();
                    C7471uYa.a((Object) rawClass2, str3);
                    Method[] declaredMethods = rawClass2.getDeclaredMethods();
                    C7471uYa.a((Object) declaredMethods, "member.type.rawClass.declaredMethods");
                    int length = declaredMethods.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            z3 = false;
                            break;
                        }
                        Method method = declaredMethods[i3];
                        C7471uYa.a((Object) method, str);
                        boolean isStatic = Modifier.isStatic(method.getModifiers());
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        C7471uYa.a((Object) declaredAnnotations, "it.declaredAnnotations");
                        int length2 = declaredAnnotations.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                z7 = false;
                                break;
                            } else if (C7471uYa.a((Object) MXa.a(MXa.a(declaredAnnotations[i4])), (Object) JsonCreator.class)) {
                                z7 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (isStatic && z7) {
                            z3 = true;
                            break;
                        }
                        i3++;
                    }
                    int size = kotlinFromJava2.getParameters().size();
                    List<CZa> parameters = kotlinFromJava2.getParameters();
                    if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                        i = 0;
                        for (CZa name : parameters) {
                            if (name.getName() != null) {
                                i++;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    boolean z13 = size == i;
                    if (kotlinFromJava2.getParameters().size() == 1 && C7471uYa.a((Object) ((CZa) kotlinFromJava2.getParameters().get(0)).getType(), (Object) QZa.a(HYa.a(String.class), null, false, null, 7, null))) {
                        Collection c = NZa.c(kotlinFromJava);
                        if (!(c instanceof Collection) || !c.isEmpty()) {
                            Iterator it6 = c.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    z5 = true;
                                    break;
                                }
                                FZa fZa = (FZa) it6.next();
                                if (!C7471uYa.a((Object) fZa.getName(), (Object) ((CZa) kotlinFromJava2.getParameters().get(0)).getName()) || !C7471uYa.a((Object) fZa.a(), (Object) ((CZa) kotlinFromJava2.getParameters().get(0)).getType())) {
                                    z6 = false;
                                    continue;
                                } else {
                                    z6 = true;
                                    continue;
                                }
                                if (z6) {
                                    z5 = false;
                                    break;
                                }
                            }
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            z4 = true;
                            if (z12 && !z && !z2 && !z3 && z13 && !z4) {
                                return true;
                            }
                        }
                    }
                    z4 = false;
                    return true;
                }
                return false;
            }
            throw new OVa("null cannot be cast to non-null type java.lang.reflect.Constructor<kotlin.Any>");
        }
        throw new OVa("null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
    }
}

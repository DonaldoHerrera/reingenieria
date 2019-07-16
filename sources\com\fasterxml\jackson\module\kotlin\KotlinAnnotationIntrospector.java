package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.Module.SetupContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;

@EVa(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b*\u00020\rH\u0002J\u001e\u0010\u000e\u001a\u0014\u0012\u0006\b\u0001\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000f*\u00020\rH\u0002J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\rH\u0002¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0013H\u0002¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0016H\u0002J\u0018\u0010\u0017\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\f\u0010\u001a\u001a\u00020\u0006*\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;", "context", "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "(Lcom/fasterxml/jackson/databind/Module$SetupContext;)V", "hasRequiredMarker", "", "m", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Boolean;", "getCorrespondingGetter", "Lkotlin/reflect/KProperty1;", "", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "getCorrespondingSetter", "Lkotlin/reflect/KMutableProperty1$Setter;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;)Ljava/lang/Boolean;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;)Ljava/lang/Boolean;", "isGetterLike", "Lkotlin/reflect/KFunction;", "isParameterRequired", "index", "", "isRequired", "Lkotlin/reflect/KType;", "isSetterLike", "jackson-module-kotlin"}, mv = {1, 1, 9})
/* compiled from: KotlinAnnotationIntrospector.kt */
public final class KotlinAnnotationIntrospector extends NopAnnotationIntrospector {
    private final SetupContext context;

    public KotlinAnnotationIntrospector(SetupContext setupContext) {
        C7471uYa.b(setupContext, "context");
        this.context = setupContext;
    }

    private final FZa<? extends Object, Object> getCorrespondingGetter(AnnotatedMethod annotatedMethod) {
        Object obj;
        Method member = annotatedMethod.getMember();
        C7471uYa.a((Object) member, "member");
        Class declaringClass = member.getDeclaringClass();
        C7471uYa.a((Object) declaringClass, "member.declaringClass");
        Iterator it = NZa.c(MXa.a(declaringClass)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7471uYa.a((Object) UZa.b((C7679xZa<?>) ((FZa) obj).b()), (Object) annotatedMethod.getMember())) {
                break;
            }
        }
        return (FZa) obj;
    }

    private final a<? extends Object, Object> getCorrespondingSetter(AnnotatedMethod annotatedMethod) {
        Object obj;
        boolean z;
        Method member = annotatedMethod.getMember();
        C7471uYa.a((Object) member, "member");
        Class declaringClass = member.getDeclaringClass();
        C7471uYa.a((Object) declaringClass, "member.declaringClass");
        Iterator it = NZa.c(MXa.a(declaringClass)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            FZa fZa = (FZa) obj;
            if (fZa instanceof AZa) {
                z = C7471uYa.a((Object) UZa.a((C7748yZa) fZa), (Object) annotatedMethod.getMember());
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        FZa fZa2 = (FZa) obj;
        if (!(fZa2 instanceof AZa)) {
            fZa2 = null;
        }
        AZa aZa = (AZa) fZa2;
        if (aZa != null) {
            return aZa.c();
        }
        return null;
    }

    private final boolean isGetterLike(C7679xZa<?> xza) {
        return xza.getParameters().size() == 1;
    }

    private final boolean isParameterRequired(C7679xZa<?> xza, int i) {
        CZa cZa = (CZa) xza.getParameters().get(i);
        HZa type = cZa.getType();
        Type a = UZa.a(type);
        boolean isPrimitive = a instanceof Class ? ((Class) a).isPrimitive() : false;
        if (type.f() || cZa.h()) {
            return false;
        }
        if (!isPrimitive || this.context.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            return true;
        }
        return false;
    }

    private final boolean isRequired(HZa hZa) {
        return !hZa.f();
    }

    private final boolean isSetterLike(C7679xZa<?> xza) {
        return xza.getParameters().size() == 2 && C7471uYa.a((Object) xza.a(), (Object) QZa.a(HYa.a(RVa.class), null, false, null, 7, null));
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean hasRequiredMarker;
        C7471uYa.b(annotatedMember, "m");
        Member member = annotatedMember.getMember();
        C7471uYa.a((Object) member, "m.member");
        Class declaringClass = member.getDeclaringClass();
        C7471uYa.a((Object) declaringClass, "m.member.declaringClass");
        if (!KotlinModuleKt.isKotlinClass(declaringClass)) {
            return null;
        }
        if (annotatedMember instanceof AnnotatedField) {
            hasRequiredMarker = hasRequiredMarker((AnnotatedField) annotatedMember);
        } else if (annotatedMember instanceof AnnotatedMethod) {
            hasRequiredMarker = hasRequiredMarker((AnnotatedMethod) annotatedMember);
        } else if (!(annotatedMember instanceof AnnotatedParameter)) {
            return null;
        } else {
            hasRequiredMarker = hasRequiredMarker((AnnotatedParameter) annotatedMember);
        }
        return hasRequiredMarker;
    }

    private final Boolean hasRequiredMarker(AnnotatedField annotatedField) {
        Member member = annotatedField.getMember();
        if (member != null) {
            DZa a = UZa.a((Field) member);
            if (a != null) {
                HZa a2 = a.a();
                if (a2 != null) {
                    return Boolean.valueOf(isRequired(a2));
                }
            }
            return null;
        }
        throw new OVa("null cannot be cast to non-null type java.lang.reflect.Field");
    }

    private final Boolean hasRequiredMarker(AnnotatedMethod annotatedMethod) {
        FZa correspondingGetter = getCorrespondingGetter(annotatedMethod);
        if (correspondingGetter != null) {
            return Boolean.valueOf(isRequired(correspondingGetter.a()));
        }
        a correspondingSetter = getCorrespondingSetter(annotatedMethod);
        if (correspondingSetter != null) {
            return Boolean.valueOf(isParameterRequired(correspondingSetter, 1));
        }
        Method member = annotatedMethod.getMember();
        C7471uYa.a((Object) member, "this.member");
        C7679xZa a = UZa.a(member);
        if (a != null) {
            if (isGetterLike(a)) {
                return Boolean.valueOf(isRequired(a.a()));
            }
            if (isSetterLike(a)) {
                return Boolean.valueOf(isParameterRequired(a, 1));
            }
        }
        return null;
    }

    private final Boolean hasRequiredMarker(AnnotatedParameter annotatedParameter) {
        Boolean valueOf;
        Member member = annotatedParameter.getMember();
        if (member instanceof Constructor) {
            C7679xZa a = UZa.a((Constructor) member);
            if (a == null) {
                return null;
            }
            valueOf = Boolean.valueOf(isParameterRequired(a, annotatedParameter.getIndex()));
        } else if (!(member instanceof Method)) {
            return null;
        } else {
            C7679xZa a2 = UZa.a((Method) member);
            if (a2 == null) {
                return null;
            }
            valueOf = Boolean.valueOf(isParameterRequired(a2, annotatedParameter.getIndex()));
        }
        return valueOf;
    }
}

package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: owb reason: default package and case insensitive filesystem */
/* compiled from: ReflectJavaMember.kt */
public abstract class C7091owb extends C6817kwb implements Tib, Vvb, C7229qwb {
    public AnnotatedElement E() {
        Member I = I();
        if (I != null) {
            return (AnnotatedElement) I;
        }
        throw new OVa("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    }

    public abstract Member I();

    public boolean c() {
        return a.b(this);
    }

    public C5583aeb d() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C7091owb) && C7471uYa.a((Object) I(), (Object) ((C7091owb) obj).I());
    }

    public boolean g() {
        return a.b(this);
    }

    public int getModifiers() {
        return I().getModifiers();
    }

    public C7694xnb getName() {
        String name = I().getName();
        if (name != null) {
            C7694xnb b = C7694xnb.b(name);
            if (b != null) {
                return b;
            }
        }
        C7694xnb xnb = C7832znb.a;
        C7471uYa.a((Object) xnb, "SpecialNames.NO_NAME_PROVIDED");
        return xnb;
    }

    public boolean h() {
        return a.c(this);
    }

    public int hashCode() {
        return I().hashCode();
    }

    public boolean k() {
        return a.d(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(I());
        return sb.toString();
    }

    public Svb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return a.a(this, snb);
    }

    public List<Svb> getAnnotations() {
        return a.a(this);
    }

    public C6545gwb j() {
        Class declaringClass = I().getDeclaringClass();
        C7471uYa.a((Object) declaringClass, "member.declaringClass");
        return new C6545gwb(declaringClass);
    }

    /* access modifiers changed from: protected */
    public final List<C5656bjb> a(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        String str;
        C7471uYa.b(typeArr, "parameterTypes");
        C7471uYa.b(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List b = Ovb.b.b(I());
        int size = b != null ? b.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            C7436twb a = C7436twb.a.a(typeArr[i]);
            if (b != null) {
                str = (String) C7676xWa.d(b, i + size);
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No parameter with index ");
                    sb.append(i);
                    sb.append('+');
                    sb.append(size);
                    sb.append(" (name=");
                    sb.append(getName());
                    sb.append(" type=");
                    sb.append(a);
                    sb.append(") in ");
                    sb.append(b);
                    sb.append("@ReflectJavaMember");
                    throw new IllegalStateException(sb.toString().toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new C7574vwb(a, annotationArr[i], str, z && i == C6578hWa.g(typeArr)));
            i++;
        }
        return arrayList;
    }
}

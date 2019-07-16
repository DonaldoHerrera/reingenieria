package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationOwner;", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "isDeprecatedInJavaDoc", "", "()Z", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"}, mv = {1, 1, 15})
/* renamed from: Vvb reason: default package */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public interface Vvb extends Hib {

    /* renamed from: Vvb$a */
    /* compiled from: ReflectJavaAnnotationOwner.kt */
    public static final class a {
        public static List<Svb> a(Vvb vvb) {
            AnnotatedElement E = vvb.E();
            if (E != null) {
                Annotation[] declaredAnnotations = E.getDeclaredAnnotations();
                if (declaredAnnotations != null) {
                    List<Svb> a = Wvb.a(declaredAnnotations);
                    if (a != null) {
                        return a;
                    }
                }
            }
            return C6918mWa.a();
        }

        public static boolean b(Vvb vvb) {
            return false;
        }

        public static Svb a(Vvb vvb, C7349snb snb) {
            C7471uYa.b(snb, "fqName");
            AnnotatedElement E = vvb.E();
            if (E != null) {
                Annotation[] declaredAnnotations = E.getDeclaredAnnotations();
                if (declaredAnnotations != null) {
                    return Wvb.a(declaredAnnotations, snb);
                }
            }
            return null;
        }
    }

    AnnotatedElement E();
}

package defpackage;

import java.lang.annotation.Annotation;

@EVa(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "Factory", "descriptors.runtime"}, mv = {1, 1, 15})
/* renamed from: Tvb reason: default package */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public abstract class Tvb implements Fib {
    public static final a a = new a(null);
    private final C7694xnb b;

    /* renamed from: Tvb$a */
    /* compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class a {
        private a() {
        }

        public final Tvb a(Object obj, C7694xnb xnb) {
            C7471uYa.b(obj, "value");
            if (Rvb.g(obj.getClass())) {
                return new C6885lwb(xnb, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new Uvb(xnb, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new Xvb(xnb, (Object[]) obj);
            }
            if (obj instanceof Class) {
                return new C6613hwb(xnb, (Class) obj);
            }
            return new C7022nwb(xnb, obj);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Tvb(C7694xnb xnb) {
        this.b = xnb;
    }

    public C7694xnb getName() {
        return this.b;
    }
}

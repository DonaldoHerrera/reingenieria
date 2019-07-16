package defpackage;

import java.lang.annotation.Annotation;

/* renamed from: Uvb reason: default package */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class Uvb extends Tvb implements Gib {
    private final Annotation c;

    public Uvb(C7694xnb xnb, Annotation annotation) {
        C7471uYa.b(annotation, "annotation");
        super(xnb);
        this.c = annotation;
    }

    public Eib a() {
        return new Svb(this.c);
    }
}

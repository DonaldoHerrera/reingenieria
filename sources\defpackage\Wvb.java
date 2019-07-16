package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Wvb reason: default package */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public final class Wvb {
    public static final List<Svb> a(Annotation[] annotationArr) {
        C7471uYa.b(annotationArr, "$this$getAnnotations");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation svb : annotationArr) {
            arrayList.add(new Svb(svb));
        }
        return arrayList;
    }

    public static final Svb a(Annotation[] annotationArr, C7349snb snb) {
        Annotation annotation;
        C7471uYa.b(annotationArr, "$this$findAnnotation");
        C7471uYa.b(snb, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (C7471uYa.a((Object) Rvb.b(MXa.a(MXa.a(annotation))).a(), (Object) snb)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new Svb(annotation);
        }
        return null;
    }
}

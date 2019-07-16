package defpackage;

import java.lang.annotation.Annotation;

/* renamed from: ubb reason: default package and case insensitive filesystem */
/* compiled from: ReflectAnnotationSource.kt */
public final class C7475ubb implements C7822zdb {
    private final Annotation a;

    public C7475ubb(Annotation annotation) {
        C7471uYa.b(annotation, "annotation");
        this.a = annotation;
    }

    public C4781Bdb a() {
        C4781Bdb bdb = C4781Bdb.a;
        C7471uYa.a((Object) bdb, "SourceFile.NO_SOURCE_FILE");
        return bdb;
    }

    public final Annotation d() {
        return this.a;
    }
}

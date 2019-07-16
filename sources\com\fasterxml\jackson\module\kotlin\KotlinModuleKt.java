package com.fasterxml.jackson.module.kotlin;

import java.lang.annotation.Annotation;

@EVa(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"metadataFqName", "", "isKotlinClass", "", "Ljava/lang/Class;", "jackson-module-kotlin"}, mv = {1, 1, 9})
/* compiled from: KotlinModule.kt */
public final class KotlinModuleKt {
    private static final String metadataFqName = "kotlin.Metadata";

    public static final boolean isKotlinClass(Class<?> cls) {
        C7471uYa.b(cls, "$receiver");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        C7471uYa.a((Object) declaredAnnotations, "this.declaredAnnotations");
        int length = declaredAnnotations.length;
        Annotation annotation = null;
        Annotation annotation2 = null;
        int i = 0;
        boolean z = false;
        while (true) {
            if (i < length) {
                Annotation annotation3 = declaredAnnotations[i];
                if (C7471uYa.a((Object) MXa.a(MXa.a(annotation3)).getName(), (Object) metadataFqName)) {
                    if (z) {
                        break;
                    }
                    annotation2 = annotation3;
                    z = true;
                }
                i++;
            } else if (z) {
                annotation = annotation2;
            }
        }
        if (annotation != null) {
            return true;
        }
        return false;
    }
}

package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: xt reason: default package and case insensitive filesystem */
public @interface C1855xt {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: xt$a */
    public @interface a {
        String zzbo();

        Class<?> zzbp();
    }

    a[] zzbn();
}

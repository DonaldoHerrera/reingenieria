package defpackage;

import android.content.Context;
import com.appboy.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: wQ reason: default package and case insensitive filesystem */
/* compiled from: AppBoyModule */
public class C3339wQ {

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: wQ$a */
    /* compiled from: AppBoyModule */
    public @interface a {
    }

    public C1956BQ a(Context context, @a String str) {
        defpackage.Af.a aVar = new defpackage.Af.a();
        aVar.a(str);
        h.a(context, aVar.a());
        return new C1996DQ(h.a(context));
    }
}

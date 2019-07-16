package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: EQ reason: default package and case insensitive filesystem */
/* compiled from: AppFeaturesModule */
public class C2016EQ {

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: EQ$a */
    /* compiled from: AppFeaturesModule */
    public @interface a {
    }

    @a
    static SharedPreferences a(Context context) {
        return context.getSharedPreferences("AppFeaturesPrefs", 0);
    }

    /* access modifiers changed from: protected */
    public com.soundcloud.android.properties.a a(C2114JQ jq) {
        return jq;
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

/* renamed from: dk reason: default package and case insensitive filesystem */
/* compiled from: AppEventsLogger */
public class C1237dk {
    private C1329gk a;

    /* renamed from: dk$a */
    /* compiled from: AppEventsLogger */
    public enum a {
        AUTO,
        EXPLICIT_ONLY
    }

    private C1237dk(Context context, String str, AccessToken accessToken) {
        this.a = new C1329gk(context, str, accessToken);
    }

    public static void a(Application application, String str) {
        C1329gk.a(application, str);
    }

    public static C1237dk b(Context context) {
        return new C1237dk(context, null, null);
    }

    public static String c() {
        return C1576ok.a();
    }

    public static String d() {
        return Sj.b();
    }

    public static void e() {
        C1329gk.g();
    }

    public static void a(Context context, String str) {
        C1329gk.a(context, str);
    }

    public static a b() {
        return C1329gk.d();
    }

    public void a(String str, Bundle bundle) {
        this.a.a(str, bundle);
    }

    public void a() {
        this.a.b();
    }

    public static String a(Context context) {
        return C1329gk.a(context);
    }

    public static void a(String str) {
        C1329gk.a(str);
    }
}

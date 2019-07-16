package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import com.soundcloud.android.activities.C2542g;
import com.soundcloud.android.collection.playhistory.C2794w;
import com.soundcloud.android.collection.recentlyplayed.C2828q;
import com.soundcloud.android.likes.C3973c;
import com.soundcloud.android.offline.C4082ee;
import com.soundcloud.android.offline.Ic;
import com.soundcloud.android.profile.C5854u;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.stations.Xb;
import com.soundcloud.android.stream.C;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: zya reason: default package and case insensitive filesystem */
/* compiled from: StorageModule */
public abstract class C7853zya {

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: zya$a */
    /* compiled from: StorageModule */
    public @interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: zya$b */
    /* compiled from: StorageModule */
    public @interface b {
    }

    static SharedPreferences A(Context context) {
        return context.getSharedPreferences("policy_settings", 0);
    }

    public static SharedPreferences B(Context context) {
        return context.getSharedPreferences("privacy_settings", 0);
    }

    static SharedPreferences C(Context context) {
        return context.getSharedPreferences("discovery_promoted_impressions", 0);
    }

    static SharedPreferences D(Context context) {
        return context.getSharedPreferences("RecommendationsSync", 0);
    }

    public static SharedPreferences E(Context context) {
        return context.getSharedPreferences("reported_comments", 0);
    }

    @b
    static File F(Context context) {
        return C6630iGa.a(context, "flipper");
    }

    static SharedPreferences G(Context context) {
        return context.getSharedPreferences("upsell", 0);
    }

    static SharedPreferences H(Context context) {
        return context.getSharedPreferences("StreamSync", 0);
    }

    static SharedPreferences I(Context context) {
        return context.getSharedPreferences("syncer", 0);
    }

    static C7321sMa<C5325TJa> a(Context context, C5354UJa uJa) {
        String str = "waveform";
        C7114pMa pma = new C7114pMa(str, 1);
        pma.a(524288, uJa);
        pma.b();
        File a2 = C6630iGa.a(context, str);
        if (a2 != null) {
            pma.a(2097152, a2, uJa);
        } else {
            pma.c();
        }
        return pma.a();
    }

    static SharedPreferences b(Context context) {
        return context.getSharedPreferences("ActivitiesSync", 0);
    }

    static SharedPreferences c(Context context) {
        return context.getSharedPreferences("ads", 0);
    }

    static SharedPreferences d(Context context) {
        return context.getSharedPreferences("alpha_reminder", 0);
    }

    static SharedPreferences e(Context context) {
        return context.getSharedPreferences("analytics_settings", 0);
    }

    static SharedPreferences f(Context context) {
        return context.getSharedPreferences("bottom_nav_state", 0);
    }

    static SharedPreferences g(Context context) {
        return context.getSharedPreferences("ChartsSync", 0);
    }

    static SharedPreferences h(Context context) {
        return context.getSharedPreferences("collections", 0);
    }

    static SharedPreferences i(Context context) {
        return context.getSharedPreferences("device_config_settings", 0);
    }

    static SharedPreferences j(Context context) {
        return context.getSharedPreferences("default_home_screen_state", 0);
    }

    @a
    static SharedPreferences k(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    static SharedPreferences l(Context context) {
        return context.getSharedPreferences("device_management", 0);
    }

    static SharedPreferences m(Context context) {
        return context.getSharedPreferences("entity_sync_state", 0);
    }

    static SharedPreferences n(Context context) {
        return context.getSharedPreferences("gcm", 0);
    }

    static SharedPreferences o(Context context) {
        return context.getSharedPreferences("in_app_updates_settings", 0);
    }

    static SharedPreferences p(Context context) {
        return context.getSharedPreferences("intro_overlays", 0);
    }

    @C3324vV
    static SharedPreferences q(Context context) {
        return context.getSharedPreferences("device_keys", 0);
    }

    static SharedPreferences r(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    static SharedPreferences s(Context context) {
        return context.getSharedPreferences("navigation_state", 0);
    }

    static SharedPreferences t(Context context) {
        return context.getSharedPreferences("nightmode_config", 0);
    }

    static SharedPreferences u(Context context) {
        return context.getSharedPreferences("notification_preferences", 0);
    }

    static SharedPreferences v(Context context) {
        return context.getSharedPreferences("offline_content", 0);
    }

    @C4082ee
    static SharedPreferences w(Context context) {
        return context.getSharedPreferences("offline_settings", 0);
    }

    static SharedPreferences x(Context context) {
        return context.getSharedPreferences("payments", 0);
    }

    static SharedPreferences y(Context context) {
        return context.getSharedPreferences("play_session_state", 0);
    }

    static SharedPreferences z(Context context) {
        return context.getSharedPreferences("player", 0);
    }

    static Tea b(Context context, C3469VY vy, j jVar) {
        return Tea.a(context, vy, jVar.a());
    }

    static C5500ZKa b(SQLiteDatabase sQLiteDatabase) {
        C5500ZKa zKa = new C5500ZKa(sQLiteDatabase);
        zKa.a();
        return zKa;
    }

    static ContentResolver a(Application application) {
        return application.getContentResolver();
    }

    static SharedPreferences a(Context context, C2041FV fv) {
        return new C5112MHa(context.getSharedPreferences("features_settings", 0), fv);
    }

    static SQLiteDatabase a(Context context, C3469VY vy, j jVar) {
        return b(context, vy, jVar).getWritableDatabase();
    }

    static C4898FLa a(SQLiteDatabase sQLiteDatabase) {
        C5500ZKa zKa = new C5500ZKa(sQLiteDatabase);
        zKa.a();
        return new C4898FLa(zKa);
    }

    static C5612aya a(C3973c cVar, C2542g gVar, C5854u uVar, C3845pba pba, Ic ic, C3507cca cca, Xb xb, C c, C2828q qVar, C2794w wVar, C6826lBa lba) {
        return new C5612aya(C2063HD.a((E[]) new Xda[]{cVar, gVar, uVar, pba, ic, cca, xb, c, qVar, wVar, lba}));
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences("unauthorized_errors", 0);
    }
}

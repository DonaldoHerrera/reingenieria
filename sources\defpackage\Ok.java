package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.b;
import com.facebook.internal.C0542c;
import com.facebook.internal.ia;
import com.soundcloud.flippernative.BuildConfig;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: Ok reason: default package */
/* compiled from: ActivityLifecycleTracker */
class Ok implements Runnable {
    final /* synthetic */ String a;

    Ok(String str) {
        this.a = str;
    }

    public void run() {
        boolean z = true;
        GraphRequest a2 = GraphRequest.a((AccessToken) null, String.format(Locale.US, "%s/app_indexing_session", new Object[]{this.a}), (JSONObject) null, (b) null);
        Bundle i = a2.i();
        if (i == null) {
            i = new Bundle();
        }
        C0542c a3 = C0542c.a(B.e());
        JSONArray jSONArray = new JSONArray();
        String str = Build.MODEL;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        jSONArray.put(str);
        if (a3 == null || a3.a() == null) {
            jSONArray.put(str2);
        } else {
            jSONArray.put(a3.a());
        }
        String str3 = BuildConfig.VERSION_NAME;
        jSONArray.put(str3);
        if (Qk.d()) {
            str3 = "1";
        }
        jSONArray.put(str3);
        Locale a4 = ia.a();
        StringBuilder sb = new StringBuilder();
        sb.append(a4.getLanguage());
        sb.append("_");
        sb.append(a4.getCountry());
        jSONArray.put(sb.toString());
        String jSONArray2 = jSONArray.toString();
        i.putString("device_session_id", Pk.m());
        i.putString("extinfo", jSONArray2);
        a2.a(i);
        if (a2 != null) {
            JSONObject b = a2.b().b();
            if (b == null || !b.optBoolean("is_app_indexing_enabled", false)) {
                z = false;
            }
            Pk.o = Boolean.valueOf(z);
            if (!Pk.o.booleanValue()) {
                Pk.n = null;
            } else {
                Pk.m.b();
            }
        }
        Pk.p = Boolean.valueOf(false);
    }
}

package com.krux.androidsdk.aggregator;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import java.util.Locale;

public class o extends c {
    private Context b;
    private String c;
    private Bundle d;
    private Bundle e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private String j;

    public o(Context context, Intent intent) {
        super(context);
        this.b = context;
        this.c = intent.getExtras().getString("page_url");
        this.d = intent.getExtras().getBundle("page_attributes_bundle");
        this.e = intent.getExtras().getBundle("user_attributes_bundle");
        this.f = intent.getExtras().getString("advertising_id");
        this.g = intent.getExtras().getString("site");
        this.h = intent.getExtras().getString("pixel");
        this.i = intent.getExtras().getBoolean("is_location_service");
        this.j = intent.getExtras().getString("publisher_uuid");
    }

    private static void a(Bundle bundle, Bundle bundle2, String str) {
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String valueOf = String.valueOf(bundle.get(str2));
                if (!str2.startsWith("_k")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    str2 = sb.toString();
                }
                bundle2.putString(str2, valueOf);
            }
        }
    }

    public final String a() {
        Bundle bundle = new Bundle();
        a(this.d, bundle, "_kpa_");
        a(this.e, bundle, "_kua_");
        bundle.putString("_kcp_d", "android_mobile_sdk");
        bundle.putString("_kcp_s", this.g);
        bundle.putString("_kcp_sc", this.c);
        C2973eI eIVar = new C2973eI(this.b, this.i);
        if (eIVar.d != null) {
            bundle.putString(Constants.LONG, eIVar.b);
            bundle.putString("lat", eIVar.c);
        }
        bundle.putString("tech_browser", "android_app");
        bundle.putString("tech_browser_lang", Locale.getDefault().getLanguage());
        bundle.putString("tech_device", Build.MODEL);
        bundle.putString("tech_manufacturer", Build.MANUFACTURER);
        StringBuilder sb = new StringBuilder("Android_");
        sb.append(Integer.toString(VERSION.SDK_INT));
        bundle.putString("tech_os", sb.toString());
        String str = this.h;
        bundle.putString("_kpid", this.j);
        bundle.putString("_kuid", this.f);
        return C2481cI.a(str, bundle);
    }
}

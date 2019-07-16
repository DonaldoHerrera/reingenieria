package com.soundcloud.android;

import android.content.res.Resources;

/* compiled from: RealAppConfiguration.kt */
public final class ja implements C7181qKa {
    private final Resources a;

    public ja(Resources resources) {
        C7471uYa.b(resources, "resources");
        this.a = resources;
    }

    public boolean a() {
        return this.a.getBoolean(R.bool.fail_fast_on_mapping_exceptions);
    }

    public int b() {
        return 1385;
    }

    public String c() {
        String string = this.a.getString(R.string.web_payment_form_stage);
        C7471uYa.a((Object) string, "resources.getString(R.st…g.web_payment_form_stage)");
        return string;
    }

    public String d() {
        return "3.3.2";
    }

    public String e() {
        String string = this.a.getString(R.string.gcm_defaultSenderId);
        C7471uYa.a((Object) string, "resources.getString(R.string.gcm_defaultSenderId)");
        return string;
    }

    public String f() {
        String string = this.a.getString(R.string.git_sha);
        C7471uYa.a((Object) string, "resources.getString(R.string.git_sha)");
        return string;
    }

    public String g() {
        return "2019.07.08-release";
    }

    public String h() {
        return "2.10.1";
    }

    public boolean i() {
        return this.a.getBoolean(R.bool.google_plus_enabled);
    }

    public boolean j() {
        return this.a.getBoolean(R.bool.register_for_gcm);
    }

    public boolean k() {
        return this.a.getBoolean(R.bool.enforce_concurrent_streaming_limitation);
    }

    public boolean l() {
        return this.a.getBoolean(R.bool.is_tablet);
    }

    public String m() {
        String string = this.a.getString(R.string.build_type);
        C7471uYa.a((Object) string, "resources.getString(R.string.build_type)");
        return string;
    }

    public String n() {
        String string = this.a.getString(R.string.web_payment_form_environment);
        C7471uYa.a((Object) string, "resources.getString(R.st…payment_form_environment)");
        return string;
    }

    public boolean o() {
        return this.a.getBoolean(R.bool.analytics_enabled);
    }
}

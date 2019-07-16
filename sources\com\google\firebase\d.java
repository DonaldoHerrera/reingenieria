package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public final class d {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private d(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static d a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        d dVar = new d(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
        return dVar;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Objects.equal(this.b, dVar.b) && Objects.equal(this.a, dVar.a) && Objects.equal(this.c, dVar.c) && Objects.equal(this.d, dVar.d) && Objects.equal(this.e, dVar.e) && Objects.equal(this.f, dVar.f) && Objects.equal(this.g, dVar.g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }

    public String a() {
        return this.a;
    }
}

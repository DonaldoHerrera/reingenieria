package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Map;

@Class(creator = "RemoteMessageCreator")
@Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new j();
    @Field(id = 2)
    Bundle a;
    private Map<String, String> b;
    private a c;

    public static class a {
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;

        private a(Bundle bundle) {
            String str = "gcm.n.title";
            this.a = e.a(bundle, str);
            this.b = e.c(bundle, str);
            this.c = a(bundle, str);
            String str2 = "gcm.n.body";
            this.d = e.a(bundle, str2);
            this.e = e.c(bundle, str2);
            this.f = a(bundle, str2);
            this.g = e.a(bundle, "gcm.n.icon");
            this.i = e.c(bundle);
            this.j = e.a(bundle, "gcm.n.tag");
            this.k = e.a(bundle, "gcm.n.color");
            this.l = e.a(bundle, "gcm.n.click_action");
            this.m = e.a(bundle, "gcm.n.android_channel_id");
            this.n = e.d(bundle);
            this.h = e.a(bundle, "gcm.n.image");
        }

        private static String[] a(Bundle bundle, String str) {
            Object[] b2 = e.b(bundle, str);
            if (b2 == null) {
                return null;
            }
            String[] strArr = new String[b2.length];
            for (int i2 = 0; i2 < b2.length; i2++) {
                strArr[i2] = String.valueOf(b2[i2]);
            }
            return strArr;
        }

        public String b() {
            return this.a;
        }

        public String a() {
            return this.d;
        }
    }

    @Constructor
    public RemoteMessage(@Param(id = 2) Bundle bundle) {
        this.a = bundle;
    }

    public final String F() {
        return this.a.getString("from");
    }

    public final a G() {
        if (this.c == null && e.b(this.a)) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    public final long H() {
        Object obj = this.a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid sent time: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        return 0;
    }

    public final Map<String, String> i() {
        if (this.b == null) {
            Bundle bundle = this.a;
            T t = new T();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        t.put(str, str2);
                    }
                }
            }
            this.b = t;
        }
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

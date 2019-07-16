package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.cast.sa;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.j reason: case insensitive filesystem */
public class C0677j {
    private int a;
    private String b;
    private List<MediaMetadata> c;
    private List<WebImage> d;
    private double e;

    /* renamed from: com.google.android.gms.cast.j$a */
    public static class a {
        private final C0677j a = new C0677j();

        public C0677j a() {
            return new C0677j();
        }

        public final a a(JSONObject jSONObject) {
            this.a.a(jSONObject);
            return this;
        }
    }

    private C0677j() {
        b();
    }

    /* access modifiers changed from: private */
    public final void a(JSONObject jSONObject) {
        b();
        if (jSONObject != null) {
            String optString = jSONObject.optString("containerType", "");
            char c2 = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != 6924225) {
                if (hashCode == 828666841 && optString.equals("GENERIC_CONTAINER")) {
                    c2 = 0;
                }
            } else if (optString.equals("AUDIOBOOK_CONTAINER")) {
                c2 = 1;
            }
            if (c2 == 0) {
                this.a = 0;
            } else if (c2 == 1) {
                this.a = 1;
            }
            this.b = jSONObject.optString("title", null);
            JSONArray optJSONArray = jSONObject.optJSONArray("sections");
            if (optJSONArray != null) {
                this.c = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        MediaMetadata mediaMetadata = new MediaMetadata();
                        mediaMetadata.a(optJSONObject);
                        this.c.add(mediaMetadata);
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
            if (optJSONArray2 != null) {
                this.d = new ArrayList();
                sa.a(this.d, optJSONArray2);
            }
            this.e = jSONObject.optDouble("containerDuration", this.e);
        }
    }

    private final void b() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0677j)) {
            return false;
        }
        C0677j jVar = (C0677j) obj;
        return this.a == jVar.a && TextUtils.equals(this.b, jVar.b) && Objects.equal(this.c, jVar.c) && Objects.equal(this.d, jVar.d) && this.e == jVar.e;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e));
    }

    private C0677j(C0677j jVar) {
        this.a = jVar.a;
        this.b = jVar.b;
        this.c = jVar.c;
        this.d = jVar.d;
        this.e = jVar.e;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.a;
            String str = "containerType";
            if (i == 0) {
                jSONObject.put(str, "GENERIC_CONTAINER");
            } else if (i == 1) {
                jSONObject.put(str, "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("title", this.b);
            }
            if (this.c != null && !this.c.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (MediaMetadata json : this.c) {
                    jSONArray.put(json.toJson());
                }
                jSONObject.put("sections", jSONArray);
            }
            if (this.d != null && !this.d.isEmpty()) {
                JSONArray a2 = sa.a(this.d);
                if (a2 != null) {
                    jSONObject.put("containerImages", a2);
                }
            }
            jSONObject.put("containerDuration", this.e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}

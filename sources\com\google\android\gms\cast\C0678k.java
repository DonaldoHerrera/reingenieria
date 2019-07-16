package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.cast.C0724pa;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.k reason: case insensitive filesystem */
public class C0678k {
    private String a;
    private String b;
    private int c;
    private String d;
    private C0677j e;
    private int f;
    private List<MediaQueueItem> g;
    private int h;
    private long i;

    /* renamed from: com.google.android.gms.cast.k$a */
    public static class a {
        private final C0678k a = new C0678k();

        public C0678k a() {
            return new C0678k();
        }

        public final a a(JSONObject jSONObject) {
            this.a.a(jSONObject);
            return this;
        }
    }

    private C0678k() {
        b();
    }

    /* access modifiers changed from: private */
    public final void a(JSONObject jSONObject) {
        b();
        if (jSONObject != null) {
            this.a = jSONObject.optString("id", null);
            this.b = jSONObject.optString("entity", null);
            String optString = jSONObject.optString("queueType");
            char c2 = 65535;
            switch (optString.hashCode()) {
                case -1803151310:
                    if (optString.equals("PODCAST_SERIES")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1758903120:
                    if (optString.equals("RADIO_STATION")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1632865838:
                    if (optString.equals("PLAYLIST")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1319760993:
                    if (optString.equals("AUDIOBOOK")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1088524588:
                    if (optString.equals("TV_SERIES")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 62359119:
                    if (optString.equals("ALBUM")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 73549584:
                    if (optString.equals("MOVIE")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 393100598:
                    if (optString.equals("VIDEO_PLAYLIST")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 902303413:
                    if (optString.equals("LIVE_TV")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    this.c = 1;
                    break;
                case 1:
                    this.c = 2;
                    break;
                case 2:
                    this.c = 3;
                    break;
                case 3:
                    this.c = 4;
                    break;
                case 4:
                    this.c = 5;
                    break;
                case 5:
                    this.c = 6;
                    break;
                case 6:
                    this.c = 7;
                    break;
                case 7:
                    this.c = 8;
                    break;
                case 8:
                    this.c = 9;
                    break;
            }
            this.d = jSONObject.optString("name", null);
            String str = "containerMetadata";
            if (jSONObject.has(str)) {
                com.google.android.gms.cast.C0677j.a aVar = new com.google.android.gms.cast.C0677j.a();
                aVar.a(jSONObject.optJSONObject(str));
                this.e = aVar.a();
            }
            Integer a2 = C0724pa.a(jSONObject.optString("repeatMode"));
            if (a2 != null) {
                this.f = a2.intValue();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                this.g = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        try {
                            this.g.add(new MediaQueueItem(optJSONObject));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            this.h = jSONObject.optInt("startIndex", this.h);
            String str2 = "startTime";
            if (jSONObject.has(str2)) {
                this.i = (long) (jSONObject.optDouble(str2, (double) this.i) * 1000.0d);
            }
        }
    }

    private final void b() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0678k)) {
            return false;
        }
        C0678k kVar = (C0678k) obj;
        return TextUtils.equals(this.a, kVar.a) && TextUtils.equals(this.b, kVar.b) && this.c == kVar.c && TextUtils.equals(this.d, kVar.d) && Objects.equal(this.e, kVar.e) && this.f == kVar.f && Objects.equal(this.g, kVar.g) && this.h == kVar.h && this.i == kVar.i;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i));
    }

    private C0678k(C0678k kVar) {
        this.a = kVar.a;
        this.b = kVar.b;
        this.c = kVar.c;
        this.d = kVar.d;
        this.e = kVar.e;
        this.f = kVar.f;
        this.g = kVar.g;
        this.h = kVar.h;
        this.i = kVar.i;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.a)) {
                jSONObject.put("id", this.a);
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("entity", this.b);
            }
            String str = "queueType";
            switch (this.c) {
                case 1:
                    jSONObject.put(str, "ALBUM");
                    break;
                case 2:
                    jSONObject.put(str, "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put(str, "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put(str, "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put(str, "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put(str, "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put(str, "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put(str, "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put(str, "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("name", this.d);
            }
            if (this.e != null) {
                jSONObject.put("containerMetadata", this.e.a());
            }
            String a2 = C0724pa.a(Integer.valueOf(this.f));
            if (a2 != null) {
                jSONObject.put("repeatMode", a2);
            }
            if (this.g != null && !this.g.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (MediaQueueItem json : this.g) {
                    jSONArray.put(json.toJson());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.h);
            if (this.i != -1) {
                jSONObject.put("startTime", ((double) this.i) / 1000.0d);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}

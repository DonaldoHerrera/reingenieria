package com.google.android.gms.cast;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.cast.C0710ia;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.g reason: case insensitive filesystem */
public class C0674g {
    private static final C0710ia a = new C0710ia("MediaLiveSeekableRange");
    private final long b;
    private final long c;
    private final boolean d;
    private final boolean e;

    private C0674g(long j, long j2, boolean z, boolean z2) {
        this.b = Math.max(j, 0);
        this.c = Math.max(j2, 0);
        this.d = z;
        this.e = z2;
    }

    public long a() {
        return this.c;
    }

    public long b() {
        return this.b;
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0674g)) {
            return false;
        }
        C0674g gVar = (C0674g) obj;
        return this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.b), Long.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }

    static C0674g a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String str = "start";
        if (jSONObject.has(str)) {
            String str2 = "end";
            if (jSONObject.has(str2)) {
                try {
                    C0674g gVar = new C0674g((long) (jSONObject.getDouble(str) * 1000.0d), (long) (jSONObject.getDouble(str2) * 1000.0d), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
                    return gVar;
                } catch (JSONException unused) {
                    C0710ia iaVar = a;
                    String valueOf = String.valueOf(jSONObject);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                    sb.append("Ignoring Malformed MediaLiveSeekableRange: ");
                    sb.append(valueOf);
                    iaVar.b(sb.toString(), new Object[0]);
                }
            }
        }
        return null;
    }
}

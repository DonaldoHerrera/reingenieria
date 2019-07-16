package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jfa reason: default package */
/* compiled from: ApiResponse */
public class jfa {
    private static final C7233qyb a = C7233qyb.b("application/json");
    private final int b;
    private final C7233qyb c;
    private final byte[] d;
    private ifa e;

    public jfa(hfa hfa, int i, C7233qyb qyb, byte[] bArr) {
        this.b = i;
        this.c = qyb;
        this.d = bArr;
        a(hfa, i);
    }

    private void a(hfa hfa, int i) {
        if (i == 429) {
            this.e = ifa.b(hfa, this, i());
        } else if (i == 428) {
            this.e = ifa.d(hfa, this);
        } else if (i == 404) {
            this.e = ifa.c(hfa, this);
        } else if (i == 401) {
            this.e = ifa.a(hfa, this);
        } else if (i == 403) {
            this.e = ifa.b(hfa, this);
        } else if (i == 400) {
            this.e = ifa.a(hfa, this, i());
        } else if (i == 422) {
            this.e = ifa.a(hfa, this, i(), h());
        } else if (i >= 500) {
            this.e = ifa.e(hfa, this);
        } else if (!a(i)) {
            this.e = ifa.f(hfa, this);
        }
    }

    private boolean a(int i) {
        return i >= 200 && i < 400;
    }

    private int h() {
        if (j()) {
            return a(b());
        }
        return -1;
    }

    private String i() {
        return j() ? b(b()) : "unknown";
    }

    private boolean j() {
        C7233qyb qyb = this.c;
        return qyb != null && qyb.b().contains(a.b());
    }

    public String b() {
        return new String(this.d, C5053KKa.c);
    }

    public byte[] c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public boolean e() {
        return this.d.length > 0;
    }

    public boolean f() {
        return this.e != null;
    }

    public boolean g() {
        return this.e == null;
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("statusCode", this.b).a("failure", (Object) this.e).toString();
    }

    private String b(String str) {
        String str2 = "errors";
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(str2)) {
                return jSONObject.getJSONArray(str2).getJSONObject(0).getString("error_message");
            }
            return jSONObject.getString("error_key");
        } catch (JSONException unused) {
            return "unknown";
        }
    }

    public jfa(ifa ifa) {
        this.b = -1;
        this.d = new byte[0];
        this.c = null;
        this.e = ifa;
    }

    public ifa a() {
        return this.e;
    }

    private int a(String str) {
        String str2 = "error";
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(str2)) {
                return jSONObject.getInt(str2);
            }
        } catch (JSONException unused) {
        }
        return -1;
    }
}

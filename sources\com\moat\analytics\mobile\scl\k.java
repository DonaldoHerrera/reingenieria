package com.moat.analytics.mobile.scl;

import android.os.Build.VERSION;
import org.json.JSONArray;
import org.json.JSONObject;

class k {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private int d = 200;

    public k(String str) {
        a(str);
    }

    private void a(String str) {
        String str2 = "in";
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("sa");
                boolean equals = string.equals("836cf3246c33629b8774ad205b387a651e021955");
                boolean equals2 = string.equals("8f1d08a2d6496191a5ebae8f0590f513e2619489");
                if ((string.equals("on") || equals || equals2) && !a(jSONObject)) {
                    this.a = true;
                    this.b = equals;
                    this.c = equals2;
                    if (this.c) {
                        this.b = true;
                    }
                }
                if (jSONObject.has(str2)) {
                    int i = jSONObject.getInt(str2);
                    if (i >= 100 && i <= 1000) {
                        this.d = i;
                    }
                }
            } catch (Exception unused) {
                this.a = false;
                this.b = false;
                this.d = 200;
            }
        }
    }

    private boolean a(JSONObject jSONObject) {
        String str = "ob";
        try {
            if (16 > VERSION.SDK_INT) {
                return true;
            }
            if (jSONObject.has(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (jSONArray.getInt(i) == VERSION.SDK_INT) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean e() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public d d() {
        return e() ? d.ON : d.OFF;
    }
}

package com.facebook;

import android.util.Log;
import com.facebook.GraphRequest.b;
import com.facebook.internal.ia;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.d reason: case insensitive filesystem */
/* compiled from: AccessTokenManager */
class C0534d implements b {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ Set c;
    final /* synthetic */ Set d;
    final /* synthetic */ C0537g e;

    C0534d(C0537g gVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
        this.e = gVar;
        this.a = atomicBoolean;
        this.b = set;
        this.c = set2;
        this.d = set3;
    }

    public void a(L l) {
        JSONObject b2 = l.b();
        if (b2 != null) {
            JSONArray optJSONArray = b2.optJSONArray("data");
            if (optJSONArray != null) {
                this.a.set(true);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString("status");
                        if (!ia.b(optString) && !ia.b(optString2)) {
                            String lowerCase = optString2.toLowerCase(Locale.US);
                            if (lowerCase.equals("granted")) {
                                this.b.add(optString);
                            } else if (lowerCase.equals("declined")) {
                                this.c.add(optString);
                            } else if (lowerCase.equals("expired")) {
                                this.d.add(optString);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unexpected status: ");
                                sb.append(lowerCase);
                                Log.w("AccessTokenManager", sb.toString());
                            }
                        }
                    }
                }
            }
        }
    }
}

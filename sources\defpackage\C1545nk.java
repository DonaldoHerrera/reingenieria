package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.C0542c;
import com.facebook.internal.ia;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: nk reason: default package and case insensitive filesystem */
/* compiled from: SessionEventsState */
class C1545nk {
    private List<Uj> a = new ArrayList();
    private List<Uj> b = new ArrayList();
    private int c;
    private C0542c d;
    private String e;
    private final int f = 1000;

    public C1545nk(C0542c cVar, String str) {
        this.d = cVar;
        this.e = str;
    }

    public synchronized void a(Uj uj) {
        if (this.a.size() + this.b.size() >= 1000) {
            this.c++;
        } else {
            this.a.add(uj);
        }
    }

    public synchronized List<Uj> b() {
        List<Uj> list;
        list = this.a;
        this.a = new ArrayList();
        return list;
    }

    public synchronized int a() {
        return this.a.size();
    }

    public synchronized void a(boolean z) {
        if (z) {
            this.a.addAll(this.b);
        }
        this.b.clear();
        this.c = 0;
    }

    public int a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.c;
            this.b.addAll(this.a);
            this.a.clear();
            JSONArray jSONArray = new JSONArray();
            for (Uj uj : this.b) {
                if (!uj.d()) {
                    ia.b("Event with invalid checksum: %s", uj.toString());
                } else if (z || !uj.a()) {
                    jSONArray.put(uj.b());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            a(graphRequest, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    private void a(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = Sk.a(a.CUSTOM_APP_EVENTS, this.d, this.e, z, context);
            if (this.c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.a(jSONObject);
        Bundle i2 = graphRequest.i();
        if (i2 == null) {
            i2 = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            i2.putString("custom_events", jSONArray2);
            graphRequest.c((Object) jSONArray2);
        }
        graphRequest.a(i2);
    }
}

package defpackage;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: zH reason: default package and case insensitive filesystem */
public class C3390zH extends C3310vH {
    public C3390zH(b bVar, HashSet<String> hashSet, JSONObject jSONObject, double d) {
        super(bVar, hashSet, jSONObject, d);
    }

    private void b(String str) {
        C2331VG a = C2331VG.a();
        if (a != null) {
            for (C2218PG pg : a.b()) {
                if (this.c.contains(pg.b())) {
                    pg.k().b(str, this.e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}

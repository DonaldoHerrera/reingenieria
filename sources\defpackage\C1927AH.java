package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: AH reason: default package and case insensitive filesystem */
public class C1927AH extends C3310vH {
    public C1927AH(b bVar, HashSet<String> hashSet, JSONObject jSONObject, double d) {
        super(bVar, hashSet, jSONObject, d);
    }

    private void b(String str) {
        C2331VG a = C2331VG.a();
        if (a != null) {
            for (C2218PG pg : a.b()) {
                if (this.c.contains(pg.b())) {
                    pg.k().a(str, this.e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C3010gH.b(this.d, this.b.b())) {
            return null;
        }
        this.b.a(this.d);
        return this.d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}

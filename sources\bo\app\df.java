package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONArray;
import org.json.JSONObject;

public class df {
    private static final String a = Hg.a(df.class);
    private final SharedPreferences b;
    private final Set<String> c;
    private final Set<String> d;
    private bb e;

    enum a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");
        
        private final String c;
        private final String d;

        private a(String str, String str2) {
            this.c = str;
            this.d = str2;
        }

        public String a() {
            return this.c;
        }

        public String b() {
            return this.d;
        }
    }

    public df(Context context, String str) {
        String a2 = Ng.a(context, str == null ? "" : str);
        StringBuilder sb = new StringBuilder();
        sb.append("com.appboy.storage.feedstorageprovider");
        sb.append(a2);
        this.b = context.getSharedPreferences(sb.toString(), 0);
        this.c = a(a.VIEWED_CARDS);
        this.d = a(a.READ_CARDS);
        d(str);
    }

    static Set<String> c(String str) {
        HashSet hashSet = new HashSet();
        if (str != null) {
            Collections.addAll(hashSet, str.split(";"));
        }
        return hashSet;
    }

    private void d(String str) {
        Editor edit = this.b.edit();
        edit.putString("uid", str);
        edit.apply();
    }

    public void a(bb bbVar) {
        this.e = bbVar;
    }

    public void b(String str) {
        if (!this.d.contains(str)) {
            this.d.add(str);
            a(this.d, a.READ_CARDS);
        }
    }

    public void a(String str) {
        if (!this.c.contains(str)) {
            this.c.add(str);
            a(this.c, a.VIEWED_CARDS);
        }
    }

    public Xf a(JSONArray jSONArray, String str) {
        String str2 = "";
        String str3 = str == null ? str2 : str;
        String string = this.b.getString("uid", str2);
        if (string.equals(str3)) {
            String str4 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Updating offline feed for user with id: ");
            sb.append(str);
            Hg.c(str4, sb.toString());
            long a2 = dn.a();
            a(jSONArray, a2);
            this.c.retainAll(a(jSONArray));
            a(this.c, a.VIEWED_CARDS);
            this.d.retainAll(a(jSONArray));
            a(this.d, a.READ_CARDS);
            return a(jSONArray, str, false, a2);
        }
        String str5 = a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The received cards are for user ");
        sb2.append(str);
        sb2.append(" and the current user is ");
        sb2.append(string);
        sb2.append(" , the cards will be discarded and no changes will be made.");
        Hg.c(str5, sb2.toString());
        return null;
    }

    public Xf a() {
        return a(new JSONArray(this.b.getString("cards", "[]")), this.b.getString("uid", ""), true, this.b.getLong("cards_timestamp", -1));
    }

    private Xf a(JSONArray jSONArray, String str, boolean z, long j) {
        List list;
        if (jSONArray == null || jSONArray.length() == 0) {
            list = new ArrayList();
        } else {
            list = bs.a(jSONArray, C1662rg.class, this.e, this);
        }
        List<C1662rg> list2 = list;
        for (C1662rg rgVar : list2) {
            if (this.c.contains(rgVar.i())) {
                rgVar.b(true);
                rgVar.a(true);
            }
            if (this.d.contains(rgVar.i())) {
                rgVar.a(true);
            }
        }
        Xf xf = new Xf(list2, str, z, j);
        return xf;
    }

    private Set<String> a(a aVar) {
        String a2 = aVar.a();
        String b2 = aVar.b();
        if (!this.b.contains(b2)) {
            return new ConcurrentSkipListSet(this.b.getStringSet(a2, new HashSet()));
        }
        Set<String> c2 = c(this.b.getString(b2, null));
        Editor edit = this.b.edit();
        edit.remove(b2);
        edit.apply();
        a(c2, aVar);
        return c2;
    }

    private void a(JSONArray jSONArray, long j) {
        Editor edit = this.b.edit();
        String str = "cards";
        if (jSONArray == null || jSONArray.length() == 0) {
            edit.remove(str);
        } else {
            edit.putString(str, jSONArray.toString());
        }
        edit.putLong("cards_timestamp", j);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    public void a(Set<String> set, a aVar) {
        String a2 = aVar.a();
        Editor edit = this.b.edit();
        if (set == null || set.isEmpty()) {
            edit.remove(a2);
        } else {
            edit.putStringSet(a2, set);
        }
        edit.apply();
    }

    static Set<String> a(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String str = "id";
                if (jSONObject.has(str)) {
                    hashSet.add(jSONObject.getString(str));
                }
            }
        }
        return hashSet;
    }
}

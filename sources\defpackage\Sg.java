package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: Sg reason: default package */
/* compiled from: AnswersAttributes */
class Sg {
    final Ug a;
    final Map<String, Object> b = new ConcurrentHashMap();

    public Sg(Ug ug) {
        this.a = ug;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        if (!this.a.a((Object) str, "key") && !this.a.a((Object) str2, "value")) {
            a(this.a.a(str), (Object) this.a.a(str2));
        }
    }

    public String toString() {
        return new JSONObject(this.b).toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, Number number) {
        if (!this.a.a((Object) str, "key") && !this.a.a((Object) number, "value")) {
            a(this.a.a(str), (Object) number);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, Object obj) {
        if (!this.a.a(this.b, str)) {
            this.b.put(str, obj);
        }
    }
}

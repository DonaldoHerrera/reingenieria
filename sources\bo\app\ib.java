package bo.app;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class ib implements id {
    public final hz a(JSONObject jSONObject, JSONObject jSONObject2) {
        hz hzVar = new hz();
        c("", jSONObject, jSONObject2, hzVar);
        return hzVar;
    }

    /* access modifiers changed from: protected */
    public void b(String str, JSONObject jSONObject, JSONObject jSONObject2, hz hzVar) {
        for (String str2 : ie.a(jSONObject)) {
            Object obj = jSONObject.get(str2);
            if (jSONObject2.has(str2)) {
                a(ie.a(str, str2), obj, jSONObject2.get(str2), hzVar);
            } else {
                hzVar.a(str, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(String str, JSONArray jSONArray, JSONArray jSONArray2, hz hzVar) {
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            Object obj2 = jSONArray2.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(i);
            sb.append("]");
            a(sb.toString(), obj, obj2, hzVar);
        }
    }

    /* access modifiers changed from: protected */
    public void d(String str, JSONArray jSONArray, JSONArray jSONArray2, hz hzVar) {
        boolean z;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= jSONArray2.length()) {
                    z = false;
                    break;
                }
                Object obj2 = jSONArray2.get(i2);
                if (!hashSet.contains(Integer.valueOf(i2)) && obj2.getClass().equals(obj.getClass())) {
                    if (obj instanceof JSONObject) {
                        if (a((JSONObject) obj, (JSONObject) obj2).a()) {
                            hashSet.add(Integer.valueOf(i2));
                            break;
                        }
                    } else if (obj instanceof JSONArray) {
                        if (a((JSONArray) obj, (JSONArray) obj2).a()) {
                            hashSet.add(Integer.valueOf(i2));
                            break;
                        }
                    } else if (obj.equals(obj2)) {
                        hashSet.add(Integer.valueOf(i2));
                        break;
                    }
                }
                i2++;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("[");
                sb.append(i);
                sb.append("] Could not find match for element ");
                sb.append(obj);
                hzVar.a(sb.toString());
                return;
            }
        }
    }

    public final hz a(JSONArray jSONArray, JSONArray jSONArray2) {
        hz hzVar = new hz();
        e("", jSONArray, jSONArray2, hzVar);
        return hzVar;
    }

    /* access modifiers changed from: protected */
    public void a(String str, JSONObject jSONObject, JSONObject jSONObject2, hz hzVar) {
        for (String str2 : ie.a(jSONObject2)) {
            if (!jSONObject.has(str2)) {
                hzVar.b(str, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(String str, JSONArray jSONArray, JSONArray jSONArray2, hz hzVar) {
        String str2;
        Map a = ie.a((Collection<T>) ie.b(jSONArray));
        Map a2 = ie.a((Collection<T>) ie.b(jSONArray2));
        Iterator it = a.keySet().iterator();
        while (true) {
            str2 = "[]";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!a2.containsKey(next)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                hzVar.a(sb.toString(), next);
            } else if (!((Integer) a2.get(next)).equals(a.get(next))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("[]: Expected ");
                sb2.append(a.get(next));
                sb2.append(" occurrence(s) of ");
                sb2.append(next);
                sb2.append(" but got ");
                sb2.append(a2.get(next));
                sb2.append(" occurrence(s)");
                hzVar.a(sb2.toString());
            }
        }
        for (Object next2 : a2.keySet()) {
            if (!a.containsKey(next2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(str2);
                hzVar.b(sb3.toString(), next2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, JSONArray jSONArray, JSONArray jSONArray2, hz hzVar) {
        String a = ie.a(jSONArray);
        if (a == null || !ie.a(a, jSONArray2)) {
            d(str, jSONArray, jSONArray2, hzVar);
            return;
        }
        Map a2 = ie.a(jSONArray, a);
        Map a3 = ie.a(jSONArray2, a);
        for (Object next : a2.keySet()) {
            if (!a3.containsKey(next)) {
                hzVar.a(ie.a(str, a, next), a2.get(next));
            } else {
                a(ie.a(str, a, next), (JSONObject) a2.get(next), (JSONObject) a3.get(next), hzVar);
            }
        }
        for (Object next2 : a3.keySet()) {
            if (!a2.containsKey(next2)) {
                hzVar.b(ie.a(str, a, next2), a3.get(next2));
            }
        }
    }
}

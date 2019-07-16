package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: dH reason: default package and case insensitive filesystem */
public class C2953dH implements C2461bH {
    private final C2461bH a;

    public C2953dH(C2461bH bHVar) {
        this.a = bHVar;
    }

    /* access modifiers changed from: 0000 */
    public ArrayList<View> a() {
        ArrayList<View> arrayList = new ArrayList<>();
        C2331VG a2 = C2331VG.a();
        if (a2 != null) {
            Collection<C2218PG> c = a2.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((c.size() * 2) + 3);
            for (C2218PG f : c) {
                View f2 = f.f();
                if (f2 != null && C3086kH.c(f2)) {
                    View rootView = f2.getRootView();
                    if (rootView != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float a3 = C3086kH.a(rootView);
                        int size = arrayList.size();
                        while (size > 0 && C3086kH.a((View) arrayList.get(size - 1)) > a3) {
                            size--;
                        }
                        arrayList.add(size, rootView);
                    }
                }
            }
        }
        return arrayList;
    }

    public JSONObject a(View view) {
        return C3010gH.a(0, 0, 0, 0);
    }

    public void a(View view, JSONObject jSONObject, a aVar, boolean z) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            aVar.a((View) it.next(), this.a, jSONObject);
        }
    }
}

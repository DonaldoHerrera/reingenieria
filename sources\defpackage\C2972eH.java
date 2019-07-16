package defpackage;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: eH reason: default package and case insensitive filesystem */
public class C2972eH implements C2461bH {
    private final int[] a = new int[2];

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a aVar) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.a(viewGroup.getChildAt(i), this, jSONObject);
        }
    }

    @TargetApi(21)
    private void b(ViewGroup viewGroup, JSONObject jSONObject, a aVar) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.a((View) it2.next(), this, jSONObject);
            }
        }
    }

    public JSONObject a(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.a);
        int[] iArr = this.a;
        return C3010gH.a(iArr[0], iArr[1], width, height);
    }

    public void a(View view, JSONObject jSONObject, a aVar, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z || VERSION.SDK_INT < 21) {
                a(viewGroup, jSONObject, aVar);
            } else {
                b(viewGroup, jSONObject, aVar);
            }
        }
    }
}

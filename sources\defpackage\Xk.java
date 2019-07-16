package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.B;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: Xk reason: default package */
/* compiled from: InAppPurchaseActivityLifecycleTracker */
class Xk implements Runnable {
    final /* synthetic */ Zk a;

    Xk(Zk zk) {
        this.a = zk;
    }

    public void run() {
        Context e = B.e();
        _k.b(e, C0311al.b(e, _k.h));
        Map c = C0311al.c(e, _k.h);
        _k.b(e, c, new HashMap());
        HashSet hashSet = new HashSet();
        c.clear();
        Iterator it = C0311al.a(e, _k.h, (Set<Integer>) hashSet).iterator();
        while (it.hasNext()) {
            c.put((String) it.next(), C1268el.EXPIRE);
        }
        HashMap hashMap = new HashMap();
        if (!hashSet.isEmpty()) {
            hashMap.put("error_code", TextUtils.join(",", hashSet));
        }
        _k.b(e, c, hashMap);
    }
}

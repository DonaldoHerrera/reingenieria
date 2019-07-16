package com.facebook.internal;

import com.facebook.C0594t;
import com.facebook.C0595u;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.b;
import com.facebook.L;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* compiled from: WebDialog */
class pa implements b {
    final /* synthetic */ String[] a;
    final /* synthetic */ int b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ d d;

    pa(d dVar, String[] strArr, int i, CountDownLatch countDownLatch) {
        this.d = dVar;
        this.a = strArr;
        this.b = i;
        this.c = countDownLatch;
    }

    public void a(L l) {
        try {
            FacebookRequestError a2 = l.a();
            String str = "Error staging photo.";
            if (a2 != null) {
                String c2 = a2.c();
                if (c2 == null) {
                    c2 = str;
                }
                throw new C0595u(l, c2);
            }
            JSONObject b2 = l.b();
            if (b2 != null) {
                String optString = b2.optString("uri");
                if (optString != null) {
                    this.a[this.b] = optString;
                    this.c.countDown();
                    return;
                }
                throw new C0594t(str);
            }
            throw new C0594t(str);
        } catch (Exception e) {
            this.d.c[this.b] = e;
        }
    }
}

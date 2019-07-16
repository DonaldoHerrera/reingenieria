package com.google.firebase.perf.network;

import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import java.io.IOException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public final class g<T> implements ResponseHandler<T> {
    private final ResponseHandler<? extends T> a;
    private final zzbg b;
    private final C0899v c;

    public g(ResponseHandler<? extends T> responseHandler, zzbg zzbg, C0899v vVar) {
        this.a = responseHandler;
        this.b = zzbg;
        this.c = vVar;
    }

    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        this.c.e(this.b.c());
        this.c.a(httpResponse.getStatusLine().getStatusCode());
        Long a2 = h.a((HttpMessage) httpResponse);
        if (a2 != null) {
            this.c.f(a2.longValue());
        }
        String a3 = h.a(httpResponse);
        if (a3 != null) {
            this.c.c(a3);
        }
        this.c.d();
        return this.a.handleResponse(httpResponse);
    }
}

package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.ia;
import java.net.HttpURLConnection;
import java.util.List;

/* compiled from: GraphRequestAsyncTask */
public class J extends AsyncTask<Void, Void, List<L>> {
    private static final String a = "com.facebook.J";
    private final HttpURLConnection b;
    private final K c;
    private Exception d;

    public J(K k) {
        this(null, k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(List<L> list) {
        super.onPostExecute(list);
        Exception exc = this.d;
        if (exc != null) {
            ia.b(a, String.format("onPostExecute: exception encountered during request: %s", new Object[]{exc.getMessage()}));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        super.onPreExecute();
        if (B.r()) {
            ia.b(a, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.c.i() == null) {
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.c.a(handler);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{RequestAsyncTask: ");
        sb.append(" connection: ");
        sb.append(this.b);
        sb.append(", requests: ");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public J(HttpURLConnection httpURLConnection, K k) {
        this.c = k;
        this.b = httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<L> doInBackground(Void... voidArr) {
        try {
            if (this.b == null) {
                return this.c.c();
            }
            return GraphRequest.a(this.b, this.c);
        } catch (Exception e) {
            this.d = e;
            return null;
        }
    }
}

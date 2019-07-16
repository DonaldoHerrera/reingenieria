package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.iid.t reason: case insensitive filesystem */
final class C2512t {
    private final Executor a;
    private final Map<Pair<String, String>, Wy<C2494a>> b = new T();

    C2512t(Executor executor) {
        this.a = executor;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        return r4;
     */
    public final synchronized Wy<C2494a> a(String str, String str2, C2513u uVar) {
        Pair pair = new Pair(str, str2);
        Wy<C2494a> wy = (Wy) this.b.get(pair);
        if (wy == null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Making new request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            Wy<C2494a> b2 = uVar.a().b(this.a, new C2514v(this, pair));
            this.b.put(pair, b2);
            return b2;
        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("Joining ongoing request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Wy a(Pair pair, Wy wy) throws Exception {
        synchronized (this) {
            this.b.remove(pair);
        }
        return wy;
    }
}

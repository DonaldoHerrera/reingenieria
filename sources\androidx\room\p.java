package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import androidx.room.h.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient */
class p {
    Context a;
    final String b;
    int c;
    final h d;
    final b e;
    C0436e f;
    final Executor g;
    final C0435d h = new j(this);
    final AtomicBoolean i = new AtomicBoolean(false);
    final ServiceConnection j = new k(this);
    final Runnable k = new l(this);
    final Runnable l = new m(this);
    private final Runnable m = new n(this);

    p(Context context, String str, h hVar, Executor executor) {
        this.a = context.getApplicationContext();
        this.b = str;
        this.d = hVar;
        this.g = executor;
        this.e = new o(this, hVar.c);
        this.a.bindService(new Intent(this.a, MultiInstanceInvalidationService.class), this.j, 1);
    }
}

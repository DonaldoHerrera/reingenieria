package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.h reason: case insensitive filesystem */
final class C2501h implements ServiceConnection {
    int a;
    final Messenger b;
    C2504k c;
    final Queue<C2506m<?>> d;
    final SparseArray<C2506m<?>> e;
    final /* synthetic */ C2499f f;

    private C2501h(C2499f fVar) {
        this.f = fVar;
        this.a = 0;
        this.b = new Messenger(new Hs(Looper.getMainLooper(), new C2500g(this)));
        this.d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    private final void c() {
        this.f.c.execute(new C2502i(this));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        return true;
     */
    public final synchronized boolean a(C2506m mVar) {
        int i = this.a;
        if (i == 0) {
            this.d.add(mVar);
            Preconditions.checkState(this.a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!ConnectionTracker.getInstance().bindService(this.f.b, intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                this.f.c.schedule(new C2503j(this), 30, TimeUnit.SECONDS);
            }
        } else if (i == 1) {
            this.d.add(mVar);
            return true;
        } else if (i == 2) {
            this.d.add(mVar);
            c();
            return true;
        } else if (i != 3) {
            if (i != 4) {
                int i2 = this.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void b() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            ConnectionTracker.getInstance().unbindService(this.f.b, this);
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.c = new C2504k(iBinder);
            this.a = 2;
            c();
        } catch (RemoteException e2) {
            a(0, e2.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        a(2, "Service disconnected");
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.m.a(com.google.firebase.iid.p):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.firebase.iid.m.a(android.os.Bundle):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.a(new com.google.firebase.iid.C2509p(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    public final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            C2506m mVar = (C2506m) this.e.get(i);
            if (mVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.e.remove(i);
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "MessengerIpcClient";
            String str3 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            ConnectionTracker.getInstance().unbindService(this.f.b, this);
            C2509p pVar = new C2509p(i, str);
            for (C2506m a2 : this.d) {
                a2.a(pVar);
            }
            this.d.clear();
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                ((C2506m) this.e.valueAt(i3)).a(pVar);
            }
            this.e.clear();
        } else if (i2 == 3) {
            this.a = 4;
        } else if (i2 != 4) {
            int i4 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(int i) {
        C2506m mVar = (C2506m) this.e.get(i);
        if (mVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i);
            mVar.a(new C2509p(3, "Timed out waiting for response"));
            b();
        }
    }
}

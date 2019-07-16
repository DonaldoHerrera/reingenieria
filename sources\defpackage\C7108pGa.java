package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/utilities/android/network/NetworkConnectivityListener;", "", "context", "Landroid/content/Context;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "connectionChangeListener", "Lcom/soundcloud/android/utilities/android/network/ConnectionChangeListener;", "(Landroid/content/Context;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/utilities/android/network/ConnectionChangeListener;)V", "receiver", "Lcom/soundcloud/android/utilities/android/network/NetworkConnectivityListener$ConnectivityBroadcastReceiver;", "startListening", "", "stopListening", "Companion", "ConnectivityBroadcastReceiver", "android-utils_release"}, mv = {1, 1, 15})
/* renamed from: pGa reason: default package and case insensitive filesystem */
/* compiled from: NetworkConnectivityListener.kt */
public final class C7108pGa {
    public static final a a = new a(null);
    private final b b = new b();
    private final Context c;
    /* access modifiers changed from: private */
    public final C6834lGa d;
    /* access modifiers changed from: private */
    public final C6766kGa e;

    /* renamed from: pGa$a */
    /* compiled from: NetworkConnectivityListener.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: pGa$b */
    /* compiled from: NetworkConnectivityListener.kt */
    private final class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            C7471uYa.b(context, "context");
            C7471uYa.b(intent, "intent");
            C6902mGa b = C7108pGa.this.d.b();
            StringBuilder sb = new StringBuilder();
            sb.append("Connectivity change detected, current connection : ");
            sb.append(b);
            Log.d("NetworkListener", sb.toString());
            C7108pGa.this.e.a(b);
        }
    }

    public C7108pGa(Context context, C6834lGa lga, C6766kGa kga) {
        C7471uYa.b(context, "context");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(kga, "connectionChangeListener");
        this.c = context;
        this.d = lga;
        this.e = kga;
    }

    public final void a() {
        Context context = this.c;
        b bVar = this.b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(bVar, intentFilter);
    }
}

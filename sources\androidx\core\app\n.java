package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: NotificationManagerCompat */
public final class n {
    private static final Object a = new Object();
    private static String b;
    private static Set<String> c = new HashSet();
    private static final Object d = new Object();
    private static d e;
    private final Context f;
    private final NotificationManager g = ((NotificationManager) this.f.getSystemService("notification"));

    /* compiled from: NotificationManagerCompat */
    private static class a implements e {
        final String a;
        final int b;
        final String c;
        final boolean d = false;

        a(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.d) {
                iNotificationSideChannel.cancelAll(this.a);
            } else {
                iNotificationSideChannel.cancel(this.a, this.b, this.c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            sb.append(this.c);
            sb.append(", all:");
            sb.append(this.d);
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class b implements e {
        final String a;
        final int b;
        final String c;
        final Notification d;

        b(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.a, this.b, this.c, this.d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class c {
        final ComponentName a;
        final IBinder b;

        c(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat */
    private static class d implements Callback, ServiceConnection {
        private final Context a;
        private final HandlerThread b;
        private final Handler c;
        private final Map<ComponentName, a> d = new HashMap();
        private Set<String> e = new HashSet();

        /* compiled from: NotificationManagerCompat */
        private static class a {
            final ComponentName a;
            boolean b = false;
            INotificationSideChannel c;
            ArrayDeque<e> d = new ArrayDeque<>();
            int e = 0;

            a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        d(Context context) {
            this.a = context;
            this.b = new HandlerThread("NotificationManagerCompat");
            this.b.start();
            this.c = new Handler(this.b.getLooper(), this);
        }

        private void b(e eVar) {
            a();
            for (a aVar : this.d.values()) {
                aVar.d.add(eVar);
                c(aVar);
            }
        }

        private void c(a aVar) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.a);
                sb.append(", ");
                sb.append(aVar.d.size());
                sb.append(" queued tasks");
                Log.d(str, sb.toString());
            }
            if (!aVar.d.isEmpty()) {
                if (!a(aVar) || aVar.c == null) {
                    d(aVar);
                    return;
                }
                while (true) {
                    e eVar = (e) aVar.d.peek();
                    if (eVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(eVar);
                            Log.d(str, sb2.toString());
                        }
                        eVar.a(aVar.c);
                        aVar.d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(aVar.a);
                            Log.d(str, sb3.toString());
                        }
                    } catch (RemoteException e2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("RemoteException communicating with ");
                        sb4.append(aVar.a);
                        Log.w(str, sb4.toString(), e2);
                    }
                }
                if (!aVar.d.isEmpty()) {
                    d(aVar);
                }
            }
        }

        private void d(a aVar) {
            if (!this.c.hasMessages(3, aVar.a)) {
                aVar.e++;
                int i = aVar.e;
                String str = "NotifManCompat";
                if (i > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(aVar.d.size());
                    sb.append(" tasks to ");
                    sb.append(aVar.a);
                    sb.append(" after ");
                    sb.append(aVar.e);
                    sb.append(" retries");
                    Log.w(str, sb.toString());
                    aVar.d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i2);
                    sb2.append(" ms");
                    Log.d(str, sb2.toString());
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(3, aVar.a), (long) i2);
            }
        }

        public void a(e eVar) {
            this.c.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                b((e) message.obj);
                return true;
            } else if (i == 1) {
                c cVar = (c) message.obj;
                a(cVar.a, cVar.b);
                return true;
            } else if (i == 2) {
                b((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                a((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
                Log.d(str, sb.toString());
            }
            this.c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            String str = "NotifManCompat";
            if (Log.isLoggable(str, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
                Log.d(str, sb.toString());
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }

        private void a(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.d.get(componentName);
            if (aVar != null) {
                aVar.c = Stub.asInterface(iBinder);
                aVar.e = 0;
                c(aVar);
            }
        }

        private void b(ComponentName componentName) {
            a aVar = (a) this.d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void a(ComponentName componentName) {
            a aVar = (a) this.d.get(componentName);
            if (aVar != null) {
                c(aVar);
            }
        }

        private void b(a aVar) {
            if (aVar.b) {
                this.a.unbindService(this);
                aVar.b = false;
            }
            aVar.c = null;
        }

        private void a() {
            String str;
            Set<String> b2 = n.b(this.a);
            if (!b2.equals(this.e)) {
                this.e = b2;
                List queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                Iterator it = queryIntentServices.iterator();
                while (true) {
                    str = "NotifManCompat";
                    if (!it.hasNext()) {
                        break;
                    }
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    if (b2.contains(resolveInfo.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            Log.w(str, sb.toString());
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.d.containsKey(componentName2)) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                            Log.d(str, sb2.toString());
                        }
                        this.d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator it2 = this.d.entrySet().iterator();
                while (it2.hasNext()) {
                    Entry entry = (Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable(str, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(entry.getKey());
                            Log.d(str, sb3.toString());
                        }
                        b((a) entry.getValue());
                        it2.remove();
                    }
                }
            }
        }

        private boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            aVar.b = this.a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.a), this, 33);
            if (aVar.b) {
                aVar.e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.a);
                Log.w("NotifManCompat", sb.toString());
                this.a.unbindService(this);
            }
            return aVar.b;
        }
    }

    /* compiled from: NotificationManagerCompat */
    private interface e {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private n(Context context) {
        this.f = context;
    }

    public static n a(Context context) {
        return new n(context);
    }

    public static Set<String> b(Context context) {
        Set<String> set;
        String string = Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (a) {
            if (string != null) {
                if (!string.equals(b)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    c = hashSet;
                    b = string;
                }
            }
            set = c;
        }
        return set;
    }

    public void a(int i) {
        a((String) null, i);
    }

    public void a(String str, int i) {
        this.g.cancel(str, i);
        if (VERSION.SDK_INT <= 19) {
            a((e) new a(this.f.getPackageName(), i, str));
        }
    }

    public void a(int i, Notification notification) {
        a(null, i, notification);
    }

    public void a(String str, int i, Notification notification) {
        if (a(notification)) {
            a((e) new b(this.f.getPackageName(), i, str, notification));
            this.g.cancel(str, i);
            return;
        }
        this.g.notify(str, i, notification);
    }

    private static boolean a(Notification notification) {
        Bundle a2 = k.a(notification);
        return a2 != null && a2.getBoolean("android.support.useSideChannel");
    }

    private void a(e eVar) {
        synchronized (d) {
            if (e == null) {
                e = new d(this.f.getApplicationContext());
            }
            e.a(eVar);
        }
    }
}

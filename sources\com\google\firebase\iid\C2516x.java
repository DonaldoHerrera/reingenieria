package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.zzm.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.iid.x reason: case insensitive filesystem */
final class C2516x {
    private static int a;
    private static PendingIntent b;
    private final C0485ba<String, Xy<Bundle>> c = new C0485ba<>();
    private final Context d;
    private final C2510q e;
    private Messenger f;
    private Messenger g;
    private zzm h;

    public C2516x(Context context, C2510q qVar) {
        this.d = context;
        this.e = qVar;
        this.f = new Messenger(new C2515w(this, Looper.getMainLooper()));
    }

    /* access modifiers changed from: private */
    public final void a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzm) {
                        this.h = (zzm) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.g = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str = "Unexpected response action: ";
                        String valueOf = String.valueOf(action);
                        Log.d("FirebaseInstanceId", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                        sb.append("Unexpected response, no error or registration id ");
                        sb.append(valueOf2);
                        Log.w("FirebaseInstanceId", sb.toString());
                    } else {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String str2 = "Received InstanceID error ";
                            String valueOf3 = String.valueOf(stringExtra2);
                            Log.d("FirebaseInstanceId", valueOf3.length() != 0 ? str2.concat(valueOf3) : new String(str2));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2) {
                                if ("ID".equals(split[1])) {
                                    String str3 = split[2];
                                    String str4 = split[3];
                                    if (str4.startsWith(":")) {
                                        str4 = str4.substring(1);
                                    }
                                    a(str3, intent2.putExtra("error", str4).getExtras());
                                }
                            }
                            String str5 = "Unexpected structured response ";
                            String valueOf4 = String.valueOf(stringExtra2);
                            Log.w("FirebaseInstanceId", valueOf4.length() != 0 ? str5.concat(valueOf4) : new String(str5));
                        } else {
                            synchronized (this.c) {
                                for (int i = 0; i < this.c.size(); i++) {
                                    a((String) this.c.b(i), intent2.getExtras());
                                }
                            }
                        }
                    }
                }
                Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str6 = "Unexpected response string: ";
                        String valueOf5 = String.valueOf(stringExtra);
                        Log.d("FirebaseInstanceId", valueOf5.length() != 0 ? str6.concat(valueOf5) : new String(str6));
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                a(group, extras);
                return;
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    private final Bundle b(Bundle bundle) throws IOException {
        Bundle c2 = c(bundle);
        if (c2 == null) {
            return c2;
        }
        String str = "google.messenger";
        if (!c2.containsKey(str)) {
            return c2;
        }
        Bundle c3 = c(bundle);
        if (c3 == null || !c3.containsKey(str)) {
            return c3;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef A[SYNTHETIC] */
    private final Bundle c(Bundle bundle) throws IOException {
        String a2 = a();
        Xy xy = new Xy();
        synchronized (this.c) {
            this.c.put(a2, xy);
        }
        if (this.e.a() != 0) {
            Intent intent = new Intent();
            intent.setPackage("com.google.android.gms");
            if (this.e.a() == 2) {
                intent.setAction("com.google.iid.TOKEN_REQUEST");
            } else {
                intent.setAction("com.google.android.c2dm.intent.REGISTER");
            }
            intent.putExtras(bundle);
            a(this.d, intent);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 5);
            sb.append("|ID|");
            sb.append(a2);
            sb.append("|");
            intent.putExtra("kid", sb.toString());
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
                sb2.append("Sending ");
                sb2.append(valueOf);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            intent.putExtra("google.messenger", this.f);
            if (!(this.g == null && this.h == null)) {
                Message obtain = Message.obtain();
                obtain.obj = intent;
                try {
                    if (this.g != null) {
                        this.g.send(obtain);
                    } else {
                        this.h.a(obtain);
                    }
                } catch (RemoteException unused) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                    }
                }
                Bundle bundle2 = (Bundle) Zy.a(xy.a(), 30000, TimeUnit.MILLISECONDS);
                synchronized (this.c) {
                    this.c.remove(a2);
                }
                return bundle2;
            }
            if (this.e.a() == 2) {
                this.d.sendBroadcast(intent);
            } else {
                this.d.startService(intent);
            }
            try {
                Bundle bundle22 = (Bundle) Zy.a(xy.a(), 30000, TimeUnit.MILLISECONDS);
                synchronized (this.c) {
                }
                return bundle22;
            } catch (InterruptedException | TimeoutException unused2) {
                Log.w("FirebaseInstanceId", "No response");
                throw new IOException("TIMEOUT");
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                synchronized (this.c) {
                    this.c.remove(a2);
                    throw th;
                }
            }
        } else {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
    }

    private static synchronized void a(Context context, Intent intent) {
        synchronized (C2516x.class) {
            if (b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", b);
        }
    }

    private final void a(String str, Bundle bundle) {
        synchronized (this.c) {
            Xy xy = (Xy) this.c.remove(str);
            if (xy == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
            xy.a(bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    public final Bundle a(Bundle bundle) throws IOException {
        if (this.e.d() < 12000000) {
            return b(bundle);
        }
        try {
            return (Bundle) Zy.a(C2499f.a(this.d).b(1, bundle));
        } catch (InterruptedException | ExecutionException e2) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d(str, sb.toString());
            }
            if (!(e2.getCause() instanceof C2509p) || ((C2509p) e2.getCause()).a() != 4) {
                return null;
            }
            return b(bundle);
        }
    }

    private static synchronized String a() {
        String num;
        synchronized (C2516x.class) {
            int i = a;
            a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }
}

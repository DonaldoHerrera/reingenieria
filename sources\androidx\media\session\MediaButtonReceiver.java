package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.ConnectionCallback;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    private static class a extends ConnectionCallback {
        private final Context a;
        private final Intent b;
        private final PendingResult c;
        private MediaBrowserCompat d;

        a(Context context, Intent intent, PendingResult pendingResult) {
            this.a = context;
            this.b = intent;
            this.c = pendingResult;
        }

        /* access modifiers changed from: 0000 */
        public void a(MediaBrowserCompat mediaBrowserCompat) {
            this.d = mediaBrowserCompat;
        }

        public void onConnected() {
            try {
                new MediaControllerCompat(this.a, this.d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
            a();
        }

        public void onConnectionFailed() {
            a();
        }

        public void onConnectionSuspended() {
            a();
        }

        private void a() {
            this.d.disconnect();
            this.c.finish();
        }
    }

    public static KeyEvent a(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (!(mediaSessionCompat == null || intent == null)) {
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                String str = "android.intent.extra.KEY_EVENT";
                if (intent.hasExtra(str)) {
                    KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra(str);
                    mediaSessionCompat.getController().dispatchMediaButtonEvent(keyEvent);
                    return keyEvent;
                }
            }
        }
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String str = "android.intent.action.MEDIA_BUTTON";
            if (str.equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
                ComponentName a2 = a(context, str);
                if (a2 != null) {
                    intent.setComponent(a2);
                    a(context, intent);
                    return;
                }
                ComponentName a3 = a(context, "android.media.browse.MediaBrowserService");
                if (a3 != null) {
                    PendingResult goAsync = goAsync();
                    Context applicationContext = context.getApplicationContext();
                    a aVar = new a(applicationContext, intent, goAsync);
                    MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a3, aVar, null);
                    aVar.a(mediaBrowserCompat);
                    mediaBrowserCompat.connect();
                    return;
                }
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignore unsupported intent: ");
        sb.append(intent);
        Log.d("MediaButtonReceiver", sb.toString());
    }

    public static ComponentName a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (queryBroadcastReceivers.size() > 1) {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }

    private static void a(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    private static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
            return new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected 1 service that handles ");
            sb.append(str);
            sb.append(", found ");
            sb.append(queryIntentServices.size());
            throw new IllegalStateException(sb.toString());
        }
    }
}

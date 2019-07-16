package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.Serializable;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/playback/HomescreenWidgetBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "playSessionController", "Lcom/soundcloud/android/playback/PlaySessionController;", "playSessionStateProvider", "Lcom/soundcloud/android/playback/PlaySessionStateProvider;", "playerInteractionsTracker", "Lcom/soundcloud/android/playback/PlayerInteractionsTracker;", "(Lcom/soundcloud/android/playback/PlaySessionController;Lcom/soundcloud/android/playback/PlaySessionStateProvider;Lcom/soundcloud/android/playback/PlayerInteractionsTracker;)V", "()V", "getPlaySessionController", "()Lcom/soundcloud/android/playback/PlaySessionController;", "setPlaySessionController", "(Lcom/soundcloud/android/playback/PlaySessionController;)V", "getPlaySessionStateProvider", "()Lcom/soundcloud/android/playback/PlaySessionStateProvider;", "setPlaySessionStateProvider", "(Lcom/soundcloud/android/playback/PlaySessionStateProvider;)V", "getPlayerInteractionsTracker", "()Lcom/soundcloud/android/playback/PlayerInteractionsTracker;", "setPlayerInteractionsTracker", "(Lcom/soundcloud/android/playback/PlayerInteractionsTracker;)V", "injectDependencies", "", "context", "Landroid/content/Context;", "onReceive", "intent", "Landroid/content/Intent;", "Companion", "HomescreenWidgetAction", "base_release"}, mv = {1, 1, 15})
/* compiled from: HomescreenWidgetBroadcastReceiver.kt */
public class HomescreenWidgetBroadcastReceiver extends BroadcastReceiver {
    public static final a a = new a(null);
    public C4412qb b;
    public C4416rb c;
    public Ic d;

    /* compiled from: HomescreenWidgetBroadcastReceiver.kt */
    public static final class a {
        private a() {
        }

        private final Intent a(Context context, b bVar) {
            Intent intent = new Intent("com.soundcloud.android.HomescreenWidgetBroadcastReceiver.ACTION");
            intent.setPackage(context.getPackageName());
            intent.putExtra("com.soundcloud.android.HomescreenWidgetBroadcastReceiver.EXTRA_DEFERRED_MEDIA_ACTION", bVar);
            intent.setClass(context, HomescreenWidgetBroadcastReceiver.class);
            return intent;
        }

        @NXa
        public final Intent b(Context context) {
            C7471uYa.b(context, "context");
            return a(context, b.SKIP_PREVIOUS);
        }

        @NXa
        public final Intent c(Context context) {
            C7471uYa.b(context, "context");
            return a(context, b.TOGGLE_PLAYBACK);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final Intent a(Context context) {
            C7471uYa.b(context, "context");
            return a(context, b.SKIP_NEXT);
        }
    }

    /* compiled from: HomescreenWidgetBroadcastReceiver.kt */
    private enum b {
        TOGGLE_PLAYBACK,
        SKIP_NEXT,
        SKIP_PREVIOUS
    }

    @NXa
    public static final Intent a(Context context) {
        return a.a(context);
    }

    @NXa
    public static final Intent b(Context context) {
        return a.b(context);
    }

    @NXa
    public static final Intent c(Context context) {
        return a.c(context);
    }

    public C4412qb a() {
        C4412qb qbVar = this.b;
        if (qbVar != null) {
            return qbVar;
        }
        C7471uYa.b("playSessionController");
        throw null;
    }

    public C4416rb b() {
        C4416rb rbVar = this.c;
        if (rbVar != null) {
            return rbVar;
        }
        C7471uYa.b("playSessionStateProvider");
        throw null;
    }

    public Ic c() {
        Ic ic = this.d;
        if (ic != null) {
            return ic;
        }
        C7471uYa.b("playerInteractionsTracker");
        throw null;
    }

    public void d(Context context) {
        C7471uYa.b(context, "context");
        dagger.android.a.a(this, context);
    }

    @SuppressLint({"CheckResult"})
    public void onReceive(Context context, Intent intent) {
        C7471uYa.b(context, "context");
        C7471uYa.b(intent, "intent");
        d(context);
        SDb.c("Received broadcast intent from homescreen widget!", new Object[0]);
        Serializable serializableExtra = intent.getSerializableExtra("com.soundcloud.android.HomescreenWidgetBroadcastReceiver.EXTRA_DEFERRED_MEDIA_ACTION");
        C7471uYa.a((Object) serializableExtra, "intent.getSerializableEx…RA_DEFERRED_MEDIA_ACTION)");
        if (serializableExtra instanceof b) {
            b bVar = (b) serializableExtra;
            StringBuilder sb = new StringBuilder();
            sb.append("Widget deferred action is ");
            sb.append(bVar);
            SDb.c(sb.toString(), new Object[0]);
            int i = C4529ya.a[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c().b(C4518wb.WIDGET);
                    a().h();
                } else if (i == 3) {
                    c().a(C4518wb.WIDGET);
                    a().k();
                }
            } else if (b().isPlaying()) {
                c().c(C4518wb.WIDGET);
                a().pause();
            } else {
                c().d(C4518wb.WIDGET);
                a().play();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Input ");
            sb2.append(serializableExtra);
            sb2.append(" not of type ");
            sb2.append(b.class.getSimpleName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}

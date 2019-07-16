package com.soundcloud.android.likes;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K.h;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0012J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/soundcloud/android/likes/LikeInNotificationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "likeOperations", "Lcom/soundcloud/android/likes/LikeOperations;", "engagementsTracking", "Lcom/soundcloud/android/analytics/EngagementsTracking;", "(Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/likes/LikeOperations;Lcom/soundcloud/android/analytics/EngagementsTracking;)V", "()V", "getEngagementsTracking", "()Lcom/soundcloud/android/analytics/EngagementsTracking;", "setEngagementsTracking", "(Lcom/soundcloud/android/analytics/EngagementsTracking;)V", "getLikeOperations", "()Lcom/soundcloud/android/likes/LikeOperations;", "setLikeOperations", "(Lcom/soundcloud/android/likes/LikeOperations;)V", "getPlayQueueManager", "()Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "setPlayQueueManager", "(Lcom/soundcloud/android/features/playqueue/PlayQueueManager;)V", "injectDependencies", "", "like", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "addLike", "", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: LikeInNotificationBroadcastReceiver.kt */
public class LikeInNotificationBroadcastReceiver extends BroadcastReceiver {
    public static final a a = new a(null);
    public C3814lca b;
    public C3983h c;
    public C2390YL d;

    /* compiled from: LikeInNotificationBroadcastReceiver.kt */
    public static final class a {
        private a() {
        }

        public final Intent a(Context context, C3508cda cda) {
            C7471uYa.b(context, "context");
            C7471uYa.b(cda, "urn");
            return a("com.soundcloud.android.LikeInNotificationBroadcastReceiver.LIKE", context, cda);
        }

        public final Intent b(Context context, C3508cda cda) {
            C7471uYa.b(context, "context");
            C7471uYa.b(cda, "urn");
            return a("com.soundcloud.android.LikeInNotificationBroadcastReceiver.UNLIKE", context, cda);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final Intent a(String str, Context context, C3508cda cda) {
            Intent intent = new Intent(str);
            intent.setPackage(context.getPackageName());
            C5526_Ha.b(intent, "com.soundcloud.android.LikeInNotificationBroadcastReceiver.EXTRA_MEDIA_URN", cda);
            intent.setClass(context, LikeInNotificationBroadcastReceiver.class);
            return intent;
        }
    }

    public C2390YL a() {
        C2390YL yl = this.d;
        if (yl != null) {
            return yl;
        }
        C7471uYa.b("engagementsTracking");
        throw null;
    }

    public C3983h b() {
        C3983h hVar = this.c;
        if (hVar != null) {
            return hVar;
        }
        C7471uYa.b("likeOperations");
        throw null;
    }

    public C3814lca c() {
        C3814lca lca = this.b;
        if (lca != null) {
            return lca;
        }
        C7471uYa.b("playQueueManager");
        throw null;
    }

    public void d() {
        SoundCloudApplication.f().a(this);
    }

    public void onReceive(Context context, Intent intent) {
        C7471uYa.b(context, "context");
        C7471uYa.b(intent, "intent");
        d();
        SDb.a("Received like intent from notification!", new Object[0]);
        String action = intent.getAction();
        C3508cda a2 = C5526_Ha.a(intent, "com.soundcloud.android.LikeInNotificationBroadcastReceiver.EXTRA_MEDIA_URN");
        if (a2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Media metadata received! Urn is: ");
            sb.append(a2);
            sb.append(", and actionType = ");
            sb.append(action);
            SDb.a(sb.toString(), new Object[0]);
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -2044402033) {
                    if (hashCode == -525304778 && action.equals("com.soundcloud.android.LikeInNotificationBroadcastReceiver.LIKE")) {
                        a(a2, true);
                        return;
                    }
                } else if (action.equals("com.soundcloud.android.LikeInNotificationBroadcastReceiver.UNLIKE")) {
                    a(a2, false);
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected actionType ");
            sb2.append(action);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private void a(C3508cda cda, boolean z) {
        C3508cda cda2 = cda;
        b().b(cda, z);
        C2390YL a2 = a();
        C3710l lVar = new C3710l(null, Yca.NOTIFICATION.a(), null, false, cda2, null, null, c().l(), null, null, null, null, null, null, 16237, null);
        C3508cda cda3 = cda;
        a2.a(cda3, z, lVar, c().a(cda3), h.NOTIFICATION_OR_HEADSET);
    }
}

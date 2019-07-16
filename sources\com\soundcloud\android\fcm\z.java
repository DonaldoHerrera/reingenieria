package com.soundcloud.android.fcm;

import android.annotation.SuppressLint;
import android.content.Context;
import org.json.JSONObject;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/fcm/RemoteFeaturesRefreshListener;", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Listener;", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "context", "Landroid/content/Context;", "navigationExecutor", "Lcom/soundcloud/android/navigation/NavigationExecutor;", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "(Lcom/soundcloud/android/view/snackbar/FeedbackController;Landroid/content/Context;Lcom/soundcloud/android/navigation/NavigationExecutor;Lcom/soundcloud/android/properties/AppFeatures;)V", "onRemoteMessage", "", "message", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Message;", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* compiled from: RemoteFeaturesRefreshListener.kt */
public class z implements defpackage.C3840oea.a {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public final C5052KJa b;
    /* access modifiers changed from: private */
    public final Context c;
    /* access modifiers changed from: private */
    public final C4581ija d;
    private final com.soundcloud.android.properties.a e;

    /* compiled from: RemoteFeaturesRefreshListener.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public z(C5052KJa kJa, Context context, C4581ija ija, com.soundcloud.android.properties.a aVar) {
        C7471uYa.b(kJa, "feedbackController");
        C7471uYa.b(context, "context");
        C7471uYa.b(ija, "navigationExecutor");
        C7471uYa.b(aVar, "appFeatures");
        this.b = kJa;
        this.c = context;
        this.d = ija;
        this.e = aVar;
    }

    @SuppressLint({"CheckResult"})
    public void a(b bVar) {
        C7471uYa.b(bVar, "message");
        JSONObject c2 = bVar.c();
        String str = "action";
        if (c2.has(str) && C7471uYa.a((Object) c2.getString(str), (Object) "refreshRemoteFeatures")) {
            this.e.a().d((C6776kQa<? super T>) new B<Object>(this));
        }
    }
}

package com.soundcloud.android.fcm;

import android.app.Service;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

@EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/fcm/ScFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "fcmMessageHandler", "Lcom/soundcloud/android/fcm/DefaultFcmMessageHandler;", "getFcmMessageHandler$fcm_release", "()Lcom/soundcloud/android/fcm/DefaultFcmMessageHandler;", "setFcmMessageHandler$fcm_release", "(Lcom/soundcloud/android/fcm/DefaultFcmMessageHandler;)V", "fcmRegistrationController", "Lcom/soundcloud/android/fcm/FcmRegistrationController;", "getFcmRegistrationController$fcm_release", "()Lcom/soundcloud/android/fcm/FcmRegistrationController;", "setFcmRegistrationController$fcm_release", "(Lcom/soundcloud/android/fcm/FcmRegistrationController;)V", "fcmStorage", "Lcom/soundcloud/android/foundation/fcm/FcmStorage;", "getFcmStorage$fcm_release", "()Lcom/soundcloud/android/foundation/fcm/FcmStorage;", "setFcmStorage$fcm_release", "(Lcom/soundcloud/android/foundation/fcm/FcmStorage;)V", "onCreate", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* compiled from: ScFirebaseMessagingService.kt */
public final class ScFirebaseMessagingService extends FirebaseMessagingService {
    public static final a g = new a(null);
    public C3541g h;
    public C3856qea i;
    public r j;

    /* compiled from: ScFirebaseMessagingService.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public void a(RemoteMessage remoteMessage) {
        super.a(remoteMessage);
        b a2 = SDb.a("FirebaseMessaging");
        StringBuilder sb = new StringBuilder();
        sb.append("Received Remote Message: ");
        sb.append(remoteMessage);
        a2.a(sb.toString(), new Object[0]);
        if (remoteMessage != null) {
            C3541g gVar = this.h;
            if (gVar != null) {
                gVar.b(remoteMessage);
            } else {
                C7471uYa.b("fcmMessageHandler");
                throw null;
            }
        }
    }

    public void b(String str) {
        super.b(str);
        SDb.a("FirebaseMessaging").a("Received a new token", new Object[0]);
        C3856qea qea = this.i;
        if (qea != null) {
            qea.b(str);
            r rVar = this.j;
            if (rVar != null) {
                rVar.a();
            } else {
                C7471uYa.b("fcmRegistrationController");
                throw null;
            }
        } else {
            C7471uYa.b("fcmStorage");
            throw null;
        }
    }

    public void onCreate() {
        dagger.android.a.a((Service) this);
        super.onCreate();
    }
}

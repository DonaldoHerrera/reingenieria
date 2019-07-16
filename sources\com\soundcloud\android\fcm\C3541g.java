package com.soundcloud.android.fcm;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.google.firebase.messaging.RemoteMessage;
import java.util.LinkedHashSet;
import java.util.Set;

@EVa(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u0000 (2\u00020\u0001:\u0001(BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0012J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001fH\u0012J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0015J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0015H\u0016J\f\u0010%\u001a\u00020\u001f*\u00020\u001cH\u0016J\f\u0010&\u001a\u00020'*\u00020\u001cH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/soundcloud/android/fcm/DefaultFcmMessageHandler;", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler;", "fcmDecryptor", "Lcom/soundcloud/android/fcm/FcmDecryptor;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "collectionUpdateListener", "Lcom/soundcloud/android/fcm/CollectionUpdateMessageListener;", "entityUpdateMessageListener", "Lcom/soundcloud/android/fcm/EntityUpdateMessageListener;", "concurrentStreamListener", "Lcom/soundcloud/android/fcm/ConcurrentStreamMessageListener;", "remoteFeaturesRefreshListener", "Lcom/soundcloud/android/fcm/RemoteFeaturesRefreshListener;", "remoteRefreshPolicies", "Lcom/soundcloud/android/fcm/RemoteRefreshPolicies;", "appConfig", "Lcom/soundcloud/appconfig/ApplicationConfiguration;", "(Lcom/soundcloud/android/fcm/FcmDecryptor;Lcom/soundcloud/android/error/reporting/ErrorReporter;Lcom/soundcloud/android/fcm/CollectionUpdateMessageListener;Lcom/soundcloud/android/fcm/EntityUpdateMessageListener;Lcom/soundcloud/android/fcm/ConcurrentStreamMessageListener;Lcom/soundcloud/android/fcm/RemoteFeaturesRefreshListener;Lcom/soundcloud/android/fcm/RemoteRefreshPolicies;Lcom/soundcloud/appconfig/ApplicationConfiguration;)V", "messageListeners", "", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Listener;", "deliverMessage", "", "message", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Message;", "handleMessage", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "handleScMessage", "payload", "", "logScMessage", "decryptedString", "registerListener", "listener", "unregisterListener", "getDebugString", "isThirdPartyMessage", "", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.fcm.g reason: case insensitive filesystem */
/* compiled from: DefaultFcmMessageHandler.kt */
public class C3541g implements C3840oea {
    private static final String a = a;
    private static final String b = b;
    private static final String c = c;
    public static final a d = new a(null);
    private final Set<defpackage.C3840oea.a> e = new LinkedHashSet();
    private final m f;
    private final C3469VY g;
    private final C7181qKa h;

    /* renamed from: com.soundcloud.android.fcm.g$a */
    /* compiled from: DefaultFcmMessageHandler.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3541g(m mVar, C3469VY vy, C3535a aVar, k kVar, C3537c cVar, z zVar, D d2, C7181qKa qka) {
        C7471uYa.b(mVar, "fcmDecryptor");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(aVar, "collectionUpdateListener");
        C7471uYa.b(kVar, "entityUpdateMessageListener");
        C7471uYa.b(cVar, "concurrentStreamListener");
        C7471uYa.b(zVar, "remoteFeaturesRefreshListener");
        C7471uYa.b(d2, "remoteRefreshPolicies");
        C7471uYa.b(qka, "appConfig");
        this.f = mVar;
        this.g = vy;
        this.h = qka;
        b((defpackage.C3840oea.a) cVar);
        b((defpackage.C3840oea.a) kVar);
        b((defpackage.C3840oea.a) zVar);
        b((defpackage.C3840oea.a) d2);
        b((defpackage.C3840oea.a) aVar);
    }

    public void a(defpackage.C3840oea.a aVar) {
        C7471uYa.b(aVar, CastExtraArgs.LISTENER);
        this.e.remove(aVar);
    }

    public final void b(defpackage.C3840oea.a aVar) {
        C7471uYa.b(aVar, CastExtraArgs.LISTENER);
        this.e.add(aVar);
    }

    public boolean c(RemoteMessage remoteMessage) {
        C7471uYa.b(remoteMessage, "$this$isThirdPartyMessage");
        String str = (String) remoteMessage.i().get(b);
        if (str == null) {
            str = "";
        }
        return C7471uYa.a((Object) str, (Object) c);
    }

    private void a(RemoteMessage remoteMessage, String str) {
        try {
            String a2 = this.f.a(str);
            a(new b(remoteMessage, a2));
            a(a2);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to handle remote message : ");
            sb.append(a(remoteMessage));
            SDb.a((Throwable) new IllegalArgumentException(sb.toString(), e2));
        }
    }

    public void b(RemoteMessage remoteMessage) {
        C7471uYa.b(remoteMessage, "remoteMessage");
        if (C7471uYa.a((Object) this.h.e(), (Object) remoteMessage.F()) && !c(remoteMessage)) {
            String str = (String) remoteMessage.i().get(a);
            if (str == null || Cxb.a(str)) {
                C3469VY vy = this.g;
                StringBuilder sb = new StringBuilder();
                sb.append("Blank Remote Message Payload : ");
                sb.append(a(remoteMessage));
                defpackage.C3469VY.a.a(vy, new IllegalArgumentException(sb.toString()), null, 2, null);
                return;
            }
            a(remoteMessage, str);
        }
    }

    public void a(b bVar) {
        C7471uYa.b(bVar, "message");
        for (defpackage.C3840oea.a a2 : this.e) {
            a2.a(bVar);
        }
    }

    private void a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Received SC Message : ");
        sb.append(str);
        SDb.a(sb.toString(), new Object[0]);
    }

    public String a(RemoteMessage remoteMessage) {
        defpackage.C4804CKa.a aVar;
        C7471uYa.b(remoteMessage, "$this$getDebugString");
        defpackage.C4804CKa.a a2 = C4804CKa.a((Object) remoteMessage);
        a2.a(a, (Object) remoteMessage.i());
        com.google.firebase.messaging.RemoteMessage.a G = remoteMessage.G();
        if (G != null) {
            C7471uYa.a((Object) G, "it");
            a2.a("body", (Object) G.a());
            aVar = a2.a("title", (Object) G.b());
        } else {
            aVar = null;
        }
        return String.valueOf(aVar);
    }
}

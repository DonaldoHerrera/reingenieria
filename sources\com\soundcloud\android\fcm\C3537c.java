package com.soundcloud.android.fcm;

import com.soundcloud.android.playback.K;
import java.util.Iterator;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0012J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010\u000e\u001a\u00020\u000f*\u00020\fH\u0012J\f\u0010\u0010\u001a\u00020\u000f*\u00020\fH\u0012J\f\u0010\u0011\u001a\u00020\u000f*\u00020\fH\u0012J\f\u0010\u0012\u001a\u00020\u000f*\u00020\fH\u0012J\f\u0010\u0013\u001a\u00020\u000f*\u00020\fH\u0012J\f\u0010\u0014\u001a\u00020\u000f*\u00020\fH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/fcm/ConcurrentStreamMessageListener;", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Listener;", "concurrentPlaybackOperations", "Lcom/soundcloud/android/playback/ConcurrentPlaybackOperations;", "fcmStorage", "Lcom/soundcloud/android/foundation/fcm/FcmStorage;", "sessionProvider", "Lcom/soundcloud/android/foundation/accounts/SessionProvider;", "(Lcom/soundcloud/android/playback/ConcurrentPlaybackOperations;Lcom/soundcloud/android/foundation/fcm/FcmStorage;Lcom/soundcloud/android/foundation/accounts/SessionProvider;)V", "handlePlaybackStopMessage", "", "message", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Message;", "onRemoteMessage", "isActionableForCurrentUser", "", "isConcurrentPlaybackMessage", "isLoggedInUser", "isNotSelfTriggered", "isStopAction", "isStopInNonStealthMode", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.fcm.c reason: case insensitive filesystem */
/* compiled from: ConcurrentStreamMessageListener.kt */
public class C3537c implements defpackage.C3840oea.a {
    public static final a a = new a(null);
    private final K b;
    private final C3856qea c;
    private final Ica d;

    /* renamed from: com.soundcloud.android.fcm.c$a */
    /* compiled from: ConcurrentStreamMessageListener.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3537c(K k, C3856qea qea, Ica ica) {
        C7471uYa.b(k, "concurrentPlaybackOperations");
        C7471uYa.b(qea, "fcmStorage");
        C7471uYa.b(ica, "sessionProvider");
        this.b = k;
        this.c = qea;
        this.d = ica;
    }

    private void b(b bVar) {
        if (c(bVar) && h(bVar)) {
            this.b.a();
        }
    }

    private boolean c(b bVar) {
        return e(bVar) && f(bVar);
    }

    private boolean d(b bVar) {
        Iterator keys = bVar.c().keys();
        C7471uYa.a((Object) keys, "payloadAsJsonObject.keys()");
        Iterator it = Twb.a(keys).iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                String str = (String) it.next();
                if (!C7471uYa.a((Object) str, (Object) "action") && !C7471uYa.a((Object) str, (Object) "user_id")) {
                    z = false;
                }
                if (z) {
                    i++;
                    if (i < 0) {
                        C6782kWa.b();
                        throw null;
                    }
                }
            } else if (i == 2) {
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean e(b bVar) {
        Ica ica = this.d;
        C3508cda f = C3508cda.f(bVar.c().getLong("user_id"));
        C7471uYa.a((Object) f, "Urn.forUser(payloadAsJso…ect.getLong(SC_USER_KEY))");
        Object b2 = ica.a(f).b();
        C7471uYa.a(b2, "sessionProvider.isLogged…USER_KEY))).blockingGet()");
        return ((Boolean) b2).booleanValue();
    }

    private boolean f(b bVar) {
        String a2 = this.c.a();
        if (a2 == null || (!C7471uYa.a((Object) a2, (Object) bVar.c().getString("token")))) {
            return true;
        }
        return false;
    }

    private boolean g(b bVar) {
        return C7471uYa.a((Object) bVar.c().getString("action"), (Object) "stop");
    }

    private boolean h(b bVar) {
        return g(bVar) && !bVar.c().optBoolean("stealth");
    }

    public void a(b bVar) {
        C7471uYa.b(bVar, "message");
        if (d(bVar)) {
            b(bVar);
        }
    }
}

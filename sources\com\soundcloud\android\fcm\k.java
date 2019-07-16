package com.soundcloud.android.fcm;

import android.annotation.SuppressLint;
import com.soundcloud.android.properties.m.q;
import com.soundcloud.android.sync.T;
import java.util.Iterator;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u000eH\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/fcm/EntityUpdateMessageListener;", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Listener;", "jsonTransformer", "Lcom/soundcloud/android/json/JsonTransformer;", "syncInitiator", "Lcom/soundcloud/android/sync/SyncInitiator;", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "(Lcom/soundcloud/android/json/JsonTransformer;Lcom/soundcloud/android/sync/SyncInitiator;Lcom/soundcloud/android/properties/AppFeatures;Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "onRemoteMessage", "", "message", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Message;", "isUpdate", "", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* compiled from: EntityUpdateMessageListener.kt */
public class k implements defpackage.C3840oea.a {
    public static final a a = new a(null);
    private final Nea b;
    private final T c;
    private final com.soundcloud.android.properties.a d;
    private final C3469VY e;

    /* compiled from: EntityUpdateMessageListener.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public k(Nea nea, T t, com.soundcloud.android.properties.a aVar, C3469VY vy) {
        C7471uYa.b(nea, "jsonTransformer");
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(aVar, "appFeatures");
        C7471uYa.b(vy, "errorReporter");
        this.b = nea;
        this.c = t;
        this.d = aVar;
        this.e = vy;
    }

    private boolean b(b bVar) {
        Iterator keys = bVar.c().keys();
        C7471uYa.a((Object) keys, "payloadAsJsonObject.keys()");
        return Ywb.a(Twb.a(keys), (Object) "entity_updates");
    }

    @SuppressLint({"sc.SilentExceptionUsage"})
    public void a(b bVar) {
        C7471uYa.b(bVar, "message");
        if (this.d.a((defpackage.C3821mba.a) q.a) && b(bVar)) {
            Nea nea = this.b;
            String b2 = bVar.b();
            C4990IKa a2 = C4990IKa.a(C4889FCa.class);
            C7471uYa.a((Object) a2, "TypeToken.of(EntityUpdatesMessage::class.java)");
            C4889FCa fCa = (C4889FCa) nea.a(b2, a2);
            if (fCa != null) {
                for (C4858ECa a3 : fCa.a()) {
                    C3508cda a4 = a3.a();
                    if (a4.u()) {
                        this.c.b(a4);
                    }
                }
                if (fCa != null) {
                    return;
                }
            }
            defpackage.C3469VY.a.a(this.e, new H("entity update", bVar.b()), null, 2, null);
            RVa rVa = RVa.a;
        }
    }
}

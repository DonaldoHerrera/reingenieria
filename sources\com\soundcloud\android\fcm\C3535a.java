package com.soundcloud.android.fcm;

import com.soundcloud.android.collections.data.C2853i;
import com.soundcloud.android.collections.data.L;
import java.util.Collection;
import java.util.Iterator;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\f\u0010\u000b\u001a\u00020\f*\u00020\nH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/fcm/CollectionUpdateMessageListener;", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Listener;", "jsonTransformer", "Lcom/soundcloud/android/json/JsonTransformer;", "likesWriteStorage", "Lcom/soundcloud/android/collections/data/LikesWriteStorage;", "(Lcom/soundcloud/android/json/JsonTransformer;Lcom/soundcloud/android/collections/data/LikesWriteStorage;)V", "onRemoteMessage", "", "message", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Message;", "isKnownMessage", "", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.fcm.a reason: case insensitive filesystem */
/* compiled from: CollectionUpdateMessageListener.kt */
public class C3535a implements a {
    public static final C0076a a = new C0076a(null);
    private final Nea b;
    private final L c;

    /* renamed from: com.soundcloud.android.fcm.a$a reason: collision with other inner class name */
    /* compiled from: CollectionUpdateMessageListener.kt */
    public static final class C0076a {
        private C0076a() {
        }

        public /* synthetic */ C0076a(C7264rYa rya) {
            this();
        }
    }

    public C3535a(Nea nea, L l) {
        C7471uYa.b(nea, "jsonTransformer");
        C7471uYa.b(l, "likesWriteStorage");
        this.b = nea;
        this.c = l;
    }

    private boolean b(b bVar) {
        Iterator keys = bVar.c().keys();
        C7471uYa.a((Object) keys, "payloadAsJsonObject.keys()");
        return Ywb.a(Twb.a(keys), (Object) "collections_updates");
    }

    public void a(b bVar) {
        C7471uYa.b(bVar, "message");
        if (b(bVar)) {
            Nea nea = this.b;
            String b2 = bVar.b();
            C4990IKa a2 = C4990IKa.a(C4734ACa.class);
            C7471uYa.a((Object) a2, "TypeToken.of(Collections…datesMessage::class.java)");
            C4734ACa aCa = (C4734ACa) nea.a(b2, a2);
            if (aCa != null) {
                C7792zCa a3 = aCa.a();
                if (a3 != null) {
                    C4827DCa a4 = a3.a();
                    if (a4 != null) {
                        this.c.a((Collection<C2853i>) C4765BCa.a(a4));
                    }
                }
            }
        }
    }
}

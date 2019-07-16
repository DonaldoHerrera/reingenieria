package defpackage;

import com.google.firebase.messaging.RemoteMessage;
import org.json.JSONObject;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\n\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler;", "", "deliverMessage", "", "message", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Message;", "registerListener", "listener", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Listener;", "unregisterListener", "Listener", "Message", "fcm-api_release"}, mv = {1, 1, 15})
/* renamed from: oea reason: default package and case insensitive filesystem */
/* compiled from: FcmMessageHandler.kt */
public interface C3840oea {

    /* renamed from: oea$a */
    /* compiled from: FcmMessageHandler.kt */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: oea$b */
    /* compiled from: FcmMessageHandler.kt */
    public static final class b {
        static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(b.class), "payloadAsJsonObject", "getPayloadAsJsonObject()Lorg/json/JSONObject;"))};
        private final String b = this.e.F();
        private final long c = this.e.H();
        private final C7744yVa d = BVa.a(new C3848pea(this));
        private final RemoteMessage e;
        private final String f;

        public b(RemoteMessage remoteMessage, String str) {
            C7471uYa.b(remoteMessage, "message");
            C7471uYa.b(str, "payload");
            this.e = remoteMessage;
            this.f = str;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.f;
        }

        public final JSONObject c() {
            C7744yVa yva = this.d;
            DZa dZa = a[0];
            return (JSONObject) yva.getValue();
        }

        public final long d() {
            return this.c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.f, (java.lang.Object) r3.f) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.e, (Object) bVar.e)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            RemoteMessage remoteMessage = this.e;
            int i = 0;
            int hashCode = (remoteMessage != null ? remoteMessage.hashCode() : 0) * 31;
            String str = this.f;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Message(message=");
            sb.append(this.e);
            sb.append(", payload=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    void a(a aVar);

    void b(a aVar);
}

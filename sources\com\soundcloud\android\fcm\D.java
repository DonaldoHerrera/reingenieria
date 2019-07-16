package com.soundcloud.android.fcm;

import android.annotation.SuppressLint;
import org.json.JSONObject;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/soundcloud/android/fcm/RemoteRefreshPolicies;", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Listener;", "policyOperations", "Lcom/soundcloud/android/policies/PolicyOperations;", "(Lcom/soundcloud/android/policies/PolicyOperations;)V", "onRemoteMessage", "", "message", "Lcom/soundcloud/android/foundation/fcm/FcmMessageHandler$Message;", "Companion", "fcm_release"}, mv = {1, 1, 15})
/* compiled from: RemoteRefreshPolicies.kt */
public class D implements defpackage.C3840oea.a {
    public static final a a = new a(null);
    private final C6334dta b;

    /* compiled from: RemoteRefreshPolicies.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public D(C6334dta dta) {
        C7471uYa.b(dta, "policyOperations");
        this.b = dta;
    }

    @SuppressLint({"CheckResult"})
    public void a(b bVar) {
        C7471uYa.b(bVar, "message");
        JSONObject c = bVar.c();
        String str = "action";
        if (c.has(str) && C7471uYa.a((Object) c.getString(str), (Object) "refreshPolicies")) {
            this.b.c().c(new E());
        }
    }
}

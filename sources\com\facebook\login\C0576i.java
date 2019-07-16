package com.facebook.login;

import com.facebook.B;
import com.facebook.C0594t;
import com.facebook.GraphRequest.b;
import com.facebook.L;
import com.facebook.internal.E;
import com.facebook.internal.ea;
import com.facebook.internal.ia;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.login.i reason: case insensitive filesystem */
/* compiled from: DeviceAuthDialog */
class C0576i implements b {
    final /* synthetic */ String a;
    final /* synthetic */ Date b;
    final /* synthetic */ Date c;
    final /* synthetic */ DeviceAuthDialog d;

    C0576i(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2) {
        this.d = deviceAuthDialog;
        this.a = str;
        this.b = date;
        this.c = date2;
    }

    public void a(L l) {
        if (!this.d.e.get()) {
            if (l.a() != null) {
                this.d.a(l.a().e());
                return;
            }
            try {
                JSONObject b2 = l.b();
                String string = b2.getString("id");
                ia.b a2 = ia.a(b2);
                String string2 = b2.getString("name");
                C1330gl.a(this.d.h.d());
                if (!E.b(B.f()).k().contains(ea.RequireConfirm) || this.d.k) {
                    this.d.a(string, a2, this.a, this.b, this.c);
                    return;
                }
                this.d.k = true;
                this.d.a(string, a2, this.a, string2, this.b, this.c);
            } catch (JSONException e) {
                this.d.a(new C0594t((Throwable) e));
            }
        }
    }
}

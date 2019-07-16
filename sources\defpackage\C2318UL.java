package defpackage;

import java.net.URL;

/* renamed from: UL reason: default package and case insensitive filesystem */
/* compiled from: DefaultSimpleApiTrackingRequestBuilder.kt */
public final class C2318UL implements C3395zM {
    private final b a;

    public C2318UL(b bVar) {
        C7471uYa.b(bVar, "devicePropertiesProvider");
        this.a = bVar;
    }

    public C7647wyb a(C2110JM jm) {
        C7471uYa.b(jm, "event");
        a aVar = new a();
        aVar.a(new URL(jm.b()));
        aVar.a("User-Agent", this.a.a());
        if (C7471uYa.a((Object) "promoted", (Object) jm.a())) {
            aVar.c();
        }
        C7647wyb a2 = aVar.a();
        C7471uYa.a((Object) a2, "Request.Builder().apply …      }\n        }.build()");
        return a2;
    }
}

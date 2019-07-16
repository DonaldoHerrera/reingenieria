package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

/* renamed from: com.soundcloud.android.foundation.ads.t reason: case insensitive filesystem */
/* compiled from: AppInstallAd */
public abstract class C3692t extends C3676c implements I {
    private b d = b.c();

    /* renamed from: com.soundcloud.android.foundation.ads.t$a */
    /* compiled from: AppInstallAd */
    public static abstract class a {
        @JsonCreator
        public static a a(@JsonProperty("urn") C3508cda cda, @JsonProperty("expiry_in_minutes") int i, @JsonProperty("name") String str, @JsonProperty("cta_button_text") String str2, @JsonProperty("clickthrough_url") String str3, @JsonProperty("image_url") String str4, @JsonProperty("rating") float f, @JsonProperty("rater_count") int i2, @JsonProperty("app_install_tracking") C3683j jVar) {
            C3696x xVar = new C3696x(cda, i, str, str2, str3, str4, f, i2, jVar);
            return xVar;
        }

        public abstract C3683j a();

        public abstract C3508cda b();

        public abstract String c();

        public abstract String d();

        public abstract int e();

        public abstract String f();

        public abstract String g();

        public abstract int h();

        public abstract float i();
    }

    /* renamed from: com.soundcloud.android.foundation.ads.t$b */
    /* compiled from: AppInstallAd */
    static abstract class b {
        b() {
        }

        static b c() {
            return a(C4928GKa.a(), false);
        }

        public abstract C4928GKa<Date> a();

        /* access modifiers changed from: 0000 */
        public b a(Date date) {
            return a().c() ? this : a(C4928GKa.c(date), b());
        }

        public abstract boolean b();

        /* access modifiers changed from: 0000 */
        public b d() {
            return b() ? this : a(a(), true);
        }

        static b a(C4928GKa<Date> gKa, boolean z) {
            return new C3697y(gKa, z);
        }
    }

    public static C3692t a(a aVar, long j) {
        C3683j a2 = aVar.a();
        C3695w wVar = new C3695w(j, aVar.e(), aVar.b(), com.soundcloud.android.foundation.ads.C3676c.a.INLAY, aVar.g(), aVar.d(), aVar.c(), aVar.f(), aVar.i(), aVar.h(), a2.f(), a2.a());
        return wVar;
    }

    public abstract String m();

    public abstract List<Y> n();

    public abstract String o();

    public boolean p() {
        return this.d.b();
    }

    public C4928GKa<Date> q() {
        return this.d.a();
    }

    public abstract String r();

    public abstract List<Y> s();

    public abstract String t();

    public abstract int u();

    public abstract float v();

    public void w() {
        this.d = this.d.d();
    }

    public void a(Date date) {
        this.d = this.d.a(date);
    }
}

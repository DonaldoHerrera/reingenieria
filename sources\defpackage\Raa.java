package defpackage;

import com.soundcloud.android.foundation.events.J;

/* renamed from: Raa reason: default package */
/* compiled from: PurchaseEvent */
public abstract class Raa extends J {

    /* renamed from: Raa$a */
    /* compiled from: PurchaseEvent */
    public enum a {
        MID_TIER("cn058f"),
        HIGH_TIER("1n0o91");
        
        private final String d;

        private a(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    public static Raa a(String str, String str2) {
        C3780haa haa = new C3780haa(J.b(), J.c(), a.HIGH_TIER, str, str2);
        return haa;
    }

    public static Raa b(String str, String str2) {
        C3780haa haa = new C3780haa(J.b(), J.c(), a.MID_TIER, str, str2);
        return haa;
    }

    public String h() {
        return k().a();
    }

    public abstract String i();

    public abstract String j();

    public abstract a k();
}

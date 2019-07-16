package defpackage;

import com.soundcloud.android.foundation.ads.C3688o;
import com.soundcloud.android.foundation.ads.C3689p;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import java.util.List;

/* renamed from: cba reason: default package and case insensitive filesystem */
/* compiled from: VisualAdImpressionEvent */
public abstract class C3506cba extends J {

    /* renamed from: cba$a */
    /* compiled from: VisualAdImpressionEvent */
    public enum a {
        COMPANION_DISPLAY("companion_display");
        
        private final String c;

        private a(String str) {
            this.c = str;
        }

        public String a() {
            return this.c;
        }
    }

    public static C3506cba a(C3693u uVar, C3508cda cda, I i, Yaa yaa) {
        C3688o A = uVar.A();
        String b = C3689p.b(A);
        C3836oaa oaa = new C3836oaa(J.b(), J.c(), cda.toString(), uVar.i().toString(), i.b(), C4928GKa.b(A != null ? A.a() : null), C4928GKa.b(b), yaa.a(uVar.D()), a.COMPANION_DISPLAY, com.soundcloud.android.foundation.ads.C3676c.a.AUDIO);
        return oaa;
    }

    public abstract C4928GKa<String> h();

    public abstract C4928GKa<C3508cda> i();

    public abstract a j();

    public abstract List<String> k();

    public abstract com.soundcloud.android.foundation.ads.C3676c.a l();

    public abstract String m();

    public abstract String n();

    public abstract String o();
}

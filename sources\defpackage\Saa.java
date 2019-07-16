package defpackage;

import com.soundcloud.android.foundation.events.J;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: Saa reason: default package */
/* compiled from: ScrollDepthEvent */
public abstract class Saa extends J {

    /* renamed from: Saa$a */
    /* compiled from: ScrollDepthEvent */
    public enum a {
        START("start"),
        SCROLL_START("scroll_start"),
        SCROLL_STOP("scroll_stop"),
        END("end");
        
        private final String f;

        private a(String str) {
            this.f = str;
        }

        public String a() {
            return this.f;
        }
    }

    /* renamed from: Saa$b */
    /* compiled from: ScrollDepthEvent */
    public static abstract class b {
        public abstract b a(int i);

        public abstract b a(long j);

        public abstract b a(a aVar);

        public abstract b a(Yca yca);

        public abstract b a(List<c> list);

        public abstract Saa a();

        public abstract b b(List<c> list);
    }

    /* renamed from: Saa$c */
    /* compiled from: ScrollDepthEvent */
    public static abstract class c {
        public static c a(int i, int i2, float f) {
            return new C3796jaa(i, i2, f);
        }

        public abstract int a();

        public abstract int b();

        public abstract float c();
    }

    private static Comparator<c> o() {
        return C3407AZ.a;
    }

    public abstract a h();

    public abstract int i();

    public c j() {
        return (c) Collections.min(k(), o());
    }

    public abstract List<c> k();

    public c l() {
        return (c) Collections.max(m(), o());
    }

    public abstract List<c> m();

    public abstract Yca n();

    public static Saa a(Yca yca, a aVar, int i, List<c> list, List<c> list2) {
        return new a().a(J.b()).a(J.c()).a(yca).a(aVar).a(i).a(list).b(list2).a();
    }
}

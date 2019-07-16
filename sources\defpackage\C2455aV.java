package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/soundcloud/android/configuration/plans/Plan;", "", "planId", "", "(Ljava/lang/String;ILjava/lang/String;)V", "isGoPlan", "", "()Z", "getPlanId", "()Ljava/lang/String;", "UNDEFINED", "FREE_TIER", "MID_TIER", "HIGH_TIER", "STUDENT_TIER", "Companion", "plans"}, mv = {1, 1, 15})
/* renamed from: aV reason: default package and case insensitive filesystem */
/* compiled from: Plan.kt */
public enum C2455aV {
    UNDEFINED("undefined"),
    FREE_TIER(IdHelperAndroid.NO_ID_AVAILABLE),
    MID_TIER("mid_tier"),
    HIGH_TIER("high_tier"),
    STUDENT_TIER("student_tier");
    
    public static final a g = null;
    private final String h;

    /* renamed from: aV$a */
    /* compiled from: Plan.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C2455aV a(String str) {
            if (str == null) {
                return C2455aV.UNDEFINED;
            }
            switch (str.hashCode()) {
                case -1654386311:
                    if (str.equals("mid_tier")) {
                        return C2455aV.MID_TIER;
                    }
                    break;
                case -692886945:
                    if (str.equals("high_tier")) {
                        return C2455aV.HIGH_TIER;
                    }
                    break;
                case -18762394:
                    if (str.equals("student_tier")) {
                        return C2455aV.STUDENT_TIER;
                    }
                    break;
                case 3387192:
                    if (str.equals(IdHelperAndroid.NO_ID_AVAILABLE)) {
                        return C2455aV.FREE_TIER;
                    }
                    break;
            }
            return C2455aV.UNDEFINED;
        }

        @NXa
        public final List<C2455aV> b(Collection<C2493cV> collection) {
            C7471uYa.b(collection, "upsells");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
            for (C2493cV a : collection) {
                arrayList.add(C2455aV.g.a(a.a()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (((C2455aV) next) != C2455aV.UNDEFINED) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final List<C2455aV> a(Collection<String> collection) {
            C7471uYa.b(collection, "ids");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
            for (String a : collection) {
                arrayList.add(C2455aV.g.a(a));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (((C2455aV) next) != C2455aV.UNDEFINED) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
    }

    static {
        g = new a(null);
    }

    private C2455aV(String str) {
        this.h = str;
    }

    @NXa
    public static final C2455aV a(String str) {
        return g.a(str);
    }

    @NXa
    public static final List<C2455aV> a(Collection<String> collection) {
        return g.a(collection);
    }

    @NXa
    public static final List<C2455aV> b(Collection<C2493cV> collection) {
        return g.b(collection);
    }

    public final String a() {
        return this.h;
    }

    public final boolean b() {
        return this == MID_TIER || this == HIGH_TIER;
    }
}

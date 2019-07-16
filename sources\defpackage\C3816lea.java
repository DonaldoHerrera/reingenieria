package defpackage;

import java.util.Arrays;
import java.util.Set;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÂ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÆ\u0001J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/foundation/events/technical/Metric;", "", "name", "", "dataPoints", "", "Lcom/soundcloud/android/foundation/events/technical/DataPoint;", "(Ljava/lang/String;Ljava/util/Set;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "events_release"}, mv = {1, 1, 15})
/* renamed from: lea reason: default package and case insensitive filesystem */
/* compiled from: Metric.kt */
public final class C3816lea {
    public static final a a = new a(null);
    private final String b;
    private final Set<C3808kea<?>> c;

    /* renamed from: lea$a */
    /* compiled from: Metric.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C3816lea a(String str, C3808kea<?>... keaArr) {
            C7471uYa.b(str, "name");
            C7471uYa.b(keaArr, "dataPoints");
            return new C3816lea(str, SWa.a((Object[]) (C3808kea[]) Arrays.copyOf(keaArr, keaArr.length)));
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3816lea(String str, Set<? extends C3808kea<?>> set) {
        C7471uYa.b(str, "name");
        C7471uYa.b(set, "dataPoints");
        this.b = str;
        this.c = set;
    }

    @NXa
    public static final C3816lea a(String str, C3808kea<?>... keaArr) {
        return a.a(str, keaArr);
    }

    public final Set<C3808kea<?>> a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3816lea) {
                C3816lea lea = (C3816lea) obj;
                if (C7471uYa.a((Object) this.b, (Object) lea.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<C3808kea<?>> set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Metric(name=");
        sb.append(this.b);
        sb.append(", dataPoints=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}

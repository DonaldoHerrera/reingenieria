package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u00078WX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/configuration/experiments/Assignment;", "", "layers", "", "Lcom/soundcloud/android/configuration/experiments/Layer;", "(Ljava/util/List;)V", "isEmpty", "", "()Z", "getLayers", "()Ljava/util/List;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "experiments-active_release"}, mv = {1, 1, 15})
/* renamed from: EU reason: default package and case insensitive filesystem */
/* compiled from: Assignment.kt */
public class C2020EU {
    public static final a a = new a(null);
    private final List<C2232PU> b;

    /* renamed from: EU$a */
    /* compiled from: Assignment.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C2020EU a() {
            return new C2020EU(C6918mWa.a());
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    @JsonCreator
    public C2020EU(@JsonProperty("layers") List<C2232PU> list) {
        C7471uYa.b(list, "layers");
        this.b = list;
    }

    @NXa
    public static final C2020EU a() {
        return a.a();
    }

    public List<C2232PU> b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) b(), (java.lang.Object) ((defpackage.C2020EU) r2).b()) != false) goto L_0x0019;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2020EU) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List b2 = b();
        if (b2 != null) {
            return b2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assignment(layers=");
        sb.append(b());
        sb.append(")");
        return sb.toString();
    }
}

package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.soundcloud.android.collections.data.C2862s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@EVa(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/sync/delta/DeltaSyncRequest;", "", "snapshot", "Lcom/soundcloud/android/sync/delta/Snapshot;", "(Lcom/soundcloud/android/sync/delta/Snapshot;)V", "getSnapshot", "()Lcom/soundcloud/android/sync/delta/Snapshot;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "deltasync_release"}, mv = {1, 1, 15})
/* renamed from: yAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncRequest.kt */
public final class C7719yAa {
    public static final a a = new a(null);
    private final C5043KAa b;

    /* renamed from: yAa$a */
    /* compiled from: DeltaSyncRequest.kt */
    public static final class a {
        private a() {
        }

        public final C7719yAa a(List<C2862s> list, List<C2862s> list2) {
            String str;
            C7471uYa.b(list, "likedTracks");
            C7471uYa.b(list2, "likedPlaylists");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
            Iterator it = list.iterator();
            while (true) {
                str = "it.urn.content";
                if (!it.hasNext()) {
                    break;
                }
                C2862s sVar = (C2862s) it.next();
                String b = sVar.a().b();
                C7471uYa.a((Object) b, str);
                arrayList.add(new C4918GAa(b, sVar.b()));
            }
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
            for (C2862s sVar2 : list2) {
                String b2 = sVar2.a().b();
                C7471uYa.a((Object) b2, str);
                arrayList2.add(new C4918GAa(b2, sVar2.b()));
            }
            C4887FAa fAa = new C4887FAa(arrayList, arrayList2, null, 4, null);
            C5043KAa kAa = new C5043KAa(fAa, null, null, 6, null);
            return new C7719yAa(kAa);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C7719yAa(C5043KAa kAa) {
        C7471uYa.b(kAa, "snapshot");
        this.b = kAa;
    }

    @JsonProperty("snapshot")
    public final C5043KAa a() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.C7719yAa) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7719yAa) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C5043KAa kAa = this.b;
        if (kAa != null) {
            return kAa.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeltaSyncRequest(snapshot=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}

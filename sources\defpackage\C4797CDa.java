package defpackage;

import com.soundcloud.android.tracks.C6149aa.f;
import com.soundcloud.android.tracks.W;
import java.util.List;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsStorage;", "", "mediaStreamsDatabase", "Lcom/soundcloud/android/tracks/MediaStreamsDatabase;", "(Lcom/soundcloud/android/tracks/MediaStreamsDatabase;)V", "clear", "", "delete", "urns", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "getPayload", "Lio/reactivex/Maybe;", "", "urn", "selectAllUrns", "", "store", "mediaStreamEntries", "Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsStorage$MediaStreamStorageEntry;", "MediaStreamStorageEntry", "base_release"}, mv = {1, 1, 15})
/* renamed from: CDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsStorage.kt */
public class C4797CDa {
    /* access modifiers changed from: private */
    public final W a;

    /* renamed from: CDa$a */
    /* compiled from: MediaStreamsStorage.kt */
    public static final class a {
        private final C3508cda a;
        private final String b;

        public a(C3508cda cda, String str) {
            C7471uYa.b(cda, "urn");
            C7471uYa.b(str, "media");
            this.a = cda;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final C3508cda b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda cda = this.a;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaStreamStorageEntry(urn=");
            sb.append(this.a);
            sb.append(", media=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public C4797CDa(W w) {
        C7471uYa.b(w, "mediaStreamsDatabase");
        this.a = w;
    }

    public List<C3508cda> b() {
        W w = this.a;
        C6840lMa b = b.b.b();
        C7471uYa.a((Object) b, "DbModel.MediaStreams.FACTORY.selectUrns()");
        C6772kMa c = b.b.c();
        C7471uYa.a((Object) c, "DbModel.MediaStreams.FACTORY.selectUrnsMapper()");
        return w.c((Xd) b, c);
    }

    public void a() {
        this.a.a("MediaStreams");
    }

    public C7531vPa<String> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        W w = this.a;
        C6840lMa a2 = b.b.a(cda);
        C7471uYa.a((Object) a2, "DbModel.MediaStreams.FACTORY.selectByUrn(urn)");
        f a3 = b.b.a();
        C7471uYa.a((Object) a3, "DbModel.MediaStreams.FACTORY.selectByUrnMapper()");
        C7531vPa<String> a4 = w.a((Xd) a2, (C6772kMa<T>) a3).a((C7256rQa<? super T>) C4859EDa.a).f(C4890FDa.a).f(C4921GDa.a).a((C7256rQa<? super T>) C4952HDa.a);
        C7471uYa.a((Object) a4, "mediaStreamsDatabase\n   …ilter { it.isNotBlank() }");
        return a4;
    }

    public void b(Iterable<a> iterable) {
        C7471uYa.b(iterable, "mediaStreamEntries");
        this.a.a((PXa<RVa>) new C4983IDa<RVa>(this, iterable));
    }

    public void a(Iterable<C3508cda> iterable) {
        C7471uYa.b(iterable, "urns");
        this.a.a((PXa<RVa>) new C4828DDa<RVa>(this, iterable));
    }
}

package defpackage;

import com.soundcloud.android.tracks.F.f;
import com.soundcloud.android.tracks.W;
import java.util.List;

@EVa(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0016\u0010\u0011\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/tracks/mediastreams/DownloadedMediaStreamsStorage;", "", "mediaStreamsDatabase", "Lcom/soundcloud/android/tracks/MediaStreamsDatabase;", "(Lcom/soundcloud/android/tracks/MediaStreamsDatabase;)V", "clear", "", "delete", "Lio/reactivex/Completable;", "urns", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "getDownloadedMediaStream", "Lio/reactivex/Maybe;", "", "Lcom/soundcloud/android/tracks/mediastreams/DownloadedMediaStreamsEntry;", "urn", "store", "mediaStreamEntries", "Lcom/soundcloud/android/tracks/mediastreams/DownloadedMediaStreamsStorage$DownloadedMediaStreamStorageEntry;", "DownloadedMediaStreamStorageEntry", "base_release"}, mv = {1, 1, 15})
/* renamed from: lDa reason: default package and case insensitive filesystem */
/* compiled from: DownloadedMediaStreamsStorage.kt */
public class C6830lDa {
    /* access modifiers changed from: private */
    public final W a;

    /* renamed from: lDa$a */
    /* compiled from: DownloadedMediaStreamsStorage.kt */
    public static final class a {
        private final C3508cda a;
        private final String b;
        private final String c;
        private final String d;

        public a(C3508cda cda, String str, String str2, String str3) {
            C7471uYa.b(cda, "urn");
            C7471uYa.b(str, "preset");
            C7471uYa.b(str2, "quality");
            C7471uYa.b(str3, "mimeType");
            this.a = cda;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final C3508cda d() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) aVar.c)) {
                            }
                        }
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
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DownloadedMediaStreamStorageEntry(urn=");
            sb.append(this.a);
            sb.append(", preset=");
            sb.append(this.b);
            sb.append(", quality=");
            sb.append(this.c);
            sb.append(", mimeType=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    public C6830lDa(W w) {
        C7471uYa.b(w, "mediaStreamsDatabase");
        this.a = w;
    }

    public C6979nPa b(Iterable<a> iterable) {
        C7471uYa.b(iterable, "mediaStreamEntries");
        C6979nPa b = C6979nPa.b((C6368eQa) new C7242rDa(this, iterable));
        C7471uYa.a((Object) b, "Completable.fromAction {…\n\n            }\n        }");
        return b;
    }

    public void a() {
        this.a.a("DownloadedMediaStreams");
    }

    public C7531vPa<List<C6762kDa>> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        W w = this.a;
        C6840lMa a2 = defpackage.C6694jDa.a.b.a(cda);
        C7471uYa.a((Object) a2, "DbModel.DownloadedMediaS….FACTORY.selectByUrn(urn)");
        f a3 = defpackage.C6694jDa.a.b.a();
        C7471uYa.a((Object) a3, "DbModel.DownloadedMediaS…CTORY.selectByUrnMapper()");
        C7531vPa<List<C6762kDa>> a4 = w.a((Xd) a2, (C6772kMa<T>) a3).j().e((C7118pQa<? super T, ? extends Iterable<? extends U>>) C6966nDa.a).h(C7035oDa.a).r().i().a((C7256rQa<? super T>) C7104pDa.a);
        C7471uYa.a((Object) a4, "mediaStreamsDatabase\n   …ilter { it.isNotEmpty() }");
        return a4;
    }

    public C6979nPa a(Iterable<C3508cda> iterable) {
        C7471uYa.b(iterable, "urns");
        W w = this.a;
        return w.b(new C6898mDa(w, iterable));
    }
}

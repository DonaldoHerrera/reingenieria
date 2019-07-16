package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/foundation/media/MediaId;", "", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "collection", "Lcom/soundcloud/android/foundation/media/Collection;", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/media/Collection;)V", "getCollection", "()Lcom/soundcloud/android/foundation/media/Collection;", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component2", "copy", "equals", "", "other", "formatToString", "", "hashCode", "", "toString", "Companion", "media-id_release"}, mv = {1, 1, 15})
/* renamed from: tea reason: default package and case insensitive filesystem */
/* compiled from: MediaId.kt */
public final class C3880tea {
    public static final a a = new a(null);
    private final C3508cda b;
    private final C3872sea c;

    /* renamed from: tea$a */
    /* compiled from: MediaId.kt */
    public static final class a {
        private a() {
        }

        public final C3880tea a(String str) {
            String str2 = "mediaId";
            C7471uYa.b(str, str2);
            Uri parse = Uri.parse(str);
            C7471uYa.a((Object) parse, "uri");
            boolean a = C7471uYa.a((Object) parse.getScheme(), (Object) str2);
            if (!TVa.a || a) {
                String path = parse.getPath();
                C3872sea sea = null;
                if (path != null) {
                    C3508cda cda = new C3508cda(Hxb.a(path, (CharSequence) "/"));
                    String queryParameter = parse.getQueryParameter("collection");
                    if (queryParameter != null) {
                        sea = C3888uea.b(queryParameter);
                    }
                    return new C3880tea(cda, sea);
                }
                C7471uYa.a();
                throw null;
            }
            throw new AssertionError("Assertion failed");
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3880tea(C3508cda cda, C3872sea sea) {
        C7471uYa.b(cda, "urn");
        this.b = cda;
        this.c = sea;
    }

    public final String a() {
        Builder path = new Builder().scheme("mediaId").path(this.b.b());
        C3872sea sea = this.c;
        if (sea != null) {
            path.appendQueryParameter("collection", sea.a());
        }
        String uri = path.build().toString();
        C7471uYa.a((Object) uri, "Uri.Builder()\n          …)\n            .toString()");
        return uri;
    }

    public final C3508cda b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3880tea) {
                C3880tea tea = (C3880tea) obj;
                if (C7471uYa.a((Object) this.b, (Object) tea.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda cda = this.b;
        int i = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        C3872sea sea = this.c;
        if (sea != null) {
            i = sea.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaId(urn=");
        sb.append(this.b);
        sb.append(", collection=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C3880tea(C3508cda cda, C3872sea sea, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            sea = null;
        }
        this(cda, sea);
    }
}

package com.soundcloud.android.search;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/search/SearchResultHeader;", "Lcom/soundcloud/android/foundation/domain/ListItem;", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "imageUrlTemplate", "Lcom/soundcloud/java/optional/Optional;", "", "typeResource", "", "resultCount", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/java/optional/Optional;II)V", "getImageUrlTemplate", "()Lcom/soundcloud/java/optional/Optional;", "getResultCount", "()I", "getTypeResource", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: SearchResultHeaderRenderer.kt */
public final class F implements Wca {
    public static final a a = new a(null);
    private final C3508cda b;
    private final C4928GKa<String> c;
    private final int d;
    private final int e;

    /* compiled from: SearchResultHeaderRenderer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3508cda a() {
        return this.b;
    }

    public C4928GKa<String> b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof F) {
                F f = (F) obj;
                if (C7471uYa.a((Object) a(), (Object) f.a()) && C7471uYa.a((Object) b(), (Object) f.b())) {
                    if (this.d == f.d) {
                        if (this.e == f.e) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C3508cda a2 = a();
        int i = 0;
        int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
        C4928GKa b2 = b();
        if (b2 != null) {
            i = b2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchResultHeader(urn=");
        sb.append(a());
        sb.append(", imageUrlTemplate=");
        sb.append(b());
        sb.append(", typeResource=");
        sb.append(this.d);
        sb.append(", resultCount=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}

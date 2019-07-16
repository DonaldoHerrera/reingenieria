package com.soundcloud.android.ads.data;

@EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/ads/data/StoredAd;", "", "()V", "Ad", "Error", "Lcom/soundcloud/android/ads/data/StoredAd$Ad;", "Lcom/soundcloud/android/ads/data/StoredAd$Error;", "ads-data_release"}, mv = {1, 1, 15})
/* compiled from: VideoAdStorage.kt */
public abstract class g {

    /* compiled from: VideoAdStorage.kt */
    public static final class a extends g {
        private final com.soundcloud.android.foundation.ads.aa.a a;

        public a(com.soundcloud.android.foundation.ads.aa.a aVar) {
            C7471uYa.b(aVar, "ad");
            super(null);
            this.a = aVar;
        }

        public final com.soundcloud.android.foundation.ads.aa.a a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.ads.data.g.a) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            com.soundcloud.android.foundation.ads.aa.a aVar = this.a;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Ad(ad=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: VideoAdStorage.kt */
    public static final class b extends g {
        private final com.soundcloud.android.foundation.ads.C3691s.b a;

        public b(com.soundcloud.android.foundation.ads.C3691s.b bVar) {
            C7471uYa.b(bVar, "error");
            super(null);
            this.a = bVar;
        }

        public final com.soundcloud.android.foundation.ads.C3691s.b a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.ads.data.g.b) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            com.soundcloud.android.foundation.ads.C3691s.b bVar = this.a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Error(error=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    private g() {
    }

    public /* synthetic */ g(C7264rYa rya) {
        this();
    }
}

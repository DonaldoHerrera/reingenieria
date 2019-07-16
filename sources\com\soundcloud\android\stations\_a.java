package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.m;

@EVa(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/soundcloud/android/stations/StationInfoPageClickParams;", "", "()V", "LikeStationClickParams", "PlayStationClickParams", "TrackClickParams", "Lcom/soundcloud/android/stations/StationInfoPageClickParams$LikeStationClickParams;", "Lcom/soundcloud/android/stations/StationInfoPageClickParams$TrackClickParams;", "Lcom/soundcloud/android/stations/StationInfoPageClickParams$PlayStationClickParams;", "base_release"}, mv = {1, 1, 15})
/* compiled from: StationInfoAdapter.kt */
public abstract class _a {

    /* compiled from: StationInfoAdapter.kt */
    public static final class a extends _a {
        private final C3508cda a;
        private final boolean b;

        public a(C3508cda cda, boolean z) {
            C7471uYa.b(cda, "stationUrn");
            super(null);
            this.a = cda;
            this.b = z;
        }

        public final C3508cda a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                        if (this.b == aVar.b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda cda = this.a;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            boolean z = this.b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LikeStationClickParams(stationUrn=");
            sb.append(this.a);
            sb.append(", isLiked=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: StationInfoAdapter.kt */
    public static final class b extends _a {
        private final C3508cda a;
        private final m b;

        public b(C3508cda cda, m mVar) {
            C7471uYa.b(cda, "stationUrn");
            C7471uYa.b(mVar, "discoverySource");
            super(null);
            this.a = cda;
            this.b = mVar;
        }

        public final m a() {
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
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
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
            m mVar = this.b;
            if (mVar != null) {
                i = mVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayStationClickParams(stationUrn=");
            sb.append(this.a);
            sb.append(", discoverySource=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: StationInfoAdapter.kt */
    public static final class c extends _a {
        private final C3508cda a;
        private final m b;
        private final int c;

        public c(C3508cda cda, m mVar, int i) {
            C7471uYa.b(cda, "stationUrn");
            C7471uYa.b(mVar, "discoverySource");
            super(null);
            this.a = cda;
            this.b = mVar;
            this.c = i;
        }

        public final m a() {
            return this.b;
        }

        public final C3508cda b() {
            return this.a;
        }

        public final int c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a) && C7471uYa.a((Object) this.b, (Object) cVar.b)) {
                        if (this.c == cVar.c) {
                            return true;
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
            m mVar = this.b;
            if (mVar != null) {
                i = mVar.hashCode();
            }
            return ((hashCode + i) * 31) + this.c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TrackClickParams(stationUrn=");
            sb.append(this.a);
            sb.append(", discoverySource=");
            sb.append(this.b);
            sb.append(", trackPosition=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    private _a() {
    }

    public /* synthetic */ _a(C7264rYa rya) {
        this();
    }
}

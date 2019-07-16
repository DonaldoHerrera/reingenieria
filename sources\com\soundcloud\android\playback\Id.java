package com.soundcloud.android.playback;

@EVa(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/soundcloud/android/playback/StreamUrls;", "", "()V", "FileStreamUrl", "WebStreamUrls", "Lcom/soundcloud/android/playback/StreamUrls$WebStreamUrls;", "Lcom/soundcloud/android/playback/StreamUrls$FileStreamUrl;", "base_release"}, mv = {1, 1, 15})
/* compiled from: StreamSelector.kt */
public abstract class Id {

    /* compiled from: StreamSelector.kt */
    public static final class a extends Id {
        private final C4308fd a;

        public a(C4308fd fdVar) {
            C7471uYa.b(fdVar, "stream");
            super(null);
            this.a = fdVar;
        }

        public final C4308fd a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.playback.Id.a) r2).a) != false) goto L_0x0015;
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
            C4308fd fdVar = this.a;
            if (fdVar != null) {
                return fdVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FileStreamUrl(stream=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: StreamSelector.kt */
    public static final class b extends Id {
        private final C4308fd a;
        private final C4308fd b;

        public b(C4308fd fdVar, C4308fd fdVar2) {
            C7471uYa.b(fdVar, "progressive");
            C7471uYa.b(fdVar2, "hls");
            super(null);
            this.a = fdVar;
            this.b = fdVar2;
        }

        public final C4308fd a() {
            return this.b;
        }

        public final C4308fd b() {
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
            C4308fd fdVar = this.a;
            int i = 0;
            int hashCode = (fdVar != null ? fdVar.hashCode() : 0) * 31;
            C4308fd fdVar2 = this.b;
            if (fdVar2 != null) {
                i = fdVar2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("WebStreamUrls(progressive=");
            sb.append(this.a);
            sb.append(", hls=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    private Id() {
    }

    public /* synthetic */ Id(C7264rYa rya) {
        this();
    }
}

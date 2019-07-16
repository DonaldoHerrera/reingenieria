package com.soundcloud.android.trackinfo;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/trackinfo/TrackStats;", "", "hasStats", "", "(Z)V", "getHasStats", "()Z", "CommentsStats", "LikesStats", "PlaysStats", "RepostsStats", "Lcom/soundcloud/android/trackinfo/TrackStats$LikesStats;", "Lcom/soundcloud/android/trackinfo/TrackStats$CommentsStats;", "Lcom/soundcloud/android/trackinfo/TrackStats$PlaysStats;", "Lcom/soundcloud/android/trackinfo/TrackStats$RepostsStats;", "trackinfo_release"}, mv = {1, 1, 15})
/* compiled from: NewTrackInfoPresenter.kt */
public abstract class C {
    private final boolean a;

    /* compiled from: NewTrackInfoPresenter.kt */
    public static final class a extends C {
        private final boolean b;
        private final int c;

        public a(boolean z, int i) {
            super(z, null);
            this.b = z;
            this.c = i;
        }

        public boolean a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (a() == aVar.a()) {
                        if (this.c == aVar.c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean a = a();
            if (a) {
                a = true;
            }
            return ((a ? 1 : 0) * true) + this.c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CommentsStats(hasStats=");
            sb.append(a());
            sb.append(", statsCount=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: NewTrackInfoPresenter.kt */
    public static final class b extends C {
        private final boolean b;
        private final String c;

        public b(boolean z, String str) {
            C7471uYa.b(str, "statsCount");
            super(z, null);
            this.b = z;
            this.c = str;
        }

        public boolean a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (!(a() == bVar.a()) || !C7471uYa.a((Object) this.c, (Object) bVar.c)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean a = a();
            if (a) {
                a = true;
            }
            int i = (a ? 1 : 0) * true;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LikesStats(hasStats=");
            sb.append(a());
            sb.append(", statsCount=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: NewTrackInfoPresenter.kt */
    public static final class c extends C {
        private final boolean b;
        private final String c;

        public c(boolean z, String str) {
            C7471uYa.b(str, "statsCount");
            super(z, null);
            this.b = z;
            this.c = str;
        }

        public boolean a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (!(a() == cVar.a()) || !C7471uYa.a((Object) this.c, (Object) cVar.c)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean a = a();
            if (a) {
                a = true;
            }
            int i = (a ? 1 : 0) * true;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaysStats(hasStats=");
            sb.append(a());
            sb.append(", statsCount=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: NewTrackInfoPresenter.kt */
    public static final class d extends C {
        private final boolean b;
        private final String c;

        public d(boolean z, String str) {
            C7471uYa.b(str, "statsCount");
            super(z, null);
            this.b = z;
            this.c = str;
        }

        public boolean a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (!(a() == dVar.a()) || !C7471uYa.a((Object) this.c, (Object) dVar.c)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            boolean a = a();
            if (a) {
                a = true;
            }
            int i = (a ? 1 : 0) * true;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RepostsStats(hasStats=");
            sb.append(a());
            sb.append(", statsCount=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    private C(boolean z) {
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }

    public /* synthetic */ C(boolean z, C7264rYa rya) {
        this(z);
    }
}

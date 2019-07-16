package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.tracks.C6185ma;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/profile/ProfileBucketsItem;", "", "()V", "DividerItem", "EndOfListDividerItem", "HeaderItem", "Playlist", "Track", "ViewAll", "Lcom/soundcloud/android/profile/ProfileBucketsItem$DividerItem;", "Lcom/soundcloud/android/profile/ProfileBucketsItem$EndOfListDividerItem;", "Lcom/soundcloud/android/profile/ProfileBucketsItem$HeaderItem;", "Lcom/soundcloud/android/profile/ProfileBucketsItem$ViewAll;", "Lcom/soundcloud/android/profile/ProfileBucketsItem$Track;", "Lcom/soundcloud/android/profile/ProfileBucketsItem$Playlist;", "base_release"}, mv = {1, 1, 15})
/* compiled from: ProfileBucketsDataSource.kt */
public abstract class P {

    /* compiled from: ProfileBucketsDataSource.kt */
    public static final class a extends P {
        private final int a;

        public a(int i) {
            super(null);
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    if (this.a == ((a) obj).a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DividerItem(collectionType=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: ProfileBucketsDataSource.kt */
    public static final class b extends P {
        public b() {
            super(null);
        }
    }

    /* compiled from: ProfileBucketsDataSource.kt */
    public static final class c extends P {
        private final int a;

        public c(int i) {
            super(null);
            this.a = i;
        }

        public final int a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    if (this.a == ((c) obj).a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HeaderItem(collectionType=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: ProfileBucketsDataSource.kt */
    public static final class d extends P {
        private final C3863rda a;
        private final C4621nja b;
        private final int c;
        private final v d;
        private final boolean e;

        public d(C3863rda rda, C4621nja nja, int i, v vVar, boolean z) {
            C7471uYa.b(rda, "playlistItem");
            C7471uYa.b(nja, "navigationTarget");
            C7471uYa.b(vVar, "module");
            super(null);
            this.a = rda;
            this.b = nja;
            this.c = i;
            this.d = vVar;
            this.e = z;
        }

        public final int a() {
            return this.c;
        }

        public final boolean b() {
            return this.e;
        }

        public final v c() {
            return this.d;
        }

        public final C4621nja d() {
            return this.b;
        }

        public final C3863rda e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) this.a, (Object) dVar.a) && C7471uYa.a((Object) this.b, (Object) dVar.b)) {
                        if ((this.c == dVar.c) && C7471uYa.a((Object) this.d, (Object) dVar.d)) {
                            if (this.e == dVar.e) {
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
            C3863rda rda = this.a;
            int i = 0;
            int hashCode = (rda != null ? rda.hashCode() : 0) * 31;
            C4621nja nja = this.b;
            int hashCode2 = (((hashCode + (nja != null ? nja.hashCode() : 0)) * 31) + this.c) * 31;
            v vVar = this.d;
            if (vVar != null) {
                i = vVar.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Playlist(playlistItem=");
            sb.append(this.a);
            sb.append(", navigationTarget=");
            sb.append(this.b);
            sb.append(", collectionType=");
            sb.append(this.c);
            sb.append(", module=");
            sb.append(this.d);
            sb.append(", goToProfileEnabled=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: ProfileBucketsDataSource.kt */
    public static final class e extends P {
        private final C6185ma a;
        private final com.soundcloud.android.playback.Db.a b;
        private final int c;
        private final v d;
        private final boolean e;

        public e(C6185ma maVar, com.soundcloud.android.playback.Db.a aVar, int i, v vVar, boolean z) {
            C7471uYa.b(maVar, "trackItem");
            C7471uYa.b(aVar, "playParams");
            C7471uYa.b(vVar, "module");
            super(null);
            this.a = maVar;
            this.b = aVar;
            this.c = i;
            this.d = vVar;
            this.e = z;
        }

        public final int a() {
            return this.c;
        }

        public final boolean b() {
            return this.e;
        }

        public final v c() {
            return this.d;
        }

        public final com.soundcloud.android.playback.Db.a d() {
            return this.b;
        }

        public final C6185ma e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    if (C7471uYa.a((Object) this.a, (Object) eVar.a) && C7471uYa.a((Object) this.b, (Object) eVar.b)) {
                        if ((this.c == eVar.c) && C7471uYa.a((Object) this.d, (Object) eVar.d)) {
                            if (this.e == eVar.e) {
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
            C6185ma maVar = this.a;
            int i = 0;
            int hashCode = (maVar != null ? maVar.hashCode() : 0) * 31;
            com.soundcloud.android.playback.Db.a aVar = this.b;
            int hashCode2 = (((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.c) * 31;
            v vVar = this.d;
            if (vVar != null) {
                i = vVar.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Track(trackItem=");
            sb.append(this.a);
            sb.append(", playParams=");
            sb.append(this.b);
            sb.append(", collectionType=");
            sb.append(this.c);
            sb.append(", module=");
            sb.append(this.d);
            sb.append(", goToProfileEnabled=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: ProfileBucketsDataSource.kt */
    public static final class f extends P {
        private final C4621nja a;
        private final int b;

        public f(C4621nja nja, int i) {
            C7471uYa.b(nja, "navigationTarget");
            super(null);
            this.a = nja;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final C4621nja b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if (C7471uYa.a((Object) this.a, (Object) fVar.a)) {
                        if (this.b == fVar.b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C4621nja nja = this.a;
            return ((nja != null ? nja.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewAll(navigationTarget=");
            sb.append(this.a);
            sb.append(", collectionType=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    private P() {
    }

    public /* synthetic */ P(C7264rYa rya) {
        this();
    }
}

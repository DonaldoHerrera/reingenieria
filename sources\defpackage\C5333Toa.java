package defpackage;

@EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem;", "", "kind", "Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem$Kind;", "(Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem$Kind;)V", "getKind", "()Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem$Kind;", "isSameIdentity", "", "other", "AddTrackToPlaylist", "CreatePlaylistForTrack", "Kind", "Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem$CreatePlaylistForTrack;", "Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem$AddTrackToPlaylist;", "base_release"}, mv = {1, 1, 15})
/* renamed from: Toa reason: default package and case insensitive filesystem */
/* compiled from: AddTrackToPlaylistItem.kt */
public abstract class C5333Toa {
    private final c a;

    /* renamed from: Toa$a */
    /* compiled from: AddTrackToPlaylistItem.kt */
    public static final class a extends C5333Toa {
        private final C3508cda b;
        private final String c;
        private final int d;
        private final boolean e;
        private final boolean f;
        private final boolean g;
        private final boolean h;

        public /* synthetic */ a(C3508cda cda, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, C7264rYa rya) {
            this(cda, str, i, z, z2, z3, (i2 & 64) != 0 ? false : z4);
        }

        public static /* synthetic */ a a(a aVar, C3508cda cda, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cda = aVar.b;
            }
            if ((i2 & 2) != 0) {
                str = aVar.c;
            }
            String str2 = str;
            if ((i2 & 4) != 0) {
                i = aVar.d;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = aVar.e;
            }
            boolean z5 = z;
            if ((i2 & 16) != 0) {
                z2 = aVar.f;
            }
            boolean z6 = z2;
            if ((i2 & 32) != 0) {
                z3 = aVar.g;
            }
            boolean z7 = z3;
            if ((i2 & 64) != 0) {
                z4 = aVar.h;
            }
            return aVar.a(cda, str2, i3, z5, z6, z7, z4);
        }

        public final a a(C3508cda cda, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            C3508cda cda2 = cda;
            C7471uYa.b(cda, "playlistUrn");
            String str2 = str;
            C7471uYa.b(str, "title");
            a aVar = new a(cda2, str2, i, z, z2, z3, z4);
            return aVar;
        }

        public final C3508cda b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public final boolean e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.b, (Object) aVar.b) && C7471uYa.a((Object) this.c, (Object) aVar.c)) {
                        if (this.d == aVar.d) {
                            if (this.e == aVar.e) {
                                if (this.f == aVar.f) {
                                    if (this.g == aVar.g) {
                                        if (this.h == aVar.h) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean f() {
            return this.h;
        }

        public final boolean g() {
            return this.e;
        }

        public final boolean h() {
            return this.g;
        }

        public int hashCode() {
            C3508cda cda = this.b;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            String str = this.c;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (((hashCode + i) * 31) + this.d) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            int i3 = (i2 + (z ? 1 : 0)) * 31;
            boolean z2 = this.f;
            if (z2) {
                z2 = true;
            }
            int i4 = (i3 + (z2 ? 1 : 0)) * 31;
            boolean z3 = this.g;
            if (z3) {
                z3 = true;
            }
            int i5 = (i4 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.h;
            if (z4) {
                z4 = true;
            }
            return i5 + (z4 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AddTrackToPlaylist(playlistUrn=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", trackCount=");
            sb.append(this.d);
            sb.append(", isPrivate=");
            sb.append(this.e);
            sb.append(", isOffline=");
            sb.append(this.f);
            sb.append(", isTrackAdded=");
            sb.append(this.g);
            sb.append(", isOfflineContentEnabled=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }

        public a(C3508cda cda, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
            C7471uYa.b(cda, "playlistUrn");
            C7471uYa.b(str, "title");
            super(c.ADD_TO_PLAYLIST, null);
            this.b = cda;
            this.c = str;
            this.d = i;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
        }
    }

    /* renamed from: Toa$b */
    /* compiled from: AddTrackToPlaylistItem.kt */
    public static final class b extends C5333Toa {
        public static final b b = new b();

        private b() {
            super(c.CREATE_PLAYLIST, null);
        }
    }

    /* renamed from: Toa$c */
    /* compiled from: AddTrackToPlaylistItem.kt */
    public enum c {
        CREATE_PLAYLIST,
        ADD_TO_PLAYLIST
    }

    private C5333Toa(c cVar) {
        this.a = cVar;
    }

    public final c a() {
        return this.a;
    }

    public /* synthetic */ C5333Toa(c cVar, C7264rYa rya) {
        this(cVar);
    }

    public final boolean a(C5333Toa toa) {
        C7471uYa.b(toa, "other");
        if ((this instanceof b) && (toa instanceof b)) {
            return true;
        }
        if (!(this instanceof a) || !(toa instanceof a)) {
            return false;
        }
        a aVar = (a) this;
        return C7471uYa.a((Object) aVar.b(), (Object) aVar.b());
    }
}

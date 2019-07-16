package com.soundcloud.android.features.library.playlists;

import com.soundcloud.android.features.library.aa.o;

@EVa(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B+\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem;", "Lcom/soundcloud/android/foundation/domain/ListItem;", "isSingleSpan", "", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "imageUrlTemplate", "Lcom/soundcloud/java/optional/Optional;", "", "(ZLcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/java/optional/Optional;)V", "getImageUrlTemplate", "()Lcom/soundcloud/java/optional/Optional;", "()Z", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "Empty", "Header", "Playlist", "RemoveFilter", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem$Header;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem$Playlist;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem$RemoveFilter;", "Lcom/soundcloud/android/features/library/playlists/PlaylistCollectionItem$Empty;", "collections-ui_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.features.library.playlists.l reason: case insensitive filesystem */
/* compiled from: PlaylistCollectionItem.kt */
public abstract class C3635l implements Wca {
    private final boolean a;
    private final C3508cda b;
    private final C4928GKa<String> c;

    /* renamed from: com.soundcloud.android.features.library.playlists.l$a */
    /* compiled from: PlaylistCollectionItem.kt */
    public static final class a extends C3635l {
        public static final a d = new a();

        private a() {
            super(false, null, null, 7, null);
        }
    }

    /* renamed from: com.soundcloud.android.features.library.playlists.l$b */
    /* compiled from: PlaylistCollectionItem.kt */
    public static final class b extends C3635l {
        private final int d;

        public b(int i) {
            super(false, null, null, 7, null);
            this.d = i;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return o.collections_playlists_and_albums_header_plural;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    if (this.d == ((b) obj).d) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Header(playlistCount=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.features.library.playlists.l$c */
    /* compiled from: PlaylistCollectionItem.kt */
    public static final class c extends C3635l {
        private final C3863rda d;
        private final C3508cda e;
        private final C4928GKa<String> f;

        public /* synthetic */ c(C3863rda rda, C3508cda cda, C4928GKa gKa, int i, C7264rYa rya) {
            if ((i & 2) != 0) {
                cda = rda.a();
                C7471uYa.a((Object) cda, "playlistItem.urn");
            }
            if ((i & 4) != 0) {
                gKa = rda.b();
                C7471uYa.a((Object) gKa, "playlistItem.imageUrlTemplate");
            }
            this(rda, cda, gKa);
        }

        public C3508cda a() {
            return this.e;
        }

        public C4928GKa<String> b() {
            return this.f;
        }

        public final C3863rda d() {
            return this.d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) b(), (java.lang.Object) r3.b()) != false) goto L_0x0031;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.d, (Object) cVar.d)) {
                        if (C7471uYa.a((Object) a(), (Object) cVar.a())) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3863rda rda = this.d;
            int i = 0;
            int hashCode = (rda != null ? rda.hashCode() : 0) * 31;
            C3508cda a = a();
            int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
            C4928GKa b = b();
            if (b != null) {
                i = b.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Playlist(playlistItem=");
            sb.append(this.d);
            sb.append(", urn=");
            sb.append(a());
            sb.append(", imageUrlTemplate=");
            sb.append(b());
            sb.append(")");
            return sb.toString();
        }

        public c(C3863rda rda, C3508cda cda, C4928GKa<String> gKa) {
            C7471uYa.b(rda, "playlistItem");
            C7471uYa.b(cda, "urn");
            C7471uYa.b(gKa, "imageUrlTemplate");
            super(true, cda, gKa, null);
            this.d = rda;
            this.e = cda;
            this.f = gKa;
        }
    }

    /* renamed from: com.soundcloud.android.features.library.playlists.l$d */
    /* compiled from: PlaylistCollectionItem.kt */
    public static final class d extends C3635l {
        public static final d d = new d();

        private d() {
            super(false, null, null, 7, null);
        }
    }

    private C3635l(boolean z, C3508cda cda, C4928GKa<String> gKa) {
        this.a = z;
        this.b = cda;
        this.c = gKa;
    }

    public C3508cda a() {
        return this.b;
    }

    public C4928GKa<String> b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public /* synthetic */ C3635l(boolean z, C3508cda cda, C4928GKa gKa, C7264rYa rya) {
        this(z, cda, gKa);
    }

    /* synthetic */ C3635l(boolean z, C3508cda cda, C4928GKa gKa, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            cda = C3508cda.a;
            C7471uYa.a((Object) cda, "Urn.NOT_SET");
        }
        if ((i & 4) != 0) {
            gKa = C4928GKa.a();
            C7471uYa.a((Object) gKa, "Optional.absent()");
        }
        this(z, cda, gKa);
    }
}

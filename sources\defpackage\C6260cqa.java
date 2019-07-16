package defpackage;

import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.upsell.p;
import java.util.List;

@EVa(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/soundcloud/android/playlists/PlaylistDetailItem;", "", "playlistItemKind", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$Kind;", "(Lcom/soundcloud/android/playlists/PlaylistDetailItem$Kind;)V", "isTrackItem", "", "()Z", "getPlaylistItemKind", "()Lcom/soundcloud/android/playlists/PlaylistDetailItem$Kind;", "Companion", "Kind", "PlaylistDetailEmptyItem", "PlaylistDetailOtherPlaylistsItem", "PlaylistDetailTrackItem", "PlaylistDetailUpsellItem", "PlaylistDetailsHeaderItem", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailsHeaderItem;", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailEmptyItem;", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailOtherPlaylistsItem;", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailTrackItem;", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailUpsellItem;", "base_release"}, mv = {1, 1, 15})
/* renamed from: cqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailItem.kt */
public abstract class C6260cqa {
    public static final a a = new a(null);
    private final b b;

    /* renamed from: cqa$a */
    /* compiled from: PlaylistDetailItem.kt */
    public static final class a {
        private a() {
        }

        public final boolean a(C6260cqa cqa, C6260cqa cqa2) {
            C7471uYa.b(cqa, "item1");
            C7471uYa.b(cqa2, "item2");
            if (!a(cqa) || !a(cqa2)) {
                return cqa.c() == cqa2.c();
            }
            return C7471uYa.a((Object) ((e) cqa).a(), (Object) ((e) cqa2).a());
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final boolean a(C6260cqa cqa) {
            return cqa.c() == b.TrackItem;
        }
    }

    /* renamed from: cqa$b */
    /* compiled from: PlaylistDetailItem.kt */
    public enum b {
        HeaderItem,
        TrackItem,
        UpsellItem,
        OtherPlaylists,
        EmptyItem
    }

    /* renamed from: cqa$c */
    /* compiled from: PlaylistDetailItem.kt */
    public static final class c extends C6260cqa {
        private final C4891FEa c;
        private final boolean d;

        public c(C4891FEa fEa, boolean z) {
            C7471uYa.b(fEa, "emptyStatus");
            super(b.EmptyItem, null);
            this.c = fEa;
            this.d = z;
        }

        public final C4891FEa e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.c, (Object) cVar.c)) {
                        if (this.d == cVar.d) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean f() {
            return this.d;
        }

        public int hashCode() {
            C4891FEa fEa = this.c;
            int hashCode = (fEa != null ? fEa.hashCode() : 0) * 31;
            boolean z = this.d;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaylistDetailEmptyItem(emptyStatus=");
            sb.append(this.c);
            sb.append(", isOwner=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: cqa$d */
    /* compiled from: PlaylistDetailItem.kt */
    public static final class d extends C6260cqa {
        private final String c;
        private final List<C3863rda> d;
        private final boolean e;

        public d(String str, List<? extends C3863rda> list, boolean z) {
            C7471uYa.b(str, "creatorName");
            C7471uYa.b(list, "otherPlaylists");
            super(b.OtherPlaylists, null);
            this.c = str;
            this.d = list;
            this.e = z;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) this.c, (Object) dVar.c) && C7471uYa.a((Object) this.d, (Object) dVar.d)) {
                        if (this.e == dVar.e) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final List<C3863rda> f() {
            return this.d;
        }

        public final boolean g() {
            return this.e;
        }

        public int hashCode() {
            String str = this.c;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<C3863rda> list = this.d;
            if (list != null) {
                i = list.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaylistDetailOtherPlaylistsItem(creatorName=");
            sb.append(this.c);
            sb.append(", otherPlaylists=");
            sb.append(this.d);
            sb.append(", isAlbum=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: cqa$e */
    /* compiled from: PlaylistDetailItem.kt */
    public static final class e extends C6260cqa implements Wca {
        private final C4928GKa<String> c;
        private final C3508cda d;
        private final C3508cda e;
        private final C3508cda f;
        private final PromotedSourceInfo g;
        private final C6185ma h;
        private final boolean i;
        private final com.soundcloud.android.playback.Db.a j;

        public e(C3508cda cda, C3508cda cda2, PromotedSourceInfo promotedSourceInfo, C6185ma maVar, boolean z, com.soundcloud.android.playback.Db.a aVar) {
            C7471uYa.b(cda, "playlistUrn");
            C7471uYa.b(cda2, "playlistOwnerUrn");
            C7471uYa.b(maVar, "trackItem");
            C7471uYa.b(aVar, "playParams");
            super(b.TrackItem, null);
            this.e = cda;
            this.f = cda2;
            this.g = promotedSourceInfo;
            this.h = maVar;
            this.i = z;
            this.j = aVar;
            C4928GKa<String> b = this.h.b();
            C7471uYa.a((Object) b, "trackItem.imageUrlTemplate");
            this.c = b;
            C3508cda a = this.h.a();
            C7471uYa.a((Object) a, "trackItem.urn");
            this.d = a;
        }

        public static /* synthetic */ e a(e eVar, C3508cda cda, C3508cda cda2, PromotedSourceInfo promotedSourceInfo, C6185ma maVar, boolean z, com.soundcloud.android.playback.Db.a aVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cda = eVar.e;
            }
            if ((i2 & 2) != 0) {
                cda2 = eVar.f;
            }
            C3508cda cda3 = cda2;
            if ((i2 & 4) != 0) {
                promotedSourceInfo = eVar.g;
            }
            PromotedSourceInfo promotedSourceInfo2 = promotedSourceInfo;
            if ((i2 & 8) != 0) {
                maVar = eVar.h;
            }
            C6185ma maVar2 = maVar;
            if ((i2 & 16) != 0) {
                z = eVar.i;
            }
            boolean z2 = z;
            if ((i2 & 32) != 0) {
                aVar = eVar.j;
            }
            return eVar.a(cda, cda3, promotedSourceInfo2, maVar2, z2, aVar);
        }

        public C3508cda a() {
            return this.d;
        }

        public final e a(C3508cda cda, C3508cda cda2, PromotedSourceInfo promotedSourceInfo, C6185ma maVar, boolean z, com.soundcloud.android.playback.Db.a aVar) {
            C7471uYa.b(cda, "playlistUrn");
            C7471uYa.b(cda2, "playlistOwnerUrn");
            C7471uYa.b(maVar, "trackItem");
            C7471uYa.b(aVar, "playParams");
            e eVar = new e(cda, cda2, promotedSourceInfo, maVar, z, aVar);
            return eVar;
        }

        public C4928GKa<String> b() {
            return this.c;
        }

        public final com.soundcloud.android.playback.Db.a e() {
            return this.j;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    if (C7471uYa.a((Object) this.e, (Object) eVar.e) && C7471uYa.a((Object) this.f, (Object) eVar.f) && C7471uYa.a((Object) this.g, (Object) eVar.g) && C7471uYa.a((Object) this.h, (Object) eVar.h)) {
                        if (!(this.i == eVar.i) || !C7471uYa.a((Object) this.j, (Object) eVar.j)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final C3508cda f() {
            return this.f;
        }

        public final C3508cda g() {
            return this.e;
        }

        public final PromotedSourceInfo h() {
            return this.g;
        }

        public int hashCode() {
            C3508cda cda = this.e;
            int i2 = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            C3508cda cda2 = this.f;
            int hashCode2 = (hashCode + (cda2 != null ? cda2.hashCode() : 0)) * 31;
            PromotedSourceInfo promotedSourceInfo = this.g;
            int hashCode3 = (hashCode2 + (promotedSourceInfo != null ? promotedSourceInfo.hashCode() : 0)) * 31;
            C6185ma maVar = this.h;
            int hashCode4 = (hashCode3 + (maVar != null ? maVar.hashCode() : 0)) * 31;
            boolean z = this.i;
            if (z) {
                z = true;
            }
            int i3 = (hashCode4 + (z ? 1 : 0)) * 31;
            com.soundcloud.android.playback.Db.a aVar = this.j;
            if (aVar != null) {
                i2 = aVar.hashCode();
            }
            return i3 + i2;
        }

        public final C6185ma i() {
            return this.h;
        }

        public final boolean j() {
            return this.i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaylistDetailTrackItem(playlistUrn=");
            sb.append(this.e);
            sb.append(", playlistOwnerUrn=");
            sb.append(this.f);
            sb.append(", promotedSourceInfo=");
            sb.append(this.g);
            sb.append(", trackItem=");
            sb.append(this.h);
            sb.append(", isInEditMode=");
            sb.append(this.i);
            sb.append(", playParams=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }

        public final e a(boolean z) {
            return a(this, null, null, null, null, z, null, 47, null);
        }
    }

    /* renamed from: cqa$f */
    /* compiled from: PlaylistDetailItem.kt */
    public static final class f extends C6260cqa implements Wca {
        private final C3508cda c;
        private final C4928GKa<String> d;
        private final C6185ma e;
        private final C3508cda f;

        public f(C6185ma maVar, C3508cda cda) {
            C7471uYa.b(maVar, "track");
            C7471uYa.b(cda, "playlistUrn");
            super(b.UpsellItem, null);
            this.e = maVar;
            this.f = cda;
            C3508cda cda2 = p.a;
            C7471uYa.a((Object) cda2, "UpsellListItem.PLAYLIST_UPSELL_URN");
            this.c = cda2;
            C4928GKa<String> a = C4928GKa.a();
            C7471uYa.a((Object) a, "Optional.absent()");
            this.d = a;
        }

        public C3508cda a() {
            return this.c;
        }

        public C4928GKa<String> b() {
            return this.d;
        }

        public final C3508cda e() {
            return this.f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.f, (java.lang.Object) r3.f) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if (C7471uYa.a((Object) this.e, (Object) fVar.e)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final C6185ma f() {
            return this.e;
        }

        public int hashCode() {
            C6185ma maVar = this.e;
            int i = 0;
            int hashCode = (maVar != null ? maVar.hashCode() : 0) * 31;
            C3508cda cda = this.f;
            if (cda != null) {
                i = cda.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaylistDetailUpsellItem(track=");
            sb.append(this.e);
            sb.append(", playlistUrn=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: cqa$g */
    /* compiled from: PlaylistDetailItem.kt */
    public static final class g extends C6260cqa {
        private final C6532gqa c;

        public g(C6532gqa gqa) {
            super(b.HeaderItem, null);
            this.c = gqa;
        }

        public final C6532gqa e() {
            return this.c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.c, (java.lang.Object) ((defpackage.C6260cqa.g) r2).c) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof g) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C6532gqa gqa = this.c;
            if (gqa != null) {
                return gqa.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaylistDetailsHeaderItem(metadata=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    private C6260cqa(b bVar) {
        this.b = bVar;
    }

    public final b c() {
        return this.b;
    }

    public final boolean d() {
        return this.b == b.TrackItem;
    }

    public /* synthetic */ C6260cqa(b bVar, C7264rYa rya) {
        this(bVar);
    }
}

package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.tracks.C6185ma;

@EVa(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0000H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem;", "", "()V", "offlineState", "Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "getOfflineState", "()Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "getUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "isSameIdentity", "", "other", "Playlist", "Track", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem$Playlist;", "Lcom/soundcloud/android/features/library/downloads/DownloadsLibraryItem$Track;", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: DownloadsLibraryItem.kt */
public abstract class s {

    /* compiled from: DownloadsLibraryItem.kt */
    public static final class a extends s {
        private final C3863rda a;

        public a(C3863rda rda) {
            C7471uYa.b(rda, "playlist");
            super(null);
            this.a = rda;
        }

        public C3823mda a() {
            return this.a.r();
        }

        public C3508cda b() {
            C3508cda a2 = this.a.a();
            C7471uYa.a((Object) a2, "playlist.urn");
            return a2;
        }

        public final C3863rda c() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.features.library.downloads.s.a) r2).a) != false) goto L_0x0015;
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
            C3863rda rda = this.a;
            if (rda != null) {
                return rda.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Playlist(playlist=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }

        public boolean a(s sVar) {
            C7471uYa.b(sVar, "other");
            return C7471uYa.a((Object) b(), (Object) sVar.b());
        }
    }

    /* compiled from: DownloadsLibraryItem.kt */
    public static final class b extends s {
        private final C6185ma a;

        public b(C6185ma maVar) {
            C7471uYa.b(maVar, "track");
            super(null);
            this.a = maVar;
        }

        public C3823mda a() {
            return this.a.r();
        }

        public C3508cda b() {
            C3508cda a2 = this.a.a();
            C7471uYa.a((Object) a2, "track.urn");
            return a2;
        }

        public final C6185ma c() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.features.library.downloads.s.b) r2).a) != false) goto L_0x0015;
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
            C6185ma maVar = this.a;
            if (maVar != null) {
                return maVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Track(track=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }

        public boolean a(s sVar) {
            C7471uYa.b(sVar, "other");
            return C7471uYa.a((Object) b(), (Object) sVar.b());
        }
    }

    private s() {
    }

    public abstract C3823mda a();

    public abstract boolean a(s sVar);

    public abstract C3508cda b();

    public /* synthetic */ s(C7264rYa rya) {
        this();
    }
}

package defpackage;

import java.util.List;

@EVa(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u001e\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u0002H\u0012J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0003H\u0014J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0002H\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/playlists/AddTracksToPlaylistCommand;", "Lcom/soundcloud/android/commands/WriteStorageCommand;", "Lcom/soundcloud/android/playlists/AddTracksToPlaylistCommand$AddTracksToPlaylistParams;", "Lcom/soundcloud/propeller/WriteResult;", "Lcom/soundcloud/android/playlists/AddTracksToPlaylistCommand$AddTracksToPlaylistResult;", "propeller", "Lcom/soundcloud/propeller/PropellerDatabase;", "dateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "loadPlaylistTrackUrnsCommand", "Lcom/soundcloud/android/playlists/LoadPlaylistTrackUrnsCommand;", "loadCurrentTrackCountCommand", "Lcom/soundcloud/android/playlists/LoadCurrentTrackCountCommand;", "(Lcom/soundcloud/propeller/PropellerDatabase;Lcom/soundcloud/android/utilities/android/date/DateProvider;Lcom/soundcloud/android/playlists/LoadPlaylistTrackUrnsCommand;Lcom/soundcloud/android/playlists/LoadCurrentTrackCountCommand;)V", "getDateProvider", "()Lcom/soundcloud/android/utilities/android/date/DateProvider;", "getLoadPlaylistTrackUrnsCommand", "()Lcom/soundcloud/android/playlists/LoadPlaylistTrackUrnsCommand;", "trackCount", "", "tracksAdded", "omitTracksAlreadyInPlaylist", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "kotlin.jvm.PlatformType", "params", "transform", "result", "write", "AddTracksToPlaylistParams", "AddTracksToPlaylistResult", "base_release"}, mv = {1, 1, 15})
/* renamed from: Uoa reason: default package and case insensitive filesystem */
/* compiled from: AddTracksToPlaylistCommand.kt */
public class C5362Uoa extends C1595pT<a, C6499gLa, b> {
    private int b;
    private int c;
    private final C5694cGa d;
    private final C5421Wpa e;
    private final C5305Spa f;

    /* renamed from: Uoa$a */
    /* compiled from: AddTracksToPlaylistCommand.kt */
    public static final class a {
        private final C3508cda a;
        private final List<C3508cda> b;

        public a(C3508cda cda, List<C3508cda> list) {
            C7471uYa.b(cda, "playlistUrn");
            C7471uYa.b(list, "trackUrns");
            this.a = cda;
            this.b = list;
        }

        public final C3508cda a() {
            return this.a;
        }

        public final List<C3508cda> b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
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
            List<C3508cda> list = this.b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AddTracksToPlaylistParams(playlistUrn=");
            sb.append(this.a);
            sb.append(", trackUrns=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    @EVa(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/soundcloud/android/playlists/AddTracksToPlaylistCommand$AddTracksToPlaylistResult;", "", "addedTracks", "", "numberOfTracksAdded", "", "newTrackCount", "(ZII)V", "getAddedTracks", "()Z", "getNewTrackCount", "()I", "getNumberOfTracksAdded", "FailureResult", "SuccessResult", "Lcom/soundcloud/android/playlists/AddTracksToPlaylistCommand$AddTracksToPlaylistResult$SuccessResult;", "Lcom/soundcloud/android/playlists/AddTracksToPlaylistCommand$AddTracksToPlaylistResult$FailureResult;", "base_release"}, mv = {1, 1, 15})
    /* renamed from: Uoa$b */
    /* compiled from: AddTracksToPlaylistCommand.kt */
    public static abstract class b {
        private final boolean a;
        private final int b;
        private final int c;

        /* renamed from: Uoa$b$a */
        /* compiled from: AddTracksToPlaylistCommand.kt */
        public static final class a extends b {
            private final int d;

            public a(int i) {
                super(false, 0, i, null);
                this.d = i;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                        if (this.d == ((a) obj).d) {
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
                sb.append("FailureResult(currentTrackCount=");
                sb.append(this.d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: Uoa$b$b reason: collision with other inner class name */
        /* compiled from: AddTracksToPlaylistCommand.kt */
        public static final class C0154b extends b {
            private final int d;
            private final int e;

            public C0154b(int i, int i2) {
                super(true, i, i2, null);
                this.d = i;
                this.e = i2;
            }

            public int a() {
                return this.e;
            }

            public int b() {
                return this.d;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0154b) {
                        C0154b bVar = (C0154b) obj;
                        if (b() == bVar.b()) {
                            if (a() == bVar.a()) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return (b() * 31) + a();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("SuccessResult(numberOfTracksAdded=");
                sb.append(b());
                sb.append(", newTrackCount=");
                sb.append(a());
                sb.append(")");
                return sb.toString();
            }
        }

        private b(boolean z, int i, int i2) {
            this.a = z;
            this.b = i;
            this.c = i2;
        }

        public int a() {
            return this.c;
        }

        public /* synthetic */ b(boolean z, int i, int i2, C7264rYa rya) {
            this(z, i, i2);
        }
    }

    public C5362Uoa(C5500ZKa zKa, C5694cGa cga, C5421Wpa wpa, C5305Spa spa) {
        C7471uYa.b(zKa, "propeller");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(wpa, "loadPlaylistTrackUrnsCommand");
        C7471uYa.b(spa, "loadCurrentTrackCountCommand");
        super(zKa);
        this.d = cga;
        this.e = wpa;
        this.f = spa;
    }

    public C5694cGa d() {
        return this.d;
    }

    public C5421Wpa e() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public C6499gLa a(C5500ZKa zKa, a aVar) {
        C5500ZKa zKa2 = zKa;
        a aVar2 = aVar;
        C7471uYa.b(zKa2, "propeller");
        C7471uYa.b(aVar2, "params");
        int intValue = this.f.a(aVar.a()).intValue();
        List a2 = a(aVar2);
        int i = 4;
        defpackage.C5054KLa.a aVar3 = new defpackage.C5054KLa.a(C6918mWa.b((Object[]) new C5085LLa[]{C5085LLa.a(_ea.PlaylistTracks, "playlist_id", Long.class), C5085LLa.a(_ea.PlaylistTracks, "track_id", Long.class), C5085LLa.a(_ea.PlaylistTracks, "position", Long.class), C5085LLa.a(_ea.PlaylistTracks, "added_at", Long.class)}));
        int i2 = 0;
        for (Object next : a2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C3508cda cda = (C3508cda) next;
                Object[] objArr = new Object[i];
                objArr[0] = Long.valueOf(aVar.a().c());
                C7471uYa.a((Object) cda, "urn");
                objArr[1] = Long.valueOf(cda.c());
                objArr[2] = Integer.valueOf(i2 + intValue);
                objArr[3] = Long.valueOf(d().b().getTime());
                aVar3.a(C6918mWa.b(objArr));
                i2 = i3;
                i = 4;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        C6431fLa a3 = zKa2.a((C5116MLa) _ea.PlaylistTracks, aVar3.a());
        if (a3.b()) {
            this.c = a2.size();
            this.b += this.c;
        }
        C7471uYa.a((Object) a3, "propeller.bulkInsert(Tab…          }\n            }");
        return a3;
    }

    private List<C3508cda> a(a aVar) {
        List b2 = aVar.b();
        List a2 = e().a(aVar.a());
        C7471uYa.a((Object) a2, "loadPlaylistTrackUrnsCom….call(params.playlistUrn)");
        return C7676xWa.c((Iterable) b2, (Iterable) a2);
    }

    /* access modifiers changed from: protected */
    public b a(C6499gLa gla) {
        C7471uYa.b(gla, "result");
        if (gla.b()) {
            return new C0154b(this.c, this.b);
        }
        return new a(this.b);
    }
}

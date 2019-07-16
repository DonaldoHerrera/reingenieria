package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.media.MediaBrowserServiceCompat.i;
import com.soundcloud.android.collection.C2746fa;
import com.soundcloud.android.collection.playhistory.Z;
import com.soundcloud.android.features.library.likes.search.C3609e;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.X;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 22\u00020\u0001:\u00012BS\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010\u0013J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019H\u0002J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001aH\u0002J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001aH\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0002J(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001a2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0002J\"\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J$\u00101\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019H\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/soundcloud/android/features/mediabrowser/DefaultMediaBrowserDataSource;", "Lcom/soundcloud/android/playback/mediabrowser/MediaBrowserDataSource;", "resources", "Landroid/content/res/Resources;", "discoveryOperations", "Lcom/soundcloud/android/discovery/DiscoveryOperations;", "playHistoryOperations", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryOperations;", "likesDataSource", "Lcom/soundcloud/android/features/library/likes/search/LikesDataSource;", "collectionOptionsStorage", "Lcom/soundcloud/android/collection/CollectionOptionsStorage;", "myPlaylistOperations", "Lcom/soundcloud/android/collection/playlists/MyPlaylistOperations;", "imageUrlBuilder", "Lcom/soundcloud/android/image/ImageUrlBuilder;", "backgroundScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "(Landroid/content/res/Resources;Lcom/soundcloud/android/discovery/DiscoveryOperations;Lcom/soundcloud/android/collection/playhistory/PlayHistoryOperations;Lcom/soundcloud/android/features/library/likes/search/LikesDataSource;Lcom/soundcloud/android/collection/CollectionOptionsStorage;Lcom/soundcloud/android/collection/playlists/MyPlaylistOperations;Lcom/soundcloud/android/image/ImageUrlBuilder;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "loadChildren", "", "parentId", "", "result", "Landroidx/media/MediaBrowserServiceCompat$Result;", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "mapDiscoveryCardsToMediaItem", "discoveryCards", "Lcom/soundcloud/android/discovery/DiscoveryCard;", "mapPlaylistsToMediaItem", "playlistItems", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistItem;", "mapSingleSelectionContentCardToMediaItem", "card", "Lcom/soundcloud/android/discovery/DiscoveryCard$SingleContentSelectionCard;", "mapTracksToMediaItem", "trackItems", "Lcom/soundcloud/android/tracks/TrackItem;", "collection", "Lcom/soundcloud/android/foundation/media/Collection;", "onGetRoot", "Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;", "clientPackageName", "clientUid", "", "rootHints", "Landroid/os/Bundle;", "onLoadChildren", "Companion", "mediabrowserdatasource_release"}, mv = {1, 1, 15})
/* renamed from: Fba reason: default package */
/* compiled from: DefaultMediaBrowserDataSource.kt */
public final class Fba implements C4649qma {
    public static final a a = new a(null);
    private final Resources b;
    private final C3858rY c;
    private final Z d;
    private final C3609e e;
    private final C2746fa f;
    private final C1938AS g;
    private final X h;
    private final HPa i;
    private final HPa j;

    /* renamed from: Fba$a */
    /* compiled from: DefaultMediaBrowserDataSource.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Fba(Resources resources, C3858rY rYVar, Z z, C3609e eVar, C2746fa faVar, C1938AS as, X x, HPa hPa, HPa hPa2) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(rYVar, "discoveryOperations");
        C7471uYa.b(z, "playHistoryOperations");
        C7471uYa.b(eVar, "likesDataSource");
        C7471uYa.b(faVar, "collectionOptionsStorage");
        C7471uYa.b(as, "myPlaylistOperations");
        C7471uYa.b(x, "imageUrlBuilder");
        C7471uYa.b(hPa, "backgroundScheduler");
        C7471uYa.b(hPa2, "mainThreadScheduler");
        this.b = resources;
        this.c = rYVar;
        this.d = z;
        this.e = eVar;
        this.f = faVar;
        this.g = as;
        this.h = x;
        this.i = hPa;
        this.j = hPa2;
    }

    private final void b(String str, i<List<MediaItem>> iVar) {
        String str2 = "likes";
        String str3 = "discovery";
        String str4 = "play_history";
        String str5 = "playlists";
        switch (str.hashCode()) {
            case -1865828127:
                if (str.equals(str5)) {
                    iVar.a();
                    this.g.a(this.f.d()).f().f(new Kba(this)).b(this.i).a(this.j).c((C6776kQa<? super T>) new Lba<Object>(iVar));
                    return;
                }
                return;
            case -1775263095:
                if (str.equals(str4)) {
                    iVar.a();
                    Z.a(this.d, 0, 1, null).f().f(new Mba(this)).b(this.i).a(this.j).c((C6776kQa<? super T>) new Nba<Object>(iVar));
                    return;
                }
                return;
            case -121207376:
                if (str.equals(str3)) {
                    iVar.a();
                    this.c.a().e(new Gba(this)).b(this.i).a(this.j).d((C6776kQa<? super T>) new Hba<Object>(iVar));
                    return;
                }
                return;
            case 102974396:
                if (str.equals(str2)) {
                    iVar.a();
                    this.e.a().f().f(new Iba(this)).b(this.i).a(this.j).c((C6776kQa<? super T>) new Jba<Object>(iVar));
                    return;
                }
                return;
            case 1567271673:
                if (str.equals("my_soundcloud")) {
                    iVar.a();
                    String string = this.b.getString(p.tab_discovery);
                    C7471uYa.a((Object) string, "resources.getString(R.string.tab_discovery)");
                    String string2 = this.b.getString(p.track_likes_title);
                    C7471uYa.a((Object) string2, "resources.getString(R.string.track_likes_title)");
                    String string3 = this.b.getString(p.collections_playlists_header);
                    C7471uYa.a((Object) string3, "resources.getString(R.st…ections_playlists_header)");
                    String string4 = this.b.getString(p.collections_play_history_header);
                    C7471uYa.a((Object) string4, "resources.getString(R.st…ions_play_history_header)");
                    List b2 = C6918mWa.b((Object[]) new MediaItem[]{Pba.a(str3, string), Pba.a(str2, string2), Pba.a(str5, string3), Pba.a(str4, string4)});
                    StringBuilder sb = new StringBuilder();
                    sb.append("sending result for root [");
                    sb.append(b2);
                    sb.append(']');
                    SDb.a(sb.toString(), new Object[0]);
                    iVar.b(b2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public androidx.media.MediaBrowserServiceCompat.a a(String str, int i2, Bundle bundle) {
        C7471uYa.b(str, "clientPackageName");
        return new androidx.media.MediaBrowserServiceCompat.a("my_soundcloud", null);
    }

    public void a(String str, i<List<MediaItem>> iVar) {
        C7471uYa.b(str, "parentId");
        C7471uYa.b(iVar, "result");
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadChildren [");
        sb.append(str);
        sb.append(']');
        SDb.a(sb.toString(), new Object[0]);
        b(str, iVar);
    }

    private final MediaItem a(d dVar) {
        C3508cda h2 = dVar.d().h();
        Uri uri = null;
        if (h2 != null) {
            String a2 = new C3880tea(h2, null, 2, null).a();
            String i2 = dVar.i();
            String a3 = dVar.a();
            String c2 = dVar.d().c();
            if (c2 != null) {
                X x = this.h;
                C3508cda cda = C3508cda.a;
                C7471uYa.a((Object) cda, "Urn.NOT_SET");
                String a4 = x.a(c2, cda, C3721b.T500);
                if (a4 != null) {
                    uri = Uri.parse(a4);
                } else {
                    C7471uYa.a();
                    throw null;
                }
            }
            return Pba.a(a2, i2, a3, uri, false);
        }
        C7471uYa.a();
        throw null;
    }

    /* access modifiers changed from: private */
    public final List<MediaItem> a(List<? extends C3503cY> list) {
        ArrayList arrayList = new ArrayList();
        for (C3503cY cYVar : list) {
            MediaItem mediaItem = null;
            if (cYVar instanceof d) {
                mediaItem = a((d) cYVar);
            } else if (!(cYVar instanceof b) && !(cYVar instanceof c) && !(cYVar instanceof defpackage.C3503cY.a) && !(cYVar instanceof e)) {
                throw new FVa();
            }
            if (mediaItem != null) {
                arrayList.add(mediaItem);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final List<MediaItem> a(List<? extends C6185ma> list, C3872sea sea) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C6185ma maVar : list) {
            C3508cda a2 = maVar.a();
            String str = "it.urn";
            C7471uYa.a((Object) a2, str);
            String a3 = new C3880tea(a2, sea).a();
            String B = maVar.B();
            String d2 = maVar.d();
            String str2 = (String) maVar.b().d();
            Uri uri = null;
            if (str2 != null) {
                X x = this.h;
                C3508cda a4 = maVar.a();
                C7471uYa.a((Object) a4, str);
                String a5 = x.a(str2, a4, C3721b.T500);
                if (a5 != null) {
                    uri = Uri.parse(a5);
                } else {
                    C7471uYa.a();
                    throw null;
                }
            }
            arrayList.add(Pba.a(a3, B, d2, uri, maVar.r() == C3823mda.DOWNLOADED));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final List<MediaItem> b(List<? extends C3863rda> list) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3863rda rda : list) {
            C3508cda a2 = rda.a();
            String str = "it.urn";
            C7471uYa.a((Object) a2, str);
            Uri uri = null;
            String a3 = new C3880tea(a2, null, 2, null).a();
            String B = rda.B();
            String d2 = rda.d();
            String str2 = (String) rda.b().d();
            if (str2 != null) {
                X x = this.h;
                C3508cda a4 = rda.a();
                C7471uYa.a((Object) a4, str);
                String a5 = x.a(str2, a4, C3721b.T500);
                if (a5 != null) {
                    uri = Uri.parse(a5);
                } else {
                    C7471uYa.a();
                    throw null;
                }
            }
            arrayList.add(Pba.a(a3, B, d2, uri, rda.r() == C3823mda.DOWNLOADED));
        }
        return arrayList;
    }
}

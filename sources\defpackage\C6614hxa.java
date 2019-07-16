package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.e.g;
import com.soundcloud.android.foundation.events.C3702d.e.j;
import com.soundcloud.android.foundation.events.C3702d.e.m;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.ia.p;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u0000 92\u00020\u0001:\u00029:B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0012J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0012J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\"\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H\u0012J(\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0012J(\u0010 \u001a\n !*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0012J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0012J\u0010\u0010$\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0012J\n\u0010)\u001a\u0004\u0018\u00010\u0012H\u0016J$\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140,0+2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.H\u0012J\u001c\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140,0+2\u0006\u0010-\u001a\u00020.H\u0012J\u001c\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140,0+2\u0006\u0010-\u001a\u00020.H\u0012J\u0018\u00101\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u0012H\u0016J \u00103\u001a\u0002042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0012J\"\u00107\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0012J\"\u00108\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/soundcloud/android/share/ShareOperations;", "", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "shareBottomSheetFragmentFactory", "Lcom/soundcloud/android/share/ShareBottomSheetFragment$Factory;", "trackRepository", "Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;", "playlistRepository", "Lcom/soundcloud/android/foundation/domain/playlists/PlaylistRepository;", "instagramPackageHelper", "Lcom/soundcloud/android/share/InstagramPackageHelper;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "(Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/share/ShareBottomSheetFragment$Factory;Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;Lcom/soundcloud/android/foundation/domain/playlists/PlaylistRepository;Lcom/soundcloud/android/share/InstagramPackageHelper;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;)V", "shareDisposable", "Lio/reactivex/disposables/Disposable;", "shareOptions", "Lcom/soundcloud/android/foundation/actions/models/ShareOptions;", "buildPermalink", "", "permalink", "secretToken", "buildShareIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "buildShareSubject", "buildShareText", "buildShareTrackText", "title", "username", "buildShareUserText", "kotlin.jvm.PlatformType", "checkPermalink", "", "checkSecretToken", "playlist", "Lcom/soundcloud/android/foundation/domain/playlists/Playlist;", "track", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "getShareOptions", "maybeReloadSecretToken", "Lio/reactivex/Maybe;", "Lcom/soundcloud/java/optional/Optional;", "playableUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "reloadPlaylistSecretToken", "reloadTrackSecretToken", "share", "options", "shouldShowInstagramShare", "", "isTrack", "isPrivate", "startShare", "startShareActivity", "Companion", "LocalEntityMissingPermalinkException", "base_release"}, mv = {1, 1, 15})
/* renamed from: hxa reason: default package and case insensitive filesystem */
/* compiled from: ShareOperations.kt */
public class C6614hxa {
    public static final a a = new a(null);
    private VPa b = C4881Eua.b();
    private Mca c;
    private final C3700b d;
    private final defpackage.C6274cxa.b e;
    private final C3760eea f;
    private final Fda g;
    private final C5222Pwa h;
    private final C6834lGa i;

    /* renamed from: hxa$a */
    /* compiled from: ShareOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: hxa$b */
    /* compiled from: ShareOperations.kt */
    public static final class b extends Exception {
    }

    public C6614hxa(C3700b bVar, defpackage.C6274cxa.b bVar2, C3760eea eea, Fda fda, C5222Pwa pwa, C6834lGa lga) {
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(bVar2, "shareBottomSheetFragmentFactory");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(fda, "playlistRepository");
        C7471uYa.b(pwa, "instagramPackageHelper");
        C7471uYa.b(lga, "connectionHelper");
        this.d = bVar;
        this.e = bVar2;
        this.f = eea;
        this.g = fda;
        this.h = pwa;
        this.i = lga;
    }

    /* access modifiers changed from: private */
    public void b(Context context, Mca mca, String str) {
        if (a(context, mca.h(), mca.g())) {
            C0370l lVar = null;
            FragmentActivity fragmentActivity = (FragmentActivity) (!(context instanceof FragmentActivity) ? null : context);
            C6274cxa a2 = this.e.a(mca.f(), a(context, mca, str));
            if (fragmentActivity != null) {
                lVar = fragmentActivity.getSupportFragmentManager();
            }
            C5262RGa.a(a2, lVar, "share_bottom_sheet");
            return;
        }
        c(context, mca, str);
        this.d.a((J) K.a.b(mca.f(), mca.b(), mca.d(), mca.a()));
    }

    private void c(Context context, Mca mca, String str) {
        context.startActivity(a(context, mca, str));
    }

    public void a(Context context, Mca mca) {
        C3702d dVar;
        C7471uYa.b(context, "context");
        C7471uYa.b(mca, "options");
        this.c = mca;
        this.b.dispose();
        if (mca.h()) {
            dVar = m.c;
        } else if (mca.i()) {
            dVar = j.c;
        } else {
            dVar = g.c;
        }
        this.d.a(dVar);
        this.d.a((J) K.a.c(mca.a().f(), mca.b(), mca.d(), mca.a()));
        b(mca);
        IPa a2 = IPa.a(C4928GKa.b(mca.e()));
        C7471uYa.a((Object) a2, "Single.just(Optional.fro…ble(options.secretToken))");
        IPa f2 = a(mca, mca.a().f()).a((MPa<? extends T>) a2).a((long) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, TimeUnit.MILLISECONDS, (MPa<? extends T>) a2).f(new C6818kxa(a2));
        C5250Qua a3 = C5250Qua.a(new C6886lxa(this, context, mca));
        f2.c(a3);
        C7471uYa.a((Object) a3, "maybeReloadSecretToken(o….orNull())\n            })");
        this.b = a3;
    }

    private C7531vPa<C4928GKa<String>> b(C3508cda cda) {
        C7531vPa<C4928GKa<String>> f2 = Nda.a(this.f.a(cda, defpackage.C3760eea.a.SYNCED)).f(new C6750jxa(this));
        C7471uYa.a((Object) f2, "trackRepository.track(pl…ecretToken)\n            }");
        return f2;
    }

    private void b(Mca mca) {
        if (!(mca.c().length() == 0)) {
            return;
        }
        if (!this.i.d()) {
            throw new b();
        }
        throw new IllegalStateException("Playlists with no permalinks cannot be shared.");
    }

    private boolean a(Context context, boolean z, boolean z2) {
        return z && !z2 && this.h.a(context);
    }

    private C7531vPa<C4928GKa<String>> a(Mca mca, C3508cda cda) {
        if (!mca.g()) {
            C7531vPa<C4928GKa<String>> c2 = C7531vPa.c(C4928GKa.b(mca.e()));
            C7471uYa.a((Object) c2, "Maybe.just(Optional.from…hareOptions.secretToken))");
            return c2;
        } else if (cda.x()) {
            return b(cda);
        } else {
            if (cda.u()) {
                return a(cda);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a playlist or track. Found: ");
            sb.append(cda);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private C7531vPa<C4928GKa<String>> a(C3508cda cda) {
        C7531vPa<C4928GKa<String>> f2 = Nda.a(this.g.a(cda, defpackage.Fda.a.SYNCED)).f(new C6682ixa(this));
        C7471uYa.a((Object) f2, "playlistRepository.playl…cretToken()\n            }");
        return f2;
    }

    /* access modifiers changed from: private */
    public void a(C3509cea cea) {
        if (cea.A() && cea.r() == null) {
            throw new IllegalStateException("Secret token missing.");
        }
    }

    /* access modifiers changed from: private */
    public void a(Eda eda) {
        if (eda.j()) {
            C4928GKa p = eda.p();
            C7471uYa.a((Object) p, "playlist.secretToken()");
            if (!p.c()) {
                throw new IllegalStateException("Secret token missing.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r3 != null) goto L_0x0020;
     */
    private String a(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            sb2.append(str2);
            str3 = sb2.toString();
        }
        str3 = "";
        sb.append(str3);
        return sb.toString();
    }

    private Intent a(Context context, Mca mca, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(524288);
        intent.setType("text/plain");
        String a2 = a(mca);
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(p.share_subject, new Object[]{a2}));
        intent.putExtra("android.intent.extra.TEXT", a(mca, context, a(mca.c(), str)));
        Intent createChooser = Intent.createChooser(intent, context.getString(p.share));
        C7471uYa.a((Object) createChooser, "Intent.createChooser(sha…etString(R.string.share))");
        return createChooser;
    }

    private String a(Mca mca) {
        return Cxb.a(mca.a().d()) ^ true ? mca.a().d() : mca.a().b();
    }

    private String a(Mca mca, Context context, String str) {
        if (mca.i()) {
            return a(context, mca.a().b(), str);
        }
        return a(context, mca.a().d(), mca.a().b(), str);
    }

    private String a(Context context, String str, String str2) {
        return context.getString(p.share_user_link, new Object[]{str, str2});
    }

    private String a(Context context, String str, String str2, String str3) {
        if (C5206PKa.b(str2)) {
            String string = context.getString(p.share_tracktitle_artist_link, new Object[]{str, str2, str3});
            C7471uYa.a((Object) string, "context.getString(R.stri…tle, username, permalink)");
            return string;
        }
        String string2 = context.getString(p.share_tracktitle_link, new Object[]{str, str3});
        C7471uYa.a((Object) string2, "context.getString(R.stri…e_link, title, permalink)");
        return string2;
    }

    public Mca a() {
        return this.c;
    }
}

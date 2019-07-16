package defpackage;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.C0325l;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;
import java.util.HashMap;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010+\u001a\u00020,2\u0018\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170/\u0012\u0004\u0012\u00020\u00180.H\u0016J\u0010\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u001cH\u0016J\b\u00102\u001a\u00020,H\u0016J\b\u00103\u001a\u00020\u001cH\u0002J\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u00020,H\u0016J\b\u00109\u001a\u00020,H\u0016J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020,0;H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0;H\u0016J\u000e\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020?R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\u001f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006A"}, d2 = {"Lcom/soundcloud/android/playlists/AddToPlaylistDialogFragment;", "Lcom/soundcloud/android/dialog/LoggingDialogFragment;", "Lcom/soundcloud/android/playlists/AddToPlaylistView;", "()V", "adapter", "Lcom/soundcloud/android/playlists/AddToPlaylistAdapter;", "getAdapter$base_release", "()Lcom/soundcloud/android/playlists/AddToPlaylistAdapter;", "setAdapter$base_release", "(Lcom/soundcloud/android/playlists/AddToPlaylistAdapter;)V", "addTrackToPlaylistClick", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/playlists/AddToPlaylistClickData;", "getAddTrackToPlaylistClick", "()Lio/reactivex/subjects/PublishSubject;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "getAnalytics$base_release", "()Lcom/soundcloud/android/foundation/events/Analytics;", "setAnalytics$base_release", "(Lcom/soundcloud/android/foundation/events/Analytics;)V", "collectionRenderer", "Lcom/soundcloud/android/view/collection/AppCollectionRenderer;", "Lcom/soundcloud/android/playlists/AddTrackToPlaylistItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "createPlaylistClick", "", "getCreatePlaylistClick", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "getObserverFactory$base_release", "()Lcom/soundcloud/android/rx/observers/ObserverFactory;", "setObserverFactory$base_release", "(Lcom/soundcloud/android/rx/observers/ObserverFactory;)V", "presenterLazy", "Ldagger/Lazy;", "Lcom/soundcloud/android/playlists/AddToPlaylistPresenter;", "getPresenterLazy$base_release", "()Ldagger/Lazy;", "setPresenterLazy$base_release", "(Ldagger/Lazy;)V", "accept", "", "viewModel", "Lcom/soundcloud/android/uniflow/AsyncLoaderState;", "", "createPlaylist", "track", "dismissDialog", "getTrackToAdd", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onRefreshed", "refreshSignal", "Lio/reactivex/Observable;", "requestContent", "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: Eoa reason: default package and case insensitive filesystem */
/* compiled from: AddToPlaylistDialogFragment.kt */
public final class C4875Eoa extends C2418ZW implements C5304Soa {
    public static final a b = new a(null);
    public C3700b c;
    public C5606ava d;
    public C4782Boa e;
    public C4806CMa<C5244Qoa> f;
    private final C6781kVa<C4844Doa> g;
    private final C6781kVa<Long> h;
    private C6769kJa<C5333Toa, C6973nJa> i;
    private final UPa j = new UPa();
    private HashMap k;

    /* renamed from: Eoa$a */
    /* compiled from: AddToPlaylistDialogFragment.kt */
    public static final class a {
        private a() {
        }

        private final Bundle b(C3508cda cda, String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("TRACK_ID", cda.c());
            bundle.putString("TRACK_TITLE", str);
            return bundle;
        }

        public final C4875Eoa a(C3508cda cda, String str) {
            C7471uYa.b(cda, "trackUrn");
            C7471uYa.b(str, "trackTitle");
            return a(b(cda, str));
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final C4875Eoa a(Bundle bundle) {
            C4875Eoa eoa = new C4875Eoa();
            eoa.setArguments(bundle);
            return eoa;
        }
    }

    public C4875Eoa() {
        C6781kVa<C4844Doa> s = C6781kVa.s();
        String str = "PublishSubject.create()";
        C7471uYa.a((Object) s, str);
        this.g = s;
        C6781kVa<Long> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, str);
        this.h = s2;
        SoundCloudApplication.f().a(this);
    }

    /* access modifiers changed from: private */
    public final long Rb() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("TRACK_ID");
        }
        throw new IllegalArgumentException("cannot get Track as arguments were null");
    }

    public void Qb() {
        HashMap hashMap = this.k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void b() {
    }

    public void bb() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Toast.makeText(activity, p.added_to_playlist, 0).show();
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
                C3700b bVar = this.c;
                if (bVar != null) {
                    bVar.a((J) K.a.a(C3710l.a.a()));
                } else {
                    C7471uYa.b("analytics");
                    throw null;
                }
            } else {
                throw new IllegalArgumentException("dialog was null on dismiss when adding track to playlist");
            }
        } else {
            throw new IllegalArgumentException("activity was null on dismiss when adding track to playlist");
        }
    }

    public APa<Long> c() {
        APa<Long> c2 = APa.c(Long.valueOf(Rb()));
        C7471uYa.a((Object) c2, "Observable.just(getTrackToAdd())");
        return c2;
    }

    public View c(int i2) {
        if (this.k == null) {
            this.k = new HashMap();
        }
        View view = (View) this.k.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.k.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public APa<RVa> e() {
        return defpackage.C5304Soa.a.a(this);
    }

    public APa<RVa> f() {
        APa<RVa> l = APa.l();
        C7471uYa.a((Object) l, "Observable.never()");
        return l;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C4782Boa boa = this.e;
        String str = "adapter";
        if (boa != null) {
            String str2 = str;
            C6769kJa kja = new C6769kJa(boa, C4906Foa.a, null, null, false, false, false, false, false, false, 1012, null);
            this.i = kja;
            UPa uPa = this.j;
            C4782Boa boa2 = this.e;
            if (boa2 != null) {
                VPa f2 = boa2.j().f((C6776kQa<? super T>) new C4937Goa<Object>(this));
                C7471uYa.a((Object) f2, "adapter.addToPlaylistCli…a(it, getTrackToAdd())) }");
                XUa.a(uPa, f2);
                UPa uPa2 = this.j;
                C4782Boa boa3 = this.e;
                if (boa3 != null) {
                    VPa f3 = boa3.k().f((C6776kQa<? super T>) new C4968Hoa<Object>(this));
                    C7471uYa.a((Object) f3, "adapter.createPlaylistCl…onNext(getTrackToAdd()) }");
                    XUa.a(uPa2, f3);
                    C4806CMa<C5244Qoa> cMa = this.f;
                    if (cMa != null) {
                        ((C5244Qoa) cMa.get()).a((C5304Soa) this);
                        FragmentActivity activity = getActivity();
                        if (activity != null) {
                            View inflate = activity.getLayoutInflater().inflate(l.add_to_playlist_layout, (FrameLayout) c(i.container), false);
                            C6769kJa<C5333Toa, C6973nJa> kja2 = this.i;
                            if (kja2 != null) {
                                C7471uYa.a((Object) inflate, "it");
                                C6769kJa.a(kja2, inflate, false, null, 0, 14, null);
                                androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(activity);
                                aVar.a(new b(getActivity()).c(p.add_track_to_playlist).a());
                                aVar.b(inflate);
                                aVar.c(p.btn_cancel, (OnClickListener) null);
                                C0325l a2 = aVar.a();
                                C7471uYa.a((Object) a2, "AlertDialog.Builder(cont…ll)\n            .create()");
                                return a2;
                            }
                            C7471uYa.b("collectionRenderer");
                            throw null;
                        }
                        throw new IllegalArgumentException("Null activity when trying to create AddToPlaylistDialog");
                    }
                    C7471uYa.b("presenterLazy");
                    throw null;
                }
                C7471uYa.b(str2);
                throw null;
            }
            C7471uYa.b(str2);
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    public void onDestroyView() {
        this.j.b();
        super.onDestroyView();
        Qb();
    }

    public C6781kVa<C4844Doa> Ya() {
        return this.g;
    }

    public void a(C6832lEa<List<C5333Toa>, C6973nJa> lea) {
        C7471uYa.b(lea, "viewModel");
        C6769kJa<C5333Toa, C6973nJa> kja = this.i;
        if (kja != null) {
            C6900mEa a2 = lea.a();
            List list = (List) lea.b();
            if (list == null) {
                list = C6918mWa.a();
            }
            kja.a(new C4736AEa<>(a2, list));
            return;
        }
        C7471uYa.b("collectionRenderer");
        throw null;
    }

    public C6781kVa<Long> gb() {
        return this.h;
    }

    public void a(long j2) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
            C5449Xoa.b(j2).a(getFragmentManager());
            return;
        }
        throw new IllegalArgumentException("dialog was null on dismiss when creating new playlist from track");
    }

    public final void a(C0370l lVar) {
        C7471uYa.b(lVar, "fragmentManager");
        C5232QGa.a((C0361c) this, lVar, "create_playlist_dialog");
    }
}

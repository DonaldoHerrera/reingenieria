package com.soundcloud.android.listeners.dev;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.C0325l;
import androidx.core.app.k.d;
import androidx.core.app.n;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.Preference.c;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import androidx.preference.s;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.cast.C2730d;
import com.soundcloud.android.listeners.dev.U.f;
import com.soundcloud.android.listeners.dev.U.i;
import com.soundcloud.android.listeners.dev.U.l;
import com.soundcloud.android.listeners.dev.U.p;
import com.soundcloud.android.listeners.dev.eventlogger.h;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.K;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@EVa(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0004\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020YH\u0002J \u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u0002J\b\u0010c\u001a\u00020YH\u0002J\b\u0010d\u001a\u00020YH\u0002J\u0010\u0010e\u001a\u00020Y2\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010h\u001a\u00020Y2\u0006\u0010i\u001a\u00020jH\u0002J\u0010\u0010k\u001a\u00020Y2\u0006\u0010i\u001a\u00020jH\u0002J\u0010\u0010l\u001a\u00020Y2\u0006\u0010m\u001a\u00020nH\u0016J\u001c\u0010o\u001a\u00020Y2\b\u0010p\u001a\u0004\u0018\u00010q2\b\u0010r\u001a\u0004\u0018\u00010bH\u0016J&\u0010s\u001a\u0004\u0018\u00010`2\u0006\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010p\u001a\u0004\u0018\u00010qH\u0016J\b\u0010x\u001a\u00020YH\u0016J\u0010\u0010y\u001a\u00020Y2\u0006\u0010z\u001a\u00020bH\u0016J\u0010\u0010{\u001a\u00020Y2\u0006\u0010|\u001a\u00020^H\u0002J\u0010\u0010}\u001a\u00020Y2\u0006\u0010]\u001a\u00020^H\u0002J\b\u0010~\u001a\u00020)H\u0002J\u001a\u0010\u001a\u00020Y2\u0007\u0010\u0001\u001a\u00020b2\u0007\u0010\u0001\u001a\u00020gH\u0002J\u001b\u0010\u0001\u001a\u00020Y2\u0006\u0010]\u001a\u00020^2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\u0014\u0010\u0001\u001a\u00020Y2\t\u0010\u0001\u001a\u0004\u0018\u00010bH\u0002J\u001e\u0010\u0001\u001a\u00020Y*\u00030\u00012\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020Y0\u0001H\u0002J\u000e\u0010\u0001\u001a\u00020Y*\u00030\u0001H\u0002J\u000e\u0010\u0001\u001a\u00020Y*\u00030\u0001H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0002018\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020=8BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001e\u0010@\u001a\u00020A8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010F\u001a\u00020G8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001e\u0010L\u001a\u00020M8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001e\u0010R\u001a\u00020S8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006\u0001"}, d2 = {"Lcom/soundcloud/android/listeners/dev/DevDrawerFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Lcom/soundcloud/android/introductoryoverlay/IntroductoryOverlayOperations$OnIntroductoryOverlayStateChangedListener;", "()V", "accountOperations", "Lcom/soundcloud/android/accounts/AccountOperations;", "getAccountOperations", "()Lcom/soundcloud/android/accounts/AccountOperations;", "setAccountOperations", "(Lcom/soundcloud/android/accounts/AccountOperations;)V", "alphaDialogHelper", "Lcom/soundcloud/android/alpha/AlphaDialogHelper;", "getAlphaDialogHelper", "()Lcom/soundcloud/android/alpha/AlphaDialogHelper;", "setAlphaDialogHelper", "(Lcom/soundcloud/android/alpha/AlphaDialogHelper;)V", "backgroundJobManager", "Lcom/soundcloud/android/backgroundjobs/BackgroundJobManager;", "getBackgroundJobManager", "()Lcom/soundcloud/android/backgroundjobs/BackgroundJobManager;", "setBackgroundJobManager", "(Lcom/soundcloud/android/backgroundjobs/BackgroundJobManager;)V", "castConfigStorage", "Lcom/soundcloud/android/cast/CastConfigStorage;", "getCastConfigStorage", "()Lcom/soundcloud/android/cast/CastConfigStorage;", "setCastConfigStorage", "(Lcom/soundcloud/android/cast/CastConfigStorage;)V", "concurrentPlaybackOperations", "Lcom/soundcloud/android/playback/ConcurrentPlaybackOperations;", "getConcurrentPlaybackOperations", "()Lcom/soundcloud/android/playback/ConcurrentPlaybackOperations;", "setConcurrentPlaybackOperations", "(Lcom/soundcloud/android/playback/ConcurrentPlaybackOperations;)V", "configurationManager", "Lcom/soundcloud/android/configuration/ConfigurationManager;", "getConfigurationManager", "()Lcom/soundcloud/android/configuration/ConfigurationManager;", "setConfigurationManager", "(Lcom/soundcloud/android/configuration/ConfigurationManager;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "drawerExperimentsHelper", "Lcom/soundcloud/android/listeners/dev/DevDrawerExperimentsHelper;", "getDrawerExperimentsHelper", "()Lcom/soundcloud/android/listeners/dev/DevDrawerExperimentsHelper;", "setDrawerExperimentsHelper", "(Lcom/soundcloud/android/listeners/dev/DevDrawerExperimentsHelper;)V", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "getEventBus", "()Lcom/soundcloud/rx/eventbus/EventBus;", "setEventBus", "(Lcom/soundcloud/rx/eventbus/EventBus;)V", "introductoryOverlayOperations", "Lcom/soundcloud/android/introductoryoverlay/IntroductoryOverlayOperations;", "getIntroductoryOverlayOperations", "()Lcom/soundcloud/android/introductoryoverlay/IntroductoryOverlayOperations;", "setIntroductoryOverlayOperations", "(Lcom/soundcloud/android/introductoryoverlay/IntroductoryOverlayOperations;)V", "introductoryOverlaysPreferenceCategory", "Landroidx/preference/PreferenceCategory;", "getIntroductoryOverlaysPreferenceCategory", "()Landroidx/preference/PreferenceCategory;", "monitorNotificationController", "Lcom/soundcloud/android/listeners/dev/eventlogger/DevEventLoggerMonitorNotificationController;", "getMonitorNotificationController", "()Lcom/soundcloud/android/listeners/dev/eventlogger/DevEventLoggerMonitorNotificationController;", "setMonitorNotificationController", "(Lcom/soundcloud/android/listeners/dev/eventlogger/DevEventLoggerMonitorNotificationController;)V", "navigationExecutor", "Lcom/soundcloud/android/navigation/NavigationExecutor;", "getNavigationExecutor", "()Lcom/soundcloud/android/navigation/NavigationExecutor;", "setNavigationExecutor", "(Lcom/soundcloud/android/navigation/NavigationExecutor;)V", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "getNavigator", "()Lcom/soundcloud/android/navigation/Navigator;", "setNavigator", "(Lcom/soundcloud/android/navigation/Navigator;)V", "nightModeConfiguration", "Lcom/soundcloud/appconfig/NightModeConfiguration;", "getNightModeConfiguration", "()Lcom/soundcloud/appconfig/NightModeConfiguration;", "setNightModeConfiguration", "(Lcom/soundcloud/appconfig/NightModeConfiguration;)V", "addActions", "", "addIntroductoryOverlaysControls", "buildCastIdInputDialog", "Landroid/app/Dialog;", "preference", "Landroidx/preference/Preference;", "dialogView", "Landroid/view/View;", "newId", "", "copyTokenToClipboard", "displayDummyNotification", "handleEventLoggerMonitorPreference", "monitor", "", "launchFakeDowngrade", "plan", "Lcom/soundcloud/android/configuration/plans/Plan;", "launchFakeUpgrade", "onAttach", "context", "Landroid/content/Context;", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onIntroductoryOverlayStateChanged", "introductoryOverlayKey", "setupForceConfigUpdatePref", "updateConfigPref", "showCastIDInputDialog", "subscribeToPlaybackStateEvent", "updateIntroductoryOverlayPreference", "key", "isChecked", "updateLastConfigUpdateText", "sharedPreferences", "Landroid/content/SharedPreferences;", "updatePlayerInformation", "player", "onSelect", "", "callFunction", "Lkotlin/Function0;", "setupCastReceiverIdPref", "Landroidx/preference/PreferenceScreen;", "setupEventLoggerMonitorPref", "Companion", "IntroductoryOverlayCheckBoxPreference", "devdrawer_release"}, mv = {1, 1, 15})
/* compiled from: DevDrawerFragment.kt */
public final class DevDrawerFragment extends s implements defpackage.Fea.a {
    public static final a a = new a(null);
    public C2526g b;
    public C4003b c;
    public C2248QR d;
    public C2288ST e;
    public C4581ija f;
    public C4655rja g;
    public K h;
    public C2730d i;
    public C5327TLa j;
    public Fea k;
    public h l;
    public C3194pK m;
    public C7250rKa n;
    private VPa o = C4881Eua.b();
    private HashMap p;

    /* compiled from: DevDrawerFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: DevDrawerFragment.kt */
    private static final class b extends CheckBoxPreference {
        /* access modifiers changed from: private */
        public final Fea U;
        /* access modifiers changed from: private */
        public final String V;

        public b(Context context, Fea fea, String str) {
            C7471uYa.b(context, "context");
            C7471uYa.b(fea, "introductoryOverlayOperations");
            C7471uYa.b(str, "preferenceKey");
            super(context);
            this.U = fea;
            this.V = str;
            b((CharSequence) C7315sGa.b(this.V));
            d(this.V);
            d(this.U.b(this.V));
            a((c) new C4006e(this));
        }
    }

    private final void Zb() {
        a(p.dev_drawer_player_key, (PXa<RVa>) new C4018q<RVa>(this));
        a(p.dev_drawer_action_app_features_key, (PXa<RVa>) new x<RVa>(this));
        a(p.dev_drawer_action_ad_injection_key, (PXa<RVa>) new y<RVa>(this));
        a(p.dev_drawer_action_get_oauth_token_to_clipboard_key, (PXa<RVa>) new z<RVa>(this));
        a(p.dev_drawer_action_show_remote_debug_key, (PXa<RVa>) new A<RVa>(this));
        a(p.dev_drawer_action_kill_app_key, (PXa<RVa>) new B<RVa>(this));
        a(p.dev_drawer_action_generate_oom_key, (PXa<RVa>) C.a);
        findPreference(getString(p.dev_drawer_day_night_key)).a((androidx.preference.Preference.b) new D(this));
        a(p.dev_drawer_action_fake_alpha_reminder, (PXa<RVa>) new E<RVa>(this));
        a(p.dev_drawer_action_fake_alpha_thanks, (PXa<RVa>) new C4008g<RVa>(this));
        a(p.dev_drawer_conversion_upgrade_ht, (PXa<RVa>) new C4009h<RVa>(this));
        a(p.dev_drawer_conversion_upgrade_mt, (PXa<RVa>) new C4010i<RVa>(this));
        a(p.dev_drawer_conversion_downgrade_mt, (PXa<RVa>) new C4011j<RVa>(this));
        a(p.dev_drawer_conversion_downgrade_free, (PXa<RVa>) new C4012k<RVa>(this));
        a(p.dev_drawer_upsells_upgrade, (PXa<RVa>) new C4013l<RVa>(this));
        a(p.dev_drawer_upsells_ads, (PXa<RVa>) new C4014m<RVa>(this));
        a(p.dev_drawer_upsells_offline, (PXa<RVa>) new C4015n<RVa>(this));
        a(p.dev_drawer_upsells_hq, (PXa<RVa>) new C4016o<RVa>(this));
        a(p.dev_drawer_upsells_premium_content, (PXa<RVa>) new C4017p<RVa>(this));
        a(p.dev_drawer_action_policy_sync_key, (PXa<RVa>) new r<RVa>(this));
        a(p.dev_drawer_action_database_cleanup_key, (PXa<RVa>) new C4019s<RVa>(this));
        a(p.dev_drawer_action_crash_key, (PXa<RVa>) C4020t.a);
        a(p.dev_drawer_action_native_crash_key, (PXa<RVa>) C4021u.a);
        a(p.dev_drawer_action_concurrent_key, (PXa<RVa>) new v<RVa>(this));
        a(p.dev_drawer_action_dummy_notification, (PXa<RVa>) new w<RVa>(this));
        int i2 = p.dev_drawer_action_acct_config_update_key;
        a(i2, (PXa<RVa>) new C4007f<RVa>(this));
        Preference findPreference = findPreference(getString(i2));
        C7471uYa.a((Object) findPreference, "findPreference(getString(it))");
        a(findPreference);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        b(preferenceScreen);
        a(preferenceScreen);
    }

    private final void _b() {
        PreferenceCategory cc = cc();
        cc.ga();
        List<String> list = Eea.a;
        C7471uYa.a((Object) list, "IntroductoryOverlayKey.ALL_KEYS");
        Iterator it = list.iterator();
        while (true) {
            String str = "introductoryOverlayOperations";
            if (it.hasNext()) {
                String str2 = (String) it.next();
                PreferenceScreen preferenceScreen = getPreferenceScreen();
                C7471uYa.a((Object) preferenceScreen, "preferenceScreen");
                Context b2 = preferenceScreen.b();
                C7471uYa.a((Object) b2, "preferenceScreen.context");
                Fea fea = this.k;
                if (fea != null) {
                    C7471uYa.a((Object) str2, "it");
                    cc.c((Preference) new b(b2, fea, str2));
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            } else {
                Fea fea2 = this.k;
                if (fea2 != null) {
                    fea2.a((defpackage.Fea.a) this);
                    return;
                } else {
                    C7471uYa.b(str);
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void ac() {
        Object systemService = requireActivity().getSystemService("clipboard");
        if (systemService != null) {
            ClipboardManager clipboardManager = (ClipboardManager) systemService;
            C2526g gVar = this.b;
            if (gVar != null) {
                C2358WP e2 = gVar.e();
                C7471uYa.a((Object) e2, "accountOperations.soundCloudToken");
                clipboardManager.setPrimaryClip(ClipData.newPlainText("oauth_token", e2.a()));
                return;
            }
            C7471uYa.b("accountOperations");
            throw null;
        }
        throw new OVa("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    /* access modifiers changed from: private */
    public final void bc() {
        FragmentActivity requireActivity = requireActivity();
        C7471uYa.a((Object) requireActivity, "context");
        Oja.b(requireActivity);
        n a2 = n.a((Context) requireActivity);
        d dVar = new d(requireActivity, "channel_dev");
        dVar.c((CharSequence) "Dummy notification");
        dVar.e(U.h.ic_notification_cloud);
        a2.a(9, dVar.a());
    }

    /* access modifiers changed from: private */
    public final void c(String str) {
        Preference c2 = getPreferenceScreen().c((CharSequence) getString(p.dev_drawer_player_key));
        C7471uYa.a((Object) c2, "preferenceScreen\n       …g.dev_drawer_player_key))");
        StringBuilder sb = new StringBuilder();
        sb.append(getString(p.dev_drawer_player_title));
        sb.append(": ");
        if (str == null) {
            str = "None";
        }
        sb.append(str);
        c2.b((CharSequence) sb.toString());
    }

    private final PreferenceCategory cc() {
        Preference c2 = getPreferenceScreen().c((CharSequence) getString(p.dev_drawer_introductory_overlays_key));
        C7471uYa.a((Object) c2, "preferenceScreen.findPre…troductory_overlays_key))");
        if (c2 instanceof PreferenceCategory) {
            return (PreferenceCategory) c2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(c2);
        sb.append(" not of type ");
        sb.append(PreferenceCategory.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    private final VPa dc() {
        C5327TLa tLa = this.j;
        if (tLa != null) {
            C5443XLa<C4431ub> xLa = C3876taa.b;
            C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_STATE_CHANGED");
            VPa f2 = tLa.a(xLa).f((C6776kQa<? super T>) new L<Object>(this));
            C7471uYa.a((Object) f2, "eventBus.queue<PlayState…ype ?: \"not available\") }");
            return f2;
        }
        C7471uYa.b("eventBus");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void f(boolean z) {
        String str = "monitorNotificationController";
        if (z) {
            h hVar = this.l;
            if (hVar != null) {
                hVar.a();
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            h hVar2 = this.l;
            if (hVar2 != null) {
                hVar2.b();
            } else {
                C7471uYa.b(str);
                throw null;
            }
        }
    }

    public void Qb() {
        HashMap hashMap = this.p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final C3194pK Rb() {
        C3194pK pKVar = this.m;
        if (pKVar != null) {
            return pKVar;
        }
        C7471uYa.b("alphaDialogHelper");
        throw null;
    }

    public final C2248QR Sb() {
        C2248QR qr = this.d;
        if (qr != null) {
            return qr;
        }
        C7471uYa.b("backgroundJobManager");
        throw null;
    }

    public final C2730d Tb() {
        C2730d dVar = this.i;
        if (dVar != null) {
            return dVar;
        }
        C7471uYa.b("castConfigStorage");
        throw null;
    }

    public final K Ub() {
        K k2 = this.h;
        if (k2 != null) {
            return k2;
        }
        C7471uYa.b("concurrentPlaybackOperations");
        throw null;
    }

    public final C2288ST Vb() {
        C2288ST st = this.e;
        if (st != null) {
            return st;
        }
        C7471uYa.b("configurationManager");
        throw null;
    }

    public final C4581ija Wb() {
        C4581ija ija = this.f;
        if (ija != null) {
            return ija;
        }
        C7471uYa.b("navigationExecutor");
        throw null;
    }

    public final C4655rja Xb() {
        C4655rja rja = this.g;
        if (rja != null) {
            return rja;
        }
        C7471uYa.b("navigator");
        throw null;
    }

    public final C7250rKa Yb() {
        C7250rKa rka = this.n;
        if (rka != null) {
            return rka;
        }
        C7471uYa.b("nightModeConfiguration");
        throw null;
    }

    public void onAttach(Context context) {
        C7471uYa.b(context, "context");
        dagger.android.support.a.a(this);
        super.onAttach(context);
    }

    public void onCreatePreferences(Bundle bundle, String str) {
        addPreferencesFromResource(U.s.dev_drawer_prefs);
        Zb();
        _b();
        C4003b bVar = this.c;
        if (bVar != null) {
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            C7471uYa.a((Object) preferenceScreen, "preferenceScreen");
            bVar.a(preferenceScreen);
            this.o = dc();
            return;
        }
        C7471uYa.b("drawerExperimentsHelper");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7471uYa.b(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null) {
            onCreateView.setBackgroundColor(onCreateView.getResources().getColor(f.primary));
            return onCreateView;
        }
        C7471uYa.a();
        throw null;
    }

    public void onDestroy() {
        Fea fea = this.k;
        if (fea != null) {
            fea.b((defpackage.Fea.a) this);
            this.o.dispose();
            super.onDestroy();
            return;
        }
        C7471uYa.b("introductoryOverlayOperations");
        throw null;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Qb();
    }

    private final void b(PreferenceScreen preferenceScreen) {
        Preference c2 = preferenceScreen.c((CharSequence) getString(p.dev_drawer_event_logger_monitor_key));
        if (c2 != null) {
            TwoStatePreference twoStatePreference = (TwoStatePreference) c2;
            f(twoStatePreference.ca());
            twoStatePreference.a((androidx.preference.Preference.b) new J(this));
            return;
        }
        throw new OVa("null cannot be cast to non-null type androidx.preference.TwoStatePreference");
    }

    /* access modifiers changed from: private */
    public final void b(C2455aV aVVar) {
        requireActivity().getSharedPreferences("device_config_settings", 0).edit().putString("pending_plan_upgrade", aVVar.a()).apply();
        C4581ija ija = this.f;
        if (ija != null) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C7471uYa.a((Object) activity, "activity!!");
                ija.e((Activity) activity);
                return;
            }
            C7471uYa.a();
            throw null;
        }
        C7471uYa.b("navigationExecutor");
        throw null;
    }

    public void a(String str) {
        C7471uYa.b(str, "introductoryOverlayKey");
        Fea fea = this.k;
        if (fea != null) {
            a(str, fea.b(str));
        } else {
            C7471uYa.b("introductoryOverlayOperations");
            throw null;
        }
    }

    private final void a(int i2, PXa<RVa> pXa) {
        getPreferenceScreen().c((CharSequence) getString(i2)).a((c) new H(pXa));
    }

    /* access modifiers changed from: private */
    public final void a(C2455aV aVVar) {
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getSharedPreferences("device_config_settings", 0).edit().putString("pending_plan_downgrade", aVVar.a()).apply();
        C4581ija ija = this.f;
        if (ija != null) {
            C7471uYa.a((Object) requireActivity, "this");
            ija.d((Activity) requireActivity);
            return;
        }
        C7471uYa.b("navigationExecutor");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void b(Preference preference) {
        View inflate = View.inflate(getActivity(), l.dev_drawer_cast_dialog, null);
        ((TextView) inflate.findViewById(i.custom_dialog_title)).setText(p.dev_drawer_dialog_cast_id_title);
        EditText editText = (EditText) inflate.findViewById(i.comment_input);
        C2730d dVar = this.i;
        if (dVar != null) {
            editText.setHint(dVar.a());
            C7471uYa.a((Object) inflate, "this");
            C7471uYa.a((Object) editText, "input");
            String obj = editText.getText().toString();
            Locale locale = Locale.US;
            C7471uYa.a((Object) locale, "Locale.US");
            if (obj != null) {
                String upperCase = obj.toUpperCase(locale);
                C7471uYa.a((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
                C5232QGa.a(a(preference, inflate, upperCase));
                return;
            }
            throw new OVa("null cannot be cast to non-null type java.lang.String");
        }
        C7471uYa.b("castConfigStorage");
        throw null;
    }

    private final void a(String str, boolean z) {
        Preference c2 = cc().c((CharSequence) str);
        if (c2 != null) {
            ((b) c2).d(z);
            return;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.listeners.dev.DevDrawerFragment.IntroductoryOverlayCheckBoxPreference");
    }

    private final void a(PreferenceScreen preferenceScreen) {
        Preference c2 = preferenceScreen.c((CharSequence) getString(p.dev_drawer_action_cast_id_key));
        C2730d dVar = this.i;
        if (dVar != null) {
            c2.a((CharSequence) dVar.a());
            c2.a((c) new I(this));
            return;
        }
        C7471uYa.b("castConfigStorage");
        throw null;
    }

    private final Dialog a(Preference preference, View view, String str) {
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(preference.b());
        aVar.b(view);
        aVar.c(p.btn_save, (OnClickListener) new F(this, str));
        aVar.b(p.dev_drawer_dialog_cast_id_reset, (OnClickListener) new G(this));
        aVar.a(p.btn_cancel, (OnClickListener) null);
        C0325l a2 = aVar.a();
        C7471uYa.a((Object) a2, "AlertDialog.Builder(pref…ll)\n            .create()");
        return a2;
    }

    private final void a(Preference preference) {
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("device_config_settings", 0);
        sharedPreferences.registerOnSharedPreferenceChangeListener(new K(this, preference));
        C7471uYa.a((Object) sharedPreferences, "this");
        a(preference, sharedPreferences);
    }

    /* access modifiers changed from: private */
    public final void a(Preference preference, SharedPreferences sharedPreferences) {
        long j2 = sharedPreferences.getLong("last_config_check_time", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("last updated ");
        Context b2 = preference.b();
        C7471uYa.a((Object) b2, "preference.context");
        Resources resources = b2.getResources();
        C7471uYa.a((Object) resources, "preference.context.resources");
        sb.append(C7315sGa.a(resources, j2, true));
        preference.a((CharSequence) sb.toString());
    }
}

package com.soundcloud.android.deeplinks;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import java.util.List;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0013J\b\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\u0006H\u0013J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0013J\b\u0010\u000f\u001a\u00020\u0010H\u0013J\b\u0010\u0011\u001a\u00020\u0010H\u0012J\b\u0010\u0012\u001a\u00020\bH\u0017J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0010H\u0012J\u0014\u0010\u0017\u001a\n \u0018*\u0004\u0018\u00010\u000b0\u000b*\u00020\rH\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/soundcloud/android/deeplinks/ShortcutController;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createSearchShortcut", "Landroid/content/pm/ShortcutInfo;", "createShortcuts", "", "createShuffleLikesShortcut", "getIcon", "Landroid/graphics/drawable/Icon;", "defaultDrawable", "", "adaptiveForegroundDrawable", "hasShortcuts", "", "missingSdk", "removeShortcuts", "reportUsage", "shortcut", "Lcom/soundcloud/android/deeplinks/ShortcutController$Shortcut;", "supportsAdaptiveIcons", "toIcon", "kotlin.jvm.PlatformType", "Shortcut", "base_release"}, mv = {1, 1, 15})
/* compiled from: ShortcutController.kt */
public class i {
    private final Context a;

    /* compiled from: ShortcutController.kt */
    public enum a {
        SEARCH("search"),
        PLAY_LIKES("play_likes");
        
        private final String d;

        private a(String str) {
            this.d = str;
        }

        public final String getId() {
            return this.d;
        }
    }

    public i(Context context) {
        C7471uYa.b(context, "context");
        this.a = context;
    }

    @TargetApi(25)
    private ShortcutInfo c() {
        ShortcutInfo build = new Builder(this.a, a.SEARCH.getId()).setShortLabel(this.a.getString(p.shortcut_search)).setLongLabel(this.a.getString(p.shortcut_search)).setIcon(a(h.ic_shortcut_search, h.ic_adaptive_shortcut_search)).setIntent(new Intent(C2929h.u)).build();
        C7471uYa.a((Object) build, "ShortcutInfo.Builder(con…\n                .build()");
        return build;
    }

    @TargetApi(25)
    private ShortcutInfo d() {
        ShortcutInfo build = new Builder(this.a, a.PLAY_LIKES.getId()).setShortLabel(this.a.getString(p.shortcut_play_likes)).setLongLabel(this.a.getString(p.shortcut_play_likes)).setIcon(a(h.ic_shortcut_collection, h.ic_adaptive_shortcut_collection)).setIntent(new Intent(C2929h.t)).build();
        C7471uYa.a((Object) build, "ShortcutInfo.Builder(con…\n                .build()");
        return build;
    }

    @TargetApi(25)
    private boolean e() {
        if (f()) {
            return false;
        }
        Object systemService = this.a.getSystemService(ShortcutManager.class);
        C7471uYa.a(systemService, "context.getSystemService…rtcutManager::class.java)");
        return !((ShortcutManager) systemService).getDynamicShortcuts().isEmpty();
    }

    private boolean f() {
        return VERSION.SDK_INT < 25;
    }

    private boolean g() {
        return VERSION.SDK_INT >= 26;
    }

    @SuppressLint({"NewApi"})
    public void a() {
        if (!f()) {
            List b = C6918mWa.b((Object[]) new ShortcutInfo[]{c(), d()});
            Object systemService = this.a.getSystemService(ShortcutManager.class);
            C7471uYa.a(systemService, "context.getSystemService…rtcutManager::class.java)");
            ((ShortcutManager) systemService).setDynamicShortcuts(b);
        }
    }

    @SuppressLint({"NewApi"})
    public void b() {
        if (!f() && e()) {
            ((ShortcutManager) this.a.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
    }

    @SuppressLint({"NewApi"})
    public void a(a aVar) {
        C7471uYa.b(aVar, "shortcut");
        if (!f()) {
            ((ShortcutManager) this.a.getSystemService(ShortcutManager.class)).reportShortcutUsed(aVar.getId());
        }
    }

    @TargetApi(25)
    private Icon a(int i, int i2) {
        boolean g = g();
        if (g) {
            i = i2;
        } else if (g) {
            throw new FVa();
        }
        Icon a2 = a(i);
        C7471uYa.a((Object) a2, "when (supportsAdaptiveIc…awable\n        }.toIcon()");
        return a2;
    }

    private Icon a(int i) {
        return Icon.createWithResource(this.a, i);
    }
}

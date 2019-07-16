package com.google.android.gms.cast.framework;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.B;
import androidx.mediarouter.app.C0388a;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.cast.C0710ia;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.cast.framework.b reason: case insensitive filesystem */
public final class C0634b {
    private static final C0710ia a = new C0710ia("CastButtonFactory");
    private static final List<WeakReference<MenuItem>> b = new ArrayList();
    private static final List<WeakReference<MediaRouteButton>> c = new ArrayList();

    public static MenuItem a(Context context, Menu menu, int i) {
        return a(context, menu, i, null);
    }

    @ShowFirstParty
    private static MenuItem a(Context context, Menu menu, int i, B b2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        Preconditions.checkNotNull(menu);
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            try {
                a(context, findItem, (B) null);
                b.add(new WeakReference(findItem));
                return findItem;
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", new Object[]{Integer.valueOf(i)}));
            }
        } else {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", new Object[]{Integer.valueOf(i)}));
        }
    }

    public static void a(Context context, MediaRouteButton mediaRouteButton) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        if (mediaRouteButton != null) {
            a(context, mediaRouteButton, (B) null);
            c.add(new WeakReference(mediaRouteButton));
        }
    }

    private static void a(Context context, MenuItem menuItem, B b2) throws IllegalArgumentException {
        Preconditions.checkMainThread("Must be called from the main thread.");
        C0388a aVar = (C0388a) C0518cc.a(menuItem);
        if (aVar != null) {
            C0635c b3 = C0635c.b(context);
            if (b3 != null) {
                aVar.a(b3.b());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private static void a(Context context, MediaRouteButton mediaRouteButton, B b2) {
        Preconditions.checkMainThread("Must be called from the main thread.");
        C0635c b3 = C0635c.b(context);
        if (b3 != null) {
            mediaRouteButton.setRouteSelector(b3.b());
        }
    }
}

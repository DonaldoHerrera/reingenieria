package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.media.MediaBrowserServiceCompat.a;
import androidx.media.MediaBrowserServiceCompat.i;
import java.util.List;

/* renamed from: pma reason: default package and case insensitive filesystem */
/* compiled from: EmptyMediaBrowserDataSource.kt */
public final class C4640pma implements C4649qma {
    public a a(String str, int i, Bundle bundle) {
        C7471uYa.b(str, "clientPackageName");
        return new a("empty_root", null);
    }

    public void a(String str, i<List<MediaItem>> iVar) {
        C7471uYa.b(str, "parentId");
        C7471uYa.b(iVar, "result");
        iVar.b(null);
    }
}

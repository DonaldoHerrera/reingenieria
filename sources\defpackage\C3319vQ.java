package defpackage;

import android.net.Uri;
import com.appboy.m;

/* renamed from: vQ reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C3319vQ implements m {
    private final /* synthetic */ String a;

    public /* synthetic */ C3319vQ(String str) {
        this.a = str;
    }

    public final Uri a(Uri uri) {
        return uri.buildUpon().authority(this.a).build();
    }
}

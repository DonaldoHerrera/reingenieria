package defpackage;

import android.net.Uri;

/* renamed from: ZHa reason: default package and case insensitive filesystem */
/* compiled from: UriUtils */
public final class C5497ZHa {
    private C5497ZHa() {
    }

    public static Uri a(Uri uri) {
        if (uri.isHierarchical()) {
            return uri;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getScheme());
        sb.append("://");
        sb.append(uri.getSchemeSpecificPart());
        return Uri.parse(sb.toString());
    }
}

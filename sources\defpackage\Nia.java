package defpackage;

import android.net.Uri;
import java.io.IOException;

/* renamed from: Nia reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class Nia implements C7118pQa {
    private final /* synthetic */ Uri a;

    public /* synthetic */ Nia(Uri uri) {
        this.a = uri;
    }

    public final Object apply(Object obj) {
        return Dja.a(this.a, new IOException((Throwable) obj));
    }
}

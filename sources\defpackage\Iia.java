package defpackage;

import android.content.Intent;
import com.soundcloud.android.foundation.playqueue.m;

/* renamed from: Iia reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class Iia implements C7733yKa {
    private final /* synthetic */ Intent a;

    public /* synthetic */ Iia(Intent intent) {
        this.a = intent;
    }

    public final void accept(Object obj) {
        this.a.putExtra("source", ((m) obj).a());
    }
}

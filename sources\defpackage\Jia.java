package defpackage;

import android.content.Intent;
import com.soundcloud.android.features.record.Recording;

/* renamed from: Jia reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class Jia implements C7733yKa {
    private final /* synthetic */ Intent a;

    public /* synthetic */ Jia(Intent intent) {
        this.a = intent;
    }

    public final void accept(Object obj) {
        this.a.putExtra("recording", (Recording) obj);
    }
}

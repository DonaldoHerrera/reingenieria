package defpackage;

import android.content.Intent;
import com.soundcloud.android.features.record.Recording;

/* renamed from: Kia reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class Kia implements C7733yKa {
    private final /* synthetic */ Intent a;

    public /* synthetic */ Kia(Intent intent) {
        this.a = intent;
    }

    public final void accept(Object obj) {
        this.a.putExtra("recording", (Recording) obj);
    }
}

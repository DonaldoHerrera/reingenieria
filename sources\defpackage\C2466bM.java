package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* renamed from: bM reason: default package and case insensitive filesystem */
/* compiled from: OrientationLogger */
public class C2466bM extends DefaultActivityLightCycle<AppCompatActivity> {
    private final C6699jHa a;

    public C2466bM(C6699jHa jha) {
        this.a = jha;
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        super.onCreate(appCompatActivity, bundle);
        String str = SoundCloudApplication.a;
        StringBuilder sb = new StringBuilder();
        sb.append(appCompatActivity);
        sb.append(" created with orientation: ");
        sb.append(this.a.d().a());
        C7316sHa.a(4, str, sb.toString());
    }
}

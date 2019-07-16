package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.fragment.app.FragmentActivity;

/* renamed from: Owa reason: default package and case insensitive filesystem */
/* compiled from: DefaultInstagramPackageHelper.kt */
public final class C5192Owa implements C5222Pwa {
    public ResolveInfo a(FragmentActivity fragmentActivity, Intent intent, int i) {
        C7471uYa.b(fragmentActivity, "activity");
        C7471uYa.b(intent, "intent");
        return fragmentActivity.getPackageManager().resolveActivity(intent, i);
    }

    public boolean a(Context context) {
        C7471uYa.b(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
        intent.setType("image/jpeg");
        return packageManager.resolveActivity(intent, 0) != null;
    }
}

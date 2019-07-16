package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/creators/PulsePackageHelper;", "", "()V", "getCreatorsViewIntent", "Landroid/content/Intent;", "uri", "Landroid/net/Uri;", "isCreatorsAppInstalled", "", "context", "Landroid/content/Context;", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: mV reason: default package and case insensitive filesystem */
/* compiled from: PulsePackageHelper.kt */
public class C3137mV {
    public static final a a = new a(null);

    /* renamed from: mV$a */
    /* compiled from: PulsePackageHelper.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public boolean a(Context context) {
        C7471uYa.b(context, "context");
        return C5203PHa.b(context, "com.soundcloud.creators");
    }

    public Intent a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.soundcloud.creators");
        return intent;
    }
}

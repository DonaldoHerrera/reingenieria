package androidx.mediarouter.media;

import android.content.Intent;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;
import androidx.mediarouter.media.h.c;

/* compiled from: MediaRouteProviderService */
class f extends c {
    final /* synthetic */ a a;
    final /* synthetic */ int b;
    final /* synthetic */ Intent c;
    final /* synthetic */ Messenger d;
    final /* synthetic */ int e;
    final /* synthetic */ MediaRouteProviderService f;

    f(MediaRouteProviderService mediaRouteProviderService, a aVar, int i, Intent intent, Messenger messenger, int i2) {
        this.f = mediaRouteProviderService;
        this.a = aVar;
        this.b = i;
        this.c = intent;
        this.d = messenger;
        this.e = i2;
    }

    public void a(Bundle bundle) {
        if (MediaRouteProviderService.a) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(": Route control request succeeded");
            sb.append(", controllerId=");
            sb.append(this.b);
            sb.append(", intent=");
            sb.append(this.c);
            sb.append(", data=");
            sb.append(bundle);
            Log.d("MediaRouteProviderSrv", sb.toString());
        }
        if (this.f.a(this.d) >= 0) {
            MediaRouteProviderService.a(this.d, 3, this.e, 0, bundle, null);
        }
    }

    public void a(String str, Bundle bundle) {
        if (MediaRouteProviderService.a) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(": Route control request failed");
            sb.append(", controllerId=");
            sb.append(this.b);
            sb.append(", intent=");
            sb.append(this.c);
            sb.append(", error=");
            sb.append(str);
            sb.append(", data=");
            sb.append(bundle);
            Log.d("MediaRouteProviderSrv", sb.toString());
        }
        if (this.f.a(this.d) < 0) {
            return;
        }
        if (str != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("error", str);
            MediaRouteProviderService.a(this.d, 4, this.e, 0, bundle, bundle2);
            return;
        }
        MediaRouteProviderService.a(this.d, 4, this.e, 0, bundle, null);
    }
}

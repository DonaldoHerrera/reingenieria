package bo.app;

import android.content.Context;
import android.content.Intent;

public final class dy {
    public static boolean a(Context context, Class<?> cls) {
        return context.getPackageManager().queryIntentServices(new Intent().setClass(context, cls), 65536).size() > 0;
    }
}

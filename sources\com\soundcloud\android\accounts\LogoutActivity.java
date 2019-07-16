package com.soundcloud.android.accounts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.ia.l;

public class LogoutActivity extends FragmentActivity {
    public static void a(Context context) {
        Intent intent = new Intent(context, LogoutActivity.class);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(l.logout_activity);
    }
}

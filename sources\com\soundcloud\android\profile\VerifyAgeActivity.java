package com.soundcloud.android.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.soundcloud.android.main.LoggedInActivity;

public class VerifyAgeActivity extends LoggedInActivity {
    C4834DJa x;
    ke y;
    Ua z;

    public static Intent a(Context context, C3508cda cda) {
        return C5526_Ha.b(new Intent(context, VerifyAgeActivity.class), "userToFollowUrn", cda);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.y.onCreate(this, bundle);
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        this.x.c(this);
    }

    public Yca x() {
        return Yca.VERIFY_AGE;
    }
}

package com.krux.androidsdk.aggregator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class e extends c {
    private String b;
    private String c;
    private Bundle d;
    private String e;

    public e(Context context, Intent intent) {
        super(context);
        this.b = intent.getExtras().getString("publisher_uuid");
        this.c = intent.getExtras().getString("advertising_id");
        this.d = intent.getExtras().getBundle("event_attributes");
        this.e = intent.getExtras().getString("event");
    }

    public final String a() {
        Bundle bundle = this.d;
        String str = this.e;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("_kpid", this.b);
        bundle.putString("_kuid", this.c);
        return C2481cI.a(str, bundle);
    }
}

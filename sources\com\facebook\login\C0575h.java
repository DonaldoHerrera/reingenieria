package com.facebook.login;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.facebook.internal.ia.b;
import java.util.Date;

/* renamed from: com.facebook.login.h reason: case insensitive filesystem */
/* compiled from: DeviceAuthDialog */
class C0575h implements OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ b b;
    final /* synthetic */ String c;
    final /* synthetic */ Date d;
    final /* synthetic */ Date e;
    final /* synthetic */ DeviceAuthDialog f;

    C0575h(DeviceAuthDialog deviceAuthDialog, String str, b bVar, String str2, Date date, Date date2) {
        this.f = deviceAuthDialog;
        this.a = str;
        this.b = bVar;
        this.c = str2;
        this.d = date;
        this.e = date2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f.a(this.a, this.b, this.c, this.d, this.e);
    }
}

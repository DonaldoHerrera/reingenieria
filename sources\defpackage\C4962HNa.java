package defpackage;

import android.content.Context;

/* renamed from: HNa reason: default package and case insensitive filesystem */
/* compiled from: InstallerPackageNameProvider */
class C4962HNa implements C6569hNa<String> {
    final /* synthetic */ C4993INa a;

    C4962HNa(C4993INa iNa) {
        this.a = iNa;
    }

    public String a(Context context) throws Exception {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }
}

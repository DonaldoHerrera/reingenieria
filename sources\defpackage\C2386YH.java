package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: YH reason: default package and case insensitive filesystem */
/* compiled from: AssetsZoneRulesInitializer */
final class C2386YH extends PDb {
    private final Context d;
    private final String e;

    C2386YH(Context context, String str) {
        this.d = context;
        this.e = str;
    }

    /* access modifiers changed from: protected */
    public void b() {
        InputStream inputStream = null;
        try {
            inputStream = this.d.getAssets().open(this.e);
            JDb jDb = new JDb(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            QDb.a((QDb) jDb);
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.e);
            sb.append(" missing from assets");
            throw new IllegalStateException(sb.toString(), e2);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}

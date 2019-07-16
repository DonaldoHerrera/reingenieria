package com.google.android.gms.auth.api.signin.internal;

import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class e implements Runnable {
    private static final Logger a = new Logger("RevokeAccessOperation", new String[0]);
    private final String b;
    private final StatusPendingResult c = new StatusPendingResult((GoogleApiClient) null);

    private e(String str) {
        Preconditions.checkNotEmpty(str);
        this.b = str;
    }

    public static PendingResult<Status> a(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        e eVar = new e(str);
        new Thread(eVar).start();
        return eVar.c;
    }

    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String str = "https://accounts.google.com/o/oauth2/revoke?token=";
            String valueOf = String.valueOf(this.b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                a.e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.d(sb.toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger2 = a;
            String str2 = "IOException when revoking access: ";
            String valueOf2 = String.valueOf(e.toString());
            logger2.e(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), new Object[0]);
        } catch (Exception e2) {
            Logger logger3 = a;
            String str3 = "Exception when revoking access: ";
            String valueOf3 = String.valueOf(e2.toString());
            logger3.e(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3), new Object[0]);
        }
        this.c.setResult(status);
    }
}

package com.google.android.exoplayer2.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.exoplayer2.offline.a.C0033a;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.HashMap;

public abstract class DownloadService extends Service {
    private static final HashMap<Class<? extends DownloadService>, a> a = new HashMap<>();
    private final String b;
    private final int c;
    private a d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;

    private static final class a implements C0033a {
        /* access modifiers changed from: private */
        public final a a;
        private DownloadService b;

        public void a(DownloadService downloadService) {
            C1852xq.b(this.b == null);
            this.b = downloadService;
        }
    }

    /* access modifiers changed from: protected */
    public abstract a a();

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void onCreate() {
        String str = this.b;
        if (str != null) {
            Nq.a(this, str, this.c, 2);
        }
        a aVar = (a) a.get(DownloadService.class);
        if (aVar != null) {
            this.d = aVar.a;
            aVar.a(this);
            return;
        }
        a().e();
        throw null;
    }

    public void onDestroy() {
        this.h = true;
        a aVar = (a) a.get(DownloadService.class);
        this.d.b();
        throw null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        char c2;
        this.e = i2;
        this.g = false;
        String str3 = "com.google.android.exoplayer.downloadService.action.RESTART";
        if (intent != null) {
            str2 = intent.getAction();
            this.f |= intent.getBooleanExtra("foreground", false) || str3.equals(str2);
            str = intent.getStringExtra("content_id");
        } else {
            str2 = null;
            str = null;
        }
        String str4 = "com.google.android.exoplayer.downloadService.action.INIT";
        if (str2 == null) {
            str2 = str4;
        }
        switch (str2.hashCode()) {
            case -1931239035:
                if (str2.equals("com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD")) {
                    c2 = 2;
                    break;
                }
            case -932047176:
                if (str2.equals("com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS")) {
                    c2 = 5;
                    break;
                }
            case -871181424:
                if (str2.equals(str3)) {
                    c2 = 1;
                    break;
                }
            case -650547439:
                if (str2.equals("com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS")) {
                    c2 = 4;
                    break;
                }
            case -119057172:
                if (str2.equals("com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS")) {
                    c2 = 8;
                    break;
                }
            case 191112771:
                if (str2.equals("com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS")) {
                    c2 = 6;
                    break;
                }
            case 671523141:
                if (str2.equals("com.google.android.exoplayer.downloadService.action.SET_STOP_REASON")) {
                    c2 = 7;
                    break;
                }
            case 1015676687:
                if (str2.equals(str4)) {
                    c2 = 0;
                    break;
                }
            case 1547520644:
                if (str2.equals("com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD")) {
                    c2 = 3;
                    break;
                }
            default:
                c2 = 65535;
                break;
        }
        String str5 = "stop_reason";
        String str6 = "DownloadService";
        switch (c2) {
            case 0:
            case 1:
                break;
            case 2:
                DownloadRequest downloadRequest = (DownloadRequest) intent.getParcelableExtra("download_request");
                if (downloadRequest == null) {
                    Iq.b(str6, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    this.d.a(downloadRequest, intent.getIntExtra(str5, 0));
                    throw null;
                }
            case 3:
                if (str == null) {
                    Iq.b(str6, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    this.d.a(str);
                    throw null;
                }
            case 4:
                this.d.d();
                throw null;
            case 5:
                this.d.e();
                throw null;
            case 6:
                this.d.c();
                throw null;
            case 7:
                if (!intent.hasExtra(str5)) {
                    Iq.b(str6, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    this.d.a(str, intent.getIntExtra(str5, 0));
                    throw null;
                }
            case 8:
                Requirements requirements = (Requirements) intent.getParcelableExtra("requirements");
                if (requirements == null) {
                    Iq.b(str6, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    this.d.a(requirements);
                    throw null;
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Ignored unrecognized action: ");
                sb.append(str2);
                Iq.b(str6, sb.toString());
                break;
        }
        this.d.a();
        throw null;
    }

    public void onTaskRemoved(Intent intent) {
        this.g = true;
    }
}

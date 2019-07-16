package com.krux.androidsdk.aggregator;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;

public class EventPublisherService extends IntentService {
    private static final String a = "EventPublisherService";
    protected c b;

    public EventPublisherService() {
        super("EventPublisherEventService");
    }

    private static n a(c cVar) {
        new g();
        String str = "";
        n nVar = new n(str, str);
        try {
            String a2 = cVar.a();
            if (a2 != null && !a2.isEmpty()) {
                return g.a(new URL(a2));
            }
            Log.e(a, "Beacon request URL is null or empty.");
            return nVar;
        } catch (MalformedURLException e) {
            String str2 = a;
            StringBuilder sb = new StringBuilder("Request URL is malformed: ");
            sb.append(e);
            Log.e(str2, sb.toString());
            return nVar;
        }
    }

    public void onCreate() {
        super.onCreate();
    }

    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.krux.androidsdk.aggregator.c] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.krux.androidsdk.aggregator.o] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [com.krux.androidsdk.aggregator.e] */
    /* JADX WARNING: type inference failed for: r1v8, types: [com.krux.androidsdk.aggregator.f] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v5, types: [com.krux.androidsdk.aggregator.o]
  assigns: [com.krux.androidsdk.aggregator.o, com.krux.androidsdk.aggregator.e, com.krux.androidsdk.aggregator.f]
  uses: [com.krux.androidsdk.aggregator.o, com.krux.androidsdk.aggregator.c, com.krux.androidsdk.aggregator.e, com.krux.androidsdk.aggregator.f]
  mth insns count: 99
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    public void onHandleIntent(Intent intent) {
        ? r1;
        String str;
        String sb;
        if (intent != null) {
            try {
                String action = intent.getAction();
                ? r12 = 0;
                char c = 65535;
                int hashCode = action.hashCode();
                if (hashCode != -1888668673) {
                    if (hashCode != -280629724) {
                        if (hashCode == -257099997) {
                            if (action.equals("genericevent")) {
                                c = 2;
                            }
                        }
                    } else if (action.equals("fireevent")) {
                        c = 1;
                    }
                } else if (action.equals("trackpageview")) {
                    c = 0;
                }
                if (c == 0) {
                    r1 = new o(this, intent);
                    if (a.a().w) {
                        str = a;
                        StringBuilder sb2 = new StringBuilder("Track Page View URL: ");
                        sb2.append(r1.a());
                        sb = sb2.toString();
                    }
                    this.b = r1;
                    n a2 = a(this.b);
                    ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("receiver_tag");
                    Bundle bundle = new Bundle();
                    bundle.putString("beacon_url", this.b.a());
                    bundle.putString("beacon_http_response", (String) a2.b);
                    bundle.putString("beacon_http_status_code", (String) a2.a);
                    resultReceiver.send(0, bundle);
                } else if (c != 1) {
                    if (c != 2) {
                        String str2 = a;
                        StringBuilder sb3 = new StringBuilder("Event not supported: ");
                        sb3.append(action);
                        Log.i(str2, sb3.toString());
                        r1 = r12;
                    } else {
                        r1 = new f(this, intent);
                        if (a.a().w) {
                            str = a;
                            StringBuilder sb4 = new StringBuilder("Generic Event URL: ");
                            sb4.append(r1.a());
                            sb = sb4.toString();
                        }
                    }
                    this.b = r1;
                    n a22 = a(this.b);
                    ResultReceiver resultReceiver2 = (ResultReceiver) intent.getParcelableExtra("receiver_tag");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("beacon_url", this.b.a());
                    bundle2.putString("beacon_http_response", (String) a22.b);
                    bundle2.putString("beacon_http_status_code", (String) a22.a);
                    resultReceiver2.send(0, bundle2);
                } else {
                    r1 = new e(this, intent);
                    if (a.a().w) {
                        str = a;
                        StringBuilder sb5 = new StringBuilder("Fire Event URL: ");
                        sb5.append(r1.a());
                        sb = sb5.toString();
                    }
                    this.b = r1;
                    n a222 = a(this.b);
                    ResultReceiver resultReceiver22 = (ResultReceiver) intent.getParcelableExtra("receiver_tag");
                    Bundle bundle22 = new Bundle();
                    bundle22.putString("beacon_url", this.b.a());
                    bundle22.putString("beacon_http_response", (String) a222.b);
                    bundle22.putString("beacon_http_status_code", (String) a222.a);
                    resultReceiver22.send(0, bundle22);
                }
                Log.d(str, sb);
                r1 = r1;
                this.b = r1;
                n a2222 = a(this.b);
                ResultReceiver resultReceiver222 = (ResultReceiver) intent.getParcelableExtra("receiver_tag");
                Bundle bundle222 = new Bundle();
                bundle222.putString("beacon_url", this.b.a());
                bundle222.putString("beacon_http_response", (String) a2222.b);
                bundle222.putString("beacon_http_status_code", (String) a2222.a);
                resultReceiver222.send(0, bundle222);
            } catch (Exception e) {
                String str3 = a;
                StringBuilder sb6 = new StringBuilder("Error in executing request: ");
                sb6.append(e);
                Log.e(str3, sb6.toString());
            }
        }
    }
}

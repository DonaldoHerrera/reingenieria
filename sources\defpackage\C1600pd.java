package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: pd reason: default package and case insensitive filesystem */
/* compiled from: LocalBroadcastManager */
public final class C1600pd {
    private static final Object a = new Object();
    private static C1600pd b;
    private final Context c;
    private final HashMap<BroadcastReceiver, ArrayList<b>> d = new HashMap<>();
    private final HashMap<String, ArrayList<b>> e = new HashMap<>();
    private final ArrayList<a> f = new ArrayList<>();
    private final Handler g;

    /* renamed from: pd$a */
    /* compiled from: LocalBroadcastManager */
    private static final class a {
        final Intent a;
        final ArrayList<b> b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    /* renamed from: pd$b */
    /* compiled from: LocalBroadcastManager */
    private static final class b {
        final IntentFilter a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;

        b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C1600pd(Context context) {
        this.c = context;
        this.g = new C1569od(this, context.getMainLooper());
    }

    public static C1600pd a(Context context) {
        C1600pd pdVar;
        synchronized (a) {
            if (b == null) {
                b = new C1600pd(context.getApplicationContext());
            }
            pdVar = b;
        }
        return pdVar;
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.d) {
            b bVar = new b(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.d.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.d.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.e.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.e.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.d) {
            ArrayList arrayList = (ArrayList) this.d.remove(broadcastReceiver);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    b bVar = (b) arrayList.get(size);
                    bVar.d = true;
                    for (int i = 0; i < bVar.a.countActions(); i++) {
                        String action = bVar.a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.e.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                b bVar2 = (b) arrayList2.get(size2);
                                if (bVar2.b == broadcastReceiver) {
                                    bVar2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.e.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0171, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0174, code lost:
        return false;
     */
    public boolean a(Intent intent) {
        String str;
        ArrayList arrayList;
        int i;
        String str2;
        ArrayList arrayList2;
        Intent intent2 = intent;
        synchronized (this.d) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent2.resolveTypeIfNeeded(this.c.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resolving type ");
                sb.append(resolveTypeIfNeeded);
                sb.append(" scheme ");
                sb.append(scheme);
                sb.append(" of intent ");
                sb.append(intent2);
                Log.v("LocalBroadcastManager", sb.toString());
            }
            ArrayList arrayList3 = (ArrayList) this.e.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Action list: ");
                    sb2.append(arrayList3);
                    Log.v("LocalBroadcastManager", sb2.toString());
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    b bVar = (b) arrayList3.get(i2);
                    if (z) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Matching against filter ");
                        sb3.append(bVar.a);
                        Log.v("LocalBroadcastManager", sb3.toString());
                    }
                    if (bVar.c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList = arrayList3;
                        str2 = action;
                        str = resolveTypeIfNeeded;
                        arrayList2 = arrayList4;
                    } else {
                        b bVar2 = bVar;
                        str2 = action;
                        arrayList2 = arrayList4;
                        i = i2;
                        arrayList = arrayList3;
                        str = resolveTypeIfNeeded;
                        int match = bVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("  Filter matched!  match=0x");
                                sb4.append(Integer.toHexString(match));
                                Log.v("LocalBroadcastManager", sb4.toString());
                            }
                            arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                            arrayList4.add(bVar2);
                            bVar2.c = true;
                            i2 = i + 1;
                            action = str2;
                            arrayList3 = arrayList;
                            resolveTypeIfNeeded = str;
                        } else if (z) {
                            String str3 = match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : C1325gg.TYPE : "data" : "action" : "category";
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("  Filter did not match: ");
                            sb5.append(str3);
                            Log.v("LocalBroadcastManager", sb5.toString());
                        }
                    }
                    arrayList4 = arrayList2;
                    i2 = i + 1;
                    action = str2;
                    arrayList3 = arrayList;
                    resolveTypeIfNeeded = str;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((b) arrayList5.get(i3)).c = false;
                    }
                    this.f.add(new a(intent2, arrayList5));
                    if (!this.g.hasMessages(1)) {
                        this.g.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r2 >= r1.length) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r3 = r1[r2];
        r4 = r3.b.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 >= r4) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r6 = (defpackage.C1600pd.b) r3.b.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r6.d != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r6.b.onReceive(r9.c, r3.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r2 = 0;
     */
    public void a() {
        while (true) {
            synchronized (this.d) {
                int size = this.f.size();
                if (size > 0) {
                    a[] aVarArr = new a[size];
                    this.f.toArray(aVarArr);
                    this.f.clear();
                } else {
                    return;
                }
            }
        }
        while (true) {
        }
    }
}

package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: nj reason: default package and case insensitive filesystem */
/* compiled from: ReportUploader */
class C1544nj {
    static final Map<String, String> a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    /* access modifiers changed from: private */
    public static final short[] b = {10, 20, 30, 60, 120, 300};
    private final Object c = new Object();
    private final Ni d;
    private final String e;
    private final c f;
    /* access modifiers changed from: private */
    public final b g;
    /* access modifiers changed from: private */
    public Thread h;

    /* renamed from: nj$a */
    /* compiled from: ReportUploader */
    static final class a implements d {
        a() {
        }

        public boolean a() {
            return true;
        }
    }

    /* renamed from: nj$b */
    /* compiled from: ReportUploader */
    interface b {
        boolean a();
    }

    /* renamed from: nj$c */
    /* compiled from: ReportUploader */
    interface c {
        File[] a();

        File[] b();

        File[] c();
    }

    /* renamed from: nj$d */
    /* compiled from: ReportUploader */
    interface d {
        boolean a();
    }

    /* renamed from: nj$e */
    /* compiled from: ReportUploader */
    private class e extends C7253rNa {
        private final float a;
        private final d b;

        e(float f, d dVar) {
            this.a = f;
            this.b = dVar;
        }

        private void b() {
            C5701cNa e = C5328TMa.e();
            StringBuilder sb = new StringBuilder();
            sb.append("Starting report processing in ");
            sb.append(this.a);
            sb.append(" second(s)...");
            String str = "CrashlyticsCore";
            e.d(str, sb.toString());
            float f = this.a;
            if (f > 0.0f) {
                try {
                    Thread.sleep((long) (f * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<C1513mj> b2 = C1544nj.this.b();
            if (!C1544nj.this.g.a()) {
                if (b2.isEmpty() || this.b.a()) {
                    int i = 0;
                    while (!b2.isEmpty() && !C1544nj.this.g.a()) {
                        C5701cNa e2 = C5328TMa.e();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Attempting to send ");
                        sb2.append(b2.size());
                        sb2.append(" report(s)");
                        e2.d(str, sb2.toString());
                        for (C1513mj a2 : b2) {
                            C1544nj.this.a(a2);
                        }
                        b2 = C1544nj.this.b();
                        if (!b2.isEmpty()) {
                            int i2 = i + 1;
                            long j = (long) C1544nj.b[Math.min(i, C1544nj.b.length - 1)];
                            C5701cNa e3 = C5328TMa.e();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Report submisson: scheduling delayed retry in ");
                            sb3.append(j);
                            sb3.append(" seconds");
                            e3.d(str, sb3.toString());
                            try {
                                Thread.sleep(j * 1000);
                                i = i2;
                            } catch (InterruptedException unused2) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    }
                    return;
                }
                C5701cNa e4 = C5328TMa.e();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("User declined to send. Removing ");
                sb4.append(b2.size());
                sb4.append(" Report(s).");
                e4.d(str, sb4.toString());
                for (C1513mj remove : b2) {
                    remove.remove();
                }
            }
        }

        public void a() {
            try {
                b();
            } catch (Exception e) {
                C5328TMa.e().e("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            C1544nj.this.h = null;
        }
    }

    public C1544nj(String str, Ni ni, c cVar, b bVar) {
        if (ni != null) {
            this.d = ni;
            this.e = str;
            this.f = cVar;
            this.g = bVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* access modifiers changed from: 0000 */
    public List<C1513mj> b() {
        File[] c2;
        File[] b2;
        File[] a2;
        C5328TMa.e().d("CrashlyticsCore", "Checking for crash reports...");
        synchronized (this.c) {
            c2 = this.f.c();
            b2 = this.f.b();
            a2 = this.f.a();
        }
        LinkedList linkedList = new LinkedList();
        if (c2 != null) {
            for (File file : c2) {
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Found crash report ");
                sb.append(file.getPath());
                e2.d("CrashlyticsCore", sb.toString());
                linkedList.add(new C1636qj(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (b2 != null) {
            for (File file2 : b2) {
                String a3 = C1874yi.a(file2);
                if (!hashMap.containsKey(a3)) {
                    hashMap.put(a3, new LinkedList());
                }
                ((List) hashMap.get(a3)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            C5701cNa e3 = C5328TMa.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found invalid session: ");
            sb2.append(str);
            e3.d("CrashlyticsCore", sb2.toString());
            List list = (List) hashMap.get(str);
            linkedList.add(new Wi(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (a2 != null) {
            for (File ejVar : a2) {
                linkedList.add(new C1266ej(ejVar));
            }
        }
        if (linkedList.isEmpty()) {
            C5328TMa.e().d("CrashlyticsCore", "No reports found.");
        }
        return linkedList;
    }

    public synchronized void a(float f2, d dVar) {
        if (this.h != null) {
            C5328TMa.e().d("CrashlyticsCore", "Report upload has already been started.");
            return;
        }
        this.h = new Thread(new e(f2, dVar), "Crashlytics Report Uploader");
        this.h.start();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(C1513mj mjVar) {
        boolean z;
        synchronized (this.c) {
            z = false;
            try {
                boolean a2 = this.d.a(new Mi(this.e, mjVar));
                C5701cNa e2 = C5328TMa.e();
                String str = "CrashlyticsCore";
                StringBuilder sb = new StringBuilder();
                sb.append("Crashlytics report upload ");
                sb.append(a2 ? "complete: " : "FAILED: ");
                sb.append(mjVar.b());
                e2.i(str, sb.toString());
                if (a2) {
                    mjVar.remove();
                    z = true;
                }
            } catch (Exception e3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error occurred sending report ");
                sb2.append(mjVar);
                C5328TMa.e().e("CrashlyticsCore", sb2.toString(), e3);
            }
        }
        return z;
    }
}

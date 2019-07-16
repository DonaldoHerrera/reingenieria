package com.evernote.android.job;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.evernote.android.job.c.b;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: JobProxy */
public interface n {

    /* compiled from: JobProxy */
    public static final class a {
        private static final Object a = new Object();
        private final Context b;
        private final int c;
        private final Dj d;
        private final l e;

        public a(Context context, Dj dj, int i) {
            l lVar;
            this.b = context;
            this.c = i;
            this.d = dj;
            try {
                lVar = l.a(context);
            } catch (m e2) {
                this.d.a((Throwable) e2);
                lVar = null;
            }
            this.e = lVar;
        }

        private static long a(long j, long j2) {
            long j3 = j + j2;
            boolean z = true;
            boolean z2 = (j2 ^ j) < 0;
            if ((j ^ j3) < 0) {
                z = false;
            }
            return a(j3, z2 | z);
        }

        private static long a(long j, boolean z) {
            if (z) {
                return j;
            }
            return Long.MAX_VALUE;
        }

        private static long b(long j, long j2) {
            int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
            if (numberOfLeadingZeros > 65) {
                return j * j2;
            }
            boolean z = true;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            long a2 = a(a(j * j2, numberOfLeadingZeros >= 64), (i >= 0) | (j2 != Long.MIN_VALUE));
            if (!(i == 0 || a2 / j == j2)) {
                z = false;
            }
            return a(a2, z);
        }

        public static long c(s sVar) {
            return a(sVar, false);
        }

        public static long d(s sVar) {
            return sVar.i();
        }

        public static int e(s sVar) {
            return sVar.g();
        }

        public static long f(s sVar) {
            if (sVar.g() > 0) {
                return sVar.a(false);
            }
            return sVar.o();
        }

        public static long g(s sVar) {
            return Math.max(1, sVar.i() - sVar.h());
        }

        public void h(s sVar) {
            this.e.e().b(sVar);
        }

        public static long a(s sVar, boolean z) {
            long j;
            if (sVar.g() > 0) {
                j = sVar.a(true);
            } else {
                j = sVar.e();
            }
            return (!z || !sVar.z() || !sVar.r()) ? j : b(j, 100);
        }

        public static long b(s sVar) {
            return a(g(sVar), (d(sVar) - g(sVar)) / 2);
        }

        public static long a(s sVar) {
            return a(f(sVar), (c(sVar) - f(sVar)) / 2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
            return r1;
         */
        public s a(boolean z, boolean z2) {
            synchronized (a) {
                if (this.e == null) {
                    return null;
                }
                s a2 = this.e.a(this.c, true);
                c b2 = this.e.b(this.c);
                boolean z3 = a2 != null && a2.u();
                if (b2 != null && !b2.g()) {
                    this.d.a("Job %d is already running, %s", Integer.valueOf(this.c), a2);
                    return null;
                } else if (b2 != null && !z3) {
                    this.d.a("Job %d already finished, %s", Integer.valueOf(this.c), a2);
                    a(z);
                    return null;
                } else if (b2 != null && System.currentTimeMillis() - b2.c() < 2000) {
                    this.d.a("Job %d is periodic and just finished, %s", Integer.valueOf(this.c), a2);
                    return null;
                } else if (a2 != null && a2.v()) {
                    this.d.a("Request %d already started, %s", Integer.valueOf(this.c), a2);
                    return null;
                } else if (a2 != null && this.e.e().a(a2)) {
                    this.d.a("Request %d is in the queue to start, %s", Integer.valueOf(this.c), a2);
                    return null;
                } else if (a2 == null) {
                    this.d.a("Request for ID %d was null", Integer.valueOf(this.c));
                    a(z);
                    return null;
                } else if (z2) {
                    h(a2);
                }
            }
        }

        public b a(s sVar, Bundle bundle) {
            String str;
            long currentTimeMillis = System.currentTimeMillis() - sVar.n();
            if (sVar.u()) {
                str = String.format(Locale.US, "interval %s, flex %s", new Object[]{Gj.a(sVar.i()), Gj.a(sVar.h())});
            } else if (sVar.j().c()) {
                str = String.format(Locale.US, "start %s, end %s", new Object[]{Gj.a(f(sVar)), Gj.a(c(sVar))});
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("delay ");
                sb.append(Gj.a(a(sVar)));
                str = sb.toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.d.d("Running JobRequest on a main thread, this could cause stutter or ANR in your app.");
            }
            this.d.a("Run job, %s, waited %s, %s", sVar, Gj.a(currentTimeMillis), str);
            j e2 = this.e.e();
            c cVar = null;
            try {
                cVar = this.e.d().a(sVar.p());
                if (!sVar.u()) {
                    sVar.c(true);
                }
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                Future a2 = e2.a(this.b, sVar, cVar, bundle);
                if (a2 == null) {
                    b bVar = b.FAILURE;
                    if (cVar == null) {
                        this.e.f().b(sVar);
                    } else if (!sVar.u()) {
                        this.e.f().b(sVar);
                    } else if (sVar.t() && !cVar.f()) {
                        this.e.f().b(sVar);
                        sVar.a(false, false);
                    }
                    return bVar;
                }
                b bVar2 = (b) a2.get();
                this.d.a("Finished job, %s %s", sVar, bVar2);
                if (cVar == null) {
                    this.e.f().b(sVar);
                } else if (!sVar.u()) {
                    this.e.f().b(sVar);
                } else if (sVar.t() && !cVar.f()) {
                    this.e.f().b(sVar);
                    sVar.a(false, false);
                }
                return bVar2;
            } catch (InterruptedException | ExecutionException e3) {
                this.d.a(e3);
                if (cVar != null) {
                    cVar.a();
                    this.d.b("Canceled %s", sVar);
                }
                b bVar3 = b.FAILURE;
                if (cVar == null) {
                    this.e.f().b(sVar);
                } else if (!sVar.u()) {
                    this.e.f().b(sVar);
                } else if (sVar.t() && !cVar.f()) {
                    this.e.f().b(sVar);
                    sVar.a(false, false);
                }
                return bVar3;
            } catch (Throwable th) {
                if (cVar == null) {
                    this.e.f().b(sVar);
                } else if (!sVar.u()) {
                    this.e.f().b(sVar);
                } else if (sVar.t() && !cVar.f()) {
                    this.e.f().b(sVar);
                    sVar.a(false, false);
                }
                throw th;
            }
        }

        private void a(boolean z) {
            if (z) {
                a(this.b, this.c);
            }
        }

        static void a(Context context, int i) {
            e[] values;
            for (e eVar : e.values()) {
                if (eVar.c(context)) {
                    try {
                        eVar.b(context).a(i);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public static ComponentName a(Context context, Intent intent) {
            return w.a(context, intent);
        }

        public static boolean a(Intent intent) {
            return w.a(intent);
        }
    }

    void a(int i);

    void a(s sVar);

    boolean b(s sVar);

    void c(s sVar);

    void d(s sVar);
}

package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.E.e;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PicassoExecutorService */
class I extends ThreadPoolExecutor {

    /* compiled from: PicassoExecutorService */
    private static final class a extends FutureTask<C6244i> implements Comparable<a> {
        private final C6244i a;

        a(C6244i iVar) {
            super(iVar, null);
            this.a = iVar;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            e j = this.a.j();
            e j2 = aVar.a.j();
            return j == j2 ? this.a.e - aVar.a.e : j2.ordinal() - j.ordinal();
        }
    }

    I() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b());
    }

    /* access modifiers changed from: 0000 */
    public void a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            a(3);
            return;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    a(1);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    a(2);
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            a(3);
                            break;
                        default:
                            a(3);
                            break;
                    }
                    a(2);
                    break;
            }
        } else if (type == 1 || type == 6 || type == 9) {
            a(4);
        } else {
            a(3);
        }
    }

    public Future<?> submit(Runnable runnable) {
        a aVar = new a((C6244i) runnable);
        execute(aVar);
        return aVar;
    }

    private void a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }
}

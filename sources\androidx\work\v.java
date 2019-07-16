package androidx.work;

import android.content.Context;

/* compiled from: WorkerFactory */
public abstract class v {
    private static final String a = i.a("WorkerFactory");

    public static v a() {
        return new u();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a2 = a(context, str, workerParameters);
        if (a2 != null) {
            return a2;
        }
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                i a3 = i.a();
                String str2 = a;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not instantiate ");
                sb.append(str);
                a3.b(str2, sb.toString(), e);
                return null;
            }
        } catch (ClassNotFoundException unused) {
            i a4 = i.a();
            String str3 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Class not found: ");
            sb2.append(str);
            a4.b(str3, sb2.toString(), new Throwable[0]);
            return null;
        }
    }
}

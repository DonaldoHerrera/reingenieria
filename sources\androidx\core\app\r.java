package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder */
public final class r implements Iterable<Intent> {
    private final ArrayList<Intent> a = new ArrayList<>();
    private final Context b;

    /* compiled from: TaskStackBuilder */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private r(Context context) {
        this.b = context;
    }

    public static r a(Context context) {
        return new r(context);
    }

    public void f() {
        a((Bundle) null);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.a.iterator();
    }

    public r a(Intent intent) {
        this.a.add(intent);
        return this;
    }

    public r a(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = i.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.b.getPackageManager());
            }
            a(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public r a(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent a2 = i.a(this.b, componentName);
            while (a2 != null) {
                this.a.add(size, a2);
                a2 = i.a(this.b, a2.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public void a(Bundle bundle) {
        if (!this.a.isEmpty()) {
            ArrayList<Intent> arrayList = this.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.a(this.b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public PendingIntent a(int i, int i2) {
        return a(i, i2, null);
    }

    public PendingIntent a(int i, int i2, Bundle bundle) {
        if (!this.a.isEmpty()) {
            ArrayList<Intent> arrayList = this.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (VERSION.SDK_INT >= 16) {
                return PendingIntent.getActivities(this.b, i, intentArr, i2, bundle);
            }
            return PendingIntent.getActivities(this.b, i, intentArr, i2);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }
}

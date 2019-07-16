package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class bl implements bk {
    private final Bf a;
    private final SharedPreferences b;

    public bl(Context context, Bf bf) {
        this.a = bf;
        this.b = context.getSharedPreferences("com.appboy.push_registration", 0);
    }

    private boolean b() {
        return this.a.B() || this.a.z();
    }

    public synchronized String a() {
        if (b() && this.b.contains("version_code") && this.a.y() != this.b.getInt("version_code", Integer.MIN_VALUE)) {
            return null;
        }
        return this.b.getString("registration_id", null);
    }

    public synchronized void a(String str) {
        if (str != null) {
            Editor edit = this.b.edit();
            edit.putString("registration_id", str);
            edit.putInt("version_code", this.a.y());
            edit.apply();
        } else {
            throw new NullPointerException();
        }
    }
}

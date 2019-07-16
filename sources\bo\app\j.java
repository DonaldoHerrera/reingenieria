package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class j {
    private final SharedPreferences a;

    public j(Context context) {
        this.a = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
    }

    public String a() {
        return this.a.getString("last_user", "");
    }

    public void b(String str) {
        Ng.a(str);
        Editor edit = this.a.edit();
        edit.putString("default_user", str);
        edit.putString("last_user", str);
        edit.apply();
    }

    public void a(String str) {
        Ng.a(str);
        Editor edit = this.a.edit();
        edit.putString("last_user", str);
        edit.apply();
    }
}

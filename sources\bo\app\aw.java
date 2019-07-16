package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.UUID;

public class aw implements bi {
    private final Context a;

    public aw(Context context) {
        this.a = context;
    }

    public String a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.appboy.device", 0);
        String str = "device_id";
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        Editor edit = sharedPreferences.edit();
        edit.putString(str, uuid);
        edit.apply();
        return uuid;
    }
}

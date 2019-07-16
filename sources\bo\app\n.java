package bo.app;

import android.content.Context;

public class n extends Cf {
    public n(Context context) {
        super(context);
    }

    public long a() {
        return (long) (getIntValue("com_appboy_data_flush_interval_bad_network", 60) * 1000);
    }

    public long b() {
        return (long) (getIntValue("com_appboy_data_flush_interval_good_network", 30) * 1000);
    }

    public long c() {
        return (long) (getIntValue("com_appboy_data_flush_interval_great_network", 10) * 1000);
    }
}

package bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;

public class av {
    private static final String c = Hg.a(av.class);
    private final Context a;
    private final bk b;

    public av(Context context, bk bkVar) {
        this.a = context;
        this.b = bkVar;
    }

    private static boolean b() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (Exception unused) {
            Hg.c(c, "com.amazon.device.messaging.ADM not found");
            return false;
        }
    }

    public void a() {
        if (this.b.a() != null) {
            Hg.c(c, "The device is already registered with the ADM server and is eligible to receive ADM messages.");
            String str = c;
            StringBuilder sb = new StringBuilder();
            sb.append("ADM registration id: ");
            sb.append(this.b.a());
            Hg.c(str, sb.toString());
            bk bkVar = this.b;
            bkVar.a(bkVar.a());
            return;
        }
        ADM adm = new ADM(this.a);
        if (adm.isSupported()) {
            Hg.c(c, "Registering with ADM server...");
            adm.startRegister();
        }
    }

    private static boolean b(Context context) {
        try {
            ADMManifest.checkManifestAuthoredProperly(context);
            return true;
        } catch (Exception e) {
            Hg.c(c, "Manifest not authored properly to support ADM.");
            Hg.c(c, "ADM manifest exception: ", e);
            return false;
        }
    }

    public static boolean a(Context context) {
        return b() && b(context);
    }
}

package bo.app;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class m implements q {
    private static final String a = Hg.a(m.class);
    private x b = x.UNKNOWN;
    private boolean c = false;
    private boolean d = false;

    public x a() {
        return this.b;
    }

    public void a(Intent intent, ConnectivityManager connectivityManager) {
        String action = intent.getAction();
        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (activeNetworkInfo != null && !booleanExtra) {
                    this.d = activeNetworkInfo.isConnectedOrConnecting();
                    this.c = activeNetworkInfo.isRoaming();
                    switch (activeNetworkInfo.getType()) {
                        case 0:
                            int subtype = activeNetworkInfo.getSubtype();
                            if (subtype != 3) {
                                if (subtype == 13) {
                                    this.b = x.FOUR_G;
                                    break;
                                } else {
                                    this.b = x.TWO_G;
                                    break;
                                }
                            } else {
                                this.b = x.THREE_G;
                                break;
                            }
                        case 1:
                            this.b = x.WIFI;
                            break;
                        case 2:
                            this.b = x.UNKNOWN;
                            break;
                        case 3:
                            this.b = x.UNKNOWN;
                            break;
                        case 4:
                            this.b = x.UNKNOWN;
                            break;
                        case 5:
                            this.b = x.UNKNOWN;
                            break;
                        case 6:
                            this.b = x.WIFI;
                            break;
                        case 7:
                            this.b = x.UNKNOWN;
                            break;
                        case 8:
                            this.b = x.UNKNOWN;
                            break;
                        case 9:
                            this.b = x.UNKNOWN;
                            break;
                        default:
                            this.b = x.UNKNOWN;
                            break;
                    }
                } else {
                    this.b = x.NONE;
                    this.d = false;
                    this.c = false;
                }
            } catch (SecurityException e) {
                Hg.b(a, "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml", e);
            }
        } else {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected system broadcast received [");
            sb.append(action);
            sb.append("]");
            Hg.e(str, sb.toString());
        }
    }
}

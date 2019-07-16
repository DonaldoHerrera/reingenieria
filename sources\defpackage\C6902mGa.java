package defpackage;

import android.net.NetworkInfo;
import android.util.Log;

@EVa(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/soundcloud/android/utilities/android/network/ConnectionType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TWO_G", "THREE_G", "FOUR_G", "WIFI", "OFFLINE", "UNKNOWN", "Companion", "android-utils_release"}, mv = {1, 1, 15})
/* renamed from: mGa reason: default package and case insensitive filesystem */
/* compiled from: ConnectionType.kt */
public enum C6902mGa {
    TWO_G("2g"),
    THREE_G("3g"),
    FOUR_G("4g"),
    WIFI("wifi"),
    OFFLINE("offline"),
    UNKNOWN("unknown");
    
    public static final a h = null;
    private final String i;

    /* renamed from: mGa$a */
    /* compiled from: ConnectionType.kt */
    public static final class a {
        private a() {
        }

        public final C6902mGa a(NetworkInfo networkInfo, int i) {
            C6902mGa mga;
            if (networkInfo == null) {
                return C6902mGa.OFFLINE;
            }
            int type = networkInfo.getType();
            switch (type) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                    mga = a(i);
                    break;
                case 1:
                case 6:
                    mga = C6902mGa.WIFI;
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("No connection type match for Active Network type ");
                    sb.append(type);
                    Log.d("ConnectionType", sb.toString());
                    mga = C6902mGa.UNKNOWN;
                    break;
            }
            return mga;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final C6902mGa a(int i) {
            switch (i) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return C6902mGa.TWO_G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return C6902mGa.THREE_G;
                case 13:
                case 18:
                    return C6902mGa.FOUR_G;
                default:
                    return C6902mGa.UNKNOWN;
            }
        }
    }

    static {
        h = new a(null);
    }

    private C6902mGa(String str) {
        this.i = str;
    }

    public final String a() {
        return this.i;
    }
}

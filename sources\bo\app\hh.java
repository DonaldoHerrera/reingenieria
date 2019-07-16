package bo.app;

import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.util.Locale;

public interface hh {

    public enum a {
        HTTP("http"),
        HTTPS(Constants.SCHEME),
        FILE("file"),
        CONTENT("content"),
        ASSETS("assets"),
        DRAWABLE("drawable"),
        UNKNOWN("");
        
        private String h;
        private String i;

        private a(String str) {
            this.h = str;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("://");
            this.i = sb.toString();
        }

        public static a a(String str) {
            a[] values;
            if (str != null) {
                for (a aVar : values()) {
                    if (aVar.d(str)) {
                        return aVar;
                    }
                }
            }
            return UNKNOWN;
        }

        private boolean d(String str) {
            return str.toLowerCase(Locale.US).startsWith(this.i);
        }

        public String b(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.i);
            sb.append(str);
            return sb.toString();
        }

        public String c(String str) {
            if (d(str)) {
                return str.substring(this.i.length());
            }
            throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[]{str, this.h}));
        }
    }

    InputStream a(String str, Object obj);
}

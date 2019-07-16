package bo.app;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public final class ds {
    private static final String a = Hg.a(ds.class);

    public static URI a(Uri uri) {
        try {
            return new URI(uri.toString());
        } catch (URISyntaxException unused) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create URI from uri [");
            sb.append(uri.toString());
            sb.append("]");
            Hg.b(str, sb.toString());
            return null;
        }
    }

    public static URL a(URI uri) {
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to parse URI [");
            sb.append(e.getMessage());
            sb.append("]");
            Hg.b(str, sb.toString());
            return null;
        }
    }
}

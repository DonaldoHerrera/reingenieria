package com.facebook;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: GraphRequest */
class H implements c {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ GraphRequest b;

    H(GraphRequest graphRequest, ArrayList arrayList) {
        this.b = graphRequest;
        this.a = arrayList;
    }

    public void a(String str, String str2) throws IOException {
        this.a.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
    }
}

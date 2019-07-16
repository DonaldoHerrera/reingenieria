package com.soundcloud.android.offline;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: com.soundcloud.android.offline.ue reason: case insensitive filesystem */
/* compiled from: SoundCloudHostnameVerifier */
public class C4177ue implements HostnameVerifier {
    private boolean a(String str, List<String> list) {
        if (list.isEmpty() || C5206PKa.a((CharSequence) str)) {
            return false;
        }
        list.add(str);
        for (String lowerCase : list) {
            if (!lowerCase.toLowerCase(Locale.US).matches(".*.\\.hs\\.llnwd\\.net$|.*.?sndcdn\\.com$|.*.?soundcloud\\.com$")) {
                return false;
            }
        }
        return true;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return a(str, a((X509Certificate) sSLSession.getPeerCertificates()[0]));
        } catch (SSLException e) {
            SDb.a("ScDownloads").a((Throwable) e, "Error retrieving peer certificates for %s", str);
            return false;
        }
    }

    private List<String> a(X509Certificate x509Certificate) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        Integer num = (Integer) list.get(0);
                        if (num != null) {
                            if (num.intValue() == 2) {
                                String str = (String) list.get(1);
                                if (str != null) {
                                    arrayList.add(str);
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }
}

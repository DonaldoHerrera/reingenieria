package com.krux.androidsdk.aggregator;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class g {
    private static final String a = "g";
    private final int b = 10000;
    private final int c = 15000;

    public static n a(URL url) {
        n nVar;
        String str;
        String str2;
        StringBuilder sb;
        String str3 = "";
        n nVar2 = new n(str3, str3);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            nVar = new n(String.valueOf(httpURLConnection.getResponseCode()), a(inputStream));
            try {
                if (a.a().w) {
                    String str4 = a;
                    StringBuilder sb2 = new StringBuilder("HTTP response is: ");
                    sb2.append((String) nVar.a);
                    Log.d(str4, sb2.toString());
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (ProtocolException e) {
                e = e;
                str2 = a;
                sb = new StringBuilder("Protocol exception: ");
                sb.append(e);
                str = sb.toString();
                Log.e(str2, str);
                return nVar;
            } catch (IOException e2) {
                e = e2;
                str2 = a;
                sb = new StringBuilder("I/O exception: ");
                sb.append(e);
                str = sb.toString();
                Log.e(str2, str);
                return nVar;
            } catch (Exception e3) {
                e = e3;
                str2 = a;
                StringBuilder sb3 = new StringBuilder("Unable to execute http request for : ");
                sb3.append(url.toString());
                sb3.append(e);
                str = sb3.toString();
                Log.e(str2, str);
                return nVar;
            }
        } catch (ProtocolException e4) {
            e = e4;
            nVar = nVar2;
            str2 = a;
            sb = new StringBuilder("Protocol exception: ");
            sb.append(e);
            str = sb.toString();
            Log.e(str2, str);
            return nVar;
        } catch (IOException e5) {
            e = e5;
            nVar = nVar2;
            str2 = a;
            sb = new StringBuilder("I/O exception: ");
            sb.append(e);
            str = sb.toString();
            Log.e(str2, str);
            return nVar;
        } catch (Exception e6) {
            e = e6;
            nVar = nVar2;
            str2 = a;
            StringBuilder sb32 = new StringBuilder("Unable to execute http request for : ");
            sb32.append(url.toString());
            sb32.append(e);
            str = sb32.toString();
            Log.e(str2, str);
            return nVar;
        }
        return nVar;
    }

    private static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return sb.toString();
            }
            sb.append(readLine);
        }
    }
}

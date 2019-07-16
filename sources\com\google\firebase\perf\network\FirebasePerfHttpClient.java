package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import com.google.firebase.perf.internal.c;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    private static HttpResponse a(HttpClient httpClient, HttpUriRequest httpUriRequest, zzbg zzbg, c cVar) throws IOException {
        C0899v a = C0899v.a(cVar);
        try {
            a.a(httpUriRequest.getURI().toString());
            a.b(httpUriRequest.getMethod());
            Long a2 = h.a((HttpMessage) httpUriRequest);
            if (a2 != null) {
                a.a(a2.longValue());
            }
            zzbg.a();
            a.b(zzbg.b());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            a.e(zzbg.c());
            a.a(execute.getStatusLine().getStatusCode());
            Long a3 = h.a((HttpMessage) execute);
            if (a3 != null) {
                a.f(a3.longValue());
            }
            String a4 = h.a(execute);
            if (a4 != null) {
                a.c(a4);
            }
            a.d();
            return execute;
        } catch (IOException e) {
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return a(httpClient, httpUriRequest, new zzbg(), c.a());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return a(httpClient, httpUriRequest, httpContext, new zzbg(), c.a());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return a(httpClient, httpUriRequest, responseHandler, new zzbg(), c.a());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return a(httpClient, httpUriRequest, responseHandler, httpContext, new zzbg(), c.a());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return a(httpClient, httpHost, httpRequest, new zzbg(), c.a());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return a(httpClient, httpHost, httpRequest, httpContext, new zzbg(), c.a());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return a(httpClient, httpHost, httpRequest, responseHandler, new zzbg(), c.a());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return a(httpClient, httpHost, httpRequest, responseHandler, httpContext, new zzbg(), c.a());
    }

    private static HttpResponse a(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, zzbg zzbg, c cVar) throws IOException {
        C0899v a = C0899v.a(cVar);
        try {
            a.a(httpUriRequest.getURI().toString());
            a.b(httpUriRequest.getMethod());
            Long a2 = h.a((HttpMessage) httpUriRequest);
            if (a2 != null) {
                a.a(a2.longValue());
            }
            zzbg.a();
            a.b(zzbg.b());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            a.e(zzbg.c());
            a.a(execute.getStatusLine().getStatusCode());
            Long a3 = h.a((HttpMessage) execute);
            if (a3 != null) {
                a.f(a3.longValue());
            }
            String a4 = h.a(execute);
            if (a4 != null) {
                a.c(a4);
            }
            a.d();
            return execute;
        } catch (IOException e) {
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }

    private static <T> T a(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, zzbg zzbg, c cVar) throws IOException {
        C0899v a = C0899v.a(cVar);
        try {
            a.a(httpUriRequest.getURI().toString());
            a.b(httpUriRequest.getMethod());
            Long a2 = h.a((HttpMessage) httpUriRequest);
            if (a2 != null) {
                a.a(a2.longValue());
            }
            zzbg.a();
            a.b(zzbg.b());
            return httpClient.execute(httpUriRequest, new g(responseHandler, zzbg, a));
        } catch (IOException e) {
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }

    private static <T> T a(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, zzbg zzbg, c cVar) throws IOException {
        C0899v a = C0899v.a(cVar);
        try {
            a.a(httpUriRequest.getURI().toString());
            a.b(httpUriRequest.getMethod());
            Long a2 = h.a((HttpMessage) httpUriRequest);
            if (a2 != null) {
                a.a(a2.longValue());
            }
            zzbg.a();
            a.b(zzbg.b());
            return httpClient.execute(httpUriRequest, new g(responseHandler, zzbg, a), httpContext);
        } catch (IOException e) {
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }

    private static HttpResponse a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, zzbg zzbg, c cVar) throws IOException {
        C0899v a = C0899v.a(cVar);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            a.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            a.b(httpRequest.getRequestLine().getMethod());
            Long a2 = h.a((HttpMessage) httpRequest);
            if (a2 != null) {
                a.a(a2.longValue());
            }
            zzbg.a();
            a.b(zzbg.b());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            a.e(zzbg.c());
            a.a(execute.getStatusLine().getStatusCode());
            Long a3 = h.a((HttpMessage) execute);
            if (a3 != null) {
                a.f(a3.longValue());
            }
            String a4 = h.a(execute);
            if (a4 != null) {
                a.c(a4);
            }
            a.d();
            return execute;
        } catch (IOException e) {
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }

    private static HttpResponse a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, zzbg zzbg, c cVar) throws IOException {
        C0899v a = C0899v.a(cVar);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            a.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            a.b(httpRequest.getRequestLine().getMethod());
            Long a2 = h.a((HttpMessage) httpRequest);
            if (a2 != null) {
                a.a(a2.longValue());
            }
            zzbg.a();
            a.b(zzbg.b());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            a.e(zzbg.c());
            a.a(execute.getStatusLine().getStatusCode());
            Long a3 = h.a((HttpMessage) execute);
            if (a3 != null) {
                a.f(a3.longValue());
            }
            String a4 = h.a(execute);
            if (a4 != null) {
                a.c(a4);
            }
            a.d();
            return execute;
        } catch (IOException e) {
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }

    private static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, zzbg zzbg, c cVar) throws IOException {
        C0899v a = C0899v.a(cVar);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            a.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            a.b(httpRequest.getRequestLine().getMethod());
            Long a2 = h.a((HttpMessage) httpRequest);
            if (a2 != null) {
                a.a(a2.longValue());
            }
            zzbg.a();
            a.b(zzbg.b());
            return httpClient.execute(httpHost, httpRequest, new g(responseHandler, zzbg, a));
        } catch (IOException e) {
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }

    private static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, zzbg zzbg, c cVar) throws IOException {
        C0899v a = C0899v.a(cVar);
        try {
            String valueOf = String.valueOf(httpHost.toURI());
            String valueOf2 = String.valueOf(httpRequest.getRequestLine().getUri());
            a.a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            a.b(httpRequest.getRequestLine().getMethod());
            Long a2 = h.a((HttpMessage) httpRequest);
            if (a2 != null) {
                a.a(a2.longValue());
            }
            zzbg.a();
            a.b(zzbg.b());
            return httpClient.execute(httpHost, httpRequest, new g(responseHandler, zzbg, a), httpContext);
        } catch (IOException e) {
            a.e(zzbg.c());
            h.a(a);
            throw e;
        }
    }
}

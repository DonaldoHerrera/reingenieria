package com.facebook.stetho.okhttp3;

import com.facebook.stetho.inspector.network.DefaultResponseHandler;
import com.facebook.stetho.inspector.network.NetworkEventReporter;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest;
import com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse;
import com.facebook.stetho.inspector.network.NetworkEventReporterImpl;
import com.facebook.stetho.inspector.network.RequestBodyHelper;
import java.io.IOException;
import java.io.InputStream;

public class StethoInterceptor implements C7164pyb {
    private final NetworkEventReporter mEventReporter = NetworkEventReporterImpl.get();

    private static class ForwardingResponseBody extends Cyb {
        private final Cyb mBody;
        private final C6961nAb mInterceptedSource;

        public ForwardingResponseBody(Cyb cyb, InputStream inputStream) {
            this.mBody = cyb;
            this.mInterceptedSource = C7720yAb.a(C7720yAb.a(inputStream));
        }

        public long contentLength() {
            return this.mBody.contentLength();
        }

        public C7233qyb contentType() {
            return this.mBody.contentType();
        }

        public C6961nAb source() {
            return this.mInterceptedSource;
        }
    }

    private static class OkHttpInspectorRequest implements InspectorRequest {
        private final C7647wyb mRequest;
        private RequestBodyHelper mRequestBodyHelper;
        private final String mRequestId;

        public OkHttpInspectorRequest(String str, C7647wyb wyb, RequestBodyHelper requestBodyHelper) {
            this.mRequestId = str;
            this.mRequest = wyb;
            this.mRequestBodyHelper = requestBodyHelper;
        }

        /* JADX INFO: finally extract failed */
        public byte[] body() throws IOException {
            C7854zyb a = this.mRequest.a();
            if (a == null) {
                return null;
            }
            C6893mAb a2 = C7720yAb.a(C7720yAb.a(this.mRequestBodyHelper.createBodySink(firstHeaderValue("Content-Encoding"))));
            try {
                a.a(a2);
                a2.close();
                return this.mRequestBodyHelper.getDisplayBody();
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }

        public String firstHeaderValue(String str) {
            return this.mRequest.a(str);
        }

        public String friendlyName() {
            return null;
        }

        public Integer friendlyNameExtra() {
            return null;
        }

        public int headerCount() {
            return this.mRequest.c().c();
        }

        public String headerName(int i) {
            return this.mRequest.c().a(i);
        }

        public String headerValue(int i) {
            return this.mRequest.c().b(i);
        }

        public String id() {
            return this.mRequestId;
        }

        public String method() {
            return this.mRequest.e();
        }

        public String url() {
            return this.mRequest.g().toString();
        }
    }

    private static class OkHttpInspectorResponse implements InspectorResponse {
        private final C5681byb mConnection;
        private final C7647wyb mRequest;
        private final String mRequestId;
        private final Ayb mResponse;

        public OkHttpInspectorResponse(String str, C7647wyb wyb, Ayb ayb, C5681byb byb) {
            this.mRequestId = str;
            this.mRequest = wyb;
            this.mResponse = ayb;
            this.mConnection = byb;
        }

        public int connectionId() {
            C5681byb byb = this.mConnection;
            if (byb == null) {
                return 0;
            }
            return byb.hashCode();
        }

        public boolean connectionReused() {
            return false;
        }

        public String firstHeaderValue(String str) {
            return this.mResponse.a(str);
        }

        public boolean fromDiskCache() {
            return this.mResponse.c() != null;
        }

        public int headerCount() {
            return this.mResponse.f().c();
        }

        public String headerName(int i) {
            return this.mResponse.f().a(i);
        }

        public String headerValue(int i) {
            return this.mResponse.f().b(i);
        }

        public String reasonPhrase() {
            return this.mResponse.i();
        }

        public String requestId() {
            return this.mRequestId;
        }

        public int statusCode() {
            return this.mResponse.d();
        }

        public String url() {
            return this.mRequest.g().toString();
        }
    }

    public Ayb intercept(a aVar) throws IOException {
        RequestBodyHelper requestBodyHelper;
        InputStream inputStream;
        C7233qyb qyb;
        String nextRequestId = this.mEventReporter.nextRequestId();
        C7647wyb x = aVar.x();
        String str = null;
        if (this.mEventReporter.isEnabled()) {
            requestBodyHelper = new RequestBodyHelper(this.mEventReporter, nextRequestId);
            this.mEventReporter.requestWillBeSent(new OkHttpInspectorRequest(nextRequestId, x, requestBodyHelper));
        } else {
            requestBodyHelper = null;
        }
        try {
            Ayb a = aVar.a(x);
            if (!this.mEventReporter.isEnabled()) {
                return a;
            }
            if (requestBodyHelper != null && requestBodyHelper.hasBody()) {
                requestBodyHelper.reportDataSent();
            }
            C5681byb a2 = aVar.a();
            if (a2 != null) {
                this.mEventReporter.responseHeadersReceived(new OkHttpInspectorResponse(nextRequestId, x, a, a2));
                Cyb a3 = a.a();
                if (a3 != null) {
                    qyb = a3.contentType();
                    inputStream = a3.byteStream();
                } else {
                    qyb = null;
                    inputStream = null;
                }
                NetworkEventReporter networkEventReporter = this.mEventReporter;
                if (qyb != null) {
                    str = qyb.toString();
                }
                InputStream interpretResponseStream = networkEventReporter.interpretResponseStream(nextRequestId, str, a.a("Content-Encoding"), inputStream, new DefaultResponseHandler(this.mEventReporter, nextRequestId));
                if (interpretResponseStream == null) {
                    return a;
                }
                a G = a.G();
                G.a((Cyb) new ForwardingResponseBody(a3, interpretResponseStream));
                return G.a();
            }
            throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
        } catch (IOException e) {
            if (this.mEventReporter.isEnabled()) {
                this.mEventReporter.httpExchangeFailed(nextRequestId, e.toString());
            }
            throw e;
        }
    }
}

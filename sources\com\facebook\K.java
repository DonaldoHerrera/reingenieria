package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GraphRequestBatch */
public class K extends AbstractList<GraphRequest> {
    private static AtomicInteger a = new AtomicInteger();
    private Handler b;
    private List<GraphRequest> c;
    private int d;
    private final String e;
    private List<a> f;
    private String g;

    /* compiled from: GraphRequestBatch */
    public interface a {
        void a(K k);
    }

    /* compiled from: GraphRequestBatch */
    public interface b extends a {
        void a(K k, long j, long j2);
    }

    public K() {
        this.c = new ArrayList();
        this.d = 0;
        this.e = Integer.valueOf(a.incrementAndGet()).toString();
        this.f = new ArrayList();
        this.c = new ArrayList();
    }

    public void a(a aVar) {
        if (!this.f.contains(aVar)) {
            this.f.add(aVar);
        }
    }

    /* renamed from: b */
    public final GraphRequest set(int i, GraphRequest graphRequest) {
        return (GraphRequest) this.c.set(i, graphRequest);
    }

    public final List<L> c() {
        return d();
    }

    public final void clear() {
        this.c.clear();
    }

    /* access modifiers changed from: 0000 */
    public List<L> d() {
        return GraphRequest.a(this);
    }

    public final J f() {
        return g();
    }

    /* access modifiers changed from: 0000 */
    public J g() {
        return GraphRequest.b(this);
    }

    public final String h() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public final Handler i() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final List<a> j() {
        return this.f;
    }

    /* access modifiers changed from: 0000 */
    public final String k() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final List<GraphRequest> l() {
        return this.c;
    }

    public int m() {
        return this.d;
    }

    public final int size() {
        return this.c.size();
    }

    public final GraphRequest get(int i) {
        return (GraphRequest) this.c.get(i);
    }

    public final GraphRequest remove(int i) {
        return (GraphRequest) this.c.remove(i);
    }

    /* renamed from: a */
    public final boolean add(GraphRequest graphRequest) {
        return this.c.add(graphRequest);
    }

    /* renamed from: a */
    public final void add(int i, GraphRequest graphRequest) {
        this.c.add(i, graphRequest);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Handler handler) {
        this.b = handler;
    }

    public K(Collection<GraphRequest> collection) {
        this.c = new ArrayList();
        this.d = 0;
        this.e = Integer.valueOf(a.incrementAndGet()).toString();
        this.f = new ArrayList();
        this.c = new ArrayList(collection);
    }

    public K(GraphRequest... graphRequestArr) {
        this.c = new ArrayList();
        this.d = 0;
        this.e = Integer.valueOf(a.incrementAndGet()).toString();
        this.f = new ArrayList();
        this.c = Arrays.asList(graphRequestArr);
    }
}

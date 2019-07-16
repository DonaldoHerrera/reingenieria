package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;

/* compiled from: AndroidInjection */
public final class a {
    public static void a(Activity activity) {
        b bVar;
        C5023JMa.a(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof f) {
            bVar = ((f) application).oa();
            C5023JMa.a(bVar, "%s.androidInjector() returned null", application.getClass());
        } else if (application instanceof e) {
            bVar = ((e) application).a();
            C5023JMa.a(bVar, "%s.activityInjector() returned null", application.getClass());
        } else {
            throw new RuntimeException(String.format("%s does not implement %s or %s", new Object[]{application.getClass().getCanonicalName(), f.class.getCanonicalName(), e.class.getCanonicalName()}));
        }
        bVar.a(activity);
    }

    public static void a(Service service) {
        b bVar;
        C5023JMa.a(service, "service");
        Application application = service.getApplication();
        if (application instanceof f) {
            bVar = ((f) application).oa();
            C5023JMa.a(bVar, "%s.androidInjector() returned null", application.getClass());
        } else if (application instanceof i) {
            bVar = ((i) application).a();
            C5023JMa.a(bVar, "%s.serviceInjector() returned null", application.getClass());
        } else {
            throw new RuntimeException(String.format("%s does not implement %s or %s", new Object[]{application.getClass().getCanonicalName(), f.class.getCanonicalName(), i.class.getCanonicalName()}));
        }
        bVar.a(service);
    }

    public static void a(BroadcastReceiver broadcastReceiver, Context context) {
        b bVar;
        C5023JMa.a(broadcastReceiver, "broadcastReceiver");
        C5023JMa.a(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof f) {
            bVar = ((f) application).oa();
            C5023JMa.a(bVar, "%s.androidInjector() returned null", application.getClass());
        } else if (application instanceof g) {
            bVar = ((g) application).a();
            C5023JMa.a(bVar, "%s.broadcastReceiverInjector() returned null", application.getClass());
        } else {
            throw new RuntimeException(String.format("%s does not implement %s or %s", new Object[]{application.getClass().getCanonicalName(), f.class.getCanonicalName(), g.class.getCanonicalName()}));
        }
        bVar.a(broadcastReceiver);
    }

    public static void a(ContentProvider contentProvider) {
        b bVar;
        C5023JMa.a(contentProvider, "contentProvider");
        Application application = (Application) contentProvider.getContext().getApplicationContext();
        if (application instanceof f) {
            bVar = ((f) application).oa();
            C5023JMa.a(bVar, "%s.androidInjector() returned null", application.getClass());
        } else if (application instanceof h) {
            bVar = ((h) application).a();
            C5023JMa.a(bVar, "%s.contentProviderInjector() returned null", application.getClass());
        } else {
            throw new RuntimeException(String.format("%s does not implement %s or %s", new Object[]{application.getClass().getCanonicalName(), f.class.getCanonicalName(), g.class.getCanonicalName()}));
        }
        bVar.a(contentProvider);
    }
}

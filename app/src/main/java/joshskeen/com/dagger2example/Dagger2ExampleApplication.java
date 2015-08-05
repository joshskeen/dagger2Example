package joshskeen.com.dagger2example;

import android.app.Application;
import android.content.Context;

import joshskeen.com.dagger2example.inject.Dagger2ExampleComponent;
import joshskeen.com.dagger2example.inject.Dagger2ExampleModule;
import joshskeen.com.dagger2example.inject.DaggerDagger2ExampleComponent;

public class Dagger2ExampleApplication extends Application {

    private Dagger2ExampleComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        buildComponentAndInject();
    }

    public void buildComponentAndInject() {
        component = DaggerComponentInitializer.init(this);
    }

    public static Dagger2ExampleComponent component(Context context) {
        return ((Dagger2ExampleApplication) context.getApplicationContext()).component;
    }

    public final static class DaggerComponentInitializer {
        public static Dagger2ExampleComponent init(Dagger2ExampleApplication app) {
            return DaggerDagger2ExampleComponent.builder()
                    .dagger2ExampleModule(new Dagger2ExampleModule(app.getApplicationContext()))
                    .build();
        }

    }

}


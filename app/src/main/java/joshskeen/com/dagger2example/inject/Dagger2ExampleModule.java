package joshskeen.com.dagger2example.inject;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import joshskeen.com.dagger2example.model.DataStore;
import joshskeen.com.dagger2example.model.LiveDataStore;

@Module
public class Dagger2ExampleModule {

    private Context mApplicationContext;

    public Dagger2ExampleModule(Context applicationContext) {
        mApplicationContext = applicationContext;
    }

    @Provides
    @Singleton
    DataStore providesDataStore() {
        return new LiveDataStore("HELLO FROM DAGGER 2 MODULE");
    }

}

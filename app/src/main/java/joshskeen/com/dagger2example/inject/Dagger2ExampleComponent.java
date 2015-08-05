package joshskeen.com.dagger2example.inject;

import javax.inject.Singleton;

import dagger.Component;
import joshskeen.com.dagger2example.MainActivity;


@Singleton
@Component(modules = {Dagger2ExampleModule.class})
public interface Dagger2ExampleComponent {

    void inject(MainActivity activity);
}
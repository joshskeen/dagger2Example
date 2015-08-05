package joshskeen.com.dagger2example;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import joshskeen.com.dagger2example.databinding.ActivityMainBinding;
import joshskeen.com.dagger2example.inject.Dagger2ExampleComponent;
import joshskeen.com.dagger2example.model.DataStore;

public class MainActivity extends AppCompatActivity {

    @Inject
    public DataStore mDataStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Dagger2ExampleComponent component = Dagger2ExampleApplication.component(this);
        component.inject(this);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.printButton.setOnClickListener(v -> binding.printResult.setText(mDataStore.getExampleValue()));
        mDataStore.getExampleValue();
    }

}

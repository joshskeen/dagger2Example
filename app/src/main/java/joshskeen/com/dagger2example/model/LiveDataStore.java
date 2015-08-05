package joshskeen.com.dagger2example.model;

public class LiveDataStore implements DataStore {

    private String mValue;

    public LiveDataStore(String message) {
        mValue = message;
    }

    @Override
    public String getExampleValue() {
        return mValue;
    }

    @Override
    public void setExampleValue(String value) {
        mValue = value;
    }
}

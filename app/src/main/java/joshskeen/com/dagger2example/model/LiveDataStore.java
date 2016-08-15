package joshskeen.com.dagger2example.model;

public class LiveDataStore implements DataStore {

    private String mValue;
    private int mTimesCalled;

    public LiveDataStore(String message) {
        mValue = message;
    }

    @Override
    public String getExampleValue() {
        mTimesCalled++;
        return mValue + " - object id:" + this.hashCode() + "\n number times called: " + mTimesCalled;
    }

    @Override
    public void setExampleValue(String value) {
        mValue = value;
    }
}
z
package com.example.pankajjoshi.accelerometer;

/**
 * Created by pankajjoshi on 3/10/17.
 */

public interface AccelerometerListener {

    public void onAccelerationChanged(float x, float y, float z);

    public void onShake(float force);
}

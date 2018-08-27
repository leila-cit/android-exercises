package com.example.leila.exercise1;

import android.os.CountDownTimer;

public class Timer extends CountDownTimer {

    private CountdownListener listener;
    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public Timer(long millisInFuture, long countDownInterval, CountdownListener listener) {
        super(millisInFuture, countDownInterval);

        this.listener = listener;
    }

    @Override
    public void onTick(long millisUntilFinished) {
        //Not implemented
    }

    @Override
    public void onFinish() {
        listener.onFinish();
    }
}

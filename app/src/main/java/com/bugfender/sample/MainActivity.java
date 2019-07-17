package com.bugfender.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.bugfender.sdk.Bugfender;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Bugfender logs
    //Bugfender debug log
    Bugfender.d("DEBUG", "This message is a debug");

    //Bugfender error log
    Bugfender.e("ERROR", "This message is a error");

    //Bugfender warning log
    Bugfender.w("WARNING", "This message is a warning");

    //Bugfender send issue
    Bugfender.sendIssue("Title", "Message");

    // Activate the force enable
    Bugfender.setForceEnabled(true);

    // Sync all the logs and issues and send it.
    Bugfender.forceSendOnce();

    // Get the device identifier generated by the device.
    String deviceIdentifier = Bugfender.getDeviceIdentifier();
    Bugfender.d("DEBUG", "Device identifier: " + deviceIdentifier);

    // Associate a string value to the device
    Bugfender.setDeviceString("user.email", "john@john.com");

    // Associate a integer value to the device
    Bugfender.setDeviceInteger("user.photo.image.width", 600);

    // Associate a boolean value to the device
    Bugfender.setDeviceBoolean("user.is.logged", true);

    // Associate a float value to the device
    Bugfender.setDeviceFloat("user.children", 3f);

    // Removed the associated device float key
    Bugfender.removeDeviceKey("user.children");
Log.i("TAG5" , "TAG4");
  }
}

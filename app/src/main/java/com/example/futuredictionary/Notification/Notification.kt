package com.example.futuredictionary

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.NotificationManager.IMPORTANCE_HIGH
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.RemoteInput
import kotlinx.android.synthetic.main.activity_notification.*
import kotlinx.android.synthetic.main.exam_item.*

class Notification : AppCompatActivity() {

    private var channelID = "com.example.futuredictionary"
    private var notificationManager : NotificationManager? = null
//    private var KEY_REPLY = "key_reply"

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_notification)
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        createNotificationChannel(channelID, "Future Dictionary", "Latest Updates")

        notificationBtn.setOnClickListener {
            displayNotification()
        }
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT_WATCH)
    private fun displayNotification(){
        val notificationId = 45
/*        var tapResultIntent = Intent(this, NotificationPage::class.java).apply{
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        var pendingIntent: PendingIntent = PendingIntent.getActivity(
            this,
            0,
            tapResultIntent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )    */

/*        //reply action
        val remoteInput : RemoteInput = RemoteInput.Builder(KEY_REPLY).run{
            setLabel("Insert your name here")
            build()
        }

        val replyAction : NotificationCompat.Action = NotificationCompat.Action.Builder(
            0,
            "REPLY",
            pendingIntent
        ).addRemoteInput(remoteInput)
            .build()      */


        //action button 1
        var intent2 = Intent(this, NotificationPage::class.java).apply{
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        var pendingIntent2: PendingIntent = PendingIntent.getActivity(
            this,
            0,
            intent2,
            PendingIntent.FLAG_UPDATE_CURRENT
        )

        val action2 : NotificationCompat.Action =
            NotificationCompat.Action.Builder(0, "SHOW MORE", pendingIntent2).build()


/*        //action button 2
        var intent3 = Intent(this, NotificationSettings::class.java).apply{
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        var pendingIntent3: PendingIntent = PendingIntent.getActivity(
            this,
            0,
            intent3,
            PendingIntent.FLAG_UPDATE_CURRENT
        )

        val action3 : NotificationCompat.Action =
            NotificationCompat.Action.Builder(0, "Settings", pendingIntent3).build()   */


        val notification = NotificationCompat.Builder(this@Notification, channelID)
            .setContentTitle("Final semester exams for engineering students in July: Anna University")
            .setContentText("The Anna University final semester exams will likely be conducted online in July or August, " +
                    "Vice Chancellor MK Surappa told The New Indian Express. ")
            .setSmallIcon(R.drawable.icon)
            .setAutoCancel(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            //.setContentIntent(pendingIntent)
                  .addAction(action2)
            //      .addAction(action3)
            //      .addAction(replyAction)
            .build()
        notificationManager?.notify(notificationId, notification)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(id : String, name : String, channelDescription : String ){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val importance : Int = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel(id, name, importance).apply{
                description = channelDescription
            }
            notificationManager?.createNotificationChannel((channel))

        }
    }
}
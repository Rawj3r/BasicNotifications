package nkosi.roger.com.basicnotifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String noteContent = "By impossible of in difficulty discovered celebrated ye. Justice joy manners boy met resolve produce. Bed head loud next plan rent had easy add him. As earnestly shameless elsewhere defective estimable fulfilled of. Esteem my advice it an excuse enable. Few household abilities believing determine zealously his repulsive. To open draw dear be by side like. \n" +
            "\n" +
            "Prepared is me marianne pleasure likewise debating. Wonder an unable except better stairs do ye admire. His and eat secure sex called esteem praise. So moreover as speedily differed branched ignorant. Tall are her knew poor now does then. Procured to contempt oh he raptures amounted occasion. One boy assure income spirit lovers set.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendNotificationBasic(View view){

        switch (view.getId()){

            case R.id.buttonBasic:
                sendBasicNotification();
                break;
            case R.id.buttonBigPicture:
                break;
            case R.id.buttonInbox:
                break;
            case R.id.bigText:
                sendNotificationBig();
                break;
        }
    }

    private void sendBasicNotification(){

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(true);
        builder.setContentTitle("Gym Notification");
        builder.setContentText(noteContent);
        builder.setSmallIcon(R.drawable.ic_action_alarm);

        Notification notification = builder.build();

        NotificationManager notificationManager = (NotificationManager) this.getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(8, notification);
    }

    public void sendNotificationBig(){
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.setBigContentTitle("Gym Notification");
        bigTextStyle.bigText(noteContent);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(true);
        builder.setContentTitle("Gym Notification");
        builder.setContentText(noteContent);
        builder.setSmallIcon(R.drawable.ic_action_alarm);
        builder.setStyle(bigTextStyle);

        Notification notification = builder.build();
        NotificationManager manager = (NotificationManager) this.getSystemService(NOTIFICATION_SERVICE);
        manager.notify(8, notification);
    }
}

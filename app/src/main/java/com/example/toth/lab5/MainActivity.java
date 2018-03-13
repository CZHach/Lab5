package com.example.toth.lab5;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] nationalParks = {
                "Yosemite",
                "Redwood",
                "Death Valley",
                "Channel Islands",
                "Sequoia Kings Canyon",
                "Pinnacles",
                "Lassen Volcanic",
                "Point Reyes",
                "Joshua Tree"
        };

    setListAdapter(new ArrayAdapter<>(this, R.layout.activity_main, R.id.nationalparks, nationalParks));
    }

    protected void onListItemClick(ListView lv, View v, int positionNum, long id) {
        switch (positionNum) {
            case 0: //yosemite
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.yosemite.com/")));
                break;

            case 1: //redwood
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.visitcalifornia.com/attraction/redwood-national-park")));
                break;

            case 2: //death valley
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nps.gov/deva/index.htm")));
                break;

            case 3: //channel islands
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nationalparks.org/explore-parks/channel-islands-national-park")));
                break;

            case 4: //sequoia
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.visitsequoia.com/")));
                break;

            case 5: //pinnacles
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Pinnacles_National_Park")));
                break;

            case 6: //lassen volcanic
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.visitcalifornia.com/destination/spotlight-lassen-volcanic-national-park")));
                break;

            case 7: //point reyes
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ptreyes.org/visitor-info")));
                break;

            case 8: //joshua tree
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nps.gov/jotr/index.htm")));
                break;
        }
    }
}

package com.example.news;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import java.util.ArrayList;
import java.util.List;

public class TravelAdapter extends BaseAdapter {

  private LayoutInflater inflater;

  private int repeatCount = 1;

  private List<Travels.Data> travelData;
  private WebView mWebview ;

  public TravelAdapter(Context context) {
    inflater = LayoutInflater.from(context);
    travelData = new ArrayList<Travels.Data>(Travels.IMG_DESCRIPTIONS);
    
  }

  @Override
  public int getCount() {
    return travelData.size() * repeatCount;
  }

  public int getRepeatCount() {
    return repeatCount;
  }

  public void setRepeatCount(int repeatCount) {
    this.repeatCount = repeatCount;
  }

  @Override
  public Object getItem(int position) {
    return position;
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View layout = convertView;
    if (convertView == null) {
      layout = inflater.inflate(R.layout.complex1, null);
      AphidLog.d("created new view from adapter: %d", position);
    }

    final Travels.Data data = travelData.get(position % travelData.size());

    UI
        .<TextView>findViewById(layout, R.id.title)
        .setText(AphidLog.format("%d. %s", position, data.title));

   /* UI
        .<ImageView>findViewById(layout, R.id.photo)
        .setImageBitmap(IO.readBitmap(inflater.getContext().getAssets(), data.imageFilename));
*/
   WebView wv =  UI.<WebView>findViewById(layout, R.id.webview1);
    wv.setWebViewClient(new WebViewClient());
    wv.loadUrl(data.link);
    wv.requestFocus();
    UI
        .<TextView>findViewById(layout, R.id.description)
        .setText(Html.fromHtml(data.description));

    UI
        .<Button>findViewById(layout, R.id.wikipedia)
        .setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            Intent intent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse(data.link)
            );
            inflater.getContext().startActivity(intent);
          }
        });
    UI
    .<Button>findViewById(layout, R.id.wikipedia).setText("View " + data.title);
    return layout;
  }

  public void removeData(int index) {
    if (travelData.size() > 1) {
      travelData.remove(index);
    }
  }
}

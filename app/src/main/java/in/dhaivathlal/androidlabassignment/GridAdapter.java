package in.dhaivathlal.androidlabassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    LayoutInflater inflater;
    Context context;
    String[] foodItems;
    String item;

    public GridAdapter(String[] foodItems, Context context, String item) {
        this.foodItems = foodItems;
        this.context = context;
        this.item = item;
    }

    @Override
    public int getCount() {
        return foodItems.length;
    }

    @Override
    public Object getItem(int position) {
        return foodItems[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.grid_item, null);
        TextView textView = convertView.findViewById(R.id.textView);
        textView.setText(foodItems[position]);

        ImageView itemImage = convertView.findViewById(R.id.itemImage);
        if (item == "Foods") {
            itemImage.setImageResource(R.drawable.food);
        }else if (item == "Snacks"){
            itemImage.setImageResource(R.drawable.burgur);
        } else{
            itemImage.setImageResource(R.drawable.burgur);
        }

        return convertView;
    }
}

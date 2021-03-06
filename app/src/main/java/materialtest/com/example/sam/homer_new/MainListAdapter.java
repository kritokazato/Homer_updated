package materialtest.com.example.sam.homer_new;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;




/**
 * Created by sam on 2015/04/18.
 */
public class MainListAdapter extends ArrayAdapter<String> {

    public MainListAdapter(Context context, String[] objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) parent.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.main_row, parent, false);
        }
        String titleValue = getItem(position);
        TextView titleView = (TextView)view.findViewById(R.id.title);
        titleView.setText(titleValue);

        return view;
    }
}

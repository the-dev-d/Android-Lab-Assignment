package in.dhaivathlal.androidlabassignment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SnackFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SnackFragment extends Fragment {

    public SnackFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_snack, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] foodItems = new String[]{"Cheese Burger", "Noodles", "Chicken Fried Rice", "Fish Fried Rice", "Cheese Burger", "Noodles", "Chicken Fried Rice", "Fish Fried Rice"};
        GridAdapter gridAdapter = new GridAdapter(foodItems, view.getContext(), "Snacks");
        GridView gridView = view.findViewById(R.id.gridViewSnack);
        gridView.setAdapter(gridAdapter);

    }
}
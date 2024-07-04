package in.dhaivathlal.androidlabassignment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] foodItems = new String[]{"Cheese Burger", "Noodles", "Chicken Fried Rice", "Fish Fried Rice", "Cheese Burger", "Noodles", "Chicken Fried Rice", "Fish Fried Rice"};
        GridAdapter gridAdapter = new GridAdapter(foodItems, view.getContext(), "Foods");
        GridView gridView = view.findViewById(R.id.gridViewFood);
        gridView.setAdapter(gridAdapter);

    }
}
package gr.choosetales.adam.choosetalesnavigation.thirdpage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gr.choosetales.adam.choosetalesnavigation.R;


public class ThirdBFragment extends Fragment {

    public ThirdBFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CardView cardOne = view.findViewById(R.id.cardChooseOne);

        final NavController navController = Navigation.findNavController(view);

        cardOne.setOnClickListener(view1 ->{navController.navigate(R.id.action_thirdBFragment_to_fourthBFragment);});

    }
}

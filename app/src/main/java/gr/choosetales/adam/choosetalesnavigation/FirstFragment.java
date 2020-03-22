package gr.choosetales.adam.choosetalesnavigation;

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

public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CardView cardOne = view.findViewById(R.id.cardChooseOne);
        CardView cardTwo = view.findViewById(R.id.cardChooseTwo);
        CardView cardTree = view.findViewById(R.id.cardChooseTree);

        final NavController navController = Navigation.findNavController(view);

        cardOne.setOnClickListener(view1 ->{navController.navigate(R.id.action_firstFragment_to_secondAFragment3);});
        cardTwo.setOnClickListener(view1 ->{navController.navigate(R.id.action_firstFragment_to_secondBFragment3);});
        cardTree.setOnClickListener(view1 ->{navController.navigate(R.id.action_firstFragment_to_secondCFragment);});

    }
}

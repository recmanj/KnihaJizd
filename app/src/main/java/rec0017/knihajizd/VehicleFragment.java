package rec0017.knihajizd;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class VehicleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle(R.string.vehicles_title);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.vehicle_fragment, container, false);
    }

}
